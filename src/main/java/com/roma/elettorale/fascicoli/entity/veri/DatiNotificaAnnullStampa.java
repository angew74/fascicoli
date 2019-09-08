
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiNotificaAnnullStampa complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiNotificaAnnullStampa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Osservazioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="IndirizzoProvenienza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CapProvenienza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="TestoMotivazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="TestoSoluzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiNotificaAnnullStampa", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "osservazioni",
    "indirizzoProvenienza",
    "capProvenienza",
    "testoMotivazione",
    "testoSoluzione"
})
public class DatiNotificaAnnullStampa {

    @XmlElementRef(name = "Osservazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<String> osservazioni;
    @XmlElementRef(name = "IndirizzoProvenienza", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indirizzoProvenienza;
    @XmlElementRef(name = "CapProvenienza", type = JAXBElement.class, required = false)
    protected JAXBElement<String> capProvenienza;
    @XmlElementRef(name = "TestoMotivazione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> testoMotivazione;
    @XmlElementRef(name = "TestoSoluzione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> testoSoluzione;

    /**
     * Recupera il valore della proprietà osservazioni.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOsservazioni() {
        return osservazioni;
    }

    /**
     * Imposta il valore della proprietà osservazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOsservazioni(JAXBElement<String> value) {
        this.osservazioni = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoProvenienza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndirizzoProvenienza() {
        return indirizzoProvenienza;
    }

    /**
     * Imposta il valore della proprietà indirizzoProvenienza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndirizzoProvenienza(JAXBElement<String> value) {
        this.indirizzoProvenienza = value;
    }

    /**
     * Recupera il valore della proprietà capProvenienza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCapProvenienza() {
        return capProvenienza;
    }

    /**
     * Imposta il valore della proprietà capProvenienza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCapProvenienza(JAXBElement<String> value) {
        this.capProvenienza = value;
    }

    /**
     * Recupera il valore della proprietà testoMotivazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTestoMotivazione() {
        return testoMotivazione;
    }

    /**
     * Imposta il valore della proprietà testoMotivazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTestoMotivazione(JAXBElement<String> value) {
        this.testoMotivazione = value;
    }

    /**
     * Recupera il valore della proprietà testoSoluzione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTestoSoluzione() {
        return testoSoluzione;
    }

    /**
     * Imposta il valore della proprietà testoSoluzione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTestoSoluzione(JAXBElement<String> value) {
        this.testoSoluzione = value;
    }

}
