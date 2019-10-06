package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.entity.certi.CertificatoType;
import com.roma.elettorale.fascicoli.entity.unidoc.*;
import com.roma.elettorale.fascicoli.entity.veri.VeriData;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import com.roma.elettorale.fascicoli.helpers.enumerators.unidocmetadata;
import com.roma.elettorale.fascicoli.helpers.enumerators.unidoctype;
import org.apache.poi.util.StringUtil;
import org.codehaus.plexus.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class ElaborazioneCaricamentiUnidoc {


    private static final Logger log = LoggerFactory.getLogger(ElaborazioneCaricamentiUnidoc.class);

    @Autowired
    TransformationFile transformationFile;

    @Autowired
    UnidocClient unidocClient;


    public String UpLoadCertificato(CertificatoType certificatoType, VeriData veriData, String codiceIndividuale,StringBuilder esito) {

        FileRequest request = new FileRequest();
        FileMetatag info = new FileMetatag();
        Metadato metadato = new Metadato();
        List<Metadato> lMeta = new ArrayList<>();
        FileResponse response = null;
        String messaggioErrore = "";
        try {
            String nomeCertificato = transformationFile.getNomeCertificatoMetaDato(certificatoType.getIdNomeCertificato());
            request.setIdTipoDocumento(7);
            request.setRefIdFile(0);
            info.setTipoDocumento("CERTIFICATO ANAGRAFICO");
            lMeta.add(transformationFile.createMetaDato("INTESTATARIO-COD_IND", codiceIndividuale));
            lMeta.add(transformationFile.createMetaDato("INTESTATARIO-COD_FIS", veriData.getCodiceFiscale()));
            lMeta.add(transformationFile.createMetaDato("INTESTATARIO-COGNOME", veriData.getCognome()));
            lMeta.add(transformationFile.createMetaDato("INTESTATARIO-NOME", veriData.getNome()));
            lMeta.add(transformationFile.createMetaDato("ORIGINE-UFFICIO-NOME", ""));
            lMeta.add(transformationFile.createMetaDato("CERTIFICATO-NOME", nomeCertificato));
            lMeta.add(transformationFile.createMetaDato("CERTIFICATO-DATA_EMISSIONE", LocalDateTime.now().toString()));


            info.setNomeOriginale(nomeCertificato + "_COD-IND." + codiceIndividuale + ".pdf");
            info.setUtenteInserimento("SYSTEMJ");
            String path = "FASCICOLO_ELETTORALE\\";
            info.setPathFolder(path + codiceIndividuale);
            ArrayOfMetadato arrayOfMetadato = new ArrayOfMetadato();
            arrayOfMetadato.setMetadato(lMeta);
            info.setMetadati(arrayOfMetadato);
            //controllo se esiste già un certificato nel documentale
            UnidocTypes type = new UnidocTypes();
            type.setIdType(unidoctype.CERTIFICATO_ANAGRAFICO.ordinal());
            UnidocFolders unidocFolders = new UnidocFolders();
            ArrayOfUnidocTypes arrayOfUnidocTypes = new ArrayOfUnidocTypes();
            List<UnidocTypes> unidocTypes = new ArrayList<>();
            unidocTypes.add(type);
            arrayOfUnidocTypes.setUnidocTypes(unidocTypes);
            UnidocsMetadata searchMetadato = new UnidocsMetadata();
            searchMetadato.setIdMetadata(unidocmetadata.INTESTATARIO_COD_IND.ordinal());
            searchMetadato.setValueMetadata(codiceIndividuale);
            UnidocsMetadata searchMetadato2 = new UnidocsMetadata();
            searchMetadato2.setIdMetadata(unidocmetadata.ORIGINE_UFFICIO_NOME.ordinal());
            searchMetadato2.setValueMetadata(nomeCertificato);
            List<UnidocsMetadata> unidocsMetadata = new ArrayList<>();
            unidocsMetadata.add(searchMetadato);
            unidocsMetadata.add(searchMetadato2);
            ArrayOfArrayOfUnidocsMetadata arrayOfArrayOfUnidocsMetadata = new ArrayOfArrayOfUnidocsMetadata();
            ArrayOfUnidocsMetadata arrayOfUnidocsMetadata = new ArrayOfUnidocsMetadata();
            arrayOfUnidocsMetadata.setUnidocsMetadata(unidocsMetadata);
            List<ArrayOfUnidocsMetadata> arrayOfUnidocsMetadataList = new ArrayList<>();
            arrayOfUnidocsMetadataList.add(arrayOfUnidocsMetadata);
            arrayOfArrayOfUnidocsMetadata.setArrayOfUnidocsMetadata(arrayOfUnidocsMetadataList);
            FileResponseList resFiles = unidocClient.searchFiles(null, arrayOfUnidocTypes, arrayOfArrayOfUnidocsMetadata);
            if (resFiles.getListFiles() != null && resFiles.getListFiles().getFileResponse().size() != 0) {
                Integer idFile = resFiles.getListFiles().getFileResponse().get(0).getMetatag().getIdFile();
                info.setRefIdPadre(idFile.toString());
                info.setMajorVersion(2);
            }
            request.setInfo(info);
            if (request.getInfo().getIdFolder() == 0) {
                log.info("creo la cartella per l'individuo: " + codiceIndividuale);
                System.out.println("creo la cartella per l'individuo: " + codiceIndividuale);
                FolderResponse folderResponse = unidocClient.creaNuovaCartella(request);
                if (folderResponse.getMsg().getEsito().equals("ERROR")) {
                    log.error("ERR_15: Errore nella creazione della cartella " + folderResponse.getMsg().getDettaglioMessagio());
                    System.out.println("Errore nell'applicazione: " + folderResponse.getMsg().getDettaglioMessagio());
                    messaggioErrore = folderResponse.getMsg().getDettaglioMessagio();
                    return messaggioErrore;
                } else {
                    request.getInfo().setIdFolder(folderResponse.getIdFolder());
                    log.info("salvo il file " + info.getNomeOriginale() + " in archivio");
                    System.out.println("salvo il file " + info.getNomeOriginale() + " in archivio");
                    // TODO WRITE
                    transformationFile.wrtiteToDisk("c:/certificati/provaCERT.pdf", certificatoType.getBin());
                    response = unidocClient.addFile(request);
                    if (response.getEsito().getEsito().toUpperCase().equals("OK")) {
                        log.info("salvo il file " + info.getNomeOriginale() + " su filesystem");
                        System.out.println("salvo il file " + info.getNomeOriginale() + " su filesystem");
                        request.setIdFile(response.getChiave());  //salvo la chiave del nuovo file
                        String idfile =String.valueOf(response.getChiave());
                        esito.append(unidocClient.postFileUpload(certificatoType.getBin(),idfile));
                        if (!(esito.toString().equals("OK"))) {
                            log.error("Il file con nome " + info.getNomeOriginale() + "  non è stato caricato motivo dettagli " + esito.toString());
                            System.out.println("Il file con nome " + info.getNomeOriginale() + "  non è stato caricato motivo dettagli " + esito.toString());
                            return esito.toString();
                        }
                    } else {
                        messaggioErrore = response.getEsito().getDettaglioMessagio();
                        log.error("Il file con nome " + info.getNomeOriginale() + "  non è stato caricato motivo dettagli " + messaggioErrore);
                        System.out.println("Il file con nome " + info.getNomeOriginale() + "  non è stato caricato motivo dettagli " + messaggioErrore);
                        return messaggioErrore;
                    }
                }
            }
        } catch (Exception e) {
            log.error("ERR_16: " + e.getMessage());
            messaggioErrore = "ERR_16: " + e.getMessage();
        }
        return messaggioErrore;
    }

    public String UploadEstratto(byte[] estratto, VeriData veriData,String codiceIndividuale, StringBuilder esito) {
        FileRequest request = new FileRequest();
        String messaggioErrore = "";
        FileMetatag info = new FileMetatag();
        Metadato metadato = new Metadato();
        List<Metadato> lMeta = new ArrayList<>();
        FileResponse response = null;
        try {
            request.setIdTipoDocumento(2);
            request.setRefIdFile(0);
            info.setTipoDocumento("ESTRATTO DI NASCITA");
            lMeta.add(transformationFile.createMetaDato("INTESTATARIO-COD_IND", codiceIndividuale));
            lMeta.add(transformationFile.createMetaDato("INTESTATARIO-COD_FIS", veriData.getCodiceFiscale()));
            lMeta.add(transformationFile.createMetaDato("INTESTATARIO-COGNOME", veriData.getCognome()));
            lMeta.add(transformationFile.createMetaDato("INTESTATARIO-NOME", veriData.getNome()));
            lMeta.add(transformationFile.createMetaDato("ORIGINE-UFFICIO-NOME", ""));
            lMeta.add(transformationFile.createMetaDato("CERTIFICATO-DATA_EMISSIONE", LocalDateTime.now().toString()));


            info.setNomeOriginale("ESTRATTO_NASCITA_COD-IND." + codiceIndividuale + ".pdf");
            info.setUtenteInserimento("SYSTEMJ");
            String path = "FASCICOLO_ELETTORALE\\";
            info.setPathFolder(path + codiceIndividuale);
            ArrayOfMetadato arrayOfMetadato = new ArrayOfMetadato();
            arrayOfMetadato.setMetadato(lMeta);
            info.setMetadati(arrayOfMetadato);
            //controllo se esiste già un certificato nel documentale
            UnidocTypes type = new UnidocTypes();
            type.setIdType(unidoctype.ESTRATTO_DI_NASCITA.ordinal());
            UnidocFolders unidocFolders = new UnidocFolders();
            ArrayOfUnidocTypes arrayOfUnidocTypes = new ArrayOfUnidocTypes();
            List<UnidocTypes> unidocTypes = new ArrayList<>();
            unidocTypes.add(type);
            arrayOfUnidocTypes.setUnidocTypes(unidocTypes);
            UnidocsMetadata searchMetadato = new UnidocsMetadata();
            searchMetadato.setIdMetadata(unidocmetadata.INTESTATARIO_COD_IND.ordinal());
            searchMetadato.setValueMetadata(codiceIndividuale);
            List<UnidocsMetadata> unidocsMetadata = new ArrayList<>();
            unidocsMetadata.add(searchMetadato);
            ArrayOfArrayOfUnidocsMetadata arrayOfArrayOfUnidocsMetadata = new ArrayOfArrayOfUnidocsMetadata();
            ArrayOfUnidocsMetadata arrayOfUnidocsMetadata = new ArrayOfUnidocsMetadata();
            arrayOfUnidocsMetadata.setUnidocsMetadata(unidocsMetadata);
            List<ArrayOfUnidocsMetadata> arrayOfUnidocsMetadataList = new ArrayList<>();
            arrayOfUnidocsMetadataList.add(arrayOfUnidocsMetadata);
            arrayOfArrayOfUnidocsMetadata.setArrayOfUnidocsMetadata(arrayOfUnidocsMetadataList);
            FileResponseList resFiles = unidocClient.searchFiles(null, arrayOfUnidocTypes, arrayOfArrayOfUnidocsMetadata);
            if (resFiles.getListFiles() != null && resFiles.getListFiles().getFileResponse().size() != 0) {
                Integer idFile = resFiles.getListFiles().getFileResponse().get(0).getMetatag().getIdFile();
                info.setRefIdPadre(idFile.toString());
                info.setMajorVersion(2);
            }
            request.setInfo(info);
            if (request.getInfo().getIdFolder() == 0) {
                log.info("creo la cartella per l'individuo: " + codiceIndividuale);
                System.out.println("creo la cartella per l'individuo: " + codiceIndividuale);
                FolderResponse folderResponse = unidocClient.creaNuovaCartella(request);
                if (folderResponse.getMsg().getEsito().equals("ERROR")) {
                    log.error("ERR_15: Errore nella creazione della cartella " + folderResponse.getMsg().getDettaglioMessagio());
                    System.out.println("Errore nell'applicazione: " + folderResponse.getMsg().getDettaglioMessagio());
                    messaggioErrore = folderResponse.getMsg().getDettaglioMessagio();
                    return messaggioErrore;
                } else {
                    request.getInfo().setIdFolder(folderResponse.getIdFolder());
                    log.info("salvo il file " + info.getNomeOriginale() + " in archivio");
                    System.out.println("salvo il file " + info.getNomeOriginale() + " in archivio");
                    response = unidocClient.addFile(request);
                    if (response.getEsito().getEsito().toUpperCase().equals("OK")) {
                        log.info("salvo il file " + info.getNomeOriginale() + " su filesystem");
                        System.out.println("salvo il file " + info.getNomeOriginale() + " su filesystem");
                        String idfile =String.valueOf(response.getChiave());
                        esito.append(unidocClient.postFileUploadRaw(estratto,idfile));
                        if (!(esito.toString().equals("OK"))) {
                            log.error("Il file con nome " + info.getNomeOriginale() + "  non è stato caricato motivo dettagli " + esito.toString());
                            System.out.println("Il file con nome " + info.getNomeOriginale() + "  non è stato caricato motivo dettagli " + esito.toString());
                            return esito.toString();
                        }
                    } else {
                        messaggioErrore = response.getEsito().getDettaglioMessagio();
                        log.error("Il file con nome " + info.getNomeOriginale() + "  non è stato caricato motivo dettagli " + messaggioErrore);
                        System.out.println("Il file con nome " + info.getNomeOriginale() + "  non è stato caricato motivo dettagli " + messaggioErrore);
                        return messaggioErrore;
                    }
                }
            }
        } catch (Exception e) {
            log.error("ERR_16: " + e.getMessage());
            messaggioErrore = "ERR_16: " + e.getMessage();
        }
        return messaggioErrore;

    }
}



