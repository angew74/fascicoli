
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
 *         &lt;element ref="{}request" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "modificaMetadato")
public class ModificaMetadato {

    protected FileRequest request;

    /**
     * Recupera il valore della proprietà request.
     * 
     * @return
     *     possible object is
     *     {@link FileRequest }
     *     
     */
    public FileRequest getRequest() {
        return request;
    }

    /**
     * Imposta il valore della proprietà request.
     * 
     * @param value
     *     allowed object is
     *     {@link FileRequest }
     *     
     */
    public void setRequest(FileRequest value) {
        this.request = value;
    }

}
