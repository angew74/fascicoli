
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
 *         &lt;element name="getSubFoldersFromIdFolderResult" type="{http://tempuri.org/}ArrayOfFolderResponse" minOccurs="0"/>
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
    "getSubFoldersFromIdFolderResult"
})
@XmlRootElement(name = "getSubFoldersFromIdFolderResponse")
public class GetSubFoldersFromIdFolderResponse {

    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfFolderResponse getSubFoldersFromIdFolderResult;

    /**
     * Recupera il valore della proprieta getSubFoldersFromIdFolderResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFolderResponse }
     *     
     */
    public ArrayOfFolderResponse getGetSubFoldersFromIdFolderResult() {
        return getSubFoldersFromIdFolderResult;
    }

    /**
     * Imposta il valore della proprieta getSubFoldersFromIdFolderResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFolderResponse }
     *     
     */
    public void setGetSubFoldersFromIdFolderResult(ArrayOfFolderResponse value) {
        this.getSubFoldersFromIdFolderResult = value;
    }

}
