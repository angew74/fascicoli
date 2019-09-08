
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UnidocMail complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnidocMail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Testo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Files" type="{}ArrayOfStringss" minOccurs="0"/>
 *         &lt;element name="Mittente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Regola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdUnivoco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidocMail", namespace = "", propOrder = {
    "destinatario",
    "oggetto",
    "testo",
    "files",
    "mittente",
    "utente",
    "appCode",
    "regola",
    "idUnivoco",
    "status"
})
public class UnidocMail {

    @XmlElement(name = "Destinatario")
    protected String destinatario;
    @XmlElement(name = "Oggetto")
    protected String oggetto;
    @XmlElement(name = "Testo")
    protected String testo;
    @XmlElement(name = "Files")
    protected ArrayOfStringss files;
    @XmlElement(name = "Mittente")
    protected String mittente;
    @XmlElement(name = "Utente")
    protected String utente;
    @XmlElement(name = "AppCode")
    protected String appCode;
    @XmlElement(name = "Regola")
    protected String regola;
    @XmlElement(name = "IdUnivoco")
    protected String idUnivoco;
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Recupera il valore della proprietà destinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Imposta il valore della proprietà destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatario(String value) {
        this.destinatario = value;
    }

    /**
     * Recupera il valore della proprietà oggetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Imposta il valore della proprietà oggetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggetto(String value) {
        this.oggetto = value;
    }

    /**
     * Recupera il valore della proprietà testo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTesto() {
        return testo;
    }

    /**
     * Imposta il valore della proprietà testo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTesto(String value) {
        this.testo = value;
    }

    /**
     * Recupera il valore della proprietà files.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringss }
     *     
     */
    public ArrayOfStringss getFiles() {
        return files;
    }

    /**
     * Imposta il valore della proprietà files.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringss }
     *     
     */
    public void setFiles(ArrayOfStringss value) {
        this.files = value;
    }

    /**
     * Recupera il valore della proprietà mittente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMittente() {
        return mittente;
    }

    /**
     * Imposta il valore della proprietà mittente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMittente(String value) {
        this.mittente = value;
    }

    /**
     * Recupera il valore della proprietà utente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtente() {
        return utente;
    }

    /**
     * Imposta il valore della proprietà utente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtente(String value) {
        this.utente = value;
    }

    /**
     * Recupera il valore della proprietà appCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * Imposta il valore della proprietà appCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCode(String value) {
        this.appCode = value;
    }

    /**
     * Recupera il valore della proprietà regola.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegola() {
        return regola;
    }

    /**
     * Imposta il valore della proprietà regola.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegola(String value) {
        this.regola = value;
    }

    /**
     * Recupera il valore della proprietà idUnivoco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUnivoco() {
        return idUnivoco;
    }

    /**
     * Imposta il valore della proprietà idUnivoco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUnivoco(String value) {
        this.idUnivoco = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
