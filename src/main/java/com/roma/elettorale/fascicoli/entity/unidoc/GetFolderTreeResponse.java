
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
 *         &lt;element name="GetFolderTreeResult" type="{http://tempuri.org/}ArrayOfSimpleTreeItem" minOccurs="0"/>
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
    "getFolderTreeResult"
})
@XmlRootElement(name = "GetFolderTreeResponse")
public class GetFolderTreeResponse {

    @XmlElement(name = "GetFolderTreeResult", namespace = "http://tempuri.org/")
    protected ArrayOfSimpleTreeItem getFolderTreeResult;

    /**
     * Recupera il valore della proprieta getFolderTreeResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimpleTreeItem }
     *     
     */
    public ArrayOfSimpleTreeItem getGetFolderTreeResult() {
        return getFolderTreeResult;
    }

    /**
     * Imposta il valore della proprieta getFolderTreeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimpleTreeItem }
     *     
     */
    public void setGetFolderTreeResult(ArrayOfSimpleTreeItem value) {
        this.getFolderTreeResult = value;
    }

}
