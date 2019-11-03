package com.roma.elettorale.fascicoli.helpers.enumerators;

import org.springframework.stereotype.Component;

import java.util.Dictionary;
import java.util.Hashtable;

@Component
public class decodificamessaggi {

    private static Dictionary<String, String> dict
            = new Hashtable<String, String>();

    decodificamessaggi()
    {
        getDict().put("000011", "Contattare Ufficio Annotazioni");
        getDict().put("000012", "Cittadino non trovato");
        getDict().put("000013", "Cert. Sosp. a seguito P.P. N 46710/04 P.M. 31508/04 GIP Rivolgersi Anagrafe");
        getDict().put("000014", "Residuale pratica non presente");
        getDict().put("000015", "Eccessivo numero di individui");
        getDict().put("000276", "Nessuna risposta in base ai criteri inseriti");
        getDict().put("000277", "Controcodice errato");
        getDict().put("000282", "CODICE NON NUMERICO");
        getDict().put("000526", "Non è stato possibile interrogare i sistemi centrali");
        getDict().put("000728", " Eccessivo numero di individui da stampare - Raffinare la ricerca");

    }

    public static Dictionary<String, String> getDict() {
        return dict;
    }

    public void setDict(Dictionary<String, String> dict) {
        this.dict = dict;
    }
    // Inserting the values into dictionary


}
