
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DocumentiPerAree complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentiPerAree">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refIdDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refIdArea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flgAssociazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="denDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentiPerAree", propOrder = {
    "refIdDoc",
    "refIdArea",
    "flgAssociazione",
    "denDoc"
})
public class DocumentiPerAree {

    @XmlElement(namespace = "http://tempuri.org/")
    protected int refIdDoc;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int refIdArea;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int flgAssociazione;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String denDoc;

    /**
     * Recupera il valore della proprietà refIdDoc.
     * 
     */
    public int getRefIdDoc() {
        return refIdDoc;
    }

    /**
     * Imposta il valore della proprietà refIdDoc.
     * 
     */
    public void setRefIdDoc(int value) {
        this.refIdDoc = value;
    }

    /**
     * Recupera il valore della proprietà refIdArea.
     * 
     */
    public int getRefIdArea() {
        return refIdArea;
    }

    /**
     * Imposta il valore della proprietà refIdArea.
     * 
     */
    public void setRefIdArea(int value) {
        this.refIdArea = value;
    }

    /**
     * Recupera il valore della proprietà flgAssociazione.
     * 
     */
    public int getFlgAssociazione() {
        return flgAssociazione;
    }

    /**
     * Imposta il valore della proprietà flgAssociazione.
     * 
     */
    public void setFlgAssociazione(int value) {
        this.flgAssociazione = value;
    }

    /**
     * Recupera il valore della proprietà denDoc.
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
     * Imposta il valore della proprietà denDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenDoc(String value) {
        this.denDoc = value;
    }

}
