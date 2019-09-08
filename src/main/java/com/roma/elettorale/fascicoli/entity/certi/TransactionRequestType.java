
package com.roma.elettorale.fascicoli.entity.certi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TransactionRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransactionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscaleIntestatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="codiceFiscaleRichiedente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="idTransazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="idPod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionRequestType", propOrder = {
    "codiceFiscaleIntestatario",
    "codiceFiscaleRichiedente",
    "idTransazione",
    "idPod",
    "sistema"
})
public class TransactionRequestType {

    protected String codiceFiscaleIntestatario;
    protected String codiceFiscaleRichiedente;
    protected String idTransazione;
    protected String idPod;
    protected String sistema;

    /**
     * Recupera il valore della proprietà codiceFiscaleIntestatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleIntestatario() {
        return codiceFiscaleIntestatario;
    }

    /**
     * Imposta il valore della proprietà codiceFiscaleIntestatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleIntestatario(String value) {
        this.codiceFiscaleIntestatario = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscaleRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleRichiedente() {
        return codiceFiscaleRichiedente;
    }

    /**
     * Imposta il valore della proprietà codiceFiscaleRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleRichiedente(String value) {
        this.codiceFiscaleRichiedente = value;
    }

    /**
     * Recupera il valore della proprietà idTransazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransazione() {
        return idTransazione;
    }

    /**
     * Imposta il valore della proprietà idTransazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransazione(String value) {
        this.idTransazione = value;
    }

    /**
     * Recupera il valore della proprietà idPod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPod() {
        return idPod;
    }

    /**
     * Imposta il valore della proprietà idPod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPod(String value) {
        this.idPod = value;
    }

    /**
     * Recupera il valore della proprietà sistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Imposta il valore della proprietà sistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistema(String value) {
        this.sistema = value;
    }

}
