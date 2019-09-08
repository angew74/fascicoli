
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiGenericiStampaCRE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiGenericiStampaCRE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataInvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataCirCons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="NotePratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataDefinizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiGenericiStampaCRE", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "dataInvio",
    "dataCirCons",
    "notePratica",
    "dataPratica",
    "dataDefinizione",
    "utente"
})
public class DatiGenericiStampaCRE {

    @XmlElementRef(name = "DataInvio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataInvio;
    @XmlElementRef(name = "DataCirCons", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCirCons;
    @XmlElementRef(name = "NotePratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notePratica;
    @XmlElementRef(name = "DataPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataPratica;
    @XmlElementRef(name = "DataDefinizione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataDefinizione;
    @XmlElementRef(name = "Utente", type = JAXBElement.class, required = false)
    protected JAXBElement<String> utente;

    /**
     * Recupera il valore della proprietà dataInvio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataInvio() {
        return dataInvio;
    }

    /**
     * Imposta il valore della proprietà dataInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataInvio(JAXBElement<String> value) {
        this.dataInvio = value;
    }

    /**
     * Recupera il valore della proprietà dataCirCons.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCirCons() {
        return dataCirCons;
    }

    /**
     * Imposta il valore della proprietà dataCirCons.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCirCons(JAXBElement<String> value) {
        this.dataCirCons = value;
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
     * Recupera il valore della proprietà dataDefinizione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataDefinizione() {
        return dataDefinizione;
    }

    /**
     * Imposta il valore della proprietà dataDefinizione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataDefinizione(JAXBElement<String> value) {
        this.dataDefinizione = value;
    }

    /**
     * Recupera il valore della proprietà utente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUtente() {
        return utente;
    }

    /**
     * Imposta il valore della proprietà utente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUtente(JAXBElement<String> value) {
        this.utente = value;
    }

}
