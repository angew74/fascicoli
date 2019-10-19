package com.roma.elettorale.fascicoli.entity.veri;

import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

@Component
public class VeriData {
    private boolean Trovato;
    private String CodiceFiscale;
    private String Nome;
    private String Cognome;
    private String DataNascita;
    private String CodiceIndividuale;
    private com.roma.elettorale.fascicoli.entity.veri.AttoNascita AttoNascita;

    @Autowired
    TransformationFile transformationFile;

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

    public VeriData CreateVeriDataFromXml(Document document) {
        VeriData vd = new VeriData();
        String codind = document.getElementsByTagName("CodiceIndiv").item(0).getTextContent();
        if (codind != null) {
            vd.setNome(transformationFile.ParsingTag("NomePersona", document));
            vd.setCognome(transformationFile.ParsingTag("CognomePersona", document));
            vd.setCodiceFiscale(transformationFile.ParsingTag("CodiceFiscale", document));
            vd.setDataNascita(transformationFile.ParsingTag("DataDiNascitaPersona", document));
            String xmlSring = transformationFile.ParsingTag("RawXml", document);
            vd.setAttoNascita(new AttoNascita());
            vd.getAttoNascita().Numero = readValueN("NATTNAS|",xmlSring, 5);
            vd.getAttoNascita().Parte = readValueN("PATTNAS|",xmlSring, 1);
            vd.getAttoNascita().Serie = readValueN("SATTNAS|",xmlSring, 1);
            vd.getAttoNascita().Esponente = readValueN("EATTNAS|",xmlSring, 2);
            vd.getAttoNascita().Anno = readValueN("AANAS|",xmlSring, 4);
            vd.setTrovato(true);
        }
        return vd;
    }


    public static String readValueN(String key ,String xmlString, int length) {
        int legnghtKey = key.length();
        int start = xmlString.lastIndexOf(key) + legnghtKey;
        int finish = start+ length;
        String value = xmlString.substring(start, finish);
        return value;
    }

    public static String ParseVeriCod(String[] arr, String key) {
        String valore = "";
        for (String s : arr) {
            String[] ss = s.split("|");
            if (ss[0].equals(key)) {
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

    public String getCodiceIndividuale() {
        return CodiceIndividuale;
    }

    public void setCodiceIndividuale(String codiceIndividuale) {
        CodiceIndividuale = codiceIndividuale;
    }
}



