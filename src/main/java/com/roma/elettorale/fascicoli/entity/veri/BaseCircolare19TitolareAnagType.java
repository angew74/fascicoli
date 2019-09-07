
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseCircolare19TitolareAnagType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseCircolare19TitolareAnagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttLavor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttRisEconLb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssSanit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IscrIstituto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitolAss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttRisEconLc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RicCartSoggQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RicCSoggP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RicRinPermQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RicRinPermP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermSoggValScad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCircolare19TitolareAnagType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipoDoc",
    "numeroDoc",
    "attLavor",
    "attRisEconLb",
    "assSanit",
    "iscrIstituto",
    "titolAss",
    "attRisEconLc",
    "ricCartSoggQ",
    "ricCSoggP",
    "ricRinPermQ",
    "ricRinPermP",
    "permSoggValScad"
})
public class BaseCircolare19TitolareAnagType {

    @XmlElementRef(name = "TipoDoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDoc;
    @XmlElementRef(name = "NumeroDoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDoc;
    @XmlElementRef(name = "AttLavor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attLavor;
    @XmlElementRef(name = "AttRisEconLb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attRisEconLb;
    @XmlElementRef(name = "AssSanit", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assSanit;
    @XmlElementRef(name = "IscrIstituto", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iscrIstituto;
    @XmlElementRef(name = "TitolAss", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titolAss;
    @XmlElementRef(name = "AttRisEconLc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attRisEconLc;
    @XmlElementRef(name = "RicCartSoggQ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ricCartSoggQ;
    @XmlElementRef(name = "RicCSoggP", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ricCSoggP;
    @XmlElementRef(name = "RicRinPermQ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ricRinPermQ;
    @XmlElementRef(name = "RicRinPermP", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ricRinPermP;
    @XmlElementRef(name = "PermSoggValScad", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permSoggValScad;

    /**
     * Recupera il valore della proprietà tipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Imposta il valore della proprietà tipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDoc(JAXBElement<String> value) {
        this.tipoDoc = value;
    }

    /**
     * Recupera il valore della proprietà numeroDoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDoc() {
        return numeroDoc;
    }

    /**
     * Imposta il valore della proprietà numeroDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDoc(JAXBElement<String> value) {
        this.numeroDoc = value;
    }

    /**
     * Recupera il valore della proprietà attLavor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttLavor() {
        return attLavor;
    }

    /**
     * Imposta il valore della proprietà attLavor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttLavor(JAXBElement<String> value) {
        this.attLavor = value;
    }

    /**
     * Recupera il valore della proprietà attRisEconLb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttRisEconLb() {
        return attRisEconLb;
    }

    /**
     * Imposta il valore della proprietà attRisEconLb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttRisEconLb(JAXBElement<String> value) {
        this.attRisEconLb = value;
    }

    /**
     * Recupera il valore della proprietà assSanit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssSanit() {
        return assSanit;
    }

    /**
     * Imposta il valore della proprietà assSanit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssSanit(JAXBElement<String> value) {
        this.assSanit = value;
    }

    /**
     * Recupera il valore della proprietà iscrIstituto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIscrIstituto() {
        return iscrIstituto;
    }

    /**
     * Imposta il valore della proprietà iscrIstituto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIscrIstituto(JAXBElement<String> value) {
        this.iscrIstituto = value;
    }

    /**
     * Recupera il valore della proprietà titolAss.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitolAss() {
        return titolAss;
    }

    /**
     * Imposta il valore della proprietà titolAss.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitolAss(JAXBElement<String> value) {
        this.titolAss = value;
    }

    /**
     * Recupera il valore della proprietà attRisEconLc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttRisEconLc() {
        return attRisEconLc;
    }

    /**
     * Imposta il valore della proprietà attRisEconLc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttRisEconLc(JAXBElement<String> value) {
        this.attRisEconLc = value;
    }

    /**
     * Recupera il valore della proprietà ricCartSoggQ.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRicCartSoggQ() {
        return ricCartSoggQ;
    }

    /**
     * Imposta il valore della proprietà ricCartSoggQ.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRicCartSoggQ(JAXBElement<String> value) {
        this.ricCartSoggQ = value;
    }

    /**
     * Recupera il valore della proprietà ricCSoggP.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRicCSoggP() {
        return ricCSoggP;
    }

    /**
     * Imposta il valore della proprietà ricCSoggP.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRicCSoggP(JAXBElement<String> value) {
        this.ricCSoggP = value;
    }

    /**
     * Recupera il valore della proprietà ricRinPermQ.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRicRinPermQ() {
        return ricRinPermQ;
    }

    /**
     * Imposta il valore della proprietà ricRinPermQ.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRicRinPermQ(JAXBElement<String> value) {
        this.ricRinPermQ = value;
    }

    /**
     * Recupera il valore della proprietà ricRinPermP.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRicRinPermP() {
        return ricRinPermP;
    }

    /**
     * Imposta il valore della proprietà ricRinPermP.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRicRinPermP(JAXBElement<String> value) {
        this.ricRinPermP = value;
    }

    /**
     * Recupera il valore della proprietà permSoggValScad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermSoggValScad() {
        return permSoggValScad;
    }

    /**
     * Imposta il valore della proprietà permSoggValScad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermSoggValScad(JAXBElement<String> value) {
        this.permSoggValScad = value;
    }

}
