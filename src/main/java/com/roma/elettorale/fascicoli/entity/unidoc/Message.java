
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per message complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescrizioneMessaggio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Livello" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message", namespace = "http://tempuri.org/BustaProtocollo.xsd", propOrder = {
    "codice",
    "attore",
    "descrizioneMessaggio",
    "livello"
})
public class Message {

    @XmlElement(name = "Codice", namespace = "http://tempuri.org/BustaProtocollo.xsd", required = true)
    protected String codice;
    @XmlElement(name = "Attore", namespace = "http://tempuri.org/BustaProtocollo.xsd", required = true)
    protected String attore;
    @XmlElement(name = "DescrizioneMessaggio", namespace = "http://tempuri.org/BustaProtocollo.xsd", required = true)
    protected String descrizioneMessaggio;
    @XmlElement(name = "Livello", namespace = "http://tempuri.org/BustaProtocollo.xsd", required = true)
    protected String livello;

    /**
     * Recupera il valore della propriet codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della propriet codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della propriet attore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttore() {
        return attore;
    }

    /**
     * Imposta il valore della propriet attore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttore(String value) {
        this.attore = value;
    }

    /**
     * Recupera il valore della propriet descrizioneMessaggio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneMessaggio() {
        return descrizioneMessaggio;
    }

    /**
     * Imposta il valore della propriet descrizioneMessaggio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneMessaggio(String value) {
        this.descrizioneMessaggio = value;
    }

    /**
     * Recupera il valore della propriet livello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivello() {
        return livello;
    }

    /**
     * Imposta il valore della propriet livello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivello(String value) {
        this.livello = value;
    }

}
