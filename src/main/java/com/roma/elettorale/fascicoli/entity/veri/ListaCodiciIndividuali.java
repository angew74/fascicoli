
package com.roma.elettorale.fascicoli.entity.veri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ListaCodiciIndividuali complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ListaCodiciIndividuali">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="CodiceIndiv" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaCodiciIndividuali", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "codiceIndiv"
})
public class ListaCodiciIndividuali {

    @XmlElement(name = "CodiceIndiv", nillable = true)
    protected List<Object> codiceIndiv;

    /**
     * Gets the value of the codiceIndiv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codiceIndiv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodiceIndiv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getCodiceIndiv() {
        if (codiceIndiv == null) {
            codiceIndiv = new ArrayList<Object>();
        }
        return this.codiceIndiv;
    }

}
