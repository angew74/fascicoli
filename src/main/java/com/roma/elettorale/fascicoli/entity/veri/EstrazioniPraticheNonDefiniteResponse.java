
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EstrazioniPraticheNonDefiniteResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EstrazioniPraticheNonDefiniteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="NPrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DtPrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DtEv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="NPers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CodCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DesCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="UlUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstrazioniPraticheNonDefiniteResponse", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "aPrt",
    "nPrt",
    "dtPrt",
    "status",
    "dtEv",
    "nPers",
    "codCom",
    "desCom",
    "ulUse"
})
public class EstrazioniPraticheNonDefiniteResponse {

    @XmlElement(name = "APrt")
    protected String aPrt;
    @XmlElement(name = "NPrt")
    protected String nPrt;
    @XmlElement(name = "DtPrt")
    protected String dtPrt;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "DtEv")
    protected String dtEv;
    @XmlElement(name = "NPers")
    protected String nPers;
    @XmlElement(name = "CodCom")
    protected String codCom;
    @XmlElement(name = "DesCom")
    protected String desCom;
    @XmlElement(name = "UlUse")
    protected String ulUse;

    /**
     * Recupera il valore della propriet� aPrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPrt() {
        return aPrt;
    }

    /**
     * Imposta il valore della propriet� aPrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPrt(String value) {
        this.aPrt = value;
    }

    /**
     * Recupera il valore della propriet� nPrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPrt() {
        return nPrt;
    }

    /**
     * Imposta il valore della propriet� nPrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPrt(String value) {
        this.nPrt = value;
    }

    /**
     * Recupera il valore della propriet� dtPrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtPrt() {
        return dtPrt;
    }

    /**
     * Imposta il valore della propriet� dtPrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtPrt(String value) {
        this.dtPrt = value;
    }

    /**
     * Recupera il valore della propriet� status.
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
     * Imposta il valore della propriet� status.
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
     * Recupera il valore della propriet� dtEv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtEv() {
        return dtEv;
    }

    /**
     * Imposta il valore della propriet� dtEv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtEv(String value) {
        this.dtEv = value;
    }

    /**
     * Recupera il valore della propriet� nPers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPers() {
        return nPers;
    }

    /**
     * Imposta il valore della propriet� nPers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPers(String value) {
        this.nPers = value;
    }

    /**
     * Recupera il valore della propriet� codCom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCom() {
        return codCom;
    }

    /**
     * Imposta il valore della propriet� codCom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCom(String value) {
        this.codCom = value;
    }

    /**
     * Recupera il valore della propriet� desCom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesCom() {
        return desCom;
    }

    /**
     * Imposta il valore della propriet� desCom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesCom(String value) {
        this.desCom = value;
    }

    /**
     * Recupera il valore della propriet� ulUse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlUse() {
        return ulUse;
    }

    /**
     * Imposta il valore della propriet� ulUse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlUse(String value) {
        this.ulUse = value;
    }

}
