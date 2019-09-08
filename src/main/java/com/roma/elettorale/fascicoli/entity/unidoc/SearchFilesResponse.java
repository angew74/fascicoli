
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
 *         &lt;element ref="{}searchFilesResult" minOccurs="0"/>
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
    "searchFilesResult"
})
@XmlRootElement(name = "searchFilesResponse")
public class SearchFilesResponse {

    protected FileResponseList searchFilesResult;

    /**
     * Recupera il valore della proprietà searchFilesResult.
     * 
     * @return
     *     possible object is
     *     {@link FileResponseList }
     *     
     */
    public FileResponseList getSearchFilesResult() {
        return searchFilesResult;
    }

    /**
     * Imposta il valore della proprietà searchFilesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FileResponseList }
     *     
     */
    public void setSearchFilesResult(FileResponseList value) {
        this.searchFilesResult = value;
    }

}
