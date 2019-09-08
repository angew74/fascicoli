
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
 *         &lt;element name="getFilesFromIdFolderResult" type="{http://tempuri.org/}ArrayOfFileResponse" minOccurs="0"/>
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
    "getFilesFromIdFolderResult"
})
@XmlRootElement(name = "getFilesFromIdFolderResponse")
public class GetFilesFromIdFolderResponse {

    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfFileResponse getFilesFromIdFolderResult;

    /**
     * Recupera il valore della proprietà getFilesFromIdFolderResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFileResponse }
     *     
     */
    public ArrayOfFileResponse getGetFilesFromIdFolderResult() {
        return getFilesFromIdFolderResult;
    }

    /**
     * Imposta il valore della proprietà getFilesFromIdFolderResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFileResponse }
     *     
     */
    public void setGetFilesFromIdFolderResult(ArrayOfFileResponse value) {
        this.getFilesFromIdFolderResult = value;
    }

}
