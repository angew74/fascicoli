
package com.roma.elettorale.fascicoli.entity.unidoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfUnidocFolder complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnidocFolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnidocFolder" type="{http://tempuri.org/}UnidocFolder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnidocFolder", propOrder = {
    "unidocFolder"
})
public class ArrayOfUnidocFolder {

    @XmlElement(name = "UnidocFolder", namespace = "http://tempuri.org/", nillable = true)
    protected List<UnidocFolder> unidocFolder;

    /**
     * Gets the value of the unidocFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidocFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidocFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidocFolder }
     * 
     * 
     */
    public List<UnidocFolder> getUnidocFolder() {
        if (unidocFolder == null) {
            unidocFolder = new ArrayList<UnidocFolder>();
        }
        return this.unidocFolder;
    }

    public void setUnidocFolder(List<UnidocFolder> list) {
        if (unidocFolder == null) {
            unidocFolder = new ArrayList<UnidocFolder>();
        }
        unidocFolder = list;
    }

}
