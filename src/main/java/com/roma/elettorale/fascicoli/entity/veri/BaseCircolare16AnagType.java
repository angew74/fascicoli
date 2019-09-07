
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseCircolare16AnagType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseCircolare16AnagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRich" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlagRicQuest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlagRicUffPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContrSoggSportImm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RichPermSogg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NullaOstaRicong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCircolare16AnagType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipoDoc",
    "numeroDoc",
    "dataRich",
    "flagRicQuest",
    "flagRicUffPost",
    "contrSoggSportImm",
    "richPermSogg",
    "nullaOstaRicong"
})
public class BaseCircolare16AnagType {

    @XmlElementRef(name = "TipoDoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDoc;
    @XmlElementRef(name = "NumeroDoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDoc;
    @XmlElementRef(name = "DataRich", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRich;
    @XmlElementRef(name = "FlagRicQuest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagRicQuest;
    @XmlElementRef(name = "FlagRicUffPost", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagRicUffPost;
    @XmlElementRef(name = "ContrSoggSportImm", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contrSoggSportImm;
    @XmlElementRef(name = "RichPermSogg", type = JAXBElement.class, required = false)
    protected JAXBElement<String> richPermSogg;
    @XmlElementRef(name = "NullaOstaRicong", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nullaOstaRicong;

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
     * Recupera il valore della proprietà dataRich.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataRich() {
        return dataRich;
    }

    /**
     * Imposta il valore della proprietà dataRich.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataRich(JAXBElement<String> value) {
        this.dataRich = value;
    }

    /**
     * Recupera il valore della proprietà flagRicQuest.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagRicQuest() {
        return flagRicQuest;
    }

    /**
     * Imposta il valore della proprietà flagRicQuest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagRicQuest(JAXBElement<String> value) {
        this.flagRicQuest = value;
    }

    /**
     * Recupera il valore della proprietà flagRicUffPost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagRicUffPost() {
        return flagRicUffPost;
    }

    /**
     * Imposta il valore della proprietà flagRicUffPost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagRicUffPost(JAXBElement<String> value) {
        this.flagRicUffPost = value;
    }

    /**
     * Recupera il valore della proprietà contrSoggSportImm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContrSoggSportImm() {
        return contrSoggSportImm;
    }

    /**
     * Imposta il valore della proprietà contrSoggSportImm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContrSoggSportImm(JAXBElement<String> value) {
        this.contrSoggSportImm = value;
    }

    /**
     * Recupera il valore della proprietà richPermSogg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRichPermSogg() {
        return richPermSogg;
    }

    /**
     * Imposta il valore della proprietà richPermSogg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRichPermSogg(JAXBElement<String> value) {
        this.richPermSogg = value;
    }

    /**
     * Recupera il valore della proprietà nullaOstaRicong.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNullaOstaRicong() {
        return nullaOstaRicong;
    }

    /**
     * Imposta il valore della proprietà nullaOstaRicong.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNullaOstaRicong(JAXBElement<String> value) {
        this.nullaOstaRicong = value;
    }

}
