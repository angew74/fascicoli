package com.roma.elettorale.fascicoli.helpers;

import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.html.simpleparser.StyleSheet;
import com.itextpdf.text.pdf.PdfStream;
import com.itextpdf.text.pdf.PdfWriter;
import com.roma.elettorale.fascicoli.entity.anagrafe.EstrattoNascita;
import com.roma.elettorale.fascicoli.entity.anagrafe.RichiestaEstratto;
import com.roma.elettorale.fascicoli.entity.veri.ObjectFactory;
import com.roma.elettorale.fascicoli.entity.veri.Ricerca;
import com.roma.elettorale.fascicoli.entity.veri.VERICODRESPONSE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.beans.Introspector;
import java.io.*;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;

@Component
public class TransformationFile {


    Logger logger = LoggerFactory.getLogger(TransformationFile.class);
    @Autowired
    Environment env;

    @Bean
    public Document convertStringToXMLDocument(String xmlString) {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();

            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
            logger.debug(e.getMessage());
        }
        return null;
    }

    public VERICODRESPONSE convertXmltoVericodResponse(String xmlString) {
        JAXBContext jaxbContext;
        VERICODRESPONSE vericodresponse = null;
        try {
            jaxbContext = JAXBContext.newInstance(VERICODRESPONSE.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            vericodresponse = (VERICODRESPONSE) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));

            System.out.println(vericodresponse);
        } catch (JAXBException e) {
            e.printStackTrace();
            logger.debug(e.getMessage());
        }
        return vericodresponse;
    }


    public EstrattoNascita convertXmltoEstrattoNascita(String xmlString) {
        JAXBContext jaxbContext;
        EstrattoNascita estrattoNascita = null;
        try {
            jaxbContext = JAXBContext.newInstance(VERICODRESPONSE.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            estrattoNascita = (EstrattoNascita) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));

            System.out.println(estrattoNascita);
        } catch (JAXBException e) {
            e.printStackTrace();
            logger.debug(e.getMessage());
        }
        return estrattoNascita;
    }


    @Bean
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
            throw new DataBindingException(e);
        }
    }

    public String applyXSLToXml(Document xmlFile, String xslStyleSheet) {
        String faticaFinale = "";
        try {
            File stylesheet = new File(xslStyleSheet);
            StreamSource stylesource = new StreamSource(stylesheet);
            byte[] bytes = xmlFile.toString().getBytes();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            StreamSource streamSource = new StreamSource(byteArrayInputStream);
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            Transformer transformer = TransformerFactory.newInstance()
                    .newTransformer(stylesource);

            transformer.transform(streamSource, result);
            String strResult = writer.toString();
            String strResultModificato = modificaOutput(strResult);
            faticaFinale = strResultModificato;
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return faticaFinale;
    }

    public byte[] createPdf(String Xmldocument)
    {
        String h = Xmldocument.replace("&lt;br&gt;", "<br />").replace("&lt;br /&gt;", "<br />");
      /* com.itextpdf.text.Document document;
        document = new com.itextpdf.text.Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream("src/output/html.pdf"));
            document.open();
            XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                    new FileInputStream(filename));
            document.close();
        }
        catch (Exception ex)
        {

        }*/
        com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize.A4, 40, 40, 20, 30);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {

            PdfWriter writer = PdfWriter.getInstance(document, byteArrayOutputStream);
            writer.setPdfVersion(PdfWriter.VERSION_1_7);
            writer.setCompressionLevel(PdfStream.BEST_COMPRESSION);
            writer.setFullCompression();
            // h.replace(@"\s"," ");
            // var spacesSquashed = Regex.Replace(h, @ "\s+", " ", RegexOptions.Singleline).Trim();

            document.open();
            com.itextpdf.text.html.simpleparser.HTMLWorker hw =
                    new com.itextpdf.text.html.simpleparser.HTMLWorker(document);
            StyleSheet style = new StyleSheet();

            Paragraph pLogo = new Paragraph();
            String IMG = env.getProperty("EstrattoLogo");
            Image image = Image.getInstance(IMG);
           //  PdfImage stream = new PdfImage(image, "", null);

         //   com.itextpdf.text.Image imagetimbro = com.itextpdf.text.Image.GetInstance(ati, com.itextpdf.WHITE);
            image.scalePercent(60);
         //    pLogo.setAlignment(Element.ALIGN_LEFT);
            pLogo.add(image);
            pLogo.setSpacingAfter(25);
            document.add(pLogo);
/*
            for(com.itextpdf.text.Element element : com.itextpdf.text.html.simpleparser.HTMLWorker.parseToList() ,style)
            {
                document.add(element);
            }
            foreach(IElement element in HTMLWorker.ParseToList(new System.IO.StringReader(spacesSquashed), style))
            {
                document.Add(element);
            }*/

            document.close();
        }
        catch (Exception ex)
        {

        }
        return byteArrayOutputStream.toByteArray();
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

    public String jaxbObjectToXML(Ricerca ricerca) {
        Locale.setDefault(Locale.ENGLISH);
        String xmlContent = "";
        try {
            //Create JAXB Context

            //    JAXBContext jaxbContext = JAXBContext.newInstance(Ricerca.class);
            //  JAXBContext jaxbContext = JAXBContext.newInstance("com.roma.elettorale.fascicoli.entity");
          //   JAXBContext jaxbContext = JAXBContext.newInstance("com.roma.elettorale.fascicoli.entity", com.roma.elettorale.fascicoli.entity.Ricerca.class.getClassLoader());
            JAXBContext jaxbContext = JAXBContext.newInstance(com.roma.elettorale.fascicoli.entity.veri.Ricerca.class, ObjectFactory.class);
            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Print XML String to Console
            StringWriter sw = new StringWriter();

            //Write XML to StringWriter
            jaxbMarshaller.marshal(ricerca, sw);

            //Verify XML Content
            xmlContent = sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return xmlContent;
    }

    public String jaxbRichiestaEstrattoToXML(RichiestaEstratto ricerca) {
        String xmlContent = "";
        try {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(RichiestaEstratto.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Print XML String to Console
            StringWriter sw = new StringWriter();

            //Write XML to StringWriter
            jaxbMarshaller.marshal(ricerca, sw);

            //Verify XML Content
            xmlContent = sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return xmlContent;
    }
}

