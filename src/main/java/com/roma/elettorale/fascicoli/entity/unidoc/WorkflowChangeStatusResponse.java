
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
 *         &lt;element ref="{}WorkflowChangeStatusResult" minOccurs="0"/>
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
    "workflowChangeStatusResult"
})
@XmlRootElement(name = "WorkflowChangeStatusResponse")
public class WorkflowChangeStatusResponse {

    @XmlElement(name = "WorkflowChangeStatusResult")
    protected WorkFlow workflowChangeStatusResult;

    /**
     * Recupera il valore della proprieta workflowChangeStatusResult.
     * 
     * @return
     *     possible object is
     *     {@link WorkFlow }
     *     
     */
    public WorkFlow getWorkflowChangeStatusResult() {
        return workflowChangeStatusResult;
    }

    /**
     * Imposta il valore della proprieta workflowChangeStatusResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkFlow }
     *     
     */
    public void setWorkflowChangeStatusResult(WorkFlow value) {
        this.workflowChangeStatusResult = value;
    }

}
