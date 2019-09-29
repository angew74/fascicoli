
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
 *         &lt;element ref="{}CreaNuovaCartellaResult" minOccurs="0"/>
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
    "creaNuovaCartellaResult"
})
@XmlRootElement(name = "CreaNuovaCartellaResponse")
public class CreaNuovaCartellaResponse {

    @XmlElement(name = "CreaNuovaCartellaResult")
    protected FolderResponse creaNuovaCartellaResult;

    /**
     * Recupera il valore della proprieta creaNuovaCartellaResult.
     * 
     * @return
     *     possible object is
     *     {@link FolderResponse }
     *     
     */
    public FolderResponse getCreaNuovaCartellaResult() {
        return creaNuovaCartellaResult;
    }

    /**
     * Imposta il valore della proprieta creaNuovaCartellaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderResponse }
     *     
     */
    public void setCreaNuovaCartellaResult(FolderResponse value) {
        this.creaNuovaCartellaResult = value;
    }

}
