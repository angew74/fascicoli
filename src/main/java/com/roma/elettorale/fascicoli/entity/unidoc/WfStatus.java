
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per WfStatus complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WfStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefIdWf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WfStatus", namespace = "", propOrder = {
    "finalStatus",
    "startStatus",
    "descrizione",
    "nome",
    "codice",
    "refIdWf",
    "idStatus"
})
public class WfStatus {

    @XmlElement(name = "FinalStatus")
    protected String finalStatus;
    @XmlElement(name = "StartStatus")
    protected String startStatus;
    @XmlElement(name = "Descrizione")
    protected String descrizione;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Codice")
    protected String codice;
    @XmlElement(name = "RefIdWf")
    protected int refIdWf;
    @XmlElement(name = "IdStatus")
    protected int idStatus;

    /**
     * Recupera il valore della proprieta finalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalStatus() {
        return finalStatus;
    }

    /**
     * Imposta il valore della proprieta finalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalStatus(String value) {
        this.finalStatus = value;
    }

    /**
     * Recupera il valore della proprieta startStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartStatus() {
        return startStatus;
    }

    /**
     * Imposta il valore della proprieta startStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartStatus(String value) {
        this.startStatus = value;
    }

    /**
     * Recupera il valore della proprieta descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprieta descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprieta nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprieta nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprieta codice.
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
     * Imposta il valore della proprieta codice.
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
     * Recupera il valore della proprieta refIdWf.
     * 
     */
    public int getRefIdWf() {
        return refIdWf;
    }

    /**
     * Imposta il valore della proprieta refIdWf.
     * 
     */
    public void setRefIdWf(int value) {
        this.refIdWf = value;
    }

    /**
     * Recupera il valore della proprieta idStatus.
     * 
     */
    public int getIdStatus() {
        return idStatus;
    }

    /**
     * Imposta il valore della proprieta idStatus.
     * 
     */
    public void setIdStatus(int value) {
        this.idStatus = value;
    }

}
