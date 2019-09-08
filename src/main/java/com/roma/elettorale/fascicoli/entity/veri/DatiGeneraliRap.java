
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiGeneraliRap complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiGeneraliRap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}BasePraticaCRAB">
 *       &lt;sequence>
 *         &lt;element name="TipoOperazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiGeneraliRap", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipoOperazione"
})
public class DatiGeneraliRap
    extends BasePraticaCRAB
{

    @XmlElementRef(name = "TipoOperazione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoOperazione;

    /**
     * Recupera il valore della proprietà tipoOperazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoOperazione() {
        return tipoOperazione;
    }

    /**
     * Imposta il valore della proprietà tipoOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoOperazione(JAXBElement<String> value) {
        this.tipoOperazione = value;
    }

}
