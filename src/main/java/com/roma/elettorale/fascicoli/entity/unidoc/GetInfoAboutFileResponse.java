
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
 *         &lt;element ref="{}GetInfoAboutFileResult" minOccurs="0"/>
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
    "getInfoAboutFileResult"
})
@XmlRootElement(name = "GetInfoAboutFileResponse")
public class GetInfoAboutFileResponse {

    @XmlElement(name = "GetInfoAboutFileResult")
    protected FileResponse getInfoAboutFileResult;

    /**
     * Recupera il valore della proprieta getInfoAboutFileResult.
     * 
     * @return
     *     possible object is
     *     {@link FileResponse }
     *     
     */
    public FileResponse getGetInfoAboutFileResult() {
        return getInfoAboutFileResult;
    }

    /**
     * Imposta il valore della proprieta getInfoAboutFileResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FileResponse }
     *     
     */
    public void setGetInfoAboutFileResult(FileResponse value) {
        this.getInfoAboutFileResult = value;
    }

}
