
package com.roma.elettorale.fascicoli.entity.certi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfCertificatoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCertificatoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificato" type="{http://www.comune.roma.it/certificati/data}CertificatoType" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCertificatoType", propOrder = {
    "certificato"
})
public class ArrayOfCertificatoType {

    protected List<CertificatoType> certificato;

    /**
     * Gets the value of the certificato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificatoType }
     * 
     * 
     */
    public List<CertificatoType> getCertificato() {
        if (certificato == null) {
            certificato = new ArrayList<CertificatoType>();
        }
        return this.certificato;
    }

}
