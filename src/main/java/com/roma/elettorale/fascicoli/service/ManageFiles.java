package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.sviluppo.contract.ICaricamentoService;
import com.roma.elettorale.fascicoli.sviluppo.contract.IPacchettoService;
import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;
import com.roma.elettorale.fascicoli.sviluppo.entity.pacchetto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
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
    IPacchettoService pacchettoService;
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
}
