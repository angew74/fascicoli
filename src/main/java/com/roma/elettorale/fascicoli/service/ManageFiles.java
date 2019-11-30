package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.helpers.enumerators.statusoperazione;
import com.roma.elettorale.fascicoli.sviluppo.contract.*;
import com.roma.elettorale.fascicoli.sviluppo.entity.*;
import org.apache.commons.collections4.iterators.NodeListIterator;
import org.apache.commons.lang3.mutable.MutableInt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Component
public class ManageFiles {

    Logger logger = LoggerFactory.getLogger(ManageFiles.class);

    @Autowired
    ICaricamentoService caricamentoService;

    @Autowired
    ICasellarioService casellarioService;

    @Autowired
    IPenaliService penaliService;

    @Autowired
    IPacchettoService pacchettoService;

    @Autowired
    IPacchettoGiudiceService pacchettoGiudiceService;

    @Autowired
    ICaricamentoGiudiceService caricamentoGiudiceService;

    public Boolean leggifile(File filetoload)
    {

        Boolean tuttapposto = false;
        List<caricamento> l = new ArrayList<caricamento>();
        String codiceindividuale = "";
        String certificato ="";
        pacchetto p = null;
        int contatore =0;
        try {
           caricamento a = new caricamento();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(filetoload);
            NodeList certificatiNodes = doc.getElementsByTagName("certificati-xml");
            for(int i=0; i<certificatiNodes.getLength(); i++)
            {
                Node certificatoNode = certificatiNodes.item(i);
                if(certificatoNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    p = new pacchetto();
                    p.setFilecaricamento(filetoload.getName());
                    Integer n = pacchettoService.maxNumero();
                    n++;
                    p.setNumero(n.toString());
                    LocalDate dat = LocalDate.now();
                    p.setDatacarimento(dat);
                    Element certificatiElement = (Element) certificatoNode;
                    NodeList listCertificati = certificatiElement.getElementsByTagName("certificato");
                    int totale = listCertificati.getLength();
                    p.setNumerocodici(totale);
                    pacchettoService.save(p);
                    for(int k=0; k<listCertificati.getLength();k++) {
                        Element certificatoElement = (Element) listCertificati.item(k);
                        String codind = certificatoElement.getElementsByTagName("codind").item(0).getTextContent();
                        NodeList tipoCerti = certificatoElement.getElementsByTagName("tipoCerti");
                        for (int z = 0; z < tipoCerti.getLength(); z++) {
                            a = new caricamento();
                            a.setCodiceindividuale(codind);
                            a.setRefidpacchetto(Integer.parseInt(p.getNumero().toString()));
                            Element codiceCertificatoElement = (Element) tipoCerti.item(z);
                            String codiceCertificato = codiceCertificatoElement.getTextContent();
                            a.setCodicecertificato(codiceCertificato);
                            a.setProgrammaelaborazione("CARICAMENTO");
                            a.setFlgoperazione(0);
                            LocalDateTime now = LocalDateTime.now();
                            a.setDataoperazione(now);
                            caricamentoService.Save(a);
                            contatore++;
                        }
                    }
                }
            }
            p.setNumerorecord(contatore);
            pacchettoService.save(p);
            tuttapposto = true;

        }
        catch (Exception ex)
        {
            logger.debug(ex.getMessage());
            logger.debug(certificato);
            logger.debug(codiceindividuale);
            return tuttapposto;
        }
        return  tuttapposto;
    }

    public Boolean leggifilePenali(String destDirRiepilogo,String destDirNegativi, String destDirPositivi)
    {

        Boolean tuttapposto = false;
        List<penali> l = new ArrayList<penali>();
        String idelemento ="0";
        int idcasellario = 0;
        String codicefiscale = "";
        StringBuilder idcasellarioBuilder = new StringBuilder();
        casellario c = null;
        penali penale = null;
        try {
            NodeList riepiloghiNodes = SaveCasellarioRiepilogo(destDirRiepilogo, idcasellarioBuilder);
            for(int i=0; i<riepiloghiNodes.getLength(); i++)
            {
                Node soggettoNode = riepiloghiNodes.item(i);
                if(soggettoNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    penale = new penali();
                    idcasellario = Integer.parseInt(idcasellarioBuilder.toString());
                    penale.setRefidcasellario(idcasellario);
                    LocalDateTime dat = LocalDateTime.now();
                    penale.setDataoperazione(dat);
                    penale.setFlgoperazione(statusoperazione.CARICATO.ordinal());
                    Element soggettoElement = (Element) soggettoNode;
                    penale.setId(Integer.parseInt(soggettoElement.getElementsByTagName("idElemento").item(0).getTextContent()));
                    penale.setNome(soggettoElement.getElementsByTagName("nome").item(0).getTextContent());
                    if(soggettoElement.getElementsByTagName("codFiscale").getLength() > 0) {
                        penale.setCodicefiscale(soggettoElement.getElementsByTagName("codFiscale").item(0).getTextContent());
                        codicefiscale = penale.getCodicefiscale();
                    }
                    penale.setCognome(soggettoElement.getElementsByTagName("cognome").item(0).getTextContent());
                    if(soggettoElement.getElementsByTagName("sinonimi").getLength() > 0) {
                        penale.setSinonimi(soggettoElement.getElementsByTagName("sinonimi").item(0).getTextContent());
                    }
                    if(soggettoElement.getElementsByTagName("aliasRichiamo").getLength() > 0) {
                        penale.setAliasrichiamo(soggettoElement.getElementsByTagName("aliasRichiamo").item(0).getTextContent());
                    }
                    if(soggettoElement.getElementsByTagName("esito").getLength() > 0) {
                        penale.setEsito(soggettoElement.getElementsByTagName("esito").item(0).getTextContent());
                    }
                    if(soggettoElement.getElementsByTagName("descEsito").getLength() > 0) {
                        penale.setDescrizioneEsito(soggettoElement.getElementsByTagName("descEsito").item(0).getTextContent());
                    }
                    idelemento = penale.getId().toString();
                    if(penale.getEsito().equals("003")) {
                        penale.setPathFile(destDirNegativi+ "\\" + penale.getId().toString()+".pdf");
                    }
                    else {
                        penale.setPathFile(destDirPositivi+"\\" + penale.getId().toString()+".pdf");
                    }
                    penaliService.Save(penale);
                }
            }
            c = casellarioService.findById(penale.getRefidcasellario());
            File fileToDelete = new File(destDirRiepilogo + "\\" + c.getFilecaricamento());
            fileToDelete.delete();
            tuttapposto = true;
        }
        catch (Exception ex)
        {
            logger.debug(ex.getMessage());
            logger.debug(codicefiscale);
            logger.debug(idelemento);
            return tuttapposto;
        }
        return  tuttapposto;
    }

        NodeList SaveCasellarioRiepilogo(String destDirRiepilogo, StringBuilder idcasellario)
    {
        File DirRiepilogo = new File(destDirRiepilogo);
        File riepilogo = null;
        NodeList riepiloghiNodes = null;
        try {
            for (File r : DirRiepilogo.listFiles()) {
                riepilogo = r;
            }
          // parte sperimentale
        //    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(riepilogo),"UTF8"));
            InputStream inputStream= new FileInputStream(riepilogo);
            Reader reader = new InputStreamReader(inputStream,"UTF-8");
            InputSource is = new InputSource(reader);
            is.setEncoding("UTF-8");
            // fine parte sperimentale
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(is);
            riepiloghiNodes = doc.getElementsByTagName("soggetto");
            int id = Integer.parseInt(doc.getElementsByTagName("idRichiesta").item(0).getTextContent());
            casellario c = new casellario();
            c.setDatacarimento(LocalDate.now());
            c.setId(id);
            c.setFilecaricamento(riepilogo.getName());
            c.setNumerorecord(riepiloghiNodes.getLength());
            casellarioService.save(c);
            idcasellario.append(id);
        }
        catch (Exception ex)
        {
            logger.debug(ex.getMessage());
            logger.debug(destDirRiepilogo);
        }
        return riepiloghiNodes;
    }

    public Boolean leggifileGiudiciPopolari(File filetoload)
    {
        Boolean tuttapposto = false;
        List<caricamentogiudice> l = new ArrayList<caricamentogiudice>();
        String codiceindividuale = "";
        String certificato ="";
        pacchettogiudice p = null;
        int contatore =0;
        try {
            caricamentogiudice a = new caricamentogiudice();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(filetoload);
            NodeList certificatiNodes = doc.getElementsByTagName("certificati-xml");
            for(int i=0; i<certificatiNodes.getLength(); i++)
            {
                Node certificatoNode = certificatiNodes.item(i);
                if(certificatoNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    p = new pacchettogiudice();
                    p.setFilecaricamento(filetoload.getName());
                    Integer n = pacchettoGiudiceService.maxNumero();
                    n++;
                    p.setNumero(n.toString());
                    LocalDate dat = LocalDate.now();
                    p.setDatacarimento(dat);
                    Element certificatiElement = (Element) certificatoNode;
                    NodeList listCertificati = certificatiElement.getElementsByTagName("certificato");
                    int totale = listCertificati.getLength();
                    p.setNumerocodici(totale);
                    pacchettoGiudiceService.save(p);
                    for(int k=0; k<listCertificati.getLength();k++) {
                        Element certificatoElement = (Element) listCertificati.item(k);
                        String codind = certificatoElement.getElementsByTagName("codind").item(0).getTextContent();
                        NodeList tipoCerti = certificatoElement.getElementsByTagName("tipoCerti");
                        for (int z = 0; z < tipoCerti.getLength(); z++) {
                            a = new caricamentogiudice();
                            a.setCodiceindividuale(codind);
                            a.setRefidpacchetto(Integer.parseInt(p.getNumero().toString()));
                            Element codiceCertificatoElement = (Element) tipoCerti.item(z);
                            String codiceCertificato = codiceCertificatoElement.getTextContent();
                            a.setCodicecertificato(codiceCertificato);
                            a.setProgrammaelaborazione("CARICAMENTO");
                            a.setFlgoperazione(0);
                            LocalDateTime now = LocalDateTime.now();
                            a.setDataoperazione(now);
                            caricamentoGiudiceService.Save(a);
                            contatore++;
                        }
                    }
                }
            }
            p.setNumerorecord(contatore);
            pacchettoGiudiceService.save(p);
            tuttapposto = true;

        }
        catch (Exception ex)
        {
            logger.debug(ex.getMessage());
            logger.debug(certificato);
            logger.debug(codiceindividuale);
            return tuttapposto;
        }
        return  tuttapposto;
    }
}
