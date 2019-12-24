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
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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

    public byte[] getPDF(String codiceindividuale, VeriData veriData, StringBuilder esito) throws ParserConfigurationException, IOException, SAXException {
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
            logger.error(ex.getMessage());
            throw ex;
        }
        return result;

    }

    private byte[] createPDF(GP25Document gp) {
        com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize.A4, 30, 30, 20, 30);
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
            Font white8 = new Font(FontFactory.getFont("Arial", 8, Font.NORMAL));
            Font white8B = new Font(FontFactory.getFont("Arial", 8, Font.BOLD));
            Font white10 = new Font(FontFactory.getFont("Arial", 10, Font.NORMAL));
            Font white10B = new Font(FontFactory.getFont("Arial", 10, Font.BOLD));
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
            border.setActive(false);
            Chunk protocollo = new Chunk("Prot. N: " + gp.getVerbaleCEC(), white10B);
            Paragraph pProtocollo = new Paragraph();
            pProtocollo.add(protocollo);
            pProtocollo.add(Chunk.NEWLINE);
            pProtocollo.add(new Chunk("Informazioni per FASCICOLO PERSONALE ", white8B));
            pProtocollo.add(Chunk.NEWLINE);
            pProtocollo.add(new Chunk("Elenchi dei giudici popolari di Corte di Assise e di Corte d'Assiste d'Appello relativa a:", white8B));
            pProtocollo.add(Chunk.NEWLINE);
            PdfPCell pdfProtocolloCell = new PdfPCell();
            pdfProtocolloCell.setBorder(0);
            pdfProtocolloCell.addElement(pProtocollo);
            float[] pointColumnWidths = {280F, 180F, 120F};
            PdfPTable tableHeader = new PdfPTable(pointColumnWidths);
            ;
            PdfPCell pdfGiudiciCell = new PdfPCell();
            pdfGiudiciCell.setBorder(0);
            Paragraph pGiudici = new Paragraph();
            pGiudici.add(Chunk.NEWLINE);
            pGiudici.add(new Chunk("GIUDICI POPOLARI", white10));
            pGiudici.add(Chunk.NEWLINE);
            pGiudici.add(new Chunk("SERVIZI ELETTORALI", white10));
            pGiudici.add(Chunk.NEWLINE);
            pGiudici.add(new Chunk("N. d'ordine:----------", white10));
            pdfGiudiciCell.addElement(pGiudici);
            PdfPCell pdfModelliCell = new PdfPCell();
            Paragraph pModelli = new Paragraph();
            pModelli.add(new Chunk("MOD. 25 G.P./U.D.", white10));
            pModelli.add(Chunk.NEWLINE);
            pModelli.add(Chunk.NEWLINE);
            pModelli.add(Chunk.NEWLINE);
            pModelli.add(new Chunk("MUNICIPIO " + gp.getMunicipioRoma(), white10));
            pdfModelliCell.setBorder(0);
            pdfModelliCell.addElement(pModelli);
            tableHeader.addCell(pdfProtocolloCell);
            tableHeader.addCell(pdfGiudiciCell);
            tableHeader.addCell(pdfModelliCell);
            tableHeader.setWidthPercentage(100);
            document.add(tableHeader);
            float[] pointColumnWidthsBody = {200F, 200F};
            PdfPTable tableBody = new PdfPTable(pointColumnWidthsBody);
            Paragraph pNomeCognome = new Paragraph();
            pNomeCognome.add(new Chunk(gp.getCognomeNome(), white12B));
            pNomeCognome.add(Chunk.NEWLINE);
            pNomeCognome.add(new Chunk("PATERNITA'", white12));
            pNomeCognome.add(Chunk.NEWLINE);
            pNomeCognome.add(new Chunk(gp.getPaternita(), white12B));
            pNomeCognome.add(Chunk.NEWLINE);
            PdfPCell pNomeCognomeCell = new PdfPCell();
            pNomeCognomeCell.addElement(Chunk.NEWLINE);
            pNomeCognomeCell.addElement(pNomeCognome);
            Paragraph pAttoNascita = new Paragraph();
            Paragraph pDataNascita = new Paragraph();
            border.setActive(true);
            pAttoNascita.add(new Chunk("ATTO DI NASCITA", white12));
            pAttoNascita.add(Chunk.NEWLINE);
            pAttoNascita.add(new Chunk("NUMERO ", white12));
            pAttoNascita.add(new Chunk(gp.getNumeroAtto(), white12B));
            pAttoNascita.add(new Chunk(" PARTE ", white12));
            pAttoNascita.add(new Chunk(gp.getParteAtto(), white12B));
            pAttoNascita.add(new Chunk(" SERIE ", white12));
            pAttoNascita.add(new Chunk(gp.getSerieAtto(), white12B));
            pAttoNascita.add(Chunk.NEWLINE);
            pAttoNascita.add(new Chunk("ANNO ", white12));
            pAttoNascita.add(new Chunk(gp.getAnnoAtto(), white12B));
            // pAttoNascita.add(new Chunk("NUMERO PARTE  SERIE ", white12));
            pNomeCognomeCell.addElement(pAttoNascita);
            pDataNascita.add(new Chunk("DATA DI NASCITA", white12));
            pDataNascita.add(Chunk.NEWLINE);
            pDataNascita.add(new Chunk("G. ", white12));
            pDataNascita.add(new Chunk(gp.getGiornoNascita(), white12B));
            pDataNascita.add(new Chunk(" M. ", white12));
            pDataNascita.add(new Chunk(gp.getMesaNascita(), white12B));
            pDataNascita.add(new Chunk(" A. ", white12));
            pDataNascita.add(new Chunk(gp.getAnnoNascita(), white12B));
            pNomeCognomeCell.addElement(pDataNascita);
            border.setActive(false);
            pNomeCognomeCell.setBorder(0);
            tableBody.addCell(pNomeCognomeCell);
            PdfPCell pSezioneCell = new PdfPCell();
            pNomeCognomeCell.addElement(Chunk.NEWLINE);
            //  border.setActive(true);
            Paragraph pSezione = new Paragraph();
            pSezione.add(Chunk.NEWLINE);
            pSezione.add(new Chunk("N. SEZIONE", white12));
            pSezione.add(Chunk.NEWLINE);
            pSezione.add(new Chunk(gp.getSezioneElettorale(), white12B));
            pSezione.add(Chunk.NEWLINE);
            Paragraph pFascicolo = new Paragraph();
            pFascicolo.add(new Chunk("N. FASCICOLO", white12));
            pFascicolo.add(Chunk.NEWLINE);
            pFascicolo.add(new Chunk(gp.getCodiceIndividuale(), white12B));
            pFascicolo.add(Chunk.NEWLINE);
            border.setActive(false);
            Paragraph pNascita = new Paragraph();
            pNascita.add(Chunk.NEWLINE);
            pNascita.add(new Chunk("COMUNE DI NASCITA ", white12));
            pNascita.add(new Chunk(gp.getComuneNascita(), white12B));
            Paragraph pAbitazione = new Paragraph();
            pAbitazione.add(new Chunk("ABITAZIONE ", white12));
            pAbitazione.add(new Chunk(gp.getIndirizzoResidenza(), white12B));
            pSezioneCell.addElement(pSezione);
            pSezioneCell.addElement(pFascicolo);
            pSezioneCell.addElement(pNascita);
            pSezioneCell.addElement(pAbitazione);
            pSezioneCell.setBorder(0);
            tableBody.addCell(pSezioneCell);
            tableBody.setWidthPercentage(100);
            document.add(tableBody);
            Paragraph pEsitoU = new Paragraph(Chunk.NEWLINE);
            pEsitoU.add(new Chunk("________________________________________________________________________________"));
            document.add(pEsitoU);
            Paragraph pEsito = new Paragraph();
            pEsito.add(new Chunk("Esito delle Informazioni", white10B));
            // pEsito.add(Chunk.NEWLINE);
            pEsito.setIndentationLeft(220);
            Paragraph pEsitoU1 = new Paragraph();
            pEsitoU1.add(new Chunk("________________________________________________________________________________"));
            pEsitoU1.add(Chunk.NEWLINE);
            document.add(pEsito);
            document.add(pEsitoU1);
            Paragraph pTitoloStudio = new Paragraph(Chunk.NEWLINE);
            pTitoloStudio.add(new Chunk("1-TITOLO DI STUDIO " + gp.getTitoloStudio(), white12));
            pTitoloStudio.add(Chunk.NEWLINE);
            pTitoloStudio.add(Chunk.NEWLINE);
            document.add(pTitoloStudio);
            Paragraph p = new Paragraph();
            p.add(new Chunk("Conseguito presso " + gp.getIstitutoTitoloStudio(), white12));
            p.add(Chunk.NEWLINE);
            p.add(Chunk.NEWLINE);
            p.add(new Chunk("Anno di conseguimento " + gp.getAnnoTitoloStudio(), white12));
            p.add(Chunk.NEWLINE);
            p.add(Chunk.NEWLINE);
            document.add(p);
            Paragraph pProfessione = new Paragraph();
            pProfessione.add(new Chunk("2-PROFESSIONE " + gp.getProfessione(), white12));
            pProfessione.add(Chunk.NEWLINE);
            pProfessione.add(Chunk.NEWLINE);
            document.add(pProfessione);
            Paragraph pDataNomina = new Paragraph();
            pDataNomina.add(new Chunk("3-DATA DI NOMINA " + gp.getDataNomina(), white12));
            pDataNomina.add(Chunk.NEWLINE);
            pDataNomina.add(Chunk.NEWLINE);
            document.add(pDataNomina);
            Paragraph pCorte = new Paragraph();
            pCorte.add(new Chunk("4-TIPO CORTE " + gp.getDescrizioneCorte(), white14));
            pCorte.add(Chunk.NEWLINE);
            pCorte.add(Chunk.NEWLINE);
            document.add(pCorte);
            Paragraph pNote = new Paragraph();
            pNote.add(new Chunk("NOTE: DATA DI CANCELLAZIONE " + gp.getDataCancellazione(), white12));
            pNote.add(Chunk.NEWLINE);
            pNote.add(Chunk.NEWLINE);
            pNote.add(new Chunk("MOTIVO " + gp.getMotivoCancellazione(), white12));
            pNote.add(Chunk.NEWLINE);
            pNote.add(Chunk.NEWLINE);
            document.add(pNote);
            float[] pointColumnWidthsCoda = {160F, 270F};
            PdfPTable tableCoda = new PdfPTable(pointColumnWidthsCoda);
            PdfPCell pdfChiusuraCell = new PdfPCell();
            Paragraph paragraph = new Paragraph();
            paragraph.add(new Chunk("Roma lì, " + gp.getDataVerbaleCEC()));
            pdfChiusuraCell.addElement(paragraph);
            Paragraph paragraphFirma = new Paragraph();
            paragraphFirma.add(new Chunk("Il Direttore, "));
            paragraphFirma.add(Chunk.NEWLINE);
            paragraphFirma.add(new Chunk(gp.getFirma()));
            paragraphFirma.setIndentationLeft(150);
            Paragraph paragraphFirma1 = new Paragraph();
            paragraphFirma1.setIndentationLeft(40);
            paragraphFirma1.add(new Chunk("Firma sostituita con indicazione a stampa del nominativo del soggetto responsabile Art 3 D. lgs. 39/93", white8));
            PdfPCell pdfFirmaCell = new PdfPCell();
            pdfFirmaCell.setBorder(0);
            pdfFirmaCell.setPaddingRight(0);
            pdfFirmaCell.addElement(paragraphFirma);
            pdfFirmaCell.addElement(paragraphFirma1);
            pdfChiusuraCell.setBorder(0);
            pdfChiusuraCell.setPaddingLeft(0);
            tableCoda.addCell(pdfChiusuraCell);
            tableCoda.addCell(pdfFirmaCell);
            tableCoda.setWidthPercentage(100);
            document.add(new Chunk(Chunk.NEWLINE));
            document.add(new Chunk(Chunk.NEWLINE));
            document.add(tableCoda);
            document.close();
        } catch (Exception ex) {
            logger.error("ERR_03: " + ex.getMessage());
        }
        return byteArrayOutputStream.toByteArray();

    }


}
