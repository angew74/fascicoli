package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlElement;

public class message {


    @XmlElement(name = "Codice", namespace = "http://tempuri.org/")
    private String codice;

    @XmlElement(name = "DescrizioneMessaggio", namespace = "http://tempuri.org/")
    private String descrizioneMessaggio;

    @XmlElement(name = "Attore", namespace = "http://tempuri.org/")
    private String attore;

    @XmlElement(name = "Livello", namespace = "http://tempuri.org/")
    private String livello;

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizioneMessaggio() {
        return descrizioneMessaggio;
    }

    public void setDescrizioneMessaggio(String descrizioneMessaggio) {
        this.descrizioneMessaggio = descrizioneMessaggio;
    }

    public String getAttore() {
        return attore;
    }

    public void setAttore(String attore) {
        this.attore = attore;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }
}
