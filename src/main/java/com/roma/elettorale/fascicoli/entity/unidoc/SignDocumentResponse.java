
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
 *         &lt;element ref="{}signDocumentResult" minOccurs="0"/>
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
    "signDocumentResult"
})
@XmlRootElement(name = "signDocumentResponse")
public class SignDocumentResponse {

    protected FileResponse signDocumentResult;

    /**
     * Recupera il valore della proprietà signDocumentResult.
     * 
     * @return
     *     possible object is
     *     {@link FileResponse }
     *     
     */
    public FileResponse getSignDocumentResult() {
        return signDocumentResult;
    }

    /**
     * Imposta il valore della proprietà signDocumentResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FileResponse }
     *     
     */
    public void setSignDocumentResult(FileResponse value) {
        this.signDocumentResult = value;
    }

}
