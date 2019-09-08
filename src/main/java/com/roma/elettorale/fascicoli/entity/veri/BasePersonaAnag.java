
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BasePersonaAnag complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasePersonaAnag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Progressivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceIndiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceFis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeIndiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlagVR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodFam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataNasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodComNasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescComNas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePersonaAnag", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "progressivo",
    "codiceIndiv",
    "codiceFis",
    "nomeIndiv",
    "cognome",
    "sesso",
    "flagVR",
    "codFam",
    "dataNasc",
    "codComNasc",
    "descComNas"
})
@XmlSeeAlso({
    BasePersonaInFamigliaAnag.class,
    PersonaInPraticaCRAB.class
})
public class BasePersonaAnag {

    @XmlElementRef(name = "Progressivo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> progressivo;
    @XmlElementRef(name = "CodiceIndiv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceIndiv;
    @XmlElementRef(name = "CodiceFis", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceFis;
    @XmlElementRef(name = "NomeIndiv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeIndiv;
    @XmlElementRef(name = "Cognome", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cognome;
    @XmlElementRef(name = "Sesso", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sesso;
    @XmlElementRef(name = "FlagVR", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagVR;
    @XmlElementRef(name = "CodFam", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codFam;
    @XmlElementRef(name = "DataNasc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataNasc;
    @XmlElementRef(name = "CodComNasc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codComNasc;
    @XmlElementRef(name = "DescComNas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descComNas;

    /**
     * Recupera il valore della proprietà progressivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgressivo() {
        return progressivo;
    }

    /**
     * Imposta il valore della proprietà progressivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgressivo(JAXBElement<String> value) {
        this.progressivo = value;
    }

    /**
     * Recupera il valore della proprietà codiceIndiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceIndiv() {
        return codiceIndiv;
    }

    /**
     * Imposta il valore della proprietà codiceIndiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceIndiv(JAXBElement<String> value) {
        this.codiceIndiv = value;
    }

    /**
     * Recupera il valore della proprietà codiceFis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceFis() {
        return codiceFis;
    }

    /**
     * Imposta il valore della proprietà codiceFis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceFis(JAXBElement<String> value) {
        this.codiceFis = value;
    }

    /**
     * Recupera il valore della proprietà nomeIndiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeIndiv() {
        return nomeIndiv;
    }

    /**
     * Imposta il valore della proprietà nomeIndiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeIndiv(JAXBElement<String> value) {
        this.nomeIndiv = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCognome(JAXBElement<String> value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà sesso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesso() {
        return sesso;
    }

    /**
     * Imposta il valore della proprietà sesso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesso(JAXBElement<String> value) {
        this.sesso = value;
    }

    /**
     * Recupera il valore della proprietà flagVR.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagVR() {
        return flagVR;
    }

    /**
     * Imposta il valore della proprietà flagVR.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagVR(JAXBElement<String> value) {
        this.flagVR = value;
    }

    /**
     * Recupera il valore della proprietà codFam.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodFam() {
        return codFam;
    }

    /**
     * Imposta il valore della proprietà codFam.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodFam(JAXBElement<String> value) {
        this.codFam = value;
    }

    /**
     * Recupera il valore della proprietà dataNasc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataNasc() {
        return dataNasc;
    }

    /**
     * Imposta il valore della proprietà dataNasc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataNasc(JAXBElement<String> value) {
        this.dataNasc = value;
    }

    /**
     * Recupera il valore della proprietà codComNasc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodComNasc() {
        return codComNasc;
    }

    /**
     * Imposta il valore della proprietà codComNasc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodComNasc(JAXBElement<String> value) {
        this.codComNasc = value;
    }

    /**
     * Recupera il valore della proprietà descComNas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescComNas() {
        return descComNas;
    }

    /**
     * Imposta il valore della proprietà descComNas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescComNas(JAXBElement<String> value) {
        this.descComNas = value;
    }

}
