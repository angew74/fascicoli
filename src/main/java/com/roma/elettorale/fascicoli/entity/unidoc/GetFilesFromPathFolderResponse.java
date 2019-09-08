
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
 *         &lt;element name="getFilesFromPathFolderResult" type="{http://tempuri.org/}ArrayOfFileResponse" minOccurs="0"/>
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
    "getFilesFromPathFolderResult"
})
@XmlRootElement(name = "getFilesFromPathFolderResponse")
public class GetFilesFromPathFolderResponse {

    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfFileResponse getFilesFromPathFolderResult;

    /**
     * Recupera il valore della proprietà getFilesFromPathFolderResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFileResponse }
     *     
     */
    public ArrayOfFileResponse getGetFilesFromPathFolderResult() {
        return getFilesFromPathFolderResult;
    }

    /**
     * Imposta il valore della proprietà getFilesFromPathFolderResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFileResponse }
     *     
     */
    public void setGetFilesFromPathFolderResult(ArrayOfFileResponse value) {
        this.getFilesFromPathFolderResult = value;
    }

}
