
package com.roma.elettorale.fascicoli.entity.unidoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfUnidocsMetadatas complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnidocsMetadatas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnidocsMetadata" type="{}UnidocsMetadatas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnidocsMetadatas", namespace = "", propOrder = {
    "unidocsMetadata"
})
public class ArrayOfUnidocsMetadatas {

    @XmlElement(name = "UnidocsMetadata", nillable = true)
    protected List<UnidocsMetadatas> unidocsMetadata;

    /**
     * Gets the value of the unidocsMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidocsMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidocsMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidocsMetadatas }
     * 
     * 
     */
    public List<UnidocsMetadatas> getUnidocsMetadata() {
        if (unidocsMetadata == null) {
            unidocsMetadata = new ArrayList<UnidocsMetadatas>();
        }
        return this.unidocsMetadata;
    }

}
