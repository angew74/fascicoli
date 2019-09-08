
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BasePensioneAnagType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasePensioneAnagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroPen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoriaPen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescCategoriaPen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescEntePen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescSede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataPen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoBD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePensioneAnagType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "numeroPen",
    "categoriaPen",
    "descCategoriaPen",
    "ente",
    "descEntePen",
    "sede",
    "descSede",
    "dataPen",
    "tipoBD"
})
public class BasePensioneAnagType {

    @XmlElementRef(name = "NumeroPen", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPen;
    @XmlElementRef(name = "CategoriaPen", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoriaPen;
    @XmlElementRef(name = "DescCategoriaPen", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descCategoriaPen;
    @XmlElementRef(name = "Ente", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ente;
    @XmlElementRef(name = "DescEntePen", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descEntePen;
    @XmlElementRef(name = "Sede", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sede;
    @XmlElementRef(name = "DescSede", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descSede;
    @XmlElementRef(name = "DataPen", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataPen;
    @XmlElement(name = "TipoBD", required = true, nillable = true)
    protected String tipoBD;

    /**
     * Recupera il valore della propriet� numeroPen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPen() {
        return numeroPen;
    }

    /**
     * Imposta il valore della propriet� numeroPen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPen(JAXBElement<String> value) {
        this.numeroPen = value;
    }

    /**
     * Recupera il valore della propriet� categoriaPen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoriaPen() {
        return categoriaPen;
    }

    /**
     * Imposta il valore della propriet� categoriaPen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoriaPen(JAXBElement<String> value) {
        this.categoriaPen = value;
    }

    /**
     * Recupera il valore della propriet� descCategoriaPen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescCategoriaPen() {
        return descCategoriaPen;
    }

    /**
     * Imposta il valore della propriet� descCategoriaPen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescCategoriaPen(JAXBElement<String> value) {
        this.descCategoriaPen = value;
    }

    /**
     * Recupera il valore della propriet� ente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnte() {
        return ente;
    }

    /**
     * Imposta il valore della propriet� ente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnte(JAXBElement<String> value) {
        this.ente = value;
    }

    /**
     * Recupera il valore della propriet� descEntePen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescEntePen() {
        return descEntePen;
    }

    /**
     * Imposta il valore della propriet� descEntePen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescEntePen(JAXBElement<String> value) {
        this.descEntePen = value;
    }

    /**
     * Recupera il valore della propriet� sede.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSede() {
        return sede;
    }

    /**
     * Imposta il valore della propriet� sede.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSede(JAXBElement<String> value) {
        this.sede = value;
    }

    /**
     * Recupera il valore della propriet� descSede.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescSede() {
        return descSede;
    }

    /**
     * Imposta il valore della propriet� descSede.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescSede(JAXBElement<String> value) {
        this.descSede = value;
    }

    /**
     * Recupera il valore della propriet� dataPen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataPen() {
        return dataPen;
    }

    /**
     * Imposta il valore della propriet� dataPen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataPen(JAXBElement<String> value) {
        this.dataPen = value;
    }

    /**
     * Recupera il valore della propriet� tipoBD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBD() {
        return tipoBD;
    }

    /**
     * Imposta il valore della propriet� tipoBD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBD(String value) {
        this.tipoBD = value;
    }

}
