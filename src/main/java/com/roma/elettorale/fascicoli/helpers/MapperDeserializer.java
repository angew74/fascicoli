package com.roma.elettorale.fascicoli.helpers;

import com.roma.elettorale.fascicoli.entity.veri.VERICODRESPONSE;
import org.apache.poi.util.StringUtil;
import org.hibernate.internal.util.xml.XmlDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.print.Doc;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class MapperDeserializer {


    // Caratteri speciali per il dialogo con Mapper (NON alterare)
    private String CHARTOCLEAN = "\\u0023";
    // [35] questo carattere, se presente, va tolto dai dati in uscita
    private String CHAR4CRLF = "\\u00A7";
    // [231] questo è il CRLF nei dati in uscita
    private String CHAR4SPLITVAL = "\\u007C";
    // [124] divide i valori dai marcatori (tag|valore)
    private String CHAR4SPACE = "¤";
    // [164] lo spazio, nei dati in entrata, va sostituito con questo

    Logger logger = LoggerFactory.getLogger(MapperDeserializer.class);
    @Autowired
    Environment env;
    @Autowired
    TransformationFile transformationFile;


    //<remarks> Trasforma la risposta Mapper in una struttura dati XML eventualmente
    // gerarchica a partire da un plain text formattato con separatori appositi.
    // Invece di produrre direttamente i tag per il documento, creo degli elementi
    // finti in un array in modo da poter avere uno o più di essi aperto per
    // inserirvi i successivi: quando avrò terminato il giro tutti i tag saranno
    // comunque chiusi (altrimenti i dati sono errati all'origine) e potrò caricarli
    // in un XMLDocument o in un XMLNode (lo farà il chiamante, io restituisco uno stream STRINGA)
    // ATTENZIONE: la utilizziamo anche da Unisys.CdR.CacheAnagrafe
    //</remarks>
    private Document PlainToXMLSerialized(String plainTextData, Boolean SkipSpecials) throws Exception {
        Document document = null;
        String[] arrayRitorno = stripEmptyData(plainTextData, true);
        StringBuilder arrayXML = new StringBuilder();
        String tmpValue = null;
        String tmpTag = null;
        Integer i = 0;
        Integer l = 0;
        l = arrayRitorno.length - 1;
        try {
            for (i = 0; i <= l; i++) {
                String[] tag = arrayRitorno[i].trim().split(CHAR4SPLITVAL);
                tmpValue = "";
                if(tag.equals("LIBRETTO"))
                {
                    String a= "";
                }
                tmpTag = tag[0].toString().trim();
                // PER ORA se c'è un dato sporco saltiamo il tag!!!
                if (tmpTag != null && !tmpTag.equals("")) {
                    // Faccio un cambio di case solo per i tag non sensibili
                    if (SkipSpecials) {
                        if (tag.length > 1) {
                            tmpValue = tag[1].toString().trim();
                        }
                    } else {
                        if (tag.length > 1) {
                            tmpValue = tag[1].toString().trim();
                        }
                    }
                    if (tmpValue.equals("{")) {
                        arrayXML.append("<" + tmpTag + ">");
                    } else if (tmpValue.equals("}")) {
                        arrayXML.append("</" + tmpTag + ">");
                    } else {
                        arrayXML.append("<" + tmpTag + ">");
                        arrayXML.append(tmpValue);
                        arrayXML.append("</" + tmpTag + ">");

                      //  myNode = document.createElement(tmpTag);
                      //  myNode.appendChild(document.createTextNode(tmpValue));
                      //  myNode.setTextContent(tmpValue);
                      //  rootElement.appendChild(myNode);
                      //  myNode = document.createElement(tmpTag);
                      //  myNode.appendChild(document.createTextNode(tmpValue));
                      ///  arrayXML.append(myNode.toString());
                    }
                }
            }
           String xmlAll = "<OpenTI>" + arrayXML.toString() + "</OpenTI>";
          document = transformationFile.ConvertStringToXmlDocument(xmlAll);

        } catch (Exception e) {
            logger.error("ERR_22 dettagli: " + e.getMessage() + " " + e.getStackTrace());
            throw new Exception("Errore imprevisto durante la elaborazione dei dati di ritorno dal sistema centrale.");
        }
        return document;
    }


    public Document CreateVerificaAnagraficaFromXml(Document document, String verificaName) {

        Document vana = null;
        JAXBContext jaxbContext;
        try {
            String xmlSring = transformationFile.ParsingTag("RawXml", document);
            vana = PlainToVerificaXML(xmlSring, verificaName);
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("ERR_20: " + ex.getMessage());
        }
        return vana;
    }

    //
    // Rimuove i caratteri sporchi, elimina i TAG vuoti (senza valori) e mi restituisce un array
    // spacchettando i TAG rimasti.....
    private String[] stripEmptyData(String Dati, boolean SkipSpecials) {
        if (SkipSpecials) {
            String dati = Dati.replace(CHARTOCLEAN, " ");
            String[] splits = dati.split(CHAR4CRLF);
            return splits;
        } else {
            StringBuilder s = new StringBuilder();
            s.append(CHAR4CRLF);
            s.append("[A-Z]*");
            s.append(CHAR4SPLITVAL);
            s.append(CHAR4CRLF);
            Pattern pattern = Pattern.compile(s.toString());
            String t = Dati.replace(CHARTOCLEAN, " ");
            Matcher matcher = pattern.matcher(t);
            while (matcher.find()) {
                t = matcher.replaceAll(CHAR4CRLF);
            }
            return t.split(CHAR4CRLF);
        }
    }

    public Document PlainToVerificaXML(String plainTextData, String xsl) {
        Document document = null;
        try {
            document = PlainToXMLSerialized(plainTextData, false);
            String stylesheet = (env.getProperty(xsl));
            String verfica = transformationFile.applyXSLToXml(document, stylesheet, false);
            document = transformationFile.ConvertStringToXmlDocument(verfica);

        } catch (Exception e) {

            logger.error("ERR_21 Errore trasformazione Xml Document dettagli: " + e.getMessage() + " " + e.getCause());
        }

        return document;
    }
}
