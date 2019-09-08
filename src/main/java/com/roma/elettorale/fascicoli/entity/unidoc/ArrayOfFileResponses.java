
package com.roma.elettorale.fascicoli.entity.unidoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfFileResponses complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFileResponses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileResponse" type="{}FileResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFileResponses", namespace = "", propOrder = {
    "fileResponse"
})
public class ArrayOfFileResponses {

    @XmlElement(name = "FileResponse", nillable = true)
    protected List<FileResponse> fileResponse;

    /**
     * Gets the value of the fileResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileResponse }
     * 
     * 
     */
    public List<FileResponse> getFileResponse() {
        if (fileResponse == null) {
            fileResponse = new ArrayList<FileResponse>();
        }
        return this.fileResponse;
    }

}
