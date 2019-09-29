
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
 *         &lt;element ref="{}fileToSave" minOccurs="0"/>
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
    "fileToSave"
})
@XmlRootElement(name = "UpdateMerge")
public class UpdateMerge {

    protected FileRequest fileToSave;

    /**
     * Recupera il valore della proprieta fileToSave.
     * 
     * @return
     *     possible object is
     *     {@link FileRequest }
     *     
     */
    public FileRequest getFileToSave() {
        return fileToSave;
    }

    /**
     * Imposta il valore della proprieta fileToSave.
     * 
     * @param value
     *     allowed object is
     *     {@link FileRequest }
     *     
     */
    public void setFileToSave(FileRequest value) {
        this.fileToSave = value;
    }

}
