package com.roma.elettorale.fascicoli.service;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfStream;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.roma.elettorale.fascicoli.entity.anagrafe.GP25Document;
import com.roma.elettorale.fascicoli.entity.veri.VeriData;
import com.roma.elettorale.fascicoli.helpers.ParagraphBorder;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.stream.Stream;


@Component
public class ElaborazioneGP25 {

    @Autowired
    Environment env;

    @Autowired
    AnagrafeClient anagrafeClient;

    @Autowired
    TransformationFile ttransformation;

    Logger logger = LoggerFactory.getLogger(AnagrafeClient.class);

    public byte[] getPDF(String codiceindividuale, VeriData veriData, StringBuilder esito) throws ParserConfigurationException {
        byte[] result = null;
        esito.append("");
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.newDocument();
            // create the root element node
            Element element = doc.createElement("CodiceIndividuale");
            element.setNodeValue(codiceindividuale);
            element.setTextContent(codiceindividuale);
            doc.appendChild(element);
            String gp25Document = anagrafeClient.GetGP25(doc);
            Document documentGP25 = ttransformation.convertStringToXMLDocument(gp25Document);
            GP25Document gp = ttransformation.convertXmltoGP25(documentGP25);
            result = createPDF(gp);
        } catch (Exception ex) {

        }
        return result;

    }

    private byte[] createPDF(GP25Document gp) {
        com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize.A4, 40, 40, 20, 30);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {

            PdfWriter writer = PdfWriter.getInstance(document, byteArrayOutputStream);
            writer.setPdfVersion(PdfWriter.VERSION_1_7);
            writer.setCompressionLevel(PdfStream.BEST_COMPRESSION);
            writer.setFullCompression();
            ParagraphBorder border = new ParagraphBorder();
            writer.setPageEvent(border);
            document.open();
            document.addTitle("Documento Integrazione Giudice Popolare per fascicolo numero " + gp.getCodiceIndividuale());
            document.addSubject("FASCICOLO GIUDICI POPOLARI");
            document.addCreator("ROMA CAPITALE");
            document.addAuthor("n.r.");
            Paragraph pLogo = new Paragraph();
            String IMG = env.getProperty("EstrattoLogo");
            Image image = Image.getInstance(IMG);
            image.scalePercent(60);
            pLogo.add(image);
            pLogo.setSpacingAfter(25);
            document.add(pLogo);
            Font white10 = new Font(FontFactory.getFont("Arial", 10, Font.NORMAL));
            Font white12 = new Font(FontFactory.getFont("Arial", 12, Font.NORMAL));
            Font white12B = new Font(FontFactory.getFont("Arial", 12, Font.BOLD));
            Font white14 = new Font(FontFactory.getFont("Arial", 14, Font.NORMAL));
            Font white14B = new Font(FontFactory.getFont("Arial", 14, Font.BOLD));
            Font white16 = new Font(FontFactory.getFont("Arial", 16, Font.NORMAL));
            Font white16B = new Font(FontFactory.getFont("Arial", 16, Font.BOLD));
            Font white18 = new Font(FontFactory.getFont("Arial", 18, Font.NORMAL));
            Font white18B = new Font(FontFactory.getFont("Arial", 18, Font.BOLD));
            Font white20 = new Font(FontFactory.getFont("Arial", 20, Font.NORMAL));
            Font white20B = new Font(FontFactory.getFont("Arial", 20, Font.BOLD));
            Font white22 = new Font(FontFactory.getFont("Arial", 22, Font.NORMAL));
            Font white22B = new Font(FontFactory.getFont("Arial", 22, Font.BOLD));
            Font white24 = new Font(FontFactory.getFont("Arial", 24, Font.NORMAL));
            Font white24B = new Font(FontFactory.getFont("Arial", 24, Font.BOLD));
            Font white15 = new Font(FontFactory.getFont("Arial", 15, Font.NORMAL));
            Font white15B = new Font(FontFactory.getFont("Arial", 15, Font.BOLD));
            Chunk protocollo = new Chunk("Prot. N: " + gp.getVerbaleCEC(), white15B);
            Paragraph pProtocollo = new Paragraph();
            pProtocollo.add(Chunk.NEWLINE);
            pProtocollo.add(new Chunk("Richiesta di Informazioni per la integrazione e", white15B));
            pProtocollo.add(Chunk.NEWLINE);
            pProtocollo.add(new Chunk("l'aggiornamento degli elenchi dei giudici", white15B));
            pProtocollo.add(Chunk.NEWLINE);
            pProtocollo.add(new Chunk("popolari di Corte di Assise e di Corte d'Assiste", white15B));
            pProtocollo.add(Chunk.NEWLINE);
            pProtocollo.add(new Chunk(" d'Appello relativa a: ", white15B));
            PdfPCell pdfProtocolloCell = new PdfPCell();
            pdfProtocolloCell.addElement(pdfProtocolloCell);
            float[] pointColumnWidths = {150F, 150F, 150F};
            PdfPTable tableHeader = new PdfPTable(pointColumnWidths);
            tableHeader.addCell(pdfProtocolloCell);
            PdfPCell pdfGiudiciCell = new PdfPCell();
            Paragraph pGiudici = new Paragraph();
            pGiudici.add(Chunk.NEWLINE);
            pGiudici.add(new Chunk("GIUDICI POPOLARI", white18));
            pGiudici.add(Chunk.NEWLINE);
            pGiudici.add(new Chunk("SERVIZI ELETTORALI", white18));
            pGiudici.add(new Chunk("N. d'ordine:----------", white16));
            pdfGiudiciCell.addElement(pGiudici);
            tableHeader.addCell(pdfGiudiciCell);
            PdfPCell pdfModelliCell = new PdfPCell();
            Paragraph pModelli = new Paragraph();
            pModelli.add(new Chunk("MOD. 25 G.P./U.D.", white16));
            pModelli.add(Chunk.NEWLINE);
            pModelli.add(Chunk.NEWLINE);
            pModelli.add(Chunk.NEWLINE);
            pModelli.add(new Chunk("AL MUNICIPIO " + gp.getMunicipioRoma(), white18));
            pdfModelliCell.addElement(pModelli);
            tableHeader.addCell(pdfModelliCell);
            document.add(tableHeader);
            float[] pointColumnWidthsBody = {150F, 150F, 150F};
            PdfPTable tableBody = new PdfPTable(pointColumnWidths);
            Paragraph pNomeCognome = new Paragraph(new Chunk(gp.getCognomeNome(), white22B));
            pNomeCognome.add(Chunk.NEWLINE);
            pNomeCognome.add(new Chunk("PATERNITA'", white22));
            pNomeCognome.add(Chunk.NEWLINE);
            pNomeCognome.add(new Chunk(gp.getPaternita(), white22B));
            pNomeCognome.add(Chunk.NEWLINE);
            PdfPCell pNomeCognomeCell = new PdfPCell();
            pNomeCognomeCell.addElement(pNomeCognome);
            Paragraph pAttoNascita = new Paragraph();
            Paragraph pDataNascita = new Paragraph();
            border.setActive(true);
            pAttoNascita.add(new Chunk("ATTO DI NASCITA", white18));
            pAttoNascita.add(Chunk.NEWLINE);
            pAttoNascita.add(new Chunk(gp.getNumeroAtto() + " " + gp.getParteAtto() + " " + gp.getSerieAtto(), white18B));
            pAttoNascita.add(new Chunk("NUMERO PARTE  SERIE ", white18));
            pNomeCognomeCell.addElement(pAttoNascita);
            pDataNascita.add(new Chunk("DATA DI NASCITA", white18));
            pDataNascita.add(Chunk.NEWLINE);
            pDataNascita.add(new Chunk(gp.getGiornoNascita() + " " + gp.getMesaNascita() + " " + gp.getAnnoNascita(), white18B));
            pDataNascita.add(new Chunk("G  M  A ", white18));
            pNomeCognomeCell.addElement(pDataNascita);
            border.setActive(false);
            tableBody.addCell(pNomeCognomeCell);
            PdfPCell pSezioneCell = new PdfPCell();
            border.setActive(true);
            Paragraph pSezione = new Paragraph();
            pSezione.add(new Chunk("N. SEZIONE", white18));
            pSezione.add(Chunk.NEWLINE);
            pSezione.add(new Chunk(gp.getSezioneElettorale(), white18B));
            pSezione.add(Chunk.NEWLINE);
            Paragraph pFascicolo = new Paragraph();
            pFascicolo.add(new Chunk("N. FASCICOLO", white18));
            pFascicolo.add(Chunk.NEWLINE);
            pFascicolo.add(new Chunk(gp.getCodiceIndividuale(), white18B));
            pFascicolo.add(Chunk.NEWLINE);
            border.setActive(false);
            Paragraph pNascita = new Paragraph();
            pNascita.add(Chunk.NEWLINE);
            pNascita.add(new Chunk("COMUNE DI NASCITA " + gp.getComuneNascita(), white20));
            Paragraph pAbitazione = new Paragraph();
            pAbitazione.add(Chunk.NEWLINE);
            pAbitazione.add(new Chunk("ABITAZIONE " + gp.getIndirizzoResidenza(), white20));
            pSezioneCell.addElement(pSezione);
            pSezioneCell.addElement(pFascicolo);
            pSezioneCell.addElement(pNascita);
            pSezioneCell.addElement(pAbitazione);
            tableBody.addCell(pSezioneCell);
            Paragraph pEsito = new Paragraph(Chunk.NEWLINE);
            pEsito.add(new Chunk("_________________________________________________________"));
            pEsito.add(new Chunk("_________________________________________________________"));
            pEsito.add(new Chunk("Esito delle Informazioni",white18B));
            document.add(pEsito);
            Paragraph pTitoloStudio = new Paragraph();
            pTitoloStudio.add(new Chunk("1-TITOLO DI STUDIO " + gp.getTitoloStudio(), white20));
            document.add(pTitoloStudio);
            Paragraph p = new Paragraph();
            p.add(new Chunk("Conseguito presso " + gp.getIstitutoTitoloStudio(),white20));
            p.add(Chunk.NEWLINE);
            p.add(new Chunk("Anno di conseguimento " + gp.getAnnoTitoloStudio(),white20));
            p.add(Chunk.NEWLINE);
            document.add(p);
            Paragraph pProfessione = new Paragraph();
            pProfessione.add(new Chunk("2-PROFESSIONE " + gp.getProfessione(), white20));
            pProfessione.add(Chunk.NEWLINE);
            pProfessione.add(Chunk.NEWLINE);
            pProfessione.add(Chunk.NEWLINE);
            document.add(pProfessione);
            Paragraph pDataNomina = new Paragraph();
            pDataNomina.add(new Chunk("3-DATA DI NOMINA " + gp.getDataNomina(), white20));
            pDataNomina.add(Chunk.NEWLINE);
            pDataNomina.add(Chunk.NEWLINE);
            pDataNomina.add(Chunk.NEWLINE);
            document.add(pDataNomina);
            Paragraph pCorte= new Paragraph();
            pCorte.add(new Chunk("3-TIPO CORTE " + gp.getDescrizioneCorte(), white20));
            pCorte.add(Chunk.NEWLINE);
            pCorte.add(Chunk.NEWLINE);
            pCorte.add(Chunk.NEWLINE);
            document.add(pCorte);
            Paragraph pNote= new Paragraph();
            pNote.add(new Chunk("NOTE: DATA DI CANCELLAZIONE " + gp.getDataCancellazione(), white20));
            pNote.add(new Chunk("MOTIVO " + gp.getMotivoCancellazione(), white20));
            pNote.add(Chunk.NEWLINE);
            pNote.add(Chunk.NEWLINE);
            pNote.add(Chunk.NEWLINE);
            document.add(pNote);
            float[] pointColumnWidthsCoda = {150F, 150F, 150F};
            PdfPTable tableCoda = new PdfPTable(pointColumnWidthsCoda);
            PdfPCell pdfChiusuraCell = new PdfPCell();
            Paragraph paragraph = new Paragraph();
            paragraph.add(new Chunk("Roma lì, " + gp.getDataVerbaleCEC() ));
            pdfChiusuraCell.addElement(paragraph);
            Paragraph paragraphFirma = new Paragraph();
            paragraphFirma.add(new Chunk("Il Direttore, "));
            paragraphFirma.add(Chunk.NEWLINE);
            paragraphFirma.add(new Chunk(gp.getFirma()));
            paragraphFirma.add(Chunk.NEWLINE);
            paragraphFirma.add("Firma sostituita con indicazione a stampa del nominativo");
            paragraphFirma.add(Chunk.NEWLINE);
            paragraphFirma.add("del soggetto responsabile Art 3 D. lgs. 39/93");
            pdfChiusuraCell.addElement(paragraphFirma);
            tableCoda.addCell(pdfChiusuraCell);
            document.close();
        } catch (Exception ex) {
            logger.error("ERR_03: " + ex.getMessage());
        }
        return byteArrayOutputStream.toByteArray();

    }


}
