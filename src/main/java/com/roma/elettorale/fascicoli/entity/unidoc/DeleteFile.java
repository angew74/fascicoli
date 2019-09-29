
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
 *         &lt;element ref="{}request" minOccurs="0"/>
 *         &lt;element name="lastVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "request",
    "lastVersion"
})
@XmlRootElement(name = "deleteFile")
public class DeleteFile {

    protected FileRequest request;
    @XmlElement(namespace = "http://tempuri.org/")
    protected boolean lastVersion;

    /**
     * Recupera il valore della proprieta request.
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
     * Imposta il valore della proprieta request.
     * 
     * @param value
     *     allowed object is
     *     {@link FileRequest }
     *     
     */
    public void setRequest(FileRequest value) {
        this.request = value;
    }

    /**
     * Recupera il valore della proprieta lastVersion.
     * 
     */
    public boolean isLastVersion() {
        return lastVersion;
    }

    /**
     * Imposta il valore della proprieta lastVersion.
     * 
     */
    public void setLastVersion(boolean value) {
        this.lastVersion = value;
    }

}
