package com.roma.elettorale.fascicoli.helpers.enumerators;

public enum statusfiles {
   I("INSERITO"), C("CANCELLATO"), O("OBSOLETO"), A("ATTESA_FILE");

    public final String label;

    private statusfiles(String label) {
        this.label = label;
    }
}
