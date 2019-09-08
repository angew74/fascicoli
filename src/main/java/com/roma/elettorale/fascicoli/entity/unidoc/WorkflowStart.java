
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
 *         &lt;element name="idFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idFile",
    "workflowCode",
    "customId",
    "startStatus"
})
@XmlRootElement(name = "WorkflowStart")
public class WorkflowStart {

    @XmlElement(namespace = "http://tempuri.org/")
    protected String idFile;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String workflowCode;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String customId;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String startStatus;

    /**
     * Recupera il valore della proprietà idFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFile() {
        return idFile;
    }

    /**
     * Imposta il valore della proprietà idFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFile(String value) {
        this.idFile = value;
    }

    /**
     * Recupera il valore della proprietà workflowCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowCode() {
        return workflowCode;
    }

    /**
     * Imposta il valore della proprietà workflowCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowCode(String value) {
        this.workflowCode = value;
    }

    /**
     * Recupera il valore della proprietà customId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * Imposta il valore della proprietà customId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomId(String value) {
        this.customId = value;
    }

    /**
     * Recupera il valore della proprietà startStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartStatus() {
        return startStatus;
    }

    /**
     * Imposta il valore della proprietà startStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartStatus(String value) {
        this.startStatus = value;
    }

}
