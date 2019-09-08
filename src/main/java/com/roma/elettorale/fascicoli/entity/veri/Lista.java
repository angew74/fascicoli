
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Lista complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Lista">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="da" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="a" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="totale" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lista", namespace = "http://tempuri.org/TipiBase.xsd")
public class Lista {

    @XmlAttribute(name = "da")
    @XmlSchemaType(name = "anySimpleType")
    protected String da;
    @XmlAttribute(name = "a")
    @XmlSchemaType(name = "anySimpleType")
    protected String a;
    @XmlAttribute(name = "totale")
    @XmlSchemaType(name = "anySimpleType")
    protected String totale;

    /**
     * Recupera il valore della proprietà da.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDa() {
        return da;
    }

    /**
     * Imposta il valore della proprietà da.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDa(String value) {
        this.da = value;
    }

    /**
     * Recupera il valore della proprietà a.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA() {
        return a;
    }

    /**
     * Imposta il valore della proprietà a.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA(String value) {
        this.a = value;
    }

    /**
     * Recupera il valore della proprietà totale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotale() {
        return totale;
    }

    /**
     * Imposta il valore della proprietà totale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotale(String value) {
        this.totale = value;
    }

}
