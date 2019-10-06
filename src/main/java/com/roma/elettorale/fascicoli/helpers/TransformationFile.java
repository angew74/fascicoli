package com.roma.elettorale.fascicoli.helpers;

import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfStream;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.StringUtils;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.roma.elettorale.fascicoli.entity.anagrafe.EstrattoNascita;
import com.roma.elettorale.fascicoli.entity.anagrafe.RichiestaEstratto;
import com.roma.elettorale.fascicoli.entity.unidoc.Metadato;
import com.roma.elettorale.fascicoli.entity.unidoc.Upload;
import com.roma.elettorale.fascicoli.entity.unidoc.UploadResponse;
import com.roma.elettorale.fascicoli.entity.veri.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.*;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.beans.Introspector;
import java.io.*;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;

@Component
public class TransformationFile {


    Logger logger = LoggerFactory.getLogger(TransformationFile.class);
    @Autowired
    Environment env;


    public Document convertStringToXMLDocument(String xmlString) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = null;
        Document document = null;
        try {
            builder = factory.newDocumentBuilder();
            document = builder.parse(new ByteArrayInputStream(xmlString.replace("#", "").getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
            logger.debug("ERR_05: " + e.getMessage());
        }
        return document;
    }



    static void recurse(NodeList list) {
        if (list == null || list.getLength() == 0) {
            return;
        } else {
            for (int i = 0; i < list.getLength(); i++) {
                Node item = list.item(i);
                System.out.println(item);
                recurse(item.getChildNodes());
            }
        }
    }

    public VERICODRESPONSE convertXmltoVericodResponse(String xmlString) {
        JAXBContext jaxbContext;
        VERICODRESPONSE vericodresponse = null;
        try {
            jaxbContext = JAXBContext.newInstance(com.roma.elettorale.fascicoli.entity.veri.VERICODRESPONSE.class, ObjectFactoryVeri.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            vericodresponse = (VERICODRESPONSE) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));
            System.out.println(vericodresponse);
        } catch (JAXBException e) {
            e.printStackTrace();
            logger.debug("ERR_04: " + e.getMessage());
        }
        return vericodresponse;
    }



    public Upload convertXmltoUploadResponse(String xmlString)
    {
        JAXBContext jaxbContext;
        Upload uploadResponse = null;
        try {
            jaxbContext = JAXBContext.newInstance(com.roma.elettorale.fascicoli.entity.unidoc.Upload.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            uploadResponse = (Upload) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));
        } catch (JAXBException e) {
            e.printStackTrace();
            logger.error("ERR_26: " + e.getMessage());
        }
        return uploadResponse;
    }

    public EstrattoNascita convertXmltoEstrattoNascita(String xmlString) {
        JAXBContext jaxbContext;
        EstrattoNascita estrattoNascita = null;
        try {
            jaxbContext = JAXBContext.newInstance(com.roma.elettorale.fascicoli.entity.anagrafe.EstrattoNascita.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            String file = xmlString.replace("#", " ");
            estrattoNascita = (EstrattoNascita) jaxbUnmarshaller.unmarshal(new StringReader(file));
        } catch (JAXBException e) {
            e.printStackTrace();
            logger.error("ERR_06: " + e.getMessage());
        }
        return estrattoNascita;
    }



    public static String getParamsString(Map<String, String> params)
            throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }

        String resultString = result.toString();
        return resultString.length() > 0
                ? resultString.substring(0, resultString.length() - 1)
                : resultString;
    }

    public Document convertClassToDocument(Object o) {

        Document document = null;
        try {
            Class<?> clazz = o.getClass();
            JAXBContext context = JAXBContext.newInstance(clazz);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true); // remove xml prolog
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // formatted output
            final QName name = new QName(Introspector.decapitalize(clazz.getSimpleName()));
            JAXBElement jaxbElement = new JAXBElement(name, clazz, o);
            StringWriter sw = new StringWriter();
            marshaller.marshal(jaxbElement, sw);
            document = convertStringToXMLDocument(sw.toString());
            return document;
        } catch (JAXBException e) {
            logger.debug("ERR_07: " + e.getMessage());
            throw new DataBindingException(e);
        }
    }

    public String applyXSLToXml(Document xmlFile, String xslStyleSheet,Boolean IsEstratto) {
        String faticaFinale = "";
        try {
            File stylesheet = new File(xslStyleSheet);
            StreamSource stylesource = new StreamSource(stylesheet);
            Source xmlSource = new DOMSource(xmlFile);
            DOMResult result = new DOMResult();
            Transformer transformer = TransformerFactory.newInstance()
                    .newTransformer(stylesource);
            transformer.transform(xmlSource, result);
            // prova
            StreamResult console = new StreamResult(System.out);
            transformer.transform(xmlSource, console);
            // fine prova
            Document aff = (Document) result.getNode();
            if(IsEstratto) {
                faticaFinale = modificaOutput(convertDocumentToString(aff));
            }
            else {
                faticaFinale = convertDocumentToString(aff);
            }
        } catch (TransformerException e) {
            logger.debug("ERR_08: " + e.getMessage());
            e.printStackTrace();
        }
        return faticaFinale;
    }


    public Metadato createMetaDato(String nomeMetadato, String valoreMetaDato) {

        Metadato m = new Metadato();
        m.setValoreMetadato(valoreMetaDato);
        m.setNomeMetadato(nomeMetadato);
        return m;
    }

    public String getNomeCertificatoMetaDato(String codice)
    {
        String nomeCertificato = "";
        switch (codice)
        {
            case "C0001":
                nomeCertificato = "NASCITA";
                break;
            case "C0004":
                nomeCertificato = "CITTADINANZA";
                break;
            case "C0005":
                nomeCertificato = "CITTADINANZA_AIRE";
                break;
            case "C0006":
                nomeCertificato = "RESIDENZA";
                break;
            case "C0007":
                nomeCertificato = "RESIDENZA_AIRE";
                break;

        }
        return  nomeCertificato;
    }

    public Document ConvertStringToXmlDocument(String xmlString)
    {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try
        {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();
            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        }
        catch (Exception e)
        {
            logger.error("ERR_22 dettagli: "  +e.getMessage() + " "+ e.getCause());
            e.printStackTrace();
        }
        return null;
    }


    public byte[] createPdf(String Xmldocument) {
        String h = Xmldocument.replace("&lt;br&gt;", "<br />").replace("&lt;br /&gt;", "<br />");
        com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize.A4, 40, 40, 20, 30);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {

            ByteArrayInputStream inputStream = new ByteArrayInputStream(h.getBytes());
            PdfWriter writer = PdfWriter.getInstance(document, byteArrayOutputStream);
            writer.setPdfVersion(PdfWriter.VERSION_1_7);
            writer.setCompressionLevel(PdfStream.BEST_COMPRESSION);
            writer.setFullCompression();
            document.open();
            Paragraph pLogo = new Paragraph();
            String IMG = env.getProperty("EstrattoLogo");
            Image image = Image.getInstance(IMG);
            image.scalePercent(60);
            pLogo.add(image);
            pLogo.setSpacingAfter(25);
            document.add(pLogo);
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, inputStream);
            document.close();
        } catch (Exception ex) {
            logger.error("ERR_03: " + ex.getMessage());
        }
        return byteArrayOutputStream.toByteArray();
    }


    public void wrtiteToDisk(String path, byte[] out) {

        try {

            File file = new File(path);
            OutputStream
                    os
                    = new FileOutputStream(file);
            os.write(out);
            System.out.println("Successfully"
                    + " byte inserted");
            os.close();
        } catch (Exception e) {
            logger.debug("ERR_09: " + e.getMessage());
            System.out.println("Exception: " + e);
        }
    }

    private static String modificaOutput(String output) {
        if (output.contains("ATTENZIONE")) {
            String rep = "<font class=\"xBold\">ATTENZIONE";
            String rep2 = "<font color=\"red\" style=\"font-weight: bold\">ATTENZIONE";
            output = output.replace(rep, rep2);
        }

        if (output.contains("ESISTE OSTATIVA")) {
            String rep = "<font class=\"xBold\">ESISTE OSTATIVA";
            String rep2 = "<font color=\"red\" style=\"font-weight: bold\">ESISTE OSTATIVA";
            output = output.replace(rep, rep2);
        }
        String whattostrip = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n<xsl:stylesheet version=\"2.0\" ";
        output = output.replace(whattostrip, "");
        whattostrip = "<html xmlns=\"http://tempuri.org/DefinizioneResponse.xsd\">";
        output = output.replace(whattostrip, "");
        whattostrip = "dd/mm/yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatDateTime = LocalDateTime.now().format(formatter);
        output = output.replace(whattostrip, formatDateTime);
        output.replace("\r\n", "").replace("\t", "");
        return output;
    }

    public String jaxbObjectToXMLVericod(VERICOD vericod) {
        Locale.setDefault(Locale.ENGLISH);
        String xmlContent = "";
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(com.roma.elettorale.fascicoli.entity.veri.VERICOD.class, ObjectFactory.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(vericod, sw);
            xmlContent = sw.toString();
        } catch (JAXBException e) {
            logger.debug("ERR_10: " + e.getMessage());
            e.printStackTrace();
        }
        return xmlContent;
    }

    public String convertDocumentToString(Document doc) throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer trans = tf.newTransformer();
        StringWriter sw = new StringWriter();
        trans.transform(new DOMSource(doc), new StreamResult(sw));
        return sw.toString();
    }

    public String jaxbRichiestaEstrattoToXML(RichiestaEstratto ricerca) {
        String xmlContent = "";
        Locale.setDefault(Locale.ENGLISH);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(com.roma.elettorale.fascicoli.entity.anagrafe.RichiestaEstratto.class, com.roma.elettorale.fascicoli.entity.anagrafe.ObjectFactory.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(ricerca, sw);
            xmlContent = sw.toString();
        } catch (JAXBException e) {
            logger.debug("ERR_11: " + e.getMessage());
            e.printStackTrace();
        }
        return xmlContent;
    }

    public static String ParsingTag(String tag, Document document) {
        return document.getElementsByTagName(tag).item(0).getTextContent();
    }

    public String Decrypt(String str, String thePassword)
    {
        String returnValue = null;
        byte[] SALT = { 73,
                118,
                97,
                110,
                32,
                77,
                101,
                100,
                118,
                101,
                100,
                101,
                118 };
        try
        {
           // String thePassword = "%cFRm*F)N9Rq[6#5";
            PasswordDeriveBytes passwordDeriveBytes = new PasswordDeriveBytes(thePassword,SALT);

            byte[] encryptedData = DatatypeConverter.parseBase64Binary(str);
            byte[] key = passwordDeriveBytes.getBytes(32);
            byte[] IV =  passwordDeriveBytes.getBytes(16);
            MessageDigest digest = MessageDigest.getInstance("MD5");
            SecretKeySpec password = new SecretKeySpec(digest.digest(thePassword.getBytes()), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec IVParamSpec = new IvParameterSpec(IV);
            cipher.init(Cipher.DECRYPT_MODE, password, IVParamSpec);
            byte[] decryptedVal = cipher.doFinal(encryptedData);
            returnValue = new String(decryptedVal);
            return new String(decryptedVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}



/*
    public static String Decrypt(String cipherText, String Password) {
        byte[] cipherBytes = Base64.getDecoder().decode(cipherText);
        PasswordDeriveBytes pdb = new PasswordDeriveBytes(Password, new byte[] {
                73,
                118,
                97,
                110,
                32,
                77,
                101,
                100,
                118,
                101,
                100,
                101,
                118});
        byte[] decryptedData = Decrypt(cipherBytes, pdb.GetBytes(32), pdb.GetBytes(16));
       String r = Base64.getEncoder().encodeToString(decryptedData);
        return r;
    }
*/



