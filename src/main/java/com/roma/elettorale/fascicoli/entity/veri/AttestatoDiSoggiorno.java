
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AttestatoDiSoggiorno complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AttestatoDiSoggiorno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceIndiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NrAttestato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRilascio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitFam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceIndFam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NrAttestatoFam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EsitoComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttestatoDiSoggiorno", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipoRec",
    "codiceIndiv",
    "nrAttestato",
    "dataRilascio",
    "titFam",
    "codiceIndFam",
    "nrAttestatoFam",
    "esitoComp"
})
public class AttestatoDiSoggiorno {

    @XmlElementRef(name = "TipoRec", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoRec;
    @XmlElementRef(name = "CodiceIndiv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceIndiv;
    @XmlElementRef(name = "NrAttestato", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nrAttestato;
    @XmlElementRef(name = "DataRilascio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRilascio;
    @XmlElementRef(name = "TitFam", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titFam;
    @XmlElementRef(name = "CodiceIndFam", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceIndFam;
    @XmlElementRef(name = "NrAttestatoFam", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nrAttestatoFam;
    @XmlElementRef(name = "EsitoComp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> esitoComp;

    /**
     * Recupera il valore della proprietà tipoRec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoRec() {
        return tipoRec;
    }

    /**
     * Imposta il valore della proprietà tipoRec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoRec(JAXBElement<String> value) {
        this.tipoRec = value;
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
     * Recupera il valore della proprietà nrAttestato.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNrAttestato() {
        return nrAttestato;
    }

    /**
     * Imposta il valore della proprietà nrAttestato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNrAttestato(JAXBElement<String> value) {
        this.nrAttestato = value;
    }

    /**
     * Recupera il valore della proprietà dataRilascio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataRilascio() {
        return dataRilascio;
    }

    /**
     * Imposta il valore della proprietà dataRilascio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataRilascio(JAXBElement<String> value) {
        this.dataRilascio = value;
    }

    /**
     * Recupera il valore della proprietà titFam.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitFam() {
        return titFam;
    }

    /**
     * Imposta il valore della proprietà titFam.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitFam(JAXBElement<String> value) {
        this.titFam = value;
    }

    /**
     * Recupera il valore della proprietà codiceIndFam.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceIndFam() {
        return codiceIndFam;
    }

    /**
     * Imposta il valore della proprietà codiceIndFam.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceIndFam(JAXBElement<String> value) {
        this.codiceIndFam = value;
    }

    /**
     * Recupera il valore della proprietà nrAttestatoFam.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNrAttestatoFam() {
        return nrAttestatoFam;
    }

    /**
     * Imposta il valore della proprietà nrAttestatoFam.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNrAttestatoFam(JAXBElement<String> value) {
        this.nrAttestatoFam = value;
    }

    /**
     * Recupera il valore della proprietà esitoComp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEsitoComp() {
        return esitoComp;
    }

    /**
     * Imposta il valore della proprietà esitoComp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEsitoComp(JAXBElement<String> value) {
        this.esitoComp = value;
    }

}
