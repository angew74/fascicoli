package com.roma.elettorale.fascicoli.service;


import com.roma.elettorale.fascicoli.entity.veri.VeriData;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import com.roma.elettorale.fascicoli.helpers.enumerators.decodificamessaggi;
import com.roma.elettorale.fascicoli.helpers.enumerators.statusoperazione;
import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;
import com.roma.elettorale.fascicoli.sviluppo.entity.penali;
import com.roma.elettorale.fascicoli.sviluppo.service.PenaliService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import javax.naming.directory.SearchResult;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


@Component
public class ElaborazionePenali {


    private static final Logger log = LoggerFactory.getLogger(ElaborazionePenali.class);


    @Autowired
    ManageFiles manageFiles;

    @Autowired
    PenaliService penaliService;

    @Autowired
    VeriData veriData;

    @Autowired
    AnagrafeClient anagrafeClient;

    @Autowired
    UnidocClient unidocClient;

    @Autowired
    TransformationFile transformationFile;

    @Autowired
    ElaborazioneCaricamentiUnidoc elaborazioneCaricamentiUnidoc;

    @Autowired
    decodificamessaggi listadeocdificamessaggi;

    public void caricaRichiestePenali(String directory) {
        File directoryRoot = new File(directory);
        ArrayList<File> list = displayDirectoryContents(directoryRoot);
        String destDirRiepilogo = "";
        String destDirNegativi = "";
        String destDirPositivi = "";
        for (File f : list) {
            File[] penalis = f.listFiles();
            for (File p : penalis) {
                if (p.getName().toLowerCase().contains("riepilogo.zip")) {
                    String zipFilePath = p.getAbsolutePath();
                    destDirRiepilogo = p.getParent() + "\\riepilogo";
                    unzip(zipFilePath, destDirRiepilogo);
                    File filezipRiepilogo = new File(zipFilePath);
                    filezipRiepilogo.delete();
                }
                if (p.getName().toLowerCase().contains("negativi.zip")) {
                    String zipFilePath = p.getAbsolutePath();
                    destDirNegativi = p.getParent() + "\\negativi";
                    unzip(zipFilePath, destDirNegativi);
                    File filezipNegativi = new File(zipFilePath);
                    filezipNegativi.delete();
                }
                if (p.getName().toLowerCase().contains("positivi.zip")) {
                    String zipFilePath = p.getAbsolutePath();
                    destDirPositivi = p.getParent() + "\\positivi";
                    unzip(zipFilePath, destDirPositivi);
                    File filezipPositivi = new File(zipFilePath);
                    filezipPositivi.delete();
                }
            }
            if(!(destDirRiepilogo.equals("")))
            {  manageFiles.leggifilePenali(destDirRiepilogo, destDirNegativi, destDirPositivi);}
        }
    }

    public ArrayList<File> displayDirectoryContents(File dir) {

        ArrayList<File> list = new ArrayList<>();
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                list.add(file);
                displayDirectoryContents(file);
            }
        }
        return list;
    }

    private static void unzip(String zipFilePath, String destDir) {
        File dir = new File(destDir);
        // create output directory if it doesn't exist
        if (!dir.exists()) dir.mkdirs();
        FileInputStream fis;
        //buffer for read and write data to file
        byte[] buffer = new byte[1024];
        try {
            fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while (ze != null) {
                String fileName = ze.getName();
                File newFile = new File(destDir + File.separator + fileName);
                System.out.println("Unzipping to " + newFile.getAbsolutePath());
                //create directories for sub directories in zip
                new File(newFile.getParent()).mkdirs();
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
                //close this ZipEntry
                zis.closeEntry();
                ze = zis.getNextEntry();
            }
            //close last ZipEntry
            zis.closeEntry();
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void caricaFilePenali(String path,String tipo) {

        try {
            List<penali> penalis = penaliService.findFirst1000ByFlgoperazione(statusoperazione.CARICATO.ordinal());
            StringBuilder s = new StringBuilder();
            String stringDoc = "";
            int status = 0;
            for (penali p : penalis) {
                if (p.getCodicefiscale() != null) {
                    stringDoc = anagrafeClient.GetVeriByCodFis(p.getCodicefiscale());
                    if (stringDoc != null && (!stringDoc.equals(""))) {
                        Document doc = null;
                        doc = transformationFile.convertStringToXMLDocument(stringDoc);
                        String codiceErrore = transformationFile.ParsingTag("Codice", doc);
                        if(codiceErrore.equals("")) {
                            veriData = veriData.CreateVeriDataFromXml(doc);
                            p.setCodiceindividuale(veriData.getCodiceIndividuale());
                            p.setDatanascita(veriData.getDataNascita());
                            File file = new File(p.getPathFile());
                            if (file.exists()) {
                                byte[] fileContent = Files.readAllBytes(file.toPath());
                               String msg =  elaborazioneCaricamentiUnidoc.UploadPenale(fileContent, p, s,path, tipo);
                                if ((msg.equals(""))) {
                                    status = statusoperazione.ELABORATO.ordinal();
                                    p.setDescrizioneerrore("");
                                } else if (msg.equals("OK")) {
                                    status = statusoperazione.ELABORATO.ordinal();
                                    p.setDescrizioneerrore("");
                                } else {
                                    status = statusoperazione.ERRORE.ordinal();
                                    p.setDescrizioneerrore(s.toString());
                                }
                                p.setFlgoperazione(status);
                                p.setDataoperazione(LocalDateTime.now());
                                penaliService.Save(p);
                                file.delete();
                                continue;
                            } else {
                                status = statusoperazione.FILE_NON_ESISTENTE.ordinal();
                                p.setDescrizioneerrore("FILE NON ESISTENTE");
                                p.setDataoperazione(LocalDateTime.now());
                                p.setFlgoperazione(status);
                                penaliService.Save(p);
                                continue;
                            }
                        }
                        else {
                            File file = new File(p.getPathFile());
                            p.setFlgoperazione(statusoperazione.CARICATO.ordinal());
                            p.setDescrizioneerrore("DA RIELABORARE");
                            p.setDataoperazione(LocalDateTime.now());
                            p.setCodicefiscale("");
                            penaliService.Save(p);
                            continue;
                        }
                    } else {
                        File file = new File(p.getPathFile());
                        p.setFlgoperazione(statusoperazione.CITTADINO_NON_TROVATO.ordinal());
                        p.setDescrizioneerrore("CITTADINO NON TROVATO");
                        p.setDataoperazione(LocalDateTime.now());
                        penaliService.Save(p);
                        file.delete();
                        continue;
                    }
                } else {
                    stringDoc = anagrafeClient.GetVeriByDatiAnag(p.getNome(), p.getCognome());
                    Document veriricResponse = transformationFile.convertStringToXMLDocument(stringDoc);
                    String codiceErrore = transformationFile.ParsingTag("Codice", veriricResponse);
                    //    String  descrizioneErrore = transformationFile.ParsingTag("Descrizione" ,veriricResponse);
                    if (!codiceErrore.equals("")) {
                        p.setFlgoperazione(statusoperazione.CITTADINO_NON_TROVATO.ordinal());
                        String descrizioneErrore = decodificamessaggi.getDict().get(codiceErrore);
                        p.setDescrizioneerrore(descrizioneErrore);
                        p.setDataoperazione(LocalDateTime.now());
                        penaliService.Save(p);
                        File file = new File(p.getPathFile());
                        file.delete();
                    } else {
                        String t = transformationFile.parsingAttribute("Elenco", "totale", veriricResponse);
                        Integer totale = Integer.parseInt(t);
                        if (totale > 1) {
                            p.setFlgoperazione(statusoperazione.TROVATI_PIU_CITTADINI.ordinal());
                            p.setDescrizioneerrore("PIU RITROVAMENTI");
                            p.setDataoperazione(LocalDateTime.now());
                            penaliService.Save(p);
                            File file = new File(p.getPathFile());
                            file.delete();
                        } else if (totale == 0) {
                            p.setFlgoperazione(statusoperazione.CITTADINO_NON_TROVATO.ordinal());
                            p.setDescrizioneerrore("CITTADINO NON TROVATO");
                            p.setDataoperazione(LocalDateTime.now());
                            penaliService.Save(p);
                            File file = new File(p.getPathFile());
                            file.delete();
                        } else if (totale == 1) {
                            p.setCodiceindividuale(veriricResponse.getElementsByTagName("CodiceIndiv").item(0).getTextContent());
                            p.setCodicefiscale(veriricResponse.getElementsByTagName("CodiceFiscale").item(0).getTextContent());
                            p.setDatanascita(veriricResponse.getElementsByTagName("DataDiNascitaPersona").item(0).getTextContent());
                            File file = new File(p.getPathFile());
                            if(file.exists()) {
                                byte[] fileContent = Files.readAllBytes(file.toPath());
                                elaborazioneCaricamentiUnidoc.UploadPenale(fileContent, p, s,path, tipo);
                                if (s.toString().equals("")) {
                                    status = statusoperazione.ELABORATO.ordinal();
                                    p.setDescrizioneerrore("");
                                } else if (s.toString().equals("OK")) {
                                    status = statusoperazione.ELABORATO.ordinal();
                                    p.setDescrizioneerrore("");
                                } else {
                                    status = statusoperazione.ERRORE.ordinal();
                                    p.setDescrizioneerrore(s.toString());
                                }
                            }
                            else {
                                status = statusoperazione.FILE_NON_ESISTENTE.ordinal();
                                p.setDescrizioneerrore("File non presente " + file.getName());
                            }
                            p.setFlgoperazione(status);
                            p.setDataoperazione(LocalDateTime.now());
                            penaliService.Save(p);
                            file.delete();
                        }
                    }
                }
            }
        } catch (Exception ex) {
            log.error("ERR_19: " + ex.getMessage());
        }

    }
}