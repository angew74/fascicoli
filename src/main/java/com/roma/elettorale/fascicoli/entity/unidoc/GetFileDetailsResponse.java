
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
 *         &lt;element ref="{}GetFileDetailsResult" minOccurs="0"/>
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
    "getFileDetailsResult"
})
@XmlRootElement(name = "GetFileDetailsResponse")
public class GetFileDetailsResponse {

    @XmlElement(name = "GetFileDetailsResult")
    protected FileResponse getFileDetailsResult;

    /**
     * Recupera il valore della proprietà getFileDetailsResult.
     * 
     * @return
     *     possible object is
     *     {@link FileResponse }
     *     
     */
    public FileResponse getGetFileDetailsResult() {
        return getFileDetailsResult;
    }

    /**
     * Imposta il valore della proprietà getFileDetailsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FileResponse }
     *     
     */
    public void setGetFileDetailsResult(FileResponse value) {
        this.getFileDetailsResult = value;
    }

}
