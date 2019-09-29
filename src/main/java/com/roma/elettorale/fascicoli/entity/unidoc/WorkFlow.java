
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per WorkFlow complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WorkFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Messaggio" type="{}Messaggio" minOccurs="0"/>
 *         &lt;element name="Workflow" type="{}Wf" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkFlow", namespace = "", propOrder = {
    "messaggio",
    "workflow"
})
public class WorkFlow {

    @XmlElement(name = "Messaggio")
    protected Messaggio messaggio;
    @XmlElement(name = "Workflow")
    protected Wf workflow;

    /**
     * Recupera il valore della proprieta messaggio.
     * 
     * @return
     *     possible object is
     *     {@link Messaggio }
     *     
     */
    public Messaggio getMessaggio() {
        return messaggio;
    }

    /**
     * Imposta il valore della proprieta messaggio.
     * 
     * @param value
     *     allowed object is
     *     {@link Messaggio }
     *     
     */
    public void setMessaggio(Messaggio value) {
        this.messaggio = value;
    }

    /**
     * Recupera il valore della proprieta workflow.
     * 
     * @return
     *     possible object is
     *     {@link Wf }
     *     
     */
    public Wf getWorkflow() {
        return workflow;
    }

    /**
     * Imposta il valore della proprieta workflow.
     * 
     * @param value
     *     allowed object is
     *     {@link Wf }
     *     
     */
    public void setWorkflow(Wf value) {
        this.workflow = value;
    }

}
