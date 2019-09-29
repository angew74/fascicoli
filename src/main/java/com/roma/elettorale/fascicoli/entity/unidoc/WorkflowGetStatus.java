
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
 *         &lt;element name="wfIstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wfIstanceId"
})
@XmlRootElement(name = "WorkflowGetStatus")
public class WorkflowGetStatus {

    @XmlElement(namespace = "http://tempuri.org/")
    protected String wfIstanceId;

    /**
     * Recupera il valore della proprieta wfIstanceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWfIstanceId() {
        return wfIstanceId;
    }

    /**
     * Imposta il valore della proprieta wfIstanceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWfIstanceId(String value) {
        this.wfIstanceId = value;
    }

}
