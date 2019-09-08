
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IndirizzoAIREAnagType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IndirizzoAIREAnagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Indirizzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodComune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DenominazioneComune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Consolato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndirizzoAIREAnagType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "indirizzo",
    "cap",
    "codComune",
    "denominazioneComune",
    "consolato"
})
public class IndirizzoAIREAnagType {

    @XmlElementRef(name = "Indirizzo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indirizzo;
    @XmlElementRef(name = "CAP", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cap;
    @XmlElementRef(name = "CodComune", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codComune;
    @XmlElementRef(name = "DenominazioneComune", type = JAXBElement.class, required = false)
    protected JAXBElement<String> denominazioneComune;
    @XmlElementRef(name = "Consolato", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consolato;

    /**
     * Recupera il valore della proprietà indirizzo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndirizzo() {
        return indirizzo;
    }

    /**
     * Imposta il valore della proprietà indirizzo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndirizzo(JAXBElement<String> value) {
        this.indirizzo = value;
    }

    /**
     * Recupera il valore della proprietà cap.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCAP() {
        return cap;
    }

    /**
     * Imposta il valore della proprietà cap.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCAP(JAXBElement<String> value) {
        this.cap = value;
    }

    /**
     * Recupera il valore della proprietà codComune.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodComune() {
        return codComune;
    }

    /**
     * Imposta il valore della proprietà codComune.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodComune(JAXBElement<String> value) {
        this.codComune = value;
    }

    /**
     * Recupera il valore della proprietà denominazioneComune.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDenominazioneComune() {
        return denominazioneComune;
    }

    /**
     * Imposta il valore della proprietà denominazioneComune.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDenominazioneComune(JAXBElement<String> value) {
        this.denominazioneComune = value;
    }

    /**
     * Recupera il valore della proprietà consolato.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsolato() {
        return consolato;
    }

    /**
     * Imposta il valore della proprietà consolato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsolato(JAXBElement<String> value) {
        this.consolato = value;
    }

}
