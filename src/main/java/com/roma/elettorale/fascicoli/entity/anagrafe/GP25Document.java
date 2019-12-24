package com.roma.elettorale.fascicoli.entity.anagrafe;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GP25", namespace = "http://tempuri.org/GP25.xsd")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class GP25Document {

    @XmlElement(name = "CodiceIndividuale",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private String CodiceIndividuale;

    @XmlElement(name = "verbaleCEC",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String VerbaleCEC;

    @XmlElement(name = "dataVerbaleCEC",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String DataVerbaleCEC;

    @XmlElement(name = "MunicipioRoma",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String MunicipioRoma;

    @XmlElement(name = "Municipio",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String Municipio;

    @XmlElement(name = "CognomeNome",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String CognomeNome;

    @XmlElement(name = "GiornoNascita",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String GiornoNascita;

    @XmlElement(name = "MesaNascita",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String MesaNascita;

    @XmlElement(name = "AnnoNascita",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String AnnoNascita;

    @XmlElement(name = "Paternita",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String Paternita;

    @XmlElement(name = "sezioneElettorale",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String SezioneElettorale;

    @XmlElement(name = "numeroAtto",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String NumeroAtto;

    @XmlElement(name = "annoAtto",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String AnnoAtto;

    @XmlElement(name = "parteAtto",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String ParteAtto;

    @XmlElement(name = "serieAtto",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String SerieAtto;

    @XmlElement(name = "comuneNascita",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String ComuneNascita;

    @XmlElement(name = "indirizzoResidenza",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String IndirizzoResidenza;

    @XmlElement(name = "Firma",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String Firma;

    @XmlElement(name = "titoloStudio",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String TitoloStudio;

    @XmlElement(name = "annoTitoloStudio",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String AnnoTitoloStudio;

    @XmlElement(name = "dataNomina",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String DataNomina;

    @XmlElement(name = "dataCancellazione",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String DataCancellazione;

    @XmlElement(name = "motivoCancellazione",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String MotivoCancellazione;

    @XmlElement(name = "descrizioneCorte",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private  String DescrizioneCorte;
    @XmlElement(name = "istitutoTitoloStudio",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private String IstitutoTitoloStudio;

    @XmlElement(name = "professione",namespace = "http://tempuri.org/GP25.xsd", required = true)
    private String Professione;

    public String getCodiceIndividuale() {
        return CodiceIndividuale;
    }

    public String getMunicipioRoma() {
        return MunicipioRoma;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public String getCognomeNome() {
        return CognomeNome;
    }

    public String getGiornoNascita() {
        return GiornoNascita;
    }

    public String getMesaNascita() {
        return MesaNascita;
    }

    public String getAnnoNascita() {
        return AnnoNascita;
    }

    public String getPaternita() {
        return Paternita;
    }

    public void setCodiceIndividuale(String codiceIndividuale) {
        CodiceIndividuale = codiceIndividuale;
    }

    public void setMunicipioRoma(String municipioRoma) {
        MunicipioRoma = municipioRoma;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }

    public void setCognomeNome(String cognomeNome) {
        CognomeNome = cognomeNome;
    }

    public void setGiornoNascita(String giornoNascita) {
        GiornoNascita = giornoNascita;
    }

    public void setMesaNascita(String mesaNascita) {
        MesaNascita = mesaNascita;
    }

    public void setAnnoNascita(String annoNascita) {
        AnnoNascita = annoNascita;
    }

    public void setPaternita(String paternita) {
        Paternita = paternita;
    }

    public void setSerieAtto(String serieAtto) {
        this.SerieAtto = serieAtto;
    }

    public String getFirma() {
        return Firma;
    }

    public void setFirma(String firma) {
        Firma = firma;
    }


    public String getVerbaleCEC() {
        return VerbaleCEC;
    }

    public void setVerbaleCEC(String verbaleCEC) {
        VerbaleCEC = verbaleCEC;
    }

    public String getDataVerbaleCEC() {
        return DataVerbaleCEC;
    }

    public void setDataVerbaleCEC(String dataVerbaleCEC) {
        DataVerbaleCEC = dataVerbaleCEC;
    }

    public String getSezioneElettorale() {
        return SezioneElettorale;
    }

    public void setSezioneElettorale(String sezioneElettorale) {
        SezioneElettorale = sezioneElettorale;
    }

    public String getNumeroAtto() {
        return NumeroAtto;
    }

    public void setNumeroAtto(String numeroAtto) {
        NumeroAtto = numeroAtto;
    }

    public String getParteAtto() {
        return ParteAtto;
    }

    public void setParteAtto(String parteAtto) {
        ParteAtto = parteAtto;
    }

    public String getSerieAtto() {
        return SerieAtto;
    }

    public String getComuneNascita() {
        return ComuneNascita;
    }

    public void setComuneNascita(String comuneNascita) {
        ComuneNascita = comuneNascita;
    }

    public String getIndirizzoResidenza() {
        return IndirizzoResidenza;
    }

    public void setIndirizzoResidenza(String indirizzoResidenza) {
        IndirizzoResidenza = indirizzoResidenza;
    }

    public String getTitoloStudio() {
        return TitoloStudio;
    }

    public void setTitoloStudio(String titoloStudio) {
        TitoloStudio = titoloStudio;
    }

    public String getProfessione() {
        return Professione;
    }

    public void setProfessione(String professione) {
        Professione = professione;
    }

    public String getAnnoTitoloStudio() {
        return AnnoTitoloStudio;
    }

    public void setAnnoTitoloStudio(String annoTitoloStudio) {
        AnnoTitoloStudio = annoTitoloStudio;
    }

    public String getDataNomina() {
        return DataNomina;
    }

    public void setDataNomina(String dataNomina) {
        DataNomina = dataNomina;
    }

    public String getDataCancellazione() {
        return DataCancellazione;
    }

    public void setDataCancellazione(String dataCancellazione) {
        DataCancellazione = dataCancellazione;
    }

    public String getMotivoCancellazione() {
        return MotivoCancellazione;
    }

    public void setMotivoCancellazione(String motivoCancellazione) {
        MotivoCancellazione = motivoCancellazione;
    }

    public String getDescrizioneCorte() {
        return DescrizioneCorte;
    }

    public void setDescrizioneCorte(String descrizioneCorte) {
        DescrizioneCorte = descrizioneCorte;
    }

    public String getIstitutoTitoloStudio() {
        return IstitutoTitoloStudio;
    }

    public void setIstitutoTitoloStudio(String istitutoTitoloStudio) {
        IstitutoTitoloStudio = istitutoTitoloStudio;
    }

    public String getAnnoAtto() {
        return AnnoAtto;
    }

    public void setAnnoAtto(String annoAtto) {
        AnnoAtto = annoAtto;
    }
}
