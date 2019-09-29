
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
 *         &lt;element name="getDocumentiByAreaResult" type="{http://tempuri.org/}ArrayOfDocumentiPerAree" minOccurs="0"/>
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
    "getDocumentiByAreaResult"
})
@XmlRootElement(name = "getDocumentiByAreaResponse")
public class GetDocumentiByAreaResponse {

    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfDocumentiPerAree getDocumentiByAreaResult;

    /**
     * Recupera il valore della proprieta getDocumentiByAreaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentiPerAree }
     *     
     */
    public ArrayOfDocumentiPerAree getGetDocumentiByAreaResult() {
        return getDocumentiByAreaResult;
    }

    /**
     * Imposta il valore della proprieta getDocumentiByAreaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentiPerAree }
     *     
     */
    public void setGetDocumentiByAreaResult(ArrayOfDocumentiPerAree value) {
        this.getDocumentiByAreaResult = value;
    }

}
