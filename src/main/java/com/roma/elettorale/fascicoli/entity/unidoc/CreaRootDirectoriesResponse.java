
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
 *         &lt;element ref="{}creaRootDirectoriesResult" minOccurs="0"/>
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
    "creaRootDirectoriesResult"
})
@XmlRootElement(name = "creaRootDirectoriesResponse")
public class CreaRootDirectoriesResponse {

    protected FolderResponse creaRootDirectoriesResult;

    /**
     * Recupera il valore della proprietà creaRootDirectoriesResult.
     * 
     * @return
     *     possible object is
     *     {@link FolderResponse }
     *     
     */
    public FolderResponse getCreaRootDirectoriesResult() {
        return creaRootDirectoriesResult;
    }

    /**
     * Imposta il valore della proprietà creaRootDirectoriesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderResponse }
     *     
     */
    public void setCreaRootDirectoriesResult(FolderResponse value) {
        this.creaRootDirectoriesResult = value;
    }

}
