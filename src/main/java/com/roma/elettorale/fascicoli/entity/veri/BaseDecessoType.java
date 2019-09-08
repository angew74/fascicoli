
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseDecessoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseDecessoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}BaseEventoStatoCivileType">
 *       &lt;sequence>
 *         &lt;element name="CodComResDec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesComResDec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDecessoType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "codComResDec",
    "desComResDec"
})
public class BaseDecessoType
    extends BaseEventoStatoCivileType
{

    @XmlElementRef(name = "CodComResDec", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codComResDec;
    @XmlElementRef(name = "DesComResDec", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desComResDec;

    /**
     * Recupera il valore della proprietà codComResDec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodComResDec() {
        return codComResDec;
    }

    /**
     * Imposta il valore della proprietà codComResDec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodComResDec(JAXBElement<String> value) {
        this.codComResDec = value;
    }

    /**
     * Recupera il valore della proprietà desComResDec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesComResDec() {
        return desComResDec;
    }

    /**
     * Imposta il valore della proprietà desComResDec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesComResDec(JAXBElement<String> value) {
        this.desComResDec = value;
    }

}
