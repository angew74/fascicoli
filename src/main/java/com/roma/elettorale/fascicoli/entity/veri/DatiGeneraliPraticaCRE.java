
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiGeneraliPraticaCRE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiGeneraliPraticaCRE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}BasePraticaCRAB">
 *       &lt;sequence>
 *         &lt;element name="DataPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PraticaImm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataPraticaImm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conteggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataEmigrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Istanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Componenti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Richiesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotePratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvioComune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndirizzoAIRE" type="{http://tempuri.org/TipiBase.xsd}IndirizzoAIREAnagType" minOccurs="0"/>
 *         &lt;element name="IntestatarioSchedaAIRE" type="{http://tempuri.org/TipiBase.xsd}BasePersonaAnag" minOccurs="0"/>
 *         &lt;element name="DataCirConsAIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnoRif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersInPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manuale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DatiGeneraliPraticaCRE", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "dataPratica",
    "praticaImm",
    "dataPraticaImm",
    "conteggio",
    "dataEmigrazione",
    "istanza",
    "componenti",
    "richiesta",
    "notePratica",
    "invioComune",
    "indirizzoAIRE",
    "intestatarioSchedaAIRE",
    "dataCirConsAIRE",
    "annoRif",
    "persInPratica",
    "manuale",
    "descrizione",
    "motivoRiapertura",
    "noteRiapertura",
    "dataIstanza",
    "numeroIstanza"
})
public class DatiGeneraliPraticaCRE
    extends BasePraticaCRAB
{

    @XmlElementRef(name = "DataPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataPratica;
    @XmlElementRef(name = "PraticaImm", type = JAXBElement.class, required = false)
    protected JAXBElement<String> praticaImm;
    @XmlElementRef(name = "DataPraticaImm", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataPraticaImm;
    @XmlElementRef(name = "Conteggio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> conteggio;
    @XmlElementRef(name = "DataEmigrazione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataEmigrazione;
    @XmlElementRef(name = "Istanza", type = JAXBElement.class, required = false)
    protected JAXBElement<String> istanza;
    @XmlElementRef(name = "Componenti", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componenti;
    @XmlElementRef(name = "Richiesta", type = JAXBElement.class, required = false)
    protected JAXBElement<String> richiesta;
    @XmlElementRef(name = "NotePratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notePratica;
    @XmlElementRef(name = "InvioComune", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invioComune;
    @XmlElementRef(name = "IndirizzoAIRE", type = JAXBElement.class, required = false)
    protected JAXBElement<IndirizzoAIREAnagType> indirizzoAIRE;
    @XmlElementRef(name = "IntestatarioSchedaAIRE", type = JAXBElement.class, required = false)
    protected JAXBElement<BasePersonaAnag> intestatarioSchedaAIRE;
    @XmlElementRef(name = "DataCirConsAIRE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCirConsAIRE;
    @XmlElementRef(name = "AnnoRif", type = JAXBElement.class, required = false)
    protected JAXBElement<String> annoRif;
    @XmlElementRef(name = "PersInPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> persInPratica;
    @XmlElementRef(name = "Manuale", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manuale;
    @XmlElementRef(name = "Descrizione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizione;
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
     * Recupera il valore della proprietà praticaImm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPraticaImm() {
        return praticaImm;
    }

    /**
     * Imposta il valore della proprietà praticaImm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPraticaImm(JAXBElement<String> value) {
        this.praticaImm = value;
    }

    /**
     * Recupera il valore della proprietà dataPraticaImm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataPraticaImm() {
        return dataPraticaImm;
    }

    /**
     * Imposta il valore della proprietà dataPraticaImm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataPraticaImm(JAXBElement<String> value) {
        this.dataPraticaImm = value;
    }

    /**
     * Recupera il valore della proprietà conteggio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConteggio() {
        return conteggio;
    }

    /**
     * Imposta il valore della proprietà conteggio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConteggio(JAXBElement<String> value) {
        this.conteggio = value;
    }

    /**
     * Recupera il valore della proprietà dataEmigrazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataEmigrazione() {
        return dataEmigrazione;
    }

    /**
     * Imposta il valore della proprietà dataEmigrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataEmigrazione(JAXBElement<String> value) {
        this.dataEmigrazione = value;
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
     * Recupera il valore della proprietà richiesta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRichiesta() {
        return richiesta;
    }

    /**
     * Imposta il valore della proprietà richiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRichiesta(JAXBElement<String> value) {
        this.richiesta = value;
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
     * Recupera il valore della proprietà invioComune.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvioComune() {
        return invioComune;
    }

    /**
     * Imposta il valore della proprietà invioComune.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvioComune(JAXBElement<String> value) {
        this.invioComune = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoAIRE.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndirizzoAIREAnagType }{@code >}
     *     
     */
    public JAXBElement<IndirizzoAIREAnagType> getIndirizzoAIRE() {
        return indirizzoAIRE;
    }

    /**
     * Imposta il valore della proprietà indirizzoAIRE.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndirizzoAIREAnagType }{@code >}
     *     
     */
    public void setIndirizzoAIRE(JAXBElement<IndirizzoAIREAnagType> value) {
        this.indirizzoAIRE = value;
    }

    /**
     * Recupera il valore della proprietà intestatarioSchedaAIRE.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BasePersonaAnag }{@code >}
     *     
     */
    public JAXBElement<BasePersonaAnag> getIntestatarioSchedaAIRE() {
        return intestatarioSchedaAIRE;
    }

    /**
     * Imposta il valore della proprietà intestatarioSchedaAIRE.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BasePersonaAnag }{@code >}
     *     
     */
    public void setIntestatarioSchedaAIRE(JAXBElement<BasePersonaAnag> value) {
        this.intestatarioSchedaAIRE = value;
    }

    /**
     * Recupera il valore della proprietà dataCirConsAIRE.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCirConsAIRE() {
        return dataCirConsAIRE;
    }

    /**
     * Imposta il valore della proprietà dataCirConsAIRE.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCirConsAIRE(JAXBElement<String> value) {
        this.dataCirConsAIRE = value;
    }

    /**
     * Recupera il valore della proprietà annoRif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnnoRif() {
        return annoRif;
    }

    /**
     * Imposta il valore della proprietà annoRif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnnoRif(JAXBElement<String> value) {
        this.annoRif = value;
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
     * Recupera il valore della proprietà manuale.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManuale() {
        return manuale;
    }

    /**
     * Imposta il valore della proprietà manuale.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManuale(JAXBElement<String> value) {
        this.manuale = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescrizione(JAXBElement<String> value) {
        this.descrizione = value;
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
