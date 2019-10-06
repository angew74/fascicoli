//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.01 alle 09:39:08 AM CEST 
//


package com.roma.elettorale.fascicoli.entity.pap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoInterr" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="CodiceIndividuale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiornoNascita" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="MeseNascita" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="annoNascita" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoInterr",
    "codiceIndividuale",
    "codiceFiscale",
    "sesso",
    "cognome",
    "nome",
    "giornoNascita",
    "meseNascita",
    "annoNascita",
    "serviceLevel"
})
@XmlRootElement(name = "VerificaLeggeRutelli")
public class VerificaLeggeRutelli {

    @XmlElement(name = "TipoInterr")
    @XmlSchemaType(name = "unsignedByte")
    protected short tipoInterr;
    @XmlElement(name = "CodiceIndividuale")
    protected String codiceIndividuale;
    @XmlElement(name = "CodiceFiscale")
    protected String codiceFiscale;
    @XmlElement(name = "Sesso")
    protected String sesso;
    @XmlElement(name = "Cognome")
    protected String cognome;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "GiornoNascita")
    @XmlSchemaType(name = "unsignedByte")
    protected short giornoNascita;
    @XmlElement(name = "MeseNascita")
    @XmlSchemaType(name = "unsignedByte")
    protected short meseNascita;
    protected short annoNascita;
    @XmlElement(name = "ServiceLevel")
    @XmlSchemaType(name = "unsignedByte")
    protected short serviceLevel;

    /**
     * Recupera il valore della proprietà tipoInterr.
     * 
     */
    public short getTipoInterr() {
        return tipoInterr;
    }

    /**
     * Imposta il valore della proprietà tipoInterr.
     * 
     */
    public void setTipoInterr(short value) {
        this.tipoInterr = value;
    }

    /**
     * Recupera il valore della proprietà codiceIndividuale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceIndividuale() {
        return codiceIndividuale;
    }

    /**
     * Imposta il valore della proprietà codiceIndividuale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceIndividuale(String value) {
        this.codiceIndividuale = value;
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
     * Recupera il valore della proprietà sesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesso() {
        return sesso;
    }

    /**
     * Imposta il valore della proprietà sesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesso(String value) {
        this.sesso = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà nome.
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
     * Imposta il valore della proprietà nome.
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
     * Recupera il valore della proprietà giornoNascita.
     * 
     */
    public short getGiornoNascita() {
        return giornoNascita;
    }

    /**
     * Imposta il valore della proprietà giornoNascita.
     * 
     */
    public void setGiornoNascita(short value) {
        this.giornoNascita = value;
    }

    /**
     * Recupera il valore della proprietà meseNascita.
     * 
     */
    public short getMeseNascita() {
        return meseNascita;
    }

    /**
     * Imposta il valore della proprietà meseNascita.
     * 
     */
    public void setMeseNascita(short value) {
        this.meseNascita = value;
    }

    /**
     * Recupera il valore della proprietà annoNascita.
     * 
     */
    public short getAnnoNascita() {
        return annoNascita;
    }

    /**
     * Imposta il valore della proprietà annoNascita.
     * 
     */
    public void setAnnoNascita(short value) {
        this.annoNascita = value;
    }

    /**
     * Recupera il valore della proprietà serviceLevel.
     * 
     */
    public short getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Imposta il valore della proprietà serviceLevel.
     * 
     */
    public void setServiceLevel(short value) {
        this.serviceLevel = value;
    }

}
