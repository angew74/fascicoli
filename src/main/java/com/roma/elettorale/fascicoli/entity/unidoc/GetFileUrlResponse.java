
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
 *         &lt;element name="GetFileUrlResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeOriginale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getFileUrlResult",
    "nomeOriginale"
})
@XmlRootElement(name = "GetFileUrlResponse")
public class GetFileUrlResponse {

    @XmlElement(name = "GetFileUrlResult", namespace = "http://tempuri.org/")
    protected String getFileUrlResult;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String nomeOriginale;

    /**
     * Recupera il valore della proprieta getFileUrlResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetFileUrlResult() {
        return getFileUrlResult;
    }

    /**
     * Imposta il valore della proprieta getFileUrlResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetFileUrlResult(String value) {
        this.getFileUrlResult = value;
    }

    /**
     * Recupera il valore della proprieta nomeOriginale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOriginale() {
        return nomeOriginale;
    }

    /**
     * Imposta il valore della proprieta nomeOriginale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOriginale(String value) {
        this.nomeOriginale = value;
    }

}
