
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseCartaIdentitaAnagType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseCartaIdentitaAnagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoCarta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroCarta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Espatrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodComuneRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescComuneRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Consolato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescConsolato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataScad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCartaIdentitaAnagType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipoCarta",
    "numeroCarta",
    "espatrio",
    "dataRil",
    "codComuneRil",
    "descComuneRil",
    "consolato",
    "descConsolato",
    "dataScad"
})
public class BaseCartaIdentitaAnagType {

    @XmlElementRef(name = "TipoCarta", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCarta;
    @XmlElementRef(name = "NumeroCarta", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCarta;
    @XmlElementRef(name = "Espatrio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> espatrio;
    @XmlElementRef(name = "DataRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRil;
    @XmlElementRef(name = "CodComuneRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codComuneRil;
    @XmlElementRef(name = "DescComuneRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descComuneRil;
    @XmlElementRef(name = "Consolato", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consolato;
    @XmlElementRef(name = "DescConsolato", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descConsolato;
    @XmlElement(name = "DataScad", required = true)
    protected String dataScad;

    /**
     * Recupera il valore della proprieta tipoCarta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCarta() {
        return tipoCarta;
    }

    /**
     * Imposta il valore della proprieta tipoCarta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCarta(JAXBElement<String> value) {
        this.tipoCarta = value;
    }

    /**
     * Recupera il valore della proprieta numeroCarta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCarta() {
        return numeroCarta;
    }

    /**
     * Imposta il valore della proprieta numeroCarta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCarta(JAXBElement<String> value) {
        this.numeroCarta = value;
    }

    /**
     * Recupera il valore della proprieta espatrio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEspatrio() {
        return espatrio;
    }

    /**
     * Imposta il valore della proprieta espatrio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEspatrio(JAXBElement<String> value) {
        this.espatrio = value;
    }

    /**
     * Recupera il valore della proprieta dataRil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataRil() {
        return dataRil;
    }

    /**
     * Imposta il valore della proprieta dataRil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataRil(JAXBElement<String> value) {
        this.dataRil = value;
    }

    /**
     * Recupera il valore della proprieta codComuneRil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodComuneRil() {
        return codComuneRil;
    }

    /**
     * Imposta il valore della proprieta codComuneRil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodComuneRil(JAXBElement<String> value) {
        this.codComuneRil = value;
    }

    /**
     * Recupera il valore della proprieta descComuneRil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescComuneRil() {
        return descComuneRil;
    }

    /**
     * Imposta il valore della proprieta descComuneRil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescComuneRil(JAXBElement<String> value) {
        this.descComuneRil = value;
    }

    /**
     * Recupera il valore della proprieta consolato.
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
     * Imposta il valore della proprieta consolato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsolato(JAXBElement<String> value) {
        this.consolato = value;
    }

    /**
     * Recupera il valore della proprieta descConsolato.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescConsolato() {
        return descConsolato;
    }

    /**
     * Imposta il valore della proprieta descConsolato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescConsolato(JAXBElement<String> value) {
        this.descConsolato = value;
    }

    /**
     * Recupera il valore della proprieta dataScad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataScad() {
        return dataScad;
    }

    /**
     * Imposta il valore della proprieta dataScad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScad(String value) {
        this.dataScad = value;
    }

}
