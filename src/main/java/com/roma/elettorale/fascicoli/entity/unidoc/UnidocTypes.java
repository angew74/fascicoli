
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UnidocTypes complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnidocTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlgVersioned" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FlgAttivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DenDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidocTypes", propOrder = {
    "flgVersioned",
    "flgAttivo",
    "denDoc",
    "idType"
})
public class UnidocTypes {

    @XmlElement(name = "FlgVersioned", namespace = "http://tempuri.org/")
    protected int flgVersioned;
    @XmlElement(name = "FlgAttivo", namespace = "http://tempuri.org/")
    protected int flgAttivo;
    @XmlElement(name = "DenDoc", namespace = "http://tempuri.org/")
    protected String denDoc;
    @XmlElement(name = "IdType", namespace = "http://tempuri.org/")
    protected int idType;

    /**
     * Recupera il valore della proprieta flgVersioned.
     * 
     */
    public int getFlgVersioned() {
        return flgVersioned;
    }

    /**
     * Imposta il valore della proprieta flgVersioned.
     * 
     */
    public void setFlgVersioned(int value) {
        this.flgVersioned = value;
    }

    /**
     * Recupera il valore della proprieta flgAttivo.
     * 
     */
    public int getFlgAttivo() {
        return flgAttivo;
    }

    /**
     * Imposta il valore della proprieta flgAttivo.
     * 
     */
    public void setFlgAttivo(int value) {
        this.flgAttivo = value;
    }

    /**
     * Recupera il valore della proprieta denDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenDoc() {
        return denDoc;
    }

    /**
     * Imposta il valore della proprieta denDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenDoc(String value) {
        this.denDoc = value;
    }

    /**
     * Recupera il valore della proprieta idType.
     * 
     */
    public int getIdType() {
        return idType;
    }

    /**
     * Imposta il valore della proprieta idType.
     * 
     */
    public void setIdType(int value) {
        this.idType = value;
    }

}
