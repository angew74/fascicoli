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
 *         &lt;element name="Sesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnnoIniziale" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="AnnoFinale" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Patern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Matern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Domicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComuneNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sesso",
    "cognome",
    "nome",
    "annoIniziale",
    "annoFinale",
    "patern",
    "matern",
    "domicilio",
    "comuneNascita",
    "serviceLevel"
})
@XmlRootElement(name = "VerificaAnagraficaEstesa")
public class VerificaAnagraficaEstesa {

    @XmlElement(name = "Sesso")
    protected String sesso;
    @XmlElement(name = "Cognome")
    protected String cognome;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "AnnoIniziale")
    protected short annoIniziale;
    @XmlElement(name = "AnnoFinale")
    protected short annoFinale;
    @XmlElement(name = "Patern")
    protected String patern;
    @XmlElement(name = "Matern")
    protected String matern;
    @XmlElement(name = "Domicilio")
    protected String domicilio;
    @XmlElement(name = "ComuneNascita")
    protected String comuneNascita;
    @XmlElement(name = "ServiceLevel")
    @XmlSchemaType(name = "unsignedByte")
    protected short serviceLevel;

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
     * Recupera il valore della proprietà annoIniziale.
     * 
     */
    public short getAnnoIniziale() {
        return annoIniziale;
    }

    /**
     * Imposta il valore della proprietà annoIniziale.
     * 
     */
    public void setAnnoIniziale(short value) {
        this.annoIniziale = value;
    }

    /**
     * Recupera il valore della proprietà annoFinale.
     * 
     */
    public short getAnnoFinale() {
        return annoFinale;
    }

    /**
     * Imposta il valore della proprietà annoFinale.
     * 
     */
    public void setAnnoFinale(short value) {
        this.annoFinale = value;
    }

    /**
     * Recupera il valore della proprietà patern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatern() {
        return patern;
    }

    /**
     * Imposta il valore della proprietà patern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatern(String value) {
        this.patern = value;
    }

    /**
     * Recupera il valore della proprietà matern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatern() {
        return matern;
    }

    /**
     * Imposta il valore della proprietà matern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatern(String value) {
        this.matern = value;
    }

    /**
     * Recupera il valore della proprietà domicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Imposta il valore della proprietà domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilio(String value) {
        this.domicilio = value;
    }

    /**
     * Recupera il valore della proprietà comuneNascita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuneNascita() {
        return comuneNascita;
    }

    /**
     * Imposta il valore della proprietà comuneNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuneNascita(String value) {
        this.comuneNascita = value;
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
