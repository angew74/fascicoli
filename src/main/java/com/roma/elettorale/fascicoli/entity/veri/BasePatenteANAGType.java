
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BasePatenteANAGType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasePatenteANAGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroPat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescCategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnteRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescEnte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusPat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComuRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescComRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePatenteANAGType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "numeroPat",
    "categoria",
    "descCategoria",
    "enteRil",
    "descEnte",
    "dataRil",
    "statusPat",
    "comuRil",
    "descComRil"
})
public class BasePatenteANAGType {

    @XmlElementRef(name = "NumeroPat", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPat;
    @XmlElementRef(name = "Categoria", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoria;
    @XmlElementRef(name = "DescCategoria", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descCategoria;
    @XmlElementRef(name = "EnteRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enteRil;
    @XmlElementRef(name = "DescEnte", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descEnte;
    @XmlElementRef(name = "DataRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRil;
    @XmlElementRef(name = "StatusPat", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusPat;
    @XmlElementRef(name = "ComuRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comuRil;
    @XmlElementRef(name = "DescComRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descComRil;

    /**
     * Recupera il valore della proprieta numeroPat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPat() {
        return numeroPat;
    }

    /**
     * Imposta il valore della proprieta numeroPat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPat(JAXBElement<String> value) {
        this.numeroPat = value;
    }

    /**
     * Recupera il valore della proprieta categoria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoria() {
        return categoria;
    }

    /**
     * Imposta il valore della proprieta categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoria(JAXBElement<String> value) {
        this.categoria = value;
    }

    /**
     * Recupera il valore della proprieta descCategoria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescCategoria() {
        return descCategoria;
    }

    /**
     * Imposta il valore della proprieta descCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescCategoria(JAXBElement<String> value) {
        this.descCategoria = value;
    }

    /**
     * Recupera il valore della proprieta enteRil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnteRil() {
        return enteRil;
    }

    /**
     * Imposta il valore della proprieta enteRil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnteRil(JAXBElement<String> value) {
        this.enteRil = value;
    }

    /**
     * Recupera il valore della proprieta descEnte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescEnte() {
        return descEnte;
    }

    /**
     * Imposta il valore della proprieta descEnte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescEnte(JAXBElement<String> value) {
        this.descEnte = value;
    }

    /**
     * Recupera il valore della proprieta dataRil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataRil() {
        return dataRil;
    }

    /**
     * Imposta il valore della proprieta dataRil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataRil(JAXBElement<String> value) {
        this.dataRil = value;
    }

    /**
     * Recupera il valore della proprieta statusPat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusPat() {
        return statusPat;
    }

    /**
     * Imposta il valore della proprieta statusPat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusPat(JAXBElement<String> value) {
        this.statusPat = value;
    }

    /**
     * Recupera il valore della proprieta comuRil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComuRil() {
        return comuRil;
    }

    /**
     * Imposta il valore della proprieta comuRil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComuRil(JAXBElement<String> value) {
        this.comuRil = value;
    }

    /**
     * Recupera il valore della proprieta descComRil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescComRil() {
        return descComRil;
    }

    /**
     * Imposta il valore della proprieta descComRil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescComRil(JAXBElement<String> value) {
        this.descComRil = value;
    }

}
