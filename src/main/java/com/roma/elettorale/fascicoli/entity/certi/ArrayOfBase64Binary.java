
package com.roma.elettorale.fascicoli.entity.certi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfBase64Binary complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBase64Binary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base64Binary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBase64Binary", propOrder = {
    "base64Binary"
})
public class ArrayOfBase64Binary {

    @XmlElement(namespace = "http://www.comune.roma.it/certificati/data", nillable = true)
    protected List<byte[]> base64Binary;

    /**
     * Gets the value of the base64Binary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the base64Binary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBase64Binary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getBase64Binary() {
        if (base64Binary == null) {
            base64Binary = new ArrayList<byte[]>();
        }
        return this.base64Binary;
    }

}
