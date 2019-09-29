
package com.roma.elettorale.fascicoli.entity.unidoc;

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
 *         &lt;element name="GetCodiceIndividualeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getCodiceIndividualeResult"
})
@XmlRootElement(name = "GetCodiceIndividualeResponse")
public class GetCodiceIndividualeResponse {

    @XmlElement(name = "GetCodiceIndividualeResult", namespace = "http://tempuri.org/")
    protected String getCodiceIndividualeResult;

    /**
     * Recupera il valore della proprieta getCodiceIndividualeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCodiceIndividualeResult() {
        return getCodiceIndividualeResult;
    }

    /**
     * Imposta il valore della proprieta getCodiceIndividualeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCodiceIndividualeResult(String value) {
        this.getCodiceIndividualeResult = value;
    }

}
