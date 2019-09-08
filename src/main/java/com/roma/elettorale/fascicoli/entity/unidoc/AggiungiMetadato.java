
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
 *         &lt;element name="m" type="{http://tempuri.org/}UnidocsMetadata" minOccurs="0"/>
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
    "m"
})
@XmlRootElement(name = "aggiungiMetadato")
public class AggiungiMetadato {

    @XmlElement(namespace = "http://tempuri.org/")
    protected UnidocsMetadata m;

    /**
     * Recupera il valore della proprietà m.
     * 
     * @return
     *     possible object is
     *     {@link UnidocsMetadata }
     *     
     */
    public UnidocsMetadata getM() {
        return m;
    }

    /**
     * Imposta il valore della proprietà m.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidocsMetadata }
     *     
     */
    public void setM(UnidocsMetadata value) {
        this.m = value;
    }

}
