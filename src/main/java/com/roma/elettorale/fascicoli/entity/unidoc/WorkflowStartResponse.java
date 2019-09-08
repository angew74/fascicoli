
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
 *         &lt;element ref="{}WorkflowStartResult" minOccurs="0"/>
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
    "workflowStartResult"
})
@XmlRootElement(name = "WorkflowStartResponse")
public class WorkflowStartResponse {

    @XmlElement(name = "WorkflowStartResult")
    protected WorkFlow workflowStartResult;

    /**
     * Recupera il valore della proprietà workflowStartResult.
     * 
     * @return
     *     possible object is
     *     {@link WorkFlow }
     *     
     */
    public WorkFlow getWorkflowStartResult() {
        return workflowStartResult;
    }

    /**
     * Imposta il valore della proprietà workflowStartResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkFlow }
     *     
     */
    public void setWorkflowStartResult(WorkFlow value) {
        this.workflowStartResult = value;
    }

}
