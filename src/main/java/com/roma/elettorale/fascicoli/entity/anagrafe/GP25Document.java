package com.roma.elettorale.fascicoli.entity.anagrafe;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GP25")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class GP25Document {

    @XmlElement(name = "CodiceIndividuale", required = true)
    private String CodiceIndividuale;

    @XmlElement(name = "verbaleCEC", required = true)
    private  String verbaleCEC;

    @XmlElement(name = "dataVerbaleCEC", required = true)
    private  String dataVerbaleCEC;

    @XmlElement(name = "MunicipioRoma", required = true)
    private  String MunicipioRoma;

    @XmlElement(name = "Municipio", required = true)
    private  String Municipio;

    @XmlElement(name = "CognomeNome", required = true)
    private  String CognomeNome;

    @XmlElement(name = "GiornoNascita", required = true)
    private  String GiornoNascita;

    @XmlElement(name = "MesaNascita", required = true)
    private  String MesaNascita;

    @XmlElement(name = "AnnoNascita", required = true)
    private  String AnnoNascita;

    @XmlElement(name = "Paternita", required = true)
    private  String Paternita;

    @XmlElement(name = "sezioneElettorale", required = true)
    private  String sezioneElettorale;

    @XmlElement(name = "numeroAtto", required = true)
    private  String numeroAtto;

    @XmlElement(name = "parteAtto", required = true)
    private  String parteAtto;

    @XmlElement(name = "serieAtto", required = true)
    private  String serieAtto;

    @XmlElement(name = "comuneNascita", required = true)
    private  String comuneNascita;

    @XmlElement(name = "indirizzoResidenza", required = true)
    private  String indirizzoResidenza;

    @XmlElement(name = "Firma", required = true)
    private  String Firma;

    @XmlElement(name = "titoloStudio", required = true)
    private  String titoloStudio;

    @XmlElement(name = "annoTitoloStudio", required = true)
    private  String annoTitoloStudio;

    @XmlElement(name = "dataNomina", required = true)
    private  String dataNomina;

    @XmlElement(name = "dataCancellazione", required = true)
    private  String dataCancellazione;

    @XmlElement(name = "motivoCancellazione", required = true)
    private  String motivoCancellazione;

    @XmlElement(name = "descrizioneCorte", required = true)
    private  String descrizioneCorte;
    @XmlElement(name = "istitutoTitoloStudio", required = true)
    private String istitutoTitoloStudio;

    @XmlElement(name = "professione", required = true)
    private String professione;

    public String getCodiceIndividuale() {
        return CodiceIndividuale;
    }

    public void setCodiceIndividuale(String codiceIndividuale) {
        CodiceIndividuale = codiceIndividuale;
    }

    public String getVerbaleCEC() {
        return verbaleCEC;
    }

    public void setVerbaleCEC(String verbaleCEC) {
        this.verbaleCEC = verbaleCEC;
    }

    public String getDataVerbaleCEC() {
        return dataVerbaleCEC;
    }

    public void setDataVerbaleCEC(String dataVerbaleCEC) {
        this.dataVerbaleCEC = dataVerbaleCEC;
    }

    public String getMunicipioRoma() {
        return MunicipioRoma;
    }

    public void setMunicipioRoma(String municipioRoma) {
        MunicipioRoma = municipioRoma;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }

    public String getCognomeNome() {
        return CognomeNome;
    }

    public void setCognomeNome(String cognomeNome) {
        CognomeNome = cognomeNome;
    }

    public String getGiornoNascita() {
        return GiornoNascita;
    }

    public void setGiornoNascita(String giornoNascita) {
        GiornoNascita = giornoNascita;
    }

    public String getMesaNascita() {
        return MesaNascita;
    }

    public void setMesaNascita(String mesaNascita) {
        MesaNascita = mesaNascita;
    }

    public String getAnnoNascita() {
        return AnnoNascita;
    }

    public void setAnnoNascita(String annoNascita) {
        AnnoNascita = annoNascita;
    }

    public String getPaternita() {
        return Paternita;
    }

    public void setPaternita(String paternita) {
        Paternita = paternita;
    }

    public String getSezioneElettorale() {
        return sezioneElettorale;
    }

    public void setSezioneElettorale(String sezioneElettorale) {
        this.sezioneElettorale = sezioneElettorale;
    }

    public String getNumeroAtto() {
        return numeroAtto;
    }

    public void setNumeroAtto(String numeroAtto) {
        this.numeroAtto = numeroAtto;
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

    public String getComuneNascita() {
        return comuneNascita;
    }

    public void setComuneNascita(String comuneNascita) {
        this.comuneNascita = comuneNascita;
    }

    public String getIndirizzoResidenza() {
        return indirizzoResidenza;
    }

    public void setIndirizzoResidenza(String indirizzoResidenza) {
        this.indirizzoResidenza = indirizzoResidenza;
    }

    public String getFirma() {
        return Firma;
    }

    public void setFirma(String firma) {
        Firma = firma;
    }

    public String getTitoloStudio() {
        return titoloStudio;
    }

    public void setTitoloStudio(String titoloStudio) {
        this.titoloStudio = titoloStudio;
    }

    public String getAnnoTitoloStudio() {
        return annoTitoloStudio;
    }

    public void setAnnoTitoloStudio(String annoTitoloStudio) {
        this.annoTitoloStudio = annoTitoloStudio;
    }

    public String getDataNomina() {
        return dataNomina;
    }

    public void setDataNomina(String dataNomina) {
        this.dataNomina = dataNomina;
    }

    public String getDataCancellazione() {
        return dataCancellazione;
    }

    public void setDataCancellazione(String dataCancellazione) {
        this.dataCancellazione = dataCancellazione;
    }

    public String getMotivoCancellazione() {
        return motivoCancellazione;
    }

    public void setMotivoCancellazione(String motivoCancellazione) {
        this.motivoCancellazione = motivoCancellazione;
    }

    public String getDescrizioneCorte() {
        return descrizioneCorte;
    }

    public void setDescrizioneCorte(String descrizioneCorte) {
        this.descrizioneCorte = descrizioneCorte;
    }

    public String getIstitutoTitoloStudio() {
        return istitutoTitoloStudio;
    }

    public void setIstitutoTitoloStudio(String istitutoTitoloStudio) {
        this.istitutoTitoloStudio = istitutoTitoloStudio;
    }

    public String getProfessione() {
        return professione;
    }

    public void setProfessione(String professione) {
        this.professione = professione;
    }
}
