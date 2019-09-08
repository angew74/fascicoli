
package com.roma.elettorale.fascicoli.entity.unidoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfAreaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAreaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaResponse" type="{}AreaResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAreaResponse", propOrder = {
    "areaResponse"
})
public class ArrayOfAreaResponse {

    @XmlElement(name = "AreaResponse", namespace = "http://tempuri.org/", nillable = true)
    protected List<AreaResponse> areaResponse;

    /**
     * Gets the value of the areaResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaResponse }
     * 
     * 
     */
    public List<AreaResponse> getAreaResponse() {
        if (areaResponse == null) {
            areaResponse = new ArrayList<AreaResponse>();
        }
        return this.areaResponse;
    }

}
