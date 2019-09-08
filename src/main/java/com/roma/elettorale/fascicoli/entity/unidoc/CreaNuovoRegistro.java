
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
 *         &lt;element name="denArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "denArea",
    "codRegistro"
})
@XmlRootElement(name = "creaNuovoRegistro")
public class CreaNuovoRegistro {

    @XmlElement(namespace = "http://tempuri.org/")
    protected String denArea;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String codRegistro;

    /**
     * Recupera il valore della proprietà denArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenArea() {
        return denArea;
    }

    /**
     * Imposta il valore della proprietà denArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenArea(String value) {
        this.denArea = value;
    }

    /**
     * Recupera il valore della proprietà codRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRegistro() {
        return codRegistro;
    }

    /**
     * Imposta il valore della proprietà codRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegistro(String value) {
        this.codRegistro = value;
    }

}
