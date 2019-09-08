
package com.roma.elettorale.fascicoli.entity.certi;

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
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}int" form="unqualified"/>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
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
    "idClient",
    "codiceFiscale",
    "ciu"
})
@XmlRootElement(name = "recuperaDocumento")
public class RecuperaDocumento {

    protected int idClient;
    protected String codiceFiscale;
    @XmlElement(name = "CIU")
    protected String ciu;

    /**
     * Recupera il valore della proprietà idClient.
     * 
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * Imposta il valore della proprietà idClient.
     * 
     */
    public void setIdClient(int value) {
        this.idClient = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprietà codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprietà ciu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIU() {
        return ciu;
    }

    /**
     * Imposta il valore della proprietà ciu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIU(String value) {
        this.ciu = value;
    }

}
