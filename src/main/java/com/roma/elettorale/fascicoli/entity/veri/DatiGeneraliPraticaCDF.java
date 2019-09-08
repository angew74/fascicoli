
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiGeneraliPraticaCDF complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiGeneraliPraticaCDF">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}BasePraticaCRAB">
 *       &lt;sequence>
 *         &lt;element name="DataPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodCirc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SedeCirc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Istanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Componenti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotePratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NuovoIndirizzo" type="{http://tempuri.org/TipiBase.xsd}BaseIndirizzoType" minOccurs="0"/>
 *         &lt;element name="IntestatarioScheda" type="{http://tempuri.org/TipiBase.xsd}BasePersonaAnag" minOccurs="0"/>
 *         &lt;element name="AnnoPraticaColl" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="PraticaCollegata" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="TuttaFamiglia" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="RapportoParentelaRichiedente" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="DocumentoRichiedente" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Dichiarante" type="{http://tempuri.org/TipiBase.xsd}BasePersonaAnag" minOccurs="0"/>
 *         &lt;element name="CodiceVecchiaFamiglia" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="CodiceNuovaFamiglia" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="FlagFamConNew" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="FlagSFD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="FlagIndValido" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="FlagAltreFam" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="FlagEntrataFam" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="FlagInFamiglia" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="PersInPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoRiapertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteRiapertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataIstanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroIstanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiGeneraliPraticaCDF", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "dataPratica",
    "codCirc",
    "sedeCirc",
    "dataCambio",
    "istanza",
    "componenti",
    "notePratica",
    "nuovoIndirizzo",
    "intestatarioScheda",
    "annoPraticaColl",
    "praticaCollegata",
    "tuttaFamiglia",
    "rapportoParentelaRichiedente",
    "documentoRichiedente",
    "dichiarante",
    "codiceVecchiaFamiglia",
    "codiceNuovaFamiglia",
    "flagFamConNew",
    "flagSFD",
    "flagIndValido",
    "flagAltreFam",
    "flagEntrataFam",
    "flagInFamiglia",
    "persInPratica",
    "motivoRiapertura",
    "noteRiapertura",
    "dataIstanza",
    "numeroIstanza"
})
public class DatiGeneraliPraticaCDF
    extends BasePraticaCRAB
{

    @XmlElementRef(name = "DataPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataPratica;
    @XmlElementRef(name = "CodCirc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCirc;
    @XmlElementRef(name = "SedeCirc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sedeCirc;
    @XmlElementRef(name = "DataCambio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCambio;
    @XmlElementRef(name = "Istanza", type = JAXBElement.class, required = false)
    protected JAXBElement<String> istanza;
    @XmlElementRef(name = "Componenti", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componenti;
    @XmlElementRef(name = "NotePratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notePratica;
    @XmlElementRef(name = "NuovoIndirizzo", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseIndirizzoType> nuovoIndirizzo;
    @XmlElementRef(name = "IntestatarioScheda", type = JAXBElement.class, required = false)
    protected JAXBElement<BasePersonaAnag> intestatarioScheda;
    @XmlElementRef(name = "AnnoPraticaColl", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> annoPraticaColl;
    @XmlElementRef(name = "PraticaCollegata", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> praticaCollegata;
    @XmlElementRef(name = "TuttaFamiglia", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> tuttaFamiglia;
    @XmlElementRef(name = "RapportoParentelaRichiedente", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> rapportoParentelaRichiedente;
    @XmlElementRef(name = "DocumentoRichiedente", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> documentoRichiedente;
    @XmlElementRef(name = "Dichiarante", type = JAXBElement.class, required = false)
    protected JAXBElement<BasePersonaAnag> dichiarante;
    @XmlElementRef(name = "CodiceVecchiaFamiglia", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> codiceVecchiaFamiglia;
    @XmlElementRef(name = "CodiceNuovaFamiglia", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> codiceNuovaFamiglia;
    @XmlElementRef(name = "FlagFamConNew", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> flagFamConNew;
    @XmlElementRef(name = "FlagSFD", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> flagSFD;
    @XmlElementRef(name = "FlagIndValido", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> flagIndValido;
    @XmlElementRef(name = "FlagAltreFam", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> flagAltreFam;
    @XmlElementRef(name = "FlagEntrataFam", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> flagEntrataFam;
    @XmlElementRef(name = "FlagInFamiglia", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> flagInFamiglia;
    @XmlElementRef(name = "PersInPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> persInPratica;
    @XmlElementRef(name = "MotivoRiapertura", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motivoRiapertura;
    @XmlElementRef(name = "NoteRiapertura", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteRiapertura;
    @XmlElementRef(name = "DataIstanza", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataIstanza;
    @XmlElementRef(name = "NumeroIstanza", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroIstanza;

    /**
     * Recupera il valore della proprietà dataPratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataPratica() {
        return dataPratica;
    }

    /**
     * Imposta il valore della proprietà dataPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataPratica(JAXBElement<String> value) {
        this.dataPratica = value;
    }

    /**
     * Recupera il valore della proprietà codCirc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCirc() {
        return codCirc;
    }

    /**
     * Imposta il valore della proprietà codCirc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCirc(JAXBElement<String> value) {
        this.codCirc = value;
    }

    /**
     * Recupera il valore della proprietà sedeCirc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSedeCirc() {
        return sedeCirc;
    }

    /**
     * Imposta il valore della proprietà sedeCirc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSedeCirc(JAXBElement<String> value) {
        this.sedeCirc = value;
    }

    /**
     * Recupera il valore della proprietà dataCambio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCambio() {
        return dataCambio;
    }

    /**
     * Imposta il valore della proprietà dataCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCambio(JAXBElement<String> value) {
        this.dataCambio = value;
    }

    /**
     * Recupera il valore della proprietà istanza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIstanza() {
        return istanza;
    }

    /**
     * Imposta il valore della proprietà istanza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIstanza(JAXBElement<String> value) {
        this.istanza = value;
    }

    /**
     * Recupera il valore della proprietà componenti.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComponenti() {
        return componenti;
    }

    /**
     * Imposta il valore della proprietà componenti.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComponenti(JAXBElement<String> value) {
        this.componenti = value;
    }

    /**
     * Recupera il valore della proprietà notePratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotePratica() {
        return notePratica;
    }

    /**
     * Imposta il valore della proprietà notePratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotePratica(JAXBElement<String> value) {
        this.notePratica = value;
    }

    /**
     * Recupera il valore della proprietà nuovoIndirizzo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseIndirizzoType }{@code >}
     *     
     */
    public JAXBElement<BaseIndirizzoType> getNuovoIndirizzo() {
        return nuovoIndirizzo;
    }

    /**
     * Imposta il valore della proprietà nuovoIndirizzo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseIndirizzoType }{@code >}
     *     
     */
    public void setNuovoIndirizzo(JAXBElement<BaseIndirizzoType> value) {
        this.nuovoIndirizzo = value;
    }

    /**
     * Recupera il valore della proprietà intestatarioScheda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BasePersonaAnag }{@code >}
     *     
     */
    public JAXBElement<BasePersonaAnag> getIntestatarioScheda() {
        return intestatarioScheda;
    }

    /**
     * Imposta il valore della proprietà intestatarioScheda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BasePersonaAnag }{@code >}
     *     
     */
    public void setIntestatarioScheda(JAXBElement<BasePersonaAnag> value) {
        this.intestatarioScheda = value;
    }

    /**
     * Recupera il valore della proprietà annoPraticaColl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getAnnoPraticaColl() {
        return annoPraticaColl;
    }

    /**
     * Imposta il valore della proprietà annoPraticaColl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setAnnoPraticaColl(JAXBElement<Object> value) {
        this.annoPraticaColl = value;
    }

    /**
     * Recupera il valore della proprietà praticaCollegata.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getPraticaCollegata() {
        return praticaCollegata;
    }

    /**
     * Imposta il valore della proprietà praticaCollegata.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setPraticaCollegata(JAXBElement<Object> value) {
        this.praticaCollegata = value;
    }

    /**
     * Recupera il valore della proprietà tuttaFamiglia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getTuttaFamiglia() {
        return tuttaFamiglia;
    }

    /**
     * Imposta il valore della proprietà tuttaFamiglia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setTuttaFamiglia(JAXBElement<Object> value) {
        this.tuttaFamiglia = value;
    }

    /**
     * Recupera il valore della proprietà rapportoParentelaRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getRapportoParentelaRichiedente() {
        return rapportoParentelaRichiedente;
    }

    /**
     * Imposta il valore della proprietà rapportoParentelaRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setRapportoParentelaRichiedente(JAXBElement<Object> value) {
        this.rapportoParentelaRichiedente = value;
    }

    /**
     * Recupera il valore della proprietà documentoRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getDocumentoRichiedente() {
        return documentoRichiedente;
    }

    /**
     * Imposta il valore della proprietà documentoRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setDocumentoRichiedente(JAXBElement<Object> value) {
        this.documentoRichiedente = value;
    }

    /**
     * Recupera il valore della proprietà dichiarante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BasePersonaAnag }{@code >}
     *     
     */
    public JAXBElement<BasePersonaAnag> getDichiarante() {
        return dichiarante;
    }

    /**
     * Imposta il valore della proprietà dichiarante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BasePersonaAnag }{@code >}
     *     
     */
    public void setDichiarante(JAXBElement<BasePersonaAnag> value) {
        this.dichiarante = value;
    }

    /**
     * Recupera il valore della proprietà codiceVecchiaFamiglia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getCodiceVecchiaFamiglia() {
        return codiceVecchiaFamiglia;
    }

    /**
     * Imposta il valore della proprietà codiceVecchiaFamiglia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setCodiceVecchiaFamiglia(JAXBElement<Object> value) {
        this.codiceVecchiaFamiglia = value;
    }

    /**
     * Recupera il valore della proprietà codiceNuovaFamiglia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getCodiceNuovaFamiglia() {
        return codiceNuovaFamiglia;
    }

    /**
     * Imposta il valore della proprietà codiceNuovaFamiglia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setCodiceNuovaFamiglia(JAXBElement<Object> value) {
        this.codiceNuovaFamiglia = value;
    }

    /**
     * Recupera il valore della proprietà flagFamConNew.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getFlagFamConNew() {
        return flagFamConNew;
    }

    /**
     * Imposta il valore della proprietà flagFamConNew.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setFlagFamConNew(JAXBElement<Object> value) {
        this.flagFamConNew = value;
    }

    /**
     * Recupera il valore della proprietà flagSFD.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getFlagSFD() {
        return flagSFD;
    }

    /**
     * Imposta il valore della proprietà flagSFD.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setFlagSFD(JAXBElement<Object> value) {
        this.flagSFD = value;
    }

    /**
     * Recupera il valore della proprietà flagIndValido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getFlagIndValido() {
        return flagIndValido;
    }

    /**
     * Imposta il valore della proprietà flagIndValido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setFlagIndValido(JAXBElement<Object> value) {
        this.flagIndValido = value;
    }

    /**
     * Recupera il valore della proprietà flagAltreFam.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getFlagAltreFam() {
        return flagAltreFam;
    }

    /**
     * Imposta il valore della proprietà flagAltreFam.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setFlagAltreFam(JAXBElement<Object> value) {
        this.flagAltreFam = value;
    }

    /**
     * Recupera il valore della proprietà flagEntrataFam.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getFlagEntrataFam() {
        return flagEntrataFam;
    }

    /**
     * Imposta il valore della proprietà flagEntrataFam.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setFlagEntrataFam(JAXBElement<Object> value) {
        this.flagEntrataFam = value;
    }

    /**
     * Recupera il valore della proprietà flagInFamiglia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getFlagInFamiglia() {
        return flagInFamiglia;
    }

    /**
     * Imposta il valore della proprietà flagInFamiglia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setFlagInFamiglia(JAXBElement<Object> value) {
        this.flagInFamiglia = value;
    }

    /**
     * Recupera il valore della proprietà persInPratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersInPratica() {
        return persInPratica;
    }

    /**
     * Imposta il valore della proprietà persInPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersInPratica(JAXBElement<String> value) {
        this.persInPratica = value;
    }

    /**
     * Recupera il valore della proprietà motivoRiapertura.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotivoRiapertura() {
        return motivoRiapertura;
    }

    /**
     * Imposta il valore della proprietà motivoRiapertura.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotivoRiapertura(JAXBElement<String> value) {
        this.motivoRiapertura = value;
    }

    /**
     * Recupera il valore della proprietà noteRiapertura.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteRiapertura() {
        return noteRiapertura;
    }

    /**
     * Imposta il valore della proprietà noteRiapertura.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteRiapertura(JAXBElement<String> value) {
        this.noteRiapertura = value;
    }

    /**
     * Recupera il valore della proprietà dataIstanza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataIstanza() {
        return dataIstanza;
    }

    /**
     * Imposta il valore della proprietà dataIstanza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataIstanza(JAXBElement<String> value) {
        this.dataIstanza = value;
    }

    /**
     * Recupera il valore della proprietà numeroIstanza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroIstanza() {
        return numeroIstanza;
    }

    /**
     * Imposta il valore della proprietà numeroIstanza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroIstanza(JAXBElement<String> value) {
        this.numeroIstanza = value;
    }

}
