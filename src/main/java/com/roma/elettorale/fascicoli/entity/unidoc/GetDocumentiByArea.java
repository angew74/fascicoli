
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_area" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idArea"
})
@XmlRootElement(name = "getDocumentiByArea")
public class GetDocumentiByArea {

    @XmlElement(name = "id_area", namespace = "http://tempuri.org/")
    protected int idArea;

    /**
     * Recupera il valore della proprietà idArea.
     * 
     */
    public int getIdArea() {
        return idArea;
    }

    /**
     * Imposta il valore della proprietà idArea.
     * 
     */
    public void setIdArea(int value) {
        this.idArea = value;
    }

}
