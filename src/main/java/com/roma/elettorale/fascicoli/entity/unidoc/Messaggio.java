
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Messaggio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Messaggio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LivelloMessagio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DettaglioMessagio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Messaggio", namespace = "", propOrder = {
    "esito",
    "attore",
    "livelloMessagio",
    "dettaglioMessagio"
})
public class Messaggio {

    @XmlElement(name = "Esito")
    protected String esito;
    @XmlElement(name = "Attore")
    protected String attore;
    @XmlElement(name = "LivelloMessagio")
    protected String livelloMessagio;
    @XmlElement(name = "DettaglioMessagio")
    protected String dettaglioMessagio;

    /**
     * Recupera il valore della proprieta esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprieta esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprieta attore.
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
     * Imposta il valore della proprieta attore.
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
     * Recupera il valore della proprieta livelloMessagio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivelloMessagio() {
        return livelloMessagio;
    }

    /**
     * Imposta il valore della proprieta livelloMessagio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivelloMessagio(String value) {
        this.livelloMessagio = value;
    }

    /**
     * Recupera il valore della proprieta dettaglioMessagio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDettaglioMessagio() {
        return dettaglioMessagio;
    }

    /**
     * Imposta il valore della proprieta dettaglioMessagio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDettaglioMessagio(String value) {
        this.dettaglioMessagio = value;
    }

}
