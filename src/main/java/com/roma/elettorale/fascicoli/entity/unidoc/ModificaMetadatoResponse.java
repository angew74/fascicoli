
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
 *         &lt;element ref="{}modificaMetadatoResult" minOccurs="0"/>
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
    "modificaMetadatoResult"
})
@XmlRootElement(name = "modificaMetadatoResponse")
public class ModificaMetadatoResponse {

    protected FileResponse modificaMetadatoResult;

    /**
     * Recupera il valore della proprietà modificaMetadatoResult.
     * 
     * @return
     *     possible object is
     *     {@link FileResponse }
     *     
     */
    public FileResponse getModificaMetadatoResult() {
        return modificaMetadatoResult;
    }

    /**
     * Imposta il valore della proprietà modificaMetadatoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FileResponse }
     *     
     */
    public void setModificaMetadatoResult(FileResponse value) {
        this.modificaMetadatoResult = value;
    }

}
