package com.roma.elettorale.fascicoli.entity.anagrafe;


import javax.xml.bind.annotation.*;
import java.io.Serializable;


@XmlRootElement(name = "EstrattoNascita" ,namespace = "http://tempuri.org/EstrNas.xsd")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class EstrattoNascita
{

    @XmlElement(name = "CodiceIndividuale", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String CodiceIndividuale;

    @XmlElement(name = "DataNas", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String DataNas;

    @XmlElement(name = "Risultanza", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Risultanze;

    @XmlElement(name = "EstrTesto", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String EstrTesto;

    @XmlElement(name = "Html", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Html;

    @XmlElement(name = "Ufficio", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Ufficio;

    @XmlElement(name = "ReadTab", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String ReadTab;

    @XmlElement(name = "Atto", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Atto;

    @XmlElement(name = "Firma", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Firma;

    @XmlElement(name = "Today", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Today;

    @XmlElement(name = "LuoNas", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String LuoNas;

    @XmlElement(name = "CognomeNome", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String CognomeNome;

    @XmlElement(name = "Codice", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Codice;

    @XmlElement(name = "Livello", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Livello;

    @XmlElement(name = "Descrizione", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Descrizione;

    @XmlElement(name = "Messaggio", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Messaggio;

    @XmlElement(name = "LogAtto", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String LogAtto;

    @XmlElement(name = "Sostituita", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String  Sostituita;

    @XmlElement(name = "Utente", namespace = "http://tempuri.org/EstrNas.xsd", required = true)
    private String Utente;


    public String getCodiceIndividuale() {
        return CodiceIndividuale;
    }

    public void setCodiceIndividuale(String codiceIndividuale) {
        CodiceIndividuale = codiceIndividuale;
    }

    public String getDataNas() {
        return DataNas;
    }

    public void setDataNas(String dataNas) {
        DataNas = dataNas;
    }

    public String getRisultanze() {
        return Risultanze;
    }

    public void setRisultanze(String risultanze) {
        Risultanze = risultanze;
    }

    public String getEstrTesto() {
        return EstrTesto;
    }

    public void setEstrTesto(String estrTesto) {
        EstrTesto = estrTesto;
    }

    public String getHtml() {
        return Html;
    }

    public void setHTML(String Html) {
        this.Html = Html;
    }

    public String getUfficio() {
        return Ufficio;
    }

    public void setUfficio(String ufficio) {
        this.Ufficio = ufficio;
    }

    public String getReadTab() {
        return ReadTab;
    }

    public void setReadTab(String readTab) {
        this.ReadTab = readTab;
    }

    public String getAtto() {
        return Atto;
    }

    public void setAtto(String atto) {
        Atto = atto;
    }

    public String getFirma() {
        return Firma;
    }

    public void setFirma(String firma) {
        this.Firma = firma;
    }

    public String getToday() {
        return Today;
    }

    public void setToday(String today) {
        Today = Today;
    }

    public String getLuoNas() {
        return LuoNas;
    }

    public void setLuoNas(String luoNas) {
        LuoNas = luoNas;
    }

    public String getCognomeNome() {
        return CognomeNome;
    }

    public void setCognomeNome(String cognomeNome) {
        CognomeNome = cognomeNome;
    }

    public String getCodice() {
        return Codice;
    }

    public void setCodice(String codice) {
        Codice = codice;
    }

    public String getLivello() {
        return Livello;
    }

    public void setLivello(String livello) {
        Livello = livello;
    }

    public String getDescrizione() {
        return Descrizione;
    }

    public void setDescrizione(String descrizione) {
        Descrizione = descrizione;
    }

    public String getMessaggio() {
        return Messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.Messaggio = messaggio;
    }

    public String getLogAtto() {
        return LogAtto;
    }

    public void setLogAtto(String logAtto) {
        this.LogAtto = logAtto;
    }

    public String getSostituita() {
        return Sostituita;
    }

    public void setSostituita(String sostituita) {
        Sostituita = sostituita;
    }

    public String getUtente() {
        return Utente;
    }

    public void setUtente(String utente) {
        Utente = utente;
    }
}
