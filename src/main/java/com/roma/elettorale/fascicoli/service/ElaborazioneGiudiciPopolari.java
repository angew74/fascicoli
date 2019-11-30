package com.roma.elettorale.fascicoli.service;


import com.roma.elettorale.fascicoli.entity.certi.CertificatoType;
import com.roma.elettorale.fascicoli.entity.veri.VeriData;
import com.roma.elettorale.fascicoli.helpers.MapperDeserializer;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import com.roma.elettorale.fascicoli.helpers.enumerators.statusoperazione;
import com.roma.elettorale.fascicoli.sviluppo.contract.ICaricamentoGiudiceService;
import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;
import com.roma.elettorale.fascicoli.sviluppo.entity.caricamentogiudice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class ElaborazioneGiudiciPopolari {

    Logger logger = LoggerFactory.getLogger(ElaborazioneGiudiciPopolari.class);

    @Autowired
    ICaricamentoGiudiceService caricamentoGiudiceService;

    @Autowired
    VeriData veriData;

    @Autowired
    AnagrafeClient anagrafeClient;

    @Autowired
    PortaApplicativaClient portaApplicativaClient;

    @Autowired
    TransformationFile transformationFile;

    @Autowired
    MapperDeserializer mapperDeserializer;

    @Autowired
    ElaborazioneEstratti elaborazioneEstratti;

    @Autowired
    ElaborazioneGP25 elaborazioneGP25;

    @Autowired
    ElaborazioneCertificati elaborazioneCertificati;

    @Autowired
    ElaborazioneCaricamentiUnidoc elaborazioneCaricamentiUnidoc;


    public void createFascicolo() throws ParserConfigurationException, SAXException, IOException {

        List<caricamentogiudice> caricamentos = caricamentoGiudiceService.findFirst1000ByFlgoperazioneAndCodicecertificato(statusoperazione.CARICATO.ordinal(),"GP25");
        String codiceindividuale = "";
        String codicecertificato = "";
        byte[] estratto = null;
        byte[] modello= null;
        int status = 0;
        StringBuilder esito = new StringBuilder();
        VeriData veriData = new VeriData();
        for (caricamentogiudice c : caricamentos) {
            esito = new StringBuilder();
            codicecertificato = c.getCodicecertificato();
            codiceindividuale = c.getCodiceindividuale();
            String stringDoc = anagrafeClient.GetVeri(codiceindividuale);
            if (stringDoc != null && (!stringDoc.equals(""))) {
                Document doc = transformationFile.convertStringToXMLDocument(stringDoc);
                veriData = veriData.CreateVeriDataFromXml(doc);
//                VerificaAnagraficaResponse vana = portaApplicativaClient.getService("VANA", codiceindividuale,"1");
                if (veriData.isTrovato()) {
                    logger.debug("persona trovata " + codiceindividuale);
                } else {
                    logger.debug("persona non trovata " + codiceindividuale);
                    status = statusoperazione.CITTADINO_NON_TROVATO.ordinal();
                    c.setFlgoperazione(status);
                    c.setDescrizioneerrore("CITTADINO NON TROVATO");
                    c.setDataoperazione(LocalDateTime.now());
                    caricamentoGiudiceService.Save(c);
                }
            }
            String codiceCerti = "";
            CertificatoType certificatoType = new CertificatoType();
            try {
                switch (codicecertificato) {
                    case "NAS": //nascita
                        codiceCerti = "C0001";
                        certificatoType = elaborazioneCertificati.elaboraCertificato(codiceindividuale, codiceCerti, veriData, esito);
                        if (esito.equals("")) {
                            String path = "FASCICOLO_ELETTORALE_GIUDICE_POPOLARE\\";
                            elaborazioneCaricamentiUnidoc.UpLoadCertificato(certificatoType, veriData, codiceindividuale, esito,path);
                            if (esito.equals("")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else if (esito.toString().equals("OK")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                            }
                            c.setFlgoperazione(status);
                            c.setDataoperazione(LocalDateTime.now());
                            caricamentoGiudiceService.Save(c);
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            c.setDataoperazione(LocalDateTime.now());
                            caricamentoGiudiceService.Save(c);
                        }
                        break;
                    case "CTD":
                        codiceCerti = "C0004";
                        certificatoType = elaborazioneCertificati.elaboraCertificato(codiceindividuale, codiceCerti, veriData, esito);
                        if (esito.toString().equals("")) {
                            String path = "FASCICOLO_ELETTORALE_GIUDICE_POPOLARE\\";
                            elaborazioneCaricamentiUnidoc.UpLoadCertificato(certificatoType, veriData, codiceindividuale, esito,path);
                            if (esito.toString().equals("OK")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                            }
                            c.setFlgoperazione(status);
                            c.setDataoperazione(LocalDateTime.now());
                            caricamentoGiudiceService.Save(c);
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            c.setDataoperazione(LocalDateTime.now());
                            caricamentoGiudiceService.Save(c);
                        }
                        break;
                    case "CTE":
                        codiceCerti = "C0005";
                        certificatoType = elaborazioneCertificati.elaboraCertificato(codiceindividuale, codiceCerti, veriData, esito);
                        if (esito.toString().equals("")) {
                            String path = "FASCICOLO_ELETTORALE_GIUDICE_POPOLARE\\";
                            elaborazioneCaricamentiUnidoc.UpLoadCertificato(certificatoType, veriData, codiceindividuale, esito,path);
                            if (esito.toString().equals("")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else if (esito.toString().equals("OK")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                            }
                            c.setFlgoperazione(status);
                            c.setDataoperazione(LocalDateTime.now());
                            caricamentoGiudiceService.Save(c);
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            c.setDataoperazione(LocalDateTime.now());
                            caricamentoGiudiceService.Save(c);
                        }
                        break;
                    case "CRS":  //residenza
                        codiceCerti = "C0006";
                        certificatoType = elaborazioneCertificati.elaboraCertificato(codiceindividuale, codiceCerti, veriData, esito);
                        if (esito.toString().equals("")) {
                            String path = "FASCICOLO_ELETTORALE_GIUDICE_POPOLARE\\";
                            elaborazioneCaricamentiUnidoc.UpLoadCertificato(certificatoType, veriData, codiceindividuale, esito,path);
                            if (esito.toString().equals("")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else if (esito.toString().equals("OK")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                            }
                            c.setDataoperazione(LocalDateTime.now());
                            c.setFlgoperazione(status);
                            caricamentoGiudiceService.Save(c);
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            c.setDataoperazione(LocalDateTime.now());
                            caricamentoGiudiceService.Save(c);
                        }
                        break;
                    case "RSE":  //residenza AIRE
                        codiceCerti = "C0007";
                        certificatoType = elaborazioneCertificati.elaboraCertificato(codiceindividuale, codiceCerti, veriData, esito);
                        if (esito.toString().equals("")) {
                            String path = "FASCICOLO_ELETTORALE_GIUDICE_POPOLARE\\";
                            elaborazioneCaricamentiUnidoc.UpLoadCertificato(certificatoType, veriData, codiceindividuale, esito,path);
                            if (esito.toString().equals("")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else if (esito.toString().equals("OK")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                            }
                            c.setFlgoperazione(status);
                            c.setDataoperazione(LocalDateTime.now());
                            caricamentoGiudiceService.Save(c);
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            c.setDataoperazione(LocalDateTime.now());
                            caricamentoGiudiceService.Save(c);
                        }
                        break;

                        case "GP25":
                            codiceCerti = "GP25";
                            modello = elaborazioneGP25.getPDF(codiceindividuale, veriData, esito);
                            if (esito.toString().equals("")) {
                                //  transformationFile.wrtiteToDisk("c:/certificati/prova.pdf", estratto);
                                String path = "FASCICOLO_ELETTORALE_GIUDICE_POPOLARE\\";
                                elaborazioneCaricamentiUnidoc.UploadGP25(modello, veriData, codiceindividuale, esito,path);
                                if (esito.toString().equals("OK")) {
                                    status = statusoperazione.ELABORATO.ordinal();
                                    c.setFlgoperazione(status);
                                    c.setDataoperazione(LocalDateTime.now());
                                    caricamentoGiudiceService.Save(c);
                                } else {
                                    status = statusoperazione.ERRORE.ordinal();
                                    c.setFlgoperazione(status);
                                    c.setDescrizioneerrore(esito.toString());
                                    c.setDataoperazione(LocalDateTime.now());
                                    caricamentoGiudiceService.Save(c);
                                }
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                                c.setFlgoperazione(status);
                                c.setDescrizioneerrore(esito.toString());
                                c.setDataoperazione(LocalDateTime.now());
                                caricamentoGiudiceService.Save(c);
                            }
                            break;
                    case "ESN":
                        codiceCerti = "ESN";
                        estratto = elaborazioneEstratti.getEstrattoNascita(codiceindividuale, veriData, esito);
                        if (esito.toString().equals("")) {
                            //  transformationFile.wrtiteToDisk("c:/certificati/prova.pdf", estratto);
                            String path = "FASCICOLO_ELETTORALE_GIUDICE_POPOLARE\\";
                            elaborazioneCaricamentiUnidoc.UploadEstratto(estratto, veriData, codiceindividuale, esito,path);
                            if (esito.toString().equals("OK")) {
                                status = statusoperazione.ELABORATO.ordinal();
                                c.setFlgoperazione(status);
                                c.setDataoperazione(LocalDateTime.now());
                                caricamentoGiudiceService.Save(c);
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                                c.setFlgoperazione(status);
                                c.setDescrizioneerrore(esito.toString());
                                c.setDataoperazione(LocalDateTime.now());
                                caricamentoGiudiceService.Save(c);
                            }
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            c.setDataoperazione(LocalDateTime.now());
                            caricamentoGiudiceService.Save(c);
                        }
                        break;
                }
            } catch (Exception ex) {
                logger.error("ERR_99: " + ex.getMessage());

            }
        }

    }
}
