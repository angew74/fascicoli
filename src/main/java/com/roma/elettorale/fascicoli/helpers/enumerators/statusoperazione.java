package com.roma.elettorale.fascicoli.helpers.enumerators;

import org.springframework.stereotype.Component;


public enum statusoperazione {
    CARICATO,
    ELABORATO,
    ERRORE,
    FILE_NON_ESISTENTE,
    NIENTE,
    CITTADINO_NON_TROVATO,
    TROVATI_PIU_CITTADINI
}
