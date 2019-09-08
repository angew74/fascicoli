
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}getPagedFilesFromIdFolderResult" minOccurs="0"/>
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
    "getPagedFilesFromIdFolderResult"
})
@XmlRootElement(name = "getPagedFilesFromIdFolderResponse")
public class GetPagedFilesFromIdFolderResponse {

    protected FileResponseList getPagedFilesFromIdFolderResult;

    /**
     * Recupera il valore della proprietà getPagedFilesFromIdFolderResult.
     * 
     * @return
     *     possible object is
     *     {@link FileResponseList }
     *     
     */
    public FileResponseList getGetPagedFilesFromIdFolderResult() {
        return getPagedFilesFromIdFolderResult;
    }

    /**
     * Imposta il valore della proprietà getPagedFilesFromIdFolderResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FileResponseList }
     *     
     */
    public void setGetPagedFilesFromIdFolderResult(FileResponseList value) {
        this.getPagedFilesFromIdFolderResult = value;
    }

}
