//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.09.24 alle 10:06:42 AM CEST 
//


package com.roma.elettorale.fascicoli.entity.certi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfInfoCertificatoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInfoCertificatoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificato" type="{http://www.comune.roma.it/certificati/data}InfoCertificatoType" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInfoCertificatoType", propOrder = {
    "certificato"
})
public class ArrayOfInfoCertificatoType {

    protected List<InfoCertificatoType> certificato;

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
     * {@link InfoCertificatoType }
     * 
     * 
     */
    public List<InfoCertificatoType> getCertificato() {
        if (certificato == null) {
            certificato = new ArrayList<InfoCertificatoType>();
        }
        return this.certificato;
    }

    public void setCertificato(List<InfoCertificatoType> list)
    {
        certificato = new ArrayList<InfoCertificatoType>();
        if(list != null)
        {
            certificato = list;
        }
    }

}
