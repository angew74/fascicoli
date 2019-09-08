package com.roma.elettorale.fascicoli.entity.veri;



public class VeriData {
    private boolean Trovato;
    private String CodiceFiscale;
    private String Nome;
    private String Cognome;
    private String DataNascita;
    private com.roma.elettorale.fascicoli.entity.veri.AttoNascita AttoNascita;

    public static VeriData CreateVeriData(String vericodResp) {
        VeriData vd = new VeriData();
        if (vericodResp.contains("CODFIS")) {
            String[] arr = vericodResp.split("§");
            vd.setNome(ParseVeriCod(arr, "NOME"));
            vd.setCognome(ParseVeriCod(arr, "COGN"));
            vd.setCodiceFiscale(ParseVeriCod(arr, "CODFIS"));
            vd.setDataNascita(String.format("{0}/{1}/{2}", ParseVeriCod(arr, "GNAS"), ParseVeriCod(arr, "MNAS"), ParseVeriCod(arr, "ANAS")));
            vd.setAttoNascita(new AttoNascita());
            vd.getAttoNascita().Numero = ParseVeriCod(arr, "NATTNAS");
            vd.getAttoNascita().Parte = ParseVeriCod(arr, "PATTNAS");
            vd.getAttoNascita().Serie = ParseVeriCod(arr, "SATTNAS");
            vd.getAttoNascita().Esponente = ParseVeriCod(arr, "EATTNAS");
            vd.getAttoNascita().Anno = ParseVeriCod(arr, "AANAS");
            vd.setTrovato(true);
        }
        return vd;
    }

    public static String ParseVeriCod(String[] arr, String key) {
        String valore = "";
        for (String s : arr) {
            String[] ss = s.split("|");
            if(ss[0].equals(key))
            {
                valore = ss[1];
            }
        }
        return valore;
    }

    public boolean isTrovato() {
        return Trovato;
    }

    public void setTrovato(boolean trovato) {
        Trovato = trovato;
    }

    public String getCodiceFiscale() {
        return CodiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        CodiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public String getDataNascita() {
        return DataNascita;
    }

    public void setDataNascita(String dataNascita) {
        DataNascita = dataNascita;
    }

    public AttoNascita getAttoNascita() {
        return AttoNascita;
    }

    public void setAttoNascita(AttoNascita attoNascita) {
        AttoNascita = attoNascita;
    }
}


