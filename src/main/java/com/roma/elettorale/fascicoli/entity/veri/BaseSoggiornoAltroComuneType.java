
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseSoggiornoAltroComuneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseSoggiornoAltroComuneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlagFamTit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoAtt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NrAttest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flag_AttestRoma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodComRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesComRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseSoggiornoAltroComuneType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "flagFamTit",
    "tipoAtt",
    "nrAttest",
    "flagAttestRoma",
    "dataRil",
    "codComRil",
    "desComRil"
})
public class BaseSoggiornoAltroComuneType {

    @XmlElementRef(name = "FlagFamTit", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagFamTit;
    @XmlElementRef(name = "TipoAtt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoAtt;
    @XmlElementRef(name = "NrAttest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nrAttest;
    @XmlElementRef(name = "Flag_AttestRoma", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagAttestRoma;
    @XmlElementRef(name = "DataRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRil;
    @XmlElementRef(name = "CodComRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codComRil;
    @XmlElementRef(name = "DesComRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desComRil;

    /**
     * Recupera il valore della proprietà flagFamTit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagFamTit() {
        return flagFamTit;
    }

    /**
     * Imposta il valore della proprietà flagFamTit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagFamTit(JAXBElement<String> value) {
        this.flagFamTit = value;
    }

    /**
     * Recupera il valore della proprietà tipoAtt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoAtt() {
        return tipoAtt;
    }

    /**
     * Imposta il valore della proprietà tipoAtt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoAtt(JAXBElement<String> value) {
        this.tipoAtt = value;
    }

    /**
     * Recupera il valore della proprietà nrAttest.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNrAttest() {
        return nrAttest;
    }

    /**
     * Imposta il valore della proprietà nrAttest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNrAttest(JAXBElement<String> value) {
        this.nrAttest = value;
    }

    /**
     * Recupera il valore della proprietà flagAttestRoma.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlagAttestRoma() {
        return flagAttestRoma;
    }

    /**
     * Imposta il valore della proprietà flagAttestRoma.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlagAttestRoma(JAXBElement<String> value) {
        this.flagAttestRoma = value;
    }

    /**
     * Recupera il valore della proprietà dataRil.
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
     * Imposta il valore della proprietà dataRil.
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
     * Recupera il valore della proprietà codComRil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodComRil() {
        return codComRil;
    }

    /**
     * Imposta il valore della proprietà codComRil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodComRil(JAXBElement<String> value) {
        this.codComRil = value;
    }

    /**
     * Recupera il valore della proprietà desComRil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesComRil() {
        return desComRil;
    }

    /**
     * Imposta il valore della proprietà desComRil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesComRil(JAXBElement<String> value) {
        this.desComRil = value;
    }

}
