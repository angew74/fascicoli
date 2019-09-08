
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseRichiestaPagingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseRichiestaPagingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Paging">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="da" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="per" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRichiestaPagingType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "paging"
})
public class BaseRichiestaPagingType {

    @XmlElement(name = "Paging", required = true)
    protected BaseRichiestaPagingType.Paging paging;

    /**
     * Recupera il valore della proprietà paging.
     * 
     * @return
     *     possible object is
     *     {@link BaseRichiestaPagingType.Paging }
     *     
     */
    public BaseRichiestaPagingType.Paging getPaging() {
        return paging;
    }

    /**
     * Imposta il valore della proprietà paging.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRichiestaPagingType.Paging }
     *     
     */
    public void setPaging(BaseRichiestaPagingType.Paging value) {
        this.paging = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="da" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="per" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Paging {

        @XmlAttribute(name = "da")
        @XmlSchemaType(name = "anySimpleType")
        protected String da;
        @XmlAttribute(name = "per")
        @XmlSchemaType(name = "anySimpleType")
        protected String per;

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

    }

}
