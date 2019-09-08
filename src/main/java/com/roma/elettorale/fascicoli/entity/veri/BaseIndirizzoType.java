
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseIndirizzoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseIndirizzoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Civ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lett" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Esp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Piano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Palaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndirizzoNonStandard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndirizzoDecodif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseIndirizzoType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "codVia",
    "nomeVia",
    "civ",
    "tipoCiv",
    "lett",
    "esp",
    "piano",
    "lotto",
    "palaz",
    "scala",
    "interno",
    "indirizzoNonStandard",
    "indirizzoDecodif"
})
public class BaseIndirizzoType {

    @XmlElementRef(name = "CodVia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codVia;
    @XmlElementRef(name = "NomeVia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeVia;
    @XmlElementRef(name = "Civ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> civ;
    @XmlElementRef(name = "TipoCiv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCiv;
    @XmlElementRef(name = "Lett", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lett;
    @XmlElementRef(name = "Esp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> esp;
    @XmlElementRef(name = "Piano", type = JAXBElement.class, required = false)
    protected JAXBElement<String> piano;
    @XmlElementRef(name = "Lotto", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lotto;
    @XmlElementRef(name = "Palaz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> palaz;
    @XmlElementRef(name = "Scala", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scala;
    @XmlElementRef(name = "Interno", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interno;
    @XmlElementRef(name = "IndirizzoNonStandard", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indirizzoNonStandard;
    @XmlElementRef(name = "IndirizzoDecodif", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indirizzoDecodif;

    /**
     * Recupera il valore della proprietà codVia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodVia() {
        return codVia;
    }

    /**
     * Imposta il valore della proprietà codVia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodVia(JAXBElement<String> value) {
        this.codVia = value;
    }

    /**
     * Recupera il valore della proprietà nomeVia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeVia() {
        return nomeVia;
    }

    /**
     * Imposta il valore della proprietà nomeVia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeVia(JAXBElement<String> value) {
        this.nomeVia = value;
    }

    /**
     * Recupera il valore della proprietà civ.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiv() {
        return civ;
    }

    /**
     * Imposta il valore della proprietà civ.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiv(JAXBElement<String> value) {
        this.civ = value;
    }

    /**
     * Recupera il valore della proprietà tipoCiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCiv() {
        return tipoCiv;
    }

    /**
     * Imposta il valore della proprietà tipoCiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCiv(JAXBElement<String> value) {
        this.tipoCiv = value;
    }

    /**
     * Recupera il valore della proprietà lett.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLett() {
        return lett;
    }

    /**
     * Imposta il valore della proprietà lett.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLett(JAXBElement<String> value) {
        this.lett = value;
    }

    /**
     * Recupera il valore della proprietà esp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEsp() {
        return esp;
    }

    /**
     * Imposta il valore della proprietà esp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEsp(JAXBElement<String> value) {
        this.esp = value;
    }

    /**
     * Recupera il valore della proprietà piano.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPiano() {
        return piano;
    }

    /**
     * Imposta il valore della proprietà piano.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPiano(JAXBElement<String> value) {
        this.piano = value;
    }

    /**
     * Recupera il valore della proprietà lotto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLotto() {
        return lotto;
    }

    /**
     * Imposta il valore della proprietà lotto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLotto(JAXBElement<String> value) {
        this.lotto = value;
    }

    /**
     * Recupera il valore della proprietà palaz.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPalaz() {
        return palaz;
    }

    /**
     * Imposta il valore della proprietà palaz.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPalaz(JAXBElement<String> value) {
        this.palaz = value;
    }

    /**
     * Recupera il valore della proprietà scala.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScala() {
        return scala;
    }

    /**
     * Imposta il valore della proprietà scala.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScala(JAXBElement<String> value) {
        this.scala = value;
    }

    /**
     * Recupera il valore della proprietà interno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterno() {
        return interno;
    }

    /**
     * Imposta il valore della proprietà interno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterno(JAXBElement<String> value) {
        this.interno = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoNonStandard.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndirizzoNonStandard() {
        return indirizzoNonStandard;
    }

    /**
     * Imposta il valore della proprietà indirizzoNonStandard.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndirizzoNonStandard(JAXBElement<String> value) {
        this.indirizzoNonStandard = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoDecodif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndirizzoDecodif() {
        return indirizzoDecodif;
    }

    /**
     * Imposta il valore della proprietà indirizzoDecodif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndirizzoDecodif(JAXBElement<String> value) {
        this.indirizzoDecodif = value;
    }

}
