
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UnidocsFirma complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnidocsFirma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Firmatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataFirma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlServizioIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlServizioOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidocsFirma", namespace = "", propOrder = {
    "firmatario",
    "dataFirma",
    "urlServizioIn",
    "urlServizioOut",
    "status",
    "idFile"
})
public class UnidocsFirma {

    @XmlElement(name = "Firmatario")
    protected String firmatario;
    @XmlElement(name = "DataFirma")
    protected String dataFirma;
    @XmlElement(name = "UrlServizioIn")
    protected String urlServizioIn;
    @XmlElement(name = "UrlServizioOut")
    protected String urlServizioOut;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "IdFile")
    protected String idFile;

    /**
     * Recupera il valore della proprieta firmatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmatario() {
        return firmatario;
    }

    /**
     * Imposta il valore della proprieta firmatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmatario(String value) {
        this.firmatario = value;
    }

    /**
     * Recupera il valore della proprieta dataFirma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFirma() {
        return dataFirma;
    }

    /**
     * Imposta il valore della proprieta dataFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFirma(String value) {
        this.dataFirma = value;
    }

    /**
     * Recupera il valore della proprieta urlServizioIn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlServizioIn() {
        return urlServizioIn;
    }

    /**
     * Imposta il valore della proprieta urlServizioIn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlServizioIn(String value) {
        this.urlServizioIn = value;
    }

    /**
     * Recupera il valore della proprieta urlServizioOut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlServizioOut() {
        return urlServizioOut;
    }

    /**
     * Imposta il valore della proprieta urlServizioOut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlServizioOut(String value) {
        this.urlServizioOut = value;
    }

    /**
     * Recupera il valore della proprieta status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprieta status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprieta idFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFile() {
        return idFile;
    }

    /**
     * Imposta il valore della proprieta idFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFile(String value) {
        this.idFile = value;
    }

}
