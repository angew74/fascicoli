
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UtentePraticaCRE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UtentePraticaCRE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UltUs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotRitr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgUs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dettaglio" type="{http://tempuri.org/TipiBase.xsd}BaseDettaglioPraticaRespCRE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtentePraticaCRE", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "ultUs",
    "totRitr",
    "progUs",
    "dettaglio"
})
public class UtentePraticaCRE {

    @XmlElementRef(name = "UltUs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ultUs;
    @XmlElementRef(name = "TotRitr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totRitr;
    @XmlElementRef(name = "ProgUs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> progUs;
    @XmlElementRef(name = "Dettaglio", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseDettaglioPraticaRespCRE> dettaglio;

    /**
     * Recupera il valore della proprietà ultUs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUltUs() {
        return ultUs;
    }

    /**
     * Imposta il valore della proprietà ultUs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUltUs(JAXBElement<String> value) {
        this.ultUs = value;
    }

    /**
     * Recupera il valore della proprietà totRitr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotRitr() {
        return totRitr;
    }

    /**
     * Imposta il valore della proprietà totRitr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotRitr(JAXBElement<String> value) {
        this.totRitr = value;
    }

    /**
     * Recupera il valore della proprietà progUs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgUs() {
        return progUs;
    }

    /**
     * Imposta il valore della proprietà progUs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgUs(JAXBElement<String> value) {
        this.progUs = value;
    }

    /**
     * Recupera il valore della proprietà dettaglio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseDettaglioPraticaRespCRE }{@code >}
     *     
     */
    public JAXBElement<BaseDettaglioPraticaRespCRE> getDettaglio() {
        return dettaglio;
    }

    /**
     * Imposta il valore della proprietà dettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseDettaglioPraticaRespCRE }{@code >}
     *     
     */
    public void setDettaglio(JAXBElement<BaseDettaglioPraticaRespCRE> value) {
        this.dettaglio = value;
    }

}
