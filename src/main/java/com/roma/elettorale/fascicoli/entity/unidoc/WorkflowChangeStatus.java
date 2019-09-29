
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
 *         &lt;element name="wfInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refIdFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "wfInstanceID",
    "currentStatus",
    "newStatus",
    "refIdFile"
})
@XmlRootElement(name = "WorkflowChangeStatus")
public class WorkflowChangeStatus {

    @XmlElement(namespace = "http://tempuri.org/")
    protected String wfInstanceID;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String currentStatus;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String newStatus;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int refIdFile;

    /**
     * Recupera il valore della proprieta wfInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWfInstanceID() {
        return wfInstanceID;
    }

    /**
     * Imposta il valore della proprieta wfInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWfInstanceID(String value) {
        this.wfInstanceID = value;
    }

    /**
     * Recupera il valore della proprieta currentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Imposta il valore della proprieta currentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

    /**
     * Recupera il valore della proprieta newStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStatus() {
        return newStatus;
    }

    /**
     * Imposta il valore della proprieta newStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStatus(String value) {
        this.newStatus = value;
    }

    /**
     * Recupera il valore della proprieta refIdFile.
     * 
     */
    public int getRefIdFile() {
        return refIdFile;
    }

    /**
     * Imposta il valore della proprieta refIdFile.
     * 
     */
    public void setRefIdFile(int value) {
        this.refIdFile = value;
    }

}
