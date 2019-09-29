
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
 *         &lt;element name="getRegistriByFiltroCodiceResult" type="{http://tempuri.org/}ArrayOfAreaResponse" minOccurs="0"/>
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
    "getRegistriByFiltroCodiceResult"
})
@XmlRootElement(name = "getRegistriByFiltroCodiceResponse")
public class GetRegistriByFiltroCodiceResponse {

    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfAreaResponse getRegistriByFiltroCodiceResult;

    /**
     * Recupera il valore della proprieta getRegistriByFiltroCodiceResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAreaResponse }
     *     
     */
    public ArrayOfAreaResponse getGetRegistriByFiltroCodiceResult() {
        return getRegistriByFiltroCodiceResult;
    }

    /**
     * Imposta il valore della proprieta getRegistriByFiltroCodiceResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAreaResponse }
     *     
     */
    public void setGetRegistriByFiltroCodiceResult(ArrayOfAreaResponse value) {
        this.getRegistriByFiltroCodiceResult = value;
    }

}
