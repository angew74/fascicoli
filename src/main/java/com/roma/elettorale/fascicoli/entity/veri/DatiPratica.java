
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiPratica complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiPratica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnoPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotePratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataDefinizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataConsolare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlgStep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiPratica", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "annoPratica",
    "numeroPratica",
    "notePratica",
    "dataDefinizione",
    "dataConsolare",
    "flgStep",
    "statusPratica"
})
public class DatiPratica {

    @XmlElementRef(name = "AnnoPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> annoPratica;
    @XmlElementRef(name = "NumeroPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPratica;
    @XmlElementRef(name = "NotePratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notePratica;
    @XmlElementRef(name = "DataDefinizione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataDefinizione;
    @XmlElementRef(name = "DataConsolare", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataConsolare;
    @XmlElementRef(name = "FlgStep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flgStep;
    @XmlElementRef(name = "StatusPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusPratica;

    /**
     * Recupera il valore della proprietà annoPratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnnoPratica() {
        return annoPratica;
    }

    /**
     * Imposta il valore della proprietà annoPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnnoPratica(JAXBElement<String> value) {
        this.annoPratica = value;
    }

    /**
     * Recupera il valore della proprietà numeroPratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPratica() {
        return numeroPratica;
    }

    /**
     * Imposta il valore della proprietà numeroPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPratica(JAXBElement<String> value) {
        this.numeroPratica = value;
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
     * Recupera il valore della proprietà dataConsolare.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataConsolare() {
        return dataConsolare;
    }

    /**
     * Imposta il valore della proprietà dataConsolare.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataConsolare(JAXBElement<String> value) {
        this.dataConsolare = value;
    }

    /**
     * Recupera il valore della proprietà flgStep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlgStep() {
        return flgStep;
    }

    /**
     * Imposta il valore della proprietà flgStep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlgStep(JAXBElement<String> value) {
        this.flgStep = value;
    }

    /**
     * Recupera il valore della proprietà statusPratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusPratica() {
        return statusPratica;
    }

    /**
     * Imposta il valore della proprietà statusPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusPratica(JAXBElement<String> value) {
        this.statusPratica = value;
    }

}
