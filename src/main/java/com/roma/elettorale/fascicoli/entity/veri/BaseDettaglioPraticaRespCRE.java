
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseDettaglioPraticaRespCRE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseDettaglioPraticaRespCRE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DtOp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DtPrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatPr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CapCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDettaglioPraticaRespCRE", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "dtOp",
    "aPrt",
    "nPrt",
    "dtPrt",
    "statPr",
    "capCom",
    "desCom"
})
public class BaseDettaglioPraticaRespCRE {

    @XmlElementRef(name = "DtOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtOp;
    @XmlElementRef(name = "APrt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aPrt;
    @XmlElementRef(name = "NPrt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nPrt;
    @XmlElementRef(name = "DtPrt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dtPrt;
    @XmlElementRef(name = "StatPr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statPr;
    @XmlElementRef(name = "CapCom", type = JAXBElement.class, required = false)
    protected JAXBElement<String> capCom;
    @XmlElementRef(name = "DesCom", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desCom;

    /**
     * Recupera il valore della proprietà dtOp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtOp() {
        return dtOp;
    }

    /**
     * Imposta il valore della proprietà dtOp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtOp(JAXBElement<String> value) {
        this.dtOp = value;
    }

    /**
     * Recupera il valore della proprietà aPrt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAPrt() {
        return aPrt;
    }

    /**
     * Imposta il valore della proprietà aPrt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAPrt(JAXBElement<String> value) {
        this.aPrt = value;
    }

    /**
     * Recupera il valore della proprietà nPrt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNPrt() {
        return nPrt;
    }

    /**
     * Imposta il valore della proprietà nPrt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNPrt(JAXBElement<String> value) {
        this.nPrt = value;
    }

    /**
     * Recupera il valore della proprietà dtPrt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtPrt() {
        return dtPrt;
    }

    /**
     * Imposta il valore della proprietà dtPrt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtPrt(JAXBElement<String> value) {
        this.dtPrt = value;
    }

    /**
     * Recupera il valore della proprietà statPr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatPr() {
        return statPr;
    }

    /**
     * Imposta il valore della proprietà statPr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatPr(JAXBElement<String> value) {
        this.statPr = value;
    }

    /**
     * Recupera il valore della proprietà capCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCapCom() {
        return capCom;
    }

    /**
     * Imposta il valore della proprietà capCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCapCom(JAXBElement<String> value) {
        this.capCom = value;
    }

    /**
     * Recupera il valore della proprietà desCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesCom() {
        return desCom;
    }

    /**
     * Imposta il valore della proprietà desCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesCom(JAXBElement<String> value) {
        this.desCom = value;
    }

}
