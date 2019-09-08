
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RigaPraticaCRE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RigaPraticaCRE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnoPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Protocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataDefinizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PraticaCollegata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotRitr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgPrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dettaglio" type="{http://tempuri.org/TipiBase.xsd}BaseDettaglioUserRespCRE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RigaPraticaCRE", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "annoPratica",
    "numeroPratica",
    "dataPratica",
    "protocollo",
    "status",
    "dataDefinizione",
    "praticaCollegata",
    "totRitr",
    "progPrat",
    "dettaglio"
})
public class RigaPraticaCRE {

    @XmlElementRef(name = "AnnoPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> annoPratica;
    @XmlElementRef(name = "NumeroPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPratica;
    @XmlElementRef(name = "DataPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataPratica;
    @XmlElementRef(name = "Protocollo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocollo;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "DataDefinizione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataDefinizione;
    @XmlElementRef(name = "PraticaCollegata", type = JAXBElement.class, required = false)
    protected JAXBElement<String> praticaCollegata;
    @XmlElementRef(name = "TotRitr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totRitr;
    @XmlElementRef(name = "ProgPrat", type = JAXBElement.class, required = false)
    protected JAXBElement<String> progPrat;
    @XmlElementRef(name = "Dettaglio", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseDettaglioUserRespCRE> dettaglio;

    /**
     * Recupera il valore della proprietà annoPratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnnoPratica() {
        return annoPratica;
    }

    /**
     * Imposta il valore della proprietà annoPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnnoPratica(JAXBElement<String> value) {
        this.annoPratica = value;
    }

    /**
     * Recupera il valore della proprietà numeroPratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPratica() {
        return numeroPratica;
    }

    /**
     * Imposta il valore della proprietà numeroPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPratica(JAXBElement<String> value) {
        this.numeroPratica = value;
    }

    /**
     * Recupera il valore della proprietà dataPratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataPratica() {
        return dataPratica;
    }

    /**
     * Imposta il valore della proprietà dataPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataPratica(JAXBElement<String> value) {
        this.dataPratica = value;
    }

    /**
     * Recupera il valore della proprietà protocollo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocollo() {
        return protocollo;
    }

    /**
     * Imposta il valore della proprietà protocollo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocollo(JAXBElement<String> value) {
        this.protocollo = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà dataDefinizione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataDefinizione() {
        return dataDefinizione;
    }

    /**
     * Imposta il valore della proprietà dataDefinizione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataDefinizione(JAXBElement<String> value) {
        this.dataDefinizione = value;
    }

    /**
     * Recupera il valore della proprietà praticaCollegata.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPraticaCollegata() {
        return praticaCollegata;
    }

    /**
     * Imposta il valore della proprietà praticaCollegata.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPraticaCollegata(JAXBElement<String> value) {
        this.praticaCollegata = value;
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
     * Recupera il valore della proprietà progPrat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgPrat() {
        return progPrat;
    }

    /**
     * Imposta il valore della proprietà progPrat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgPrat(JAXBElement<String> value) {
        this.progPrat = value;
    }

    /**
     * Recupera il valore della proprietà dettaglio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseDettaglioUserRespCRE }{@code >}
     *     
     */
    public JAXBElement<BaseDettaglioUserRespCRE> getDettaglio() {
        return dettaglio;
    }

    /**
     * Imposta il valore della proprietà dettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseDettaglioUserRespCRE }{@code >}
     *     
     */
    public void setDettaglio(JAXBElement<BaseDettaglioUserRespCRE> value) {
        this.dettaglio = value;
    }

}
