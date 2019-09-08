
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
 *         &lt;element name="wf_instance_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wfInstanceId"
})
@XmlRootElement(name = "WfDetach")
public class WfDetach {

    @XmlElement(name = "wf_instance_id", namespace = "http://tempuri.org/")
    protected String wfInstanceId;

    /**
     * Recupera il valore della proprietà wfInstanceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWfInstanceId() {
        return wfInstanceId;
    }

    /**
     * Imposta il valore della proprietà wfInstanceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWfInstanceId(String value) {
        this.wfInstanceId = value;
    }

}
