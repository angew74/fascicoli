package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.entity.certi.CertificatoType;
import com.roma.elettorale.fascicoli.entity.veri.VeriData;
import com.roma.elettorale.fascicoli.helpers.enumerators.statusoperazione;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ElaborazioneCertificati {

    private static final Logger log = LoggerFactory.getLogger(ElaborazioneCertificati.class);

    @Autowired
    CertificatiClient certificatiClient;

    public CertificatoType elaboraCertificato(String codiceindividuale, String codiceCerti, VeriData veriData, StringBuilder esito) {
        esito.append("");
        CertificatoType certificatoType = new CertificatoType();
        try {
            certificatoType = certificatiClient.GeneraCertificato("SYSTEM", codiceindividuale, "127.0.0.1", codiceCerti, esito);
            if (esito.equals("") && !certificatoType.isEmettibile()) { //aggiorno il file degli scartati
                esito.append("Certificato non emettibile");
            }
        } catch (Exception ex) {
            log.error("ERR_19: " + ex.getMessage());
            esito.append("ERR_19: " + ex.getMessage());
        }
        return certificatoType;
    }
}
