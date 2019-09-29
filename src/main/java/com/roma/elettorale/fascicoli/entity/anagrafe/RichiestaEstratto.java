package com.roma.elettorale.fascicoli.entity.anagrafe;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "RichiestaEstratto")
public class RichiestaEstratto
{


  //  @XmlElement(name = "CodiceIndividuale", required = true)
    private String codiceIndividuale;

    //@XmlElement(name = "CodiceFiscale", required = true)
    private String codiceFiscale;

    //@XmlElement(name = "Sesso", required = false)
    private String sesso;

    //@XmlElement(name = "Cognome", required = false)
    private String cognome;

   // @XmlElement(name = "Nome", required = false)
    private String nome;

 //   @XmlElement(name = "AANas", required = false)
    private String aANas;

  //  @XmlElement(name = "MMNas", required = false)
    private String mMNas;

  //  @XmlElement(name = "GGNas", required = false)
    private String gGNas;

 //   @XmlElement(name = "NumAtto", required = true)
    private String numAtto;

//    @XmlElement(name = "ParteAtto", required = true)
    private String parteAtto;

  //  @XmlElement(name = "SerieAtto", required = true)
    private String serieAtto;

 //   @XmlElement(name = "AnnoAtto", required = true)
    private String annoAtto;

//    @XmlElement(name = "Utente", required = true)
    private String utente;

  //  @XmlElement(name = "Dipartimento", required = true)
    private String dipartimento;

   // @XmlElement(name = "Password", required = true)
    private String password;

    private String giornRichiesta;

    private String meseRichiesta;

    private String annoRichiesta;

    private String dataEvento;

    public String getCodiceIndividuale() {
        return codiceIndividuale;
    }

    public void setCodiceIndividuale(String codiceIndividuale) {
        this.codiceIndividuale = codiceIndividuale;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getaANas() {
        return aANas;
    }

    public void setaANas(String aANas) {
        this.aANas = aANas;
    }

    public String getmMNas() {
        return mMNas;
    }

    public void setmMNas(String mMNas) {
        this.mMNas = mMNas;
    }

    public String getgGNas() {
        return gGNas;
    }

    public void setgGNas(String gGNas) {
        this.gGNas = gGNas;
    }

    public String getNumAtto() {
        return numAtto;
    }

    public void setNumAtto(String numAtto) {
        this.numAtto = numAtto;
    }

    public String getParteAtto() {
        return parteAtto;
    }

    public void setParteAtto(String parteAtto) {
        this.parteAtto = parteAtto;
    }

    public String getSerieAtto() {
        return serieAtto;
    }

    public void setSerieAtto(String serieAtto) {
        this.serieAtto = serieAtto;
    }

    public String getAnnoAtto() {
        return annoAtto;
    }

    public void setAnnoAtto(String annoAtto) {
        this.annoAtto = annoAtto;
    }

    public String getUtente() {
        return utente;
    }

    public void setUtente(String utente) {
        this.utente = utente;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGiornRichiesta() {
        return giornRichiesta;
    }

    public void setGiornRichiesta(String giornRichiesta) {
        this.giornRichiesta = giornRichiesta;
    }

    public String getMeseRichiesta() {
        return meseRichiesta;
    }

    public void setMeseRichiesta(String meseRichiesta) {
        this.meseRichiesta = meseRichiesta;
    }

    public String getAnnoRichiesta() {
        return annoRichiesta;
    }

    public void setAnnoRichiesta(String annoRichiesta) {
        this.annoRichiesta = annoRichiesta;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }
}
