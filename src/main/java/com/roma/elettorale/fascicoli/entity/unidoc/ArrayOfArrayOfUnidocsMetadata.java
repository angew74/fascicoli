
package com.roma.elettorale.fascicoli.entity.unidoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfArrayOfUnidocsMetadata complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfUnidocsMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfUnidocsMetadata" type="{http://tempuri.org/}ArrayOfUnidocsMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfUnidocsMetadata", propOrder = {
    "arrayOfUnidocsMetadata"
})
public class ArrayOfArrayOfUnidocsMetadata {

    @XmlElement(name = "ArrayOfUnidocsMetadata", namespace = "http://tempuri.org/", nillable = true)
    protected List<ArrayOfUnidocsMetadata> arrayOfUnidocsMetadata;

    /**
     * Gets the value of the arrayOfUnidocsMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfUnidocsMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfUnidocsMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfUnidocsMetadata }
     * 
     * 
     */
    public List<ArrayOfUnidocsMetadata> getArrayOfUnidocsMetadata() {
        if (arrayOfUnidocsMetadata == null) {
            arrayOfUnidocsMetadata = new ArrayList<ArrayOfUnidocsMetadata>();
        }
        return this.arrayOfUnidocsMetadata;
    }

    public void setArrayOfUnidocsMetadata(List<ArrayOfUnidocsMetadata> list) {
        if (arrayOfUnidocsMetadata == null) {
            arrayOfUnidocsMetadata = new ArrayList<ArrayOfUnidocsMetadata>();
        }
        this.arrayOfUnidocsMetadata = list;
    }

}
