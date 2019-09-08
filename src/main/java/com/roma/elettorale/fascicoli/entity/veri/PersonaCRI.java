
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PersonaCRI complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonaCRI">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}PersonaInPraticaCRAB">
 *       &lt;sequence>
 *         &lt;element name="ReiscComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EsitoAccerComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttoNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParteNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerieNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EspNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnoAttoN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoComuneAttoN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComuneAttoN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DComuneAttoN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Padre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Madre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cittadinanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nazionalita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatoCivile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rappar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Professione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosizioneProf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CondizioneProf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TStudio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlagFiltro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlagOmonimia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlagCitt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlagOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesNazionalita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FlagFDV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaCRI", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "reiscComp",
    "esitoAccerComp",
    "attoNascita",
    "parteNascita",
    "serieNascita",
    "espNascita",
    "annoAttoN",
    "tipoComuneAttoN",
    "comuneAttoN",
    "dComuneAttoN",
    "padre",
    "madre",
    "cittadinanza",
    "nazionalita",
    "statoCivile",
    "rappar",
    "professione",
    "posizioneProf",
    "attivita",
    "condizioneProf",
    "tStudio",
    "flagFiltro",
    "flagOmonimia",
    "motivo",
    "flagCitt",
    "flagOri",
    "desNazionalita"
})
public class PersonaCRI
    extends PersonaInPraticaCRAB
{

    @XmlElementRef(name = "ReiscComp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reiscComp;
    @XmlElementRef(name = "EsitoAccerComp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> esitoAccerComp;
    @XmlElementRef(name = "AttoNascita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attoNascita;
    @XmlElementRef(name = "ParteNascita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parteNascita;
    @XmlElementRef(name = "SerieNascita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serieNascita;
    @XmlElementRef(name = "EspNascita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> espNascita;
    @XmlElementRef(name = "AnnoAttoN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> annoAttoN;
    @XmlElementRef(name = "TipoComuneAttoN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoComuneAttoN;
    @XmlElementRef(name = "ComuneAttoN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comuneAttoN;
    @XmlElementRef(name = "DComuneAttoN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dComuneAttoN;
    @XmlElementRef(name = "Padre", type = JAXBElement.class, required = false)
    protected JAXBElement<String> padre;
    @XmlElementRef(name = "Madre", type = JAXBElement.class, required = false)
    protected JAXBElement<String> madre;
    @XmlElementRef(name = "Cittadinanza", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cittadinanza;
    @XmlElementRef(name = "Nazionalita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazionalita;
    @XmlElementRef(name = "StatoCivile", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statoCivile;
    @XmlElementRef(name = "Rappar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rappar;
    @XmlElementRef(name = "Professione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> professione;
    @XmlElementRef(name = "PosizioneProf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posizioneProf;
    @XmlElementRef(name = "Attivita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attivita;
    @XmlElementRef(name = "CondizioneProf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> condizioneProf;
    @XmlElementRef(name = "TStudio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tStudio;
    @XmlElementRef(name = "FlagFiltro", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagFiltro;
    @XmlElementRef(name = "FlagOmonimia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagOmonimia;
    @XmlElementRef(name = "Motivo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motivo;
    @XmlElementRef(name = "FlagCitt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagCitt;
    @XmlElementRef(name = "FlagOri", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagOri;
    @XmlElementRef(name = "DesNazionalita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desNazionalita;
    @XmlAttribute(name = "FlagFDV")
    protected String flagFDV;

    /**
     * Recupera il valore della propriet� reiscComp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReiscComp() {
        return reiscComp;
    }

    /**
     * Imposta il valore della propriet� reiscComp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReiscComp(JAXBElement<String> value) {
        this.reiscComp = value;
    }

    /**
     * Recupera il valore della propriet� esitoAccerComp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEsitoAccerComp() {
        return esitoAccerComp;
    }

    /**
     * Imposta il valore della propriet� esitoAccerComp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEsitoAccerComp(JAXBElement<String> value) {
        this.esitoAccerComp = value;
    }

    /**
     * Recupera il valore della propriet� attoNascita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttoNascita() {
        return attoNascita;
    }

    /**
     * Imposta il valore della propriet� attoNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttoNascita(JAXBElement<String> value) {
        this.attoNascita = value;
    }

    /**
     * Recupera il valore della propriet� parteNascita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParteNascita() {
        return parteNascita;
    }

    /**
     * Imposta il valore della propriet� parteNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParteNascita(JAXBElement<String> value) {
        this.parteNascita = value;
    }

    /**
     * Recupera il valore della propriet� serieNascita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerieNascita() {
        return serieNascita;
    }

    /**
     * Imposta il valore della propriet� serieNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerieNascita(JAXBElement<String> value) {
        this.serieNascita = value;
    }

    /**
     * Recupera il valore della propriet� espNascita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEspNascita() {
        return espNascita;
    }

    /**
     * Imposta il valore della propriet� espNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEspNascita(JAXBElement<String> value) {
        this.espNascita = value;
    }

    /**
     * Recupera il valore della propriet� annoAttoN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnnoAttoN() {
        return annoAttoN;
    }

    /**
     * Imposta il valore della propriet� annoAttoN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnnoAttoN(JAXBElement<String> value) {
        this.annoAttoN = value;
    }

    /**
     * Recupera il valore della propriet� tipoComuneAttoN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoComuneAttoN() {
        return tipoComuneAttoN;
    }

    /**
     * Imposta il valore della propriet� tipoComuneAttoN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoComuneAttoN(JAXBElement<String> value) {
        this.tipoComuneAttoN = value;
    }

    /**
     * Recupera il valore della propriet� comuneAttoN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComuneAttoN() {
        return comuneAttoN;
    }

    /**
     * Imposta il valore della propriet� comuneAttoN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComuneAttoN(JAXBElement<String> value) {
        this.comuneAttoN = value;
    }

    /**
     * Recupera il valore della propriet� dComuneAttoN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDComuneAttoN() {
        return dComuneAttoN;
    }

    /**
     * Imposta il valore della propriet� dComuneAttoN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDComuneAttoN(JAXBElement<String> value) {
        this.dComuneAttoN = value;
    }

    /**
     * Recupera il valore della propriet� padre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPadre() {
        return padre;
    }

    /**
     * Imposta il valore della propriet� padre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPadre(JAXBElement<String> value) {
        this.padre = value;
    }

    /**
     * Recupera il valore della propriet� madre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMadre() {
        return madre;
    }

    /**
     * Imposta il valore della propriet� madre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMadre(JAXBElement<String> value) {
        this.madre = value;
    }

    /**
     * Recupera il valore della propriet� cittadinanza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCittadinanza() {
        return cittadinanza;
    }

    /**
     * Imposta il valore della propriet� cittadinanza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCittadinanza(JAXBElement<String> value) {
        this.cittadinanza = value;
    }

    /**
     * Recupera il valore della propriet� nazionalita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazionalita() {
        return nazionalita;
    }

    /**
     * Imposta il valore della propriet� nazionalita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazionalita(JAXBElement<String> value) {
        this.nazionalita = value;
    }

    /**
     * Recupera il valore della propriet� statoCivile.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatoCivile() {
        return statoCivile;
    }

    /**
     * Imposta il valore della propriet� statoCivile.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatoCivile(JAXBElement<String> value) {
        this.statoCivile = value;
    }

    /**
     * Recupera il valore della propriet� rappar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRappar() {
        return rappar;
    }

    /**
     * Imposta il valore della propriet� rappar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRappar(JAXBElement<String> value) {
        this.rappar = value;
    }

    /**
     * Recupera il valore della propriet� professione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfessione() {
        return professione;
    }

    /**
     * Imposta il valore della propriet� professione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfessione(JAXBElement<String> value) {
        this.professione = value;
    }

    /**
     * Recupera il valore della propriet� posizioneProf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosizioneProf() {
        return posizioneProf;
    }

    /**
     * Imposta il valore della propriet� posizioneProf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosizioneProf(JAXBElement<String> value) {
        this.posizioneProf = value;
    }

    /**
     * Recupera il valore della propriet� attivita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttivita() {
        return attivita;
    }

    /**
     * Imposta il valore della propriet� attivita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttivita(JAXBElement<String> value) {
        this.attivita = value;
    }

    /**
     * Recupera il valore della propriet� condizioneProf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCondizioneProf() {
        return condizioneProf;
    }

    /**
     * Imposta il valore della propriet� condizioneProf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCondizioneProf(JAXBElement<String> value) {
        this.condizioneProf = value;
    }

    /**
     * Recupera il valore della propriet� tStudio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTStudio() {
        return tStudio;
    }

    /**
     * Imposta il valore della propriet� tStudio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTStudio(JAXBElement<String> value) {
        this.tStudio = value;
    }

    /**
     * Recupera il valore della propriet� flagFiltro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagFiltro() {
        return flagFiltro;
    }

    /**
     * Imposta il valore della propriet� flagFiltro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagFiltro(JAXBElement<String> value) {
        this.flagFiltro = value;
    }

    /**
     * Recupera il valore della propriet� flagOmonimia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagOmonimia() {
        return flagOmonimia;
    }

    /**
     * Imposta il valore della propriet� flagOmonimia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagOmonimia(JAXBElement<String> value) {
        this.flagOmonimia = value;
    }

    /**
     * Recupera il valore della propriet� motivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotivo() {
        return motivo;
    }

    /**
     * Imposta il valore della propriet� motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotivo(JAXBElement<String> value) {
        this.motivo = value;
    }

    /**
     * Recupera il valore della propriet� flagCitt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagCitt() {
        return flagCitt;
    }

    /**
     * Imposta il valore della propriet� flagCitt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagCitt(JAXBElement<String> value) {
        this.flagCitt = value;
    }

    /**
     * Recupera il valore della propriet� flagOri.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagOri() {
        return flagOri;
    }

    /**
     * Imposta il valore della propriet� flagOri.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagOri(JAXBElement<String> value) {
        this.flagOri = value;
    }

    /**
     * Recupera il valore della propriet� desNazionalita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesNazionalita() {
        return desNazionalita;
    }

    /**
     * Imposta il valore della propriet� desNazionalita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesNazionalita(JAXBElement<String> value) {
        this.desNazionalita = value;
    }

    /**
     * Recupera il valore della propriet� flagFDV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagFDV() {
        return flagFDV;
    }

    /**
     * Imposta il valore della propriet� flagFDV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagFDV(String value) {
        this.flagFDV = value;
    }

}
