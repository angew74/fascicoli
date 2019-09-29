
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IdAttoStatoCivile complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IdAttoStatoCivile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnoSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParteSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerieSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EspSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoComAttoSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodComAttoSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesComAttoSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdAttoStatoCivile", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "annoSs",
    "numeroSs",
    "parteSs",
    "serieSs",
    "espSs",
    "tipoComAttoSs",
    "codComAttoSs",
    "desComAttoSs"
})
@XmlSeeAlso({
    BaseEventoStatoCivileType.class,
    BaseDivorzioType.class
})
public class IdAttoStatoCivile {

    @XmlElementRef(name = "AnnoSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> annoSs;
    @XmlElementRef(name = "NumeroSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroSs;
    @XmlElementRef(name = "ParteSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parteSs;
    @XmlElementRef(name = "SerieSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serieSs;
    @XmlElementRef(name = "EspSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> espSs;
    @XmlElementRef(name = "TipoComAttoSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoComAttoSs;
    @XmlElementRef(name = "CodComAttoSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codComAttoSs;
    @XmlElementRef(name = "DesComAttoSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desComAttoSs;

    /**
     * Recupera il valore della propriet� annoSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnnoSs() {
        return annoSs;
    }

    /**
     * Imposta il valore della propriet� annoSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnnoSs(JAXBElement<String> value) {
        this.annoSs = value;
    }

    /**
     * Recupera il valore della propriet� numeroSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroSs() {
        return numeroSs;
    }

    /**
     * Imposta il valore della propriet� numeroSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroSs(JAXBElement<String> value) {
        this.numeroSs = value;
    }

    /**
     * Recupera il valore della propriet� parteSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParteSs() {
        return parteSs;
    }

    /**
     * Imposta il valore della propriet� parteSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParteSs(JAXBElement<String> value) {
        this.parteSs = value;
    }

    /**
     * Recupera il valore della propriet� serieSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerieSs() {
        return serieSs;
    }

    /**
     * Imposta il valore della propriet� serieSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerieSs(JAXBElement<String> value) {
        this.serieSs = value;
    }

    /**
     * Recupera il valore della propriet� espSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEspSs() {
        return espSs;
    }

    /**
     * Imposta il valore della propriet� espSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEspSs(JAXBElement<String> value) {
        this.espSs = value;
    }

    /**
     * Recupera il valore della propriet� tipoComAttoSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoComAttoSs() {
        return tipoComAttoSs;
    }

    /**
     * Imposta il valore della propriet tipoComAttoSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoComAttoSs(JAXBElement<String> value) {
        this.tipoComAttoSs = value;
    }

    /**
     * Recupera il valore della propriet� codComAttoSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodComAttoSs() {
        return codComAttoSs;
    }

    /**
     * Imposta il valore della propriet� codComAttoSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodComAttoSs(JAXBElement<String> value) {
        this.codComAttoSs = value;
    }

    /**
     * Recupera il valore della propriet� desComAttoSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesComAttoSs() {
        return desComAttoSs;
    }

    /**
     * Imposta il valore della propriet� desComAttoSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesComAttoSs(JAXBElement<String> value) {
        this.desComAttoSs = value;
    }

}
