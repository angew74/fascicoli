
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Metadato complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Metadato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeMetadato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdMetadato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ValoreMetadato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeMetadato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LabelMetadato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Metadato", namespace = "", propOrder = {
    "nomeMetadato",
    "idMetadato",
    "valoreMetadato",
    "typeMetadato",
    "labelMetadato"
})
public class Metadato {

    @XmlElement(name = "NomeMetadato")
    protected String nomeMetadato;
    @XmlElement(name = "IdMetadato")
    protected int idMetadato;
    @XmlElement(name = "ValoreMetadato")
    protected String valoreMetadato;
    @XmlElement(name = "TypeMetadato")
    protected String typeMetadato;
    @XmlElement(name = "LabelMetadato")
    protected String labelMetadato;

    /**
     * Recupera il valore della proprietà nomeMetadato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMetadato() {
        return nomeMetadato;
    }

    /**
     * Imposta il valore della proprietà nomeMetadato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMetadato(String value) {
        this.nomeMetadato = value;
    }

    /**
     * Recupera il valore della proprietà idMetadato.
     * 
     */
    public int getIdMetadato() {
        return idMetadato;
    }

    /**
     * Imposta il valore della proprietà idMetadato.
     * 
     */
    public void setIdMetadato(int value) {
        this.idMetadato = value;
    }

    /**
     * Recupera il valore della proprietà valoreMetadato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoreMetadato() {
        return valoreMetadato;
    }

    /**
     * Imposta il valore della proprietà valoreMetadato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoreMetadato(String value) {
        this.valoreMetadato = value;
    }

    /**
     * Recupera il valore della proprietà typeMetadato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeMetadato() {
        return typeMetadato;
    }

    /**
     * Imposta il valore della proprietà typeMetadato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeMetadato(String value) {
        this.typeMetadato = value;
    }

    /**
     * Recupera il valore della proprietà labelMetadato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelMetadato() {
        return labelMetadato;
    }

    /**
     * Imposta il valore della proprietà labelMetadato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelMetadato(String value) {
        this.labelMetadato = value;
    }

}
