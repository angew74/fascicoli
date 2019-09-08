
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseTargaAnagType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseTargaAnagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipVeicolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargaVeicolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseTargaAnagType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipVeicolo",
    "targaVeicolo",
    "descTipo"
})
public class BaseTargaAnagType {

    @XmlElementRef(name = "TipVeicolo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipVeicolo;
    @XmlElementRef(name = "TargaVeicolo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targaVeicolo;
    @XmlElementRef(name = "DescTipo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descTipo;

    /**
     * Recupera il valore della proprietà tipVeicolo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipVeicolo() {
        return tipVeicolo;
    }

    /**
     * Imposta il valore della proprietà tipVeicolo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipVeicolo(JAXBElement<String> value) {
        this.tipVeicolo = value;
    }

    /**
     * Recupera il valore della proprietà targaVeicolo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargaVeicolo() {
        return targaVeicolo;
    }

    /**
     * Imposta il valore della proprietà targaVeicolo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargaVeicolo(JAXBElement<String> value) {
        this.targaVeicolo = value;
    }

    /**
     * Recupera il valore della proprietà descTipo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescTipo() {
        return descTipo;
    }

    /**
     * Imposta il valore della proprietà descTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescTipo(JAXBElement<String> value) {
        this.descTipo = value;
    }

}
