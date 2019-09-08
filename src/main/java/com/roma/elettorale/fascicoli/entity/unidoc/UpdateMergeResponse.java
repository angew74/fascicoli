
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
 *         &lt;element ref="{}UpdateMergeResult" minOccurs="0"/>
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
    "updateMergeResult"
})
@XmlRootElement(name = "UpdateMergeResponse")
public class UpdateMergeResponse {

    @XmlElement(name = "UpdateMergeResult")
    protected FileResponse updateMergeResult;

    /**
     * Recupera il valore della proprietà updateMergeResult.
     * 
     * @return
     *     possible object is
     *     {@link FileResponse }
     *     
     */
    public FileResponse getUpdateMergeResult() {
        return updateMergeResult;
    }

    /**
     * Imposta il valore della proprietà updateMergeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FileResponse }
     *     
     */
    public void setUpdateMergeResult(FileResponse value) {
        this.updateMergeResult = value;
    }

}
