
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseLibrettoDiLavoroAnagType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseLibrettoDiLavoroAnagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroLib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataLib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modalita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodComuneLib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescComuneLib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseLibrettoDiLavoroAnagType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "numeroLib",
    "dataLib",
    "modalita",
    "codComuneLib",
    "descComuneLib"
})
public class BaseLibrettoDiLavoroAnagType {

    @XmlElementRef(name = "NumeroLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroLib;
    @XmlElementRef(name = "DataLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataLib;
    @XmlElementRef(name = "Modalita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modalita;
    @XmlElementRef(name = "CodComuneLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codComuneLib;
    @XmlElementRef(name = "DescComuneLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descComuneLib;

    /**
     * Recupera il valore della proprietà numeroLib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroLib() {
        return numeroLib;
    }

    /**
     * Imposta il valore della proprietà numeroLib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroLib(JAXBElement<String> value) {
        this.numeroLib = value;
    }

    /**
     * Recupera il valore della proprietà dataLib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataLib() {
        return dataLib;
    }

    /**
     * Imposta il valore della proprietà dataLib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataLib(JAXBElement<String> value) {
        this.dataLib = value;
    }

    /**
     * Recupera il valore della proprietà modalita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModalita() {
        return modalita;
    }

    /**
     * Imposta il valore della proprietà modalita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModalita(JAXBElement<String> value) {
        this.modalita = value;
    }

    /**
     * Recupera il valore della proprietà codComuneLib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodComuneLib() {
        return codComuneLib;
    }

    /**
     * Imposta il valore della proprietà codComuneLib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodComuneLib(JAXBElement<String> value) {
        this.codComuneLib = value;
    }

    /**
     * Recupera il valore della proprietà descComuneLib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescComuneLib() {
        return descComuneLib;
    }

    /**
     * Imposta il valore della proprietà descComuneLib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescComuneLib(JAXBElement<String> value) {
        this.descComuneLib = value;
    }

}
