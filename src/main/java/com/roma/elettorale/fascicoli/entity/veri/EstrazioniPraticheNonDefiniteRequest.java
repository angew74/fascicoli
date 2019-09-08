
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EstrazioniPraticheNonDefiniteRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EstrazioniPraticheNonDefiniteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnoPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="NumeroPraticaDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="NumeroPraticaA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="da" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="per" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstrazioniPraticheNonDefiniteRequest", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "annoPratica",
    "numeroPraticaDA",
    "numeroPraticaA"
})
public class EstrazioniPraticheNonDefiniteRequest {

    @XmlElementRef(name = "AnnoPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> annoPratica;
    @XmlElementRef(name = "NumeroPraticaDA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPraticaDA;
    @XmlElementRef(name = "NumeroPraticaA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPraticaA;
    @XmlAttribute(name = "da")
    protected String da;
    @XmlAttribute(name = "per")
    protected String per;

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
     * Recupera il valore della proprietà numeroPraticaDA.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPraticaDA() {
        return numeroPraticaDA;
    }

    /**
     * Imposta il valore della proprietà numeroPraticaDA.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPraticaDA(JAXBElement<String> value) {
        this.numeroPraticaDA = value;
    }

    /**
     * Recupera il valore della proprietà numeroPraticaA.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPraticaA() {
        return numeroPraticaA;
    }

    /**
     * Imposta il valore della proprietà numeroPraticaA.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPraticaA(JAXBElement<String> value) {
        this.numeroPraticaA = value;
    }

    /**
     * Recupera il valore della proprietà da.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDa() {
        return da;
    }

    /**
     * Imposta il valore della proprietà da.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDa(String value) {
        this.da = value;
    }

    /**
     * Recupera il valore della proprietà per.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPer() {
        return per;
    }

    /**
     * Imposta il valore della proprietà per.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPer(String value) {
        this.per = value;
    }

}
