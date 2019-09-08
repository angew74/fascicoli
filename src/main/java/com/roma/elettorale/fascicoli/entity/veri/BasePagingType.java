
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BasePagingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasePagingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="da" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="per" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="element" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePagingType", namespace = "http://tempuri.org/TipiBase.xsd")
public class BasePagingType {

    @XmlAttribute(name = "da")
    protected String da;
    @XmlAttribute(name = "per")
    protected String per;
    @XmlAttribute(name = "element")
    protected String element;

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
     * Recupera il valore della proprietà per.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPer() {
        return per;
    }

    /**
     * Imposta il valore della proprietà per.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPer(String value) {
        this.per = value;
    }

    /**
     * Recupera il valore della proprietà element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElement() {
        return element;
    }

    /**
     * Imposta il valore della proprietà element.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElement(String value) {
        this.element = value;
    }

}
