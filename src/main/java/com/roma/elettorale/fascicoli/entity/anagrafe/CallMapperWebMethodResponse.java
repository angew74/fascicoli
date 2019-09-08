
package com.roma.elettorale.fascicoli.entity.anagrafe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallMapperWebMethodResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Dati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TPURCODE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "callMapperWebMethodResult",
    "dati",
    "tpurcode"
})
@XmlRootElement(name = "CallMapperWebMethodResponse")
public class CallMapperWebMethodResponse {

    @XmlElement(name = "CallMapperWebMethodResult")
    protected boolean callMapperWebMethodResult;
    @XmlElement(name = "Dati")
    protected String dati;
    @XmlElement(name = "TPURCODE")
    protected int tpurcode;

    /**
     * Recupera il valore della proprietà callMapperWebMethodResult.
     * 
     */
    public boolean isCallMapperWebMethodResult() {
        return callMapperWebMethodResult;
    }

    /**
     * Imposta il valore della proprietà callMapperWebMethodResult.
     * 
     */
    public void setCallMapperWebMethodResult(boolean value) {
        this.callMapperWebMethodResult = value;
    }

    /**
     * Recupera il valore della proprietà dati.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDati() {
        return dati;
    }

    /**
     * Imposta il valore della proprietà dati.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDati(String value) {
        this.dati = value;
    }

    /**
     * Recupera il valore della proprietà tpurcode.
     * 
     */
    public int getTPURCODE() {
        return tpurcode;
    }

    /**
     * Imposta il valore della proprietà tpurcode.
     * 
     */
    public void setTPURCODE(int value) {
        this.tpurcode = value;
    }

}
