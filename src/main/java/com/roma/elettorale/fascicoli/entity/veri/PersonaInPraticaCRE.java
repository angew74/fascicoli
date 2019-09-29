
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PersonaInPraticaCRE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonaInPraticaCRE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}PersonaInPraticaCRAB">
 *       &lt;sequence>
 *         &lt;element name="CodPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodNPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodSett" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipConf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EsitoAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumProt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaInPraticaCRE", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "codPos",
    "codNPos",
    "codSett",
    "tipConf",
    "esitoAcc",
    "numProt"
})
public class PersonaInPraticaCRE
    extends PersonaInPraticaCRAB
{

    @XmlElementRef(name = "CodPos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codPos;
    @XmlElementRef(name = "CodNPos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codNPos;
    @XmlElementRef(name = "CodSett", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codSett;
    @XmlElementRef(name = "TipConf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipConf;
    @XmlElementRef(name = "EsitoAcc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> esitoAcc;
    @XmlElementRef(name = "NumProt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numProt;

    /**
     * Recupera il valore della proprieta codPos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodPos() {
        return codPos;
    }

    /**
     * Imposta il valore della proprieta codPos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodPos(JAXBElement<String> value) {
        this.codPos = value;
    }

    /**
     * Recupera il valore della proprieta codNPos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodNPos() {
        return codNPos;
    }

    /**
     * Imposta il valore della proprieta codNPos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodNPos(JAXBElement<String> value) {
        this.codNPos = value;
    }

    /**
     * Recupera il valore della proprieta codSett.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSett() {
        return codSett;
    }

    /**
     * Imposta il valore della proprieta codSett.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSett(JAXBElement<String> value) {
        this.codSett = value;
    }

    /**
     * Recupera il valore della proprieta tipConf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipConf() {
        return tipConf;
    }

    /**
     * Imposta il valore della proprieta tipConf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipConf(JAXBElement<String> value) {
        this.tipConf = value;
    }

    /**
     * Recupera il valore della proprieta esitoAcc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEsitoAcc() {
        return esitoAcc;
    }

    /**
     * Imposta il valore della proprieta esitoAcc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEsitoAcc(JAXBElement<String> value) {
        this.esitoAcc = value;
    }

    /**
     * Recupera il valore della proprieta numProt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumProt() {
        return numProt;
    }

    /**
     * Imposta il valore della proprieta numProt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumProt(JAXBElement<String> value) {
        this.numProt = value;
    }

}
