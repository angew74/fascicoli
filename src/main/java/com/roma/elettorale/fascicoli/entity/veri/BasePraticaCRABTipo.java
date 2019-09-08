
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BasePraticaCRABTipo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasePraticaCRABTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}BasePraticaCRAB">
 *       &lt;sequence>
 *         &lt;element name="TipoPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePraticaCRABTipo", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipoPratica"
})
public class BasePraticaCRABTipo
    extends BasePraticaCRAB
{

    @XmlElementRef(name = "TipoPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPratica;

    /**
     * Recupera il valore della proprietà tipoPratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPratica() {
        return tipoPratica;
    }

    /**
     * Imposta il valore della proprietà tipoPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPratica(JAXBElement<String> value) {
        this.tipoPratica = value;
    }

}
