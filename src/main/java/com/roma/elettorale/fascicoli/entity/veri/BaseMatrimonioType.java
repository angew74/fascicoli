
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseMatrimonioType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseMatrimonioType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}BaseEventoStatoCivileType">
 *       &lt;sequence>
 *         &lt;element name="SceltaPat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMatrimonioType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "sceltaPat"
})
public class BaseMatrimonioType
    extends BaseEventoStatoCivileType
{

    @XmlElementRef(name = "SceltaPat", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sceltaPat;

    /**
     * Recupera il valore della proprietà sceltaPat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSceltaPat() {
        return sceltaPat;
    }

    /**
     * Imposta il valore della proprietà sceltaPat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSceltaPat(JAXBElement<String> value) {
        this.sceltaPat = value;
    }

}
