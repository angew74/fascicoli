
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
 *         &lt;element name="getFoldersByAreaResult" type="{http://tempuri.org/}ArrayOfFolderResponse" minOccurs="0"/>
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
    "getFoldersByAreaResult"
})
@XmlRootElement(name = "getFoldersByAreaResponse")
public class GetFoldersByAreaResponse {

    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfFolderResponse getFoldersByAreaResult;

    /**
     * Recupera il valore della proprieta getFoldersByAreaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFolderResponse }
     *     
     */
    public ArrayOfFolderResponse getGetFoldersByAreaResult() {
        return getFoldersByAreaResult;
    }

    /**
     * Imposta il valore della proprieta getFoldersByAreaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFolderResponse }
     *     
     */
    public void setGetFoldersByAreaResult(ArrayOfFolderResponse value) {
        this.getFoldersByAreaResult = value;
    }

}
