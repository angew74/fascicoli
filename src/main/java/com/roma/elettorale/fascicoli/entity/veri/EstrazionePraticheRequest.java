
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EstrazionePraticheRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EstrazionePraticheRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Scelta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataRicDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataRicA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="UteRic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="FlagTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
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
@XmlType(name = "EstrazionePraticheRequest", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "scelta",
    "dataRicDa",
    "dataRicA",
    "uteRic",
    "flagTipo"
})
public class EstrazionePraticheRequest {

    @XmlElement(name = "Scelta")
    protected String scelta;
    @XmlElement(name = "DataRicDa")
    protected String dataRicDa;
    @XmlElement(name = "DataRicA")
    protected String dataRicA;
    @XmlElement(name = "UteRic")
    protected String uteRic;
    @XmlElement(name = "FlagTipo")
    protected String flagTipo;
    @XmlAttribute(name = "da")
    protected String da;
    @XmlAttribute(name = "per")
    protected String per;

    /**
     * Recupera il valore della proprietÓ scelta.
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
     * Imposta il valore della proprietÓ scelta.
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
     * Recupera il valore della proprietÓ dataRicDa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRicDa() {
        return dataRicDa;
    }

    /**
     * Imposta il valore della proprietÓ dataRicDa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRicDa(String value) {
        this.dataRicDa = value;
    }

    /**
     * Recupera il valore della proprietÓ dataRicA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRicA() {
        return dataRicA;
    }

    /**
     * Imposta il valore della proprietÓ dataRicA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRicA(String value) {
        this.dataRicA = value;
    }

    /**
     * Recupera il valore della proprietÓ uteRic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUteRic() {
        return uteRic;
    }

    /**
     * Imposta il valore della proprietÓ uteRic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUteRic(String value) {
        this.uteRic = value;
    }

    /**
     * Recupera il valore della proprietÓ flagTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagTipo() {
        return flagTipo;
    }

    /**
     * Imposta il valore della proprietÓ flagTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagTipo(String value) {
        this.flagTipo = value;
    }

    /**
     * Recupera il valore della proprietÓ da.
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
     * Imposta il valore della proprietÓ da.
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
     * Recupera il valore della proprietÓ per.
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
     * Imposta il valore della proprietÓ per.
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
