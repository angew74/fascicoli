package com.roma.elettorale.fascicoli.service;


import com.roma.elettorale.fascicoli.entity.certi.CertificatoType;
import com.roma.elettorale.fascicoli.entity.pap.VerificaAnagrafica;
import com.roma.elettorale.fascicoli.entity.pap.VerificaAnagraficaResponse;
import com.roma.elettorale.fascicoli.entity.veri.VERICODRESPONSE;
import com.roma.elettorale.fascicoli.entity.veri.VeriData;
import com.roma.elettorale.fascicoli.helpers.MapperDeserializer;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import com.roma.elettorale.fascicoli.helpers.enumerators.statusoperazione;
import com.roma.elettorale.fascicoli.sviluppo.contract.ICaricamentoService;
import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class ElaborazioneRichieste {


    Logger logger = LoggerFactory.getLogger(ManageFiles.class);

    @Autowired
    ICaricamentoService caricamentoService;

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
    ElaborazioneCertificati elaborazioneCertificati;

    @Autowired
    ElaborazioneCaricamentiUnidoc elaborazioneCaricamentiUnidoc;

    public void createCertificato() {
        //   List<caricamento> caricamentos = caricamentoService.findFirst1000ByFlgoperazione(0);
        List<caricamento> caricamentos = caricamentoService.findFirst1000ByFlgoperazioneAndCodicecertificato(statusoperazione.CARICATO.ordinal(), "ESN");
        String codiceindividuale = "";
        String codicecertificato = "";
        byte[] estratto = null;
        int status = 0;
        StringBuilder esito = new StringBuilder();
        VeriData veriData = new VeriData();
        for (caricamento c : caricamentos) {
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
                    caricamentoService.Save(c);
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
                            elaborazioneCaricamentiUnidoc.UpLoadCertificato(certificatoType, veriData, codiceindividuale, esito);
                            if (esito.equals("")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                            }
                            c.setFlgoperazione(status);
                            caricamentoService.Save(c);
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            caricamentoService.Save(c);
                        }
                        break;
                    case "CTD":
                        codiceCerti = "C0004";
                        certificatoType = elaborazioneCertificati.elaboraCertificato(codiceindividuale, codiceCerti, veriData, esito);
                        if (esito.toString().equals("")) {
                            elaborazioneCaricamentiUnidoc.UpLoadCertificato(certificatoType, veriData, codiceindividuale, esito);
                            if (esito.toString().equals("")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                            }
                            c.setFlgoperazione(status);
                            caricamentoService.Save(c);
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            caricamentoService.Save(c);
                        }
                        break;
                    case "CTE":
                        codiceCerti = "C0005";
                        certificatoType = elaborazioneCertificati.elaboraCertificato(codiceindividuale, codiceCerti, veriData, esito);
                        if (esito.toString().equals("")) {
                            elaborazioneCaricamentiUnidoc.UpLoadCertificato(certificatoType, veriData, codiceindividuale, esito);
                            if (esito.toString().equals("")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                            }
                            c.setFlgoperazione(status);
                            caricamentoService.Save(c);
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            caricamentoService.Save(c);
                        }
                        break;
                    case "CRS":  //residenza
                        codiceCerti = "C0006";
                        certificatoType = elaborazioneCertificati.elaboraCertificato(codiceindividuale, codiceCerti, veriData, esito);
                        if (esito.toString().equals("")) {
                            elaborazioneCaricamentiUnidoc.UpLoadCertificato(certificatoType, veriData, codiceindividuale, esito);
                            if (esito.toString().equals("")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                            }
                            c.setFlgoperazione(status);
                            caricamentoService.Save(c);
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            caricamentoService.Save(c);
                        }
                        break;
                    case "RSE":  //residenza AIRE
                        codiceCerti = "C0007";
                        certificatoType = elaborazioneCertificati.elaboraCertificato(codiceindividuale, codiceCerti, veriData, esito);
                        if (esito.toString().equals("")) {
                            elaborazioneCaricamentiUnidoc.UpLoadCertificato(certificatoType, veriData, codiceindividuale, esito);
                            if (esito.toString().equals("")) {
                                status = statusoperazione.ELABORATO.ordinal();
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                            }
                            c.setFlgoperazione(status);
                            caricamentoService.Save(c);
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            caricamentoService.Save(c);
                        }
                        break;
                    case "ESN":
                        codiceCerti = "ESN";
                        estratto = elaborazioneEstratti.getEstrattoNascita(codiceindividuale, veriData, esito);
                        if (esito.toString().equals("")) {
                            transformationFile.wrtiteToDisk("c:/certificati/prova.pdf", estratto);
                            elaborazioneCaricamentiUnidoc.UploadEstratto(estratto, veriData, codiceindividuale, esito);
                            if (esito.toString().equals("OK")) {
                                status = statusoperazione.ELABORATO.ordinal();
                                c.setFlgoperazione(status);
                                c.setDataoperazione(LocalDateTime.now());
                                caricamentoService.Save(c);
                            } else {
                                status = statusoperazione.ERRORE.ordinal();
                                c.setFlgoperazione(status);
                                c.setDescrizioneerrore(esito.toString());
                                caricamentoService.Save(c);
                            }
                        } else {
                            status = statusoperazione.ERRORE.ordinal();
                            c.setFlgoperazione(status);
                            c.setDescrizioneerrore(esito.toString());
                            caricamentoService.Save(c);
                        }
                        break;
                }
            } catch (Exception ex) {
                logger.error("ERR_99: " + ex.getMessage());

            }
        }

    }
}
