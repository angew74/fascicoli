
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseCircolare19FamiliareAnagType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseCircolare19FamiliareAnagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocFamilUe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocACaricoUe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocGenItal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NrAttestFam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodIndTitolare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CognTit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeTit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataNasTit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessoTit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCircolare19FamiliareAnagType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipoDoc",
    "numeroDoc",
    "docFamilUe",
    "docACaricoUe",
    "docGenItal",
    "nrAttestFam",
    "codIndTitolare",
    "cognTit",
    "nomeTit",
    "dataNasTit",
    "sessoTit"
})
public class BaseCircolare19FamiliareAnagType {

    @XmlElementRef(name = "TipoDoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDoc;
    @XmlElementRef(name = "NumeroDoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDoc;
    @XmlElementRef(name = "DocFamilUe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docFamilUe;
    @XmlElementRef(name = "DocACaricoUe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docACaricoUe;
    @XmlElementRef(name = "DocGenItal", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docGenItal;
    @XmlElementRef(name = "NrAttestFam", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nrAttestFam;
    @XmlElementRef(name = "CodIndTitolare", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codIndTitolare;
    @XmlElementRef(name = "CognTit", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cognTit;
    @XmlElementRef(name = "NomeTit", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeTit;
    @XmlElementRef(name = "DataNasTit", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataNasTit;
    @XmlElementRef(name = "SessoTit", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessoTit;

    /**
     * Recupera il valore della proprietà tipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Imposta il valore della proprietà tipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDoc(JAXBElement<String> value) {
        this.tipoDoc = value;
    }

    /**
     * Recupera il valore della proprietà numeroDoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDoc() {
        return numeroDoc;
    }

    /**
     * Imposta il valore della proprietà numeroDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDoc(JAXBElement<String> value) {
        this.numeroDoc = value;
    }

    /**
     * Recupera il valore della proprietà docFamilUe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocFamilUe() {
        return docFamilUe;
    }

    /**
     * Imposta il valore della proprietà docFamilUe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocFamilUe(JAXBElement<String> value) {
        this.docFamilUe = value;
    }

    /**
     * Recupera il valore della proprietà docACaricoUe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocACaricoUe() {
        return docACaricoUe;
    }

    /**
     * Imposta il valore della proprietà docACaricoUe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocACaricoUe(JAXBElement<String> value) {
        this.docACaricoUe = value;
    }

    /**
     * Recupera il valore della proprietà docGenItal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocGenItal() {
        return docGenItal;
    }

    /**
     * Imposta il valore della proprietà docGenItal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocGenItal(JAXBElement<String> value) {
        this.docGenItal = value;
    }

    /**
     * Recupera il valore della proprietà nrAttestFam.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNrAttestFam() {
        return nrAttestFam;
    }

    /**
     * Imposta il valore della proprietà nrAttestFam.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNrAttestFam(JAXBElement<String> value) {
        this.nrAttestFam = value;
    }

    /**
     * Recupera il valore della proprietà codIndTitolare.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodIndTitolare() {
        return codIndTitolare;
    }

    /**
     * Imposta il valore della proprietà codIndTitolare.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodIndTitolare(JAXBElement<String> value) {
        this.codIndTitolare = value;
    }

    /**
     * Recupera il valore della proprietà cognTit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCognTit() {
        return cognTit;
    }

    /**
     * Imposta il valore della proprietà cognTit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCognTit(JAXBElement<String> value) {
        this.cognTit = value;
    }

    /**
     * Recupera il valore della proprietà nomeTit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeTit() {
        return nomeTit;
    }

    /**
     * Imposta il valore della proprietà nomeTit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeTit(JAXBElement<String> value) {
        this.nomeTit = value;
    }

    /**
     * Recupera il valore della proprietà dataNasTit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataNasTit() {
        return dataNasTit;
    }

    /**
     * Imposta il valore della proprietà dataNasTit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataNasTit(JAXBElement<String> value) {
        this.dataNasTit = value;
    }

    /**
     * Recupera il valore della proprietà sessoTit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessoTit() {
        return sessoTit;
    }

    /**
     * Imposta il valore della proprietà sessoTit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessoTit(JAXBElement<String> value) {
        this.sessoTit = value;
    }

}
