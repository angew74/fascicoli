
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BasePraticaCRAB complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasePraticaCRAB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnoPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BasePraticaCRAB", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "annoPratica",
    "numeroPratica",
    "statusPratica"
})
@XmlSeeAlso({
    DatiGeneraliPraticaCDF.class,
    BasePraticaCRABTipo.class,
    PraticaOriundo.class,
    DatiGeneraliRap.class,
    DatiGeneraliPraticaCRE.class
})
public class BasePraticaCRAB {

    @XmlElementRef(name = "AnnoPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> annoPratica;
    @XmlElementRef(name = "NumeroPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPratica;
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
