
package com.roma.elettorale.fascicoli.entity.unidoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfMetadato complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMetadato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Metadato" type="{}Metadato" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMetadato", namespace = "", propOrder = {
    "metadato"
})
public class ArrayOfMetadato {

    @XmlElement(name = "Metadato", nillable = true)
    protected List<Metadato> metadato;

    /**
     * Gets the value of the metadato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Metadato }
     * 
     * 
     */

    public void setMetadato(List<Metadato> list)
    {
        if (metadato == null) {
            metadato = new ArrayList<Metadato>();
            metadato = list;
        }
    }

    public List<Metadato> getMetadato() {
        if (metadato == null) {
            metadato = new ArrayList<Metadato>();
        }
        return this.metadato;
    }

}
