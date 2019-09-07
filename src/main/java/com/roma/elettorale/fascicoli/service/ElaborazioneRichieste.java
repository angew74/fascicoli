package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.entity.VERICODRESPONSE;
import com.roma.elettorale.fascicoli.helpers.enumerators.statusoperazione;
import com.roma.elettorale.fascicoli.entity.TransformationFile;
import com.roma.elettorale.fascicoli.sviluppo.contract.ICaricamentoService;
import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import java.util.List;

@Component
public class ElaborazioneRichieste {


    Logger logger = LoggerFactory.getLogger(ManageFiles.class);

    @Autowired
    ICaricamentoService caricamentoService;

    @Autowired
    AnagrafeClient anagrafeClient;

    @Autowired
    TransformationFile tranS;

    @Autowired
    ElaborazioneEstratti elaborazioneEstratti;

    public void createCertificato() {
      //   List<caricamento> caricamentos = caricamentoService.findFirst1000ByFlgoperazione(0);
        List<caricamento> caricamentos = caricamentoService.findFirst1000ByFlgoperazioneAndCodicecertificato(0, "ESN");

        String codiceindividuale = "";
        String codicecertificato = "";
        String msg = "";
        VERICODRESPONSE.Verifica verifica = null;
        for (caricamento c : caricamentos) {
            codicecertificato = c.getCodicecertificato();
            codiceindividuale = c.getCodiceindividuale();
            Document doc = anagrafeClient.GetVeri(codiceindividuale);
            VERICODRESPONSE vericodresponse = new VERICODRESPONSE();
            if (doc != null) {
                vericodresponse = tranS.convertXmltoVericodResponse(doc.toString());
                verifica = vericodresponse.getVerifica();
                if (verifica.getRawXml() != null) {
                    logger.debug("persona trovata " + codiceindividuale);
                } else {
                    logger.debug("persona non trovata " + codiceindividuale);
                    int status = statusoperazione.CITTADINO_NON_TROVATO.ordinal();
                    c.setFlgoperazione(status);
                    c.setDescrizioneerrore("CITTADINO NON TROVATO");
                    caricamentoService.Save(c);
                }
            }
            String codiceCerti = "";
            switch (codicecertificato) {
                case "NAS": //nascita
                    byte[] estratto = elaborazioneEstratti.getEstrattoNascita(codiceindividuale,verifica,msg);
                  codiceCerti = "C0001";
                    break;
                case "CTD":
                    codiceCerti = "C0004";
                    break;
                case "CTE":
                    codiceCerti = "C0005";
                    break;
                case "CRS":  //residenza
                    codiceCerti = "C0006";
                    break;
                case "RSE":  //residenza AIRE
                    codiceCerti = "C0007";
                    break;
                case "ESN":
                    codiceCerti = "ESN";
                    break;
            }
            String esito = "";
            if (!codiceCerti.equals("") && !codiceCerti.equals("ESN")) {

                //   String esito = proxy.getCerti(codiceindividuale, codiceCerti, veriData,msg);

                if (!esito.equals("OK")) { //aggiorno il file degli scartati
                    int status = statusoperazione.ERRORE.ordinal();
                    c.setFlgoperazione(status);
                    c.setDescrizioneerrore(msg);

                }
                int status = statusoperazione.CARICATO.ordinal();
                c.setFlgoperazione(status);
            } else {
                //   String esito = proxy.caricaEstrattoNascita(codiceindividuale, veriData, msg);
                if (!esito.equals("OK")) {
                    int status = statusoperazione.ERRORE.ordinal();
                    c.setFlgoperazione(status);
                    c.setDescrizioneerrore(msg);
                }
                int status = statusoperazione.CARICATO.ordinal();
                c.setFlgoperazione(status);
            }

        }

    }
}
