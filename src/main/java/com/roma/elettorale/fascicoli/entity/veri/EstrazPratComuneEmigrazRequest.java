
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EstrazPratComuneEmigrazRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EstrazPratComuneEmigrazRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceComune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Scelta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="da" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="per" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstrazPratComuneEmigrazRequest", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "codiceComune",
    "dataPratica",
    "scelta"
})
public class EstrazPratComuneEmigrazRequest {

    @XmlElement(name = "CodiceComune")
    protected String codiceComune;
    @XmlElement(name = "DataPratica")
    protected String dataPratica;
    @XmlElement(name = "Scelta")
    protected String scelta;
    @XmlAttribute(name = "da")
    protected String da;
    @XmlAttribute(name = "per")
    protected String per;

    /**
     * Recupera il valore della proprietà codiceComune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceComune() {
        return codiceComune;
    }

    /**
     * Imposta il valore della proprietà codiceComune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceComune(String value) {
        this.codiceComune = value;
    }

    /**
     * Recupera il valore della proprietà dataPratica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPratica() {
        return dataPratica;
    }

    /**
     * Imposta il valore della proprietà dataPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPratica(String value) {
        this.dataPratica = value;
    }

    /**
     * Recupera il valore della proprietà scelta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScelta() {
        return scelta;
    }

    /**
     * Imposta il valore della proprietà scelta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScelta(String value) {
        this.scelta = value;
    }

    /**
     * Recupera il valore della proprietà da.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDa() {
        return da;
    }

    /**
     * Imposta il valore della proprietà da.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDa(String value) {
        this.da = value;
    }

    /**
     * Recupera il valore della proprietà per.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPer() {
        return per;
    }

    /**
     * Imposta il valore della proprietà per.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPer(String value) {
        this.per = value;
    }

}
