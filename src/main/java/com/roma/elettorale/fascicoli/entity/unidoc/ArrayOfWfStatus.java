
package com.roma.elettorale.fascicoli.entity.unidoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfWfStatus complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWfStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WfStatus" type="{}WfStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWfStatus", namespace = "", propOrder = {
    "wfStatus"
})
public class ArrayOfWfStatus {

    @XmlElement(name = "WfStatus", nillable = true)
    protected List<WfStatus> wfStatus;

    /**
     * Gets the value of the wfStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wfStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWfStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WfStatus }
     * 
     * 
     */
    public List<WfStatus> getWfStatus() {
        if (wfStatus == null) {
            wfStatus = new ArrayList<WfStatus>();
        }
        return this.wfStatus;
    }

}
