
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseConvivenza complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseConvivenza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlagFamConv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesConvivenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConvivenza", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "flagFamConv",
    "desConvivenza"
})
public class BaseConvivenza {

    @XmlElementRef(name = "FlagFamConv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagFamConv;
    @XmlElementRef(name = "DesConvivenza", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desConvivenza;

    /**
     * Recupera il valore della proprietà flagFamConv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagFamConv() {
        return flagFamConv;
    }

    /**
     * Imposta il valore della proprietà flagFamConv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagFamConv(JAXBElement<String> value) {
        this.flagFamConv = value;
    }

    /**
     * Recupera il valore della proprietà desConvivenza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesConvivenza() {
        return desConvivenza;
    }

    /**
     * Imposta il valore della proprietà desConvivenza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesConvivenza(JAXBElement<String> value) {
        this.desConvivenza = value;
    }

}
