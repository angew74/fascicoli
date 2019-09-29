
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
 *         &lt;element ref="{}getPagedFilesFromIdFolderStatusResult" minOccurs="0"/>
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
    "getPagedFilesFromIdFolderStatusResult"
})
@XmlRootElement(name = "getPagedFilesFromIdFolderStatusResponse")
public class GetPagedFilesFromIdFolderStatusResponse {

    protected FileResponseList getPagedFilesFromIdFolderStatusResult;

    /**
     * Recupera il valore della proprieta getPagedFilesFromIdFolderStatusResult.
     * 
     * @return
     *     possible object is
     *     {@link FileResponseList }
     *     
     */
    public FileResponseList getGetPagedFilesFromIdFolderStatusResult() {
        return getPagedFilesFromIdFolderStatusResult;
    }

    /**
     * Imposta il valore della proprieta getPagedFilesFromIdFolderStatusResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FileResponseList }
     *     
     */
    public void setGetPagedFilesFromIdFolderStatusResult(FileResponseList value) {
        this.getPagedFilesFromIdFolderStatusResult = value;
    }

}
