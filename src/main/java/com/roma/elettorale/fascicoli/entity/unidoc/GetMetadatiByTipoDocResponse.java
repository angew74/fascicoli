
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
 *         &lt;element ref="{}GetMetadatiByTipoDocResult" minOccurs="0"/>
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
    "getMetadatiByTipoDocResult"
})
@XmlRootElement(name = "GetMetadatiByTipoDocResponse")
public class GetMetadatiByTipoDocResponse {

    @XmlElement(name = "GetMetadatiByTipoDocResult")
    protected FileResponse getMetadatiByTipoDocResult;

    /**
     * Recupera il valore della proprieta getMetadatiByTipoDocResult.
     * 
     * @return
     *     possible object is
     *     {@link FileResponse }
     *     
     */
    public FileResponse getGetMetadatiByTipoDocResult() {
        return getMetadatiByTipoDocResult;
    }

    /**
     * Imposta il valore della proprieta getMetadatiByTipoDocResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FileResponse }
     *     
     */
    public void setGetMetadatiByTipoDocResult(FileResponse value) {
        this.getMetadatiByTipoDocResult = value;
    }

}
