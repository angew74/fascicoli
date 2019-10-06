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
 *         &lt;element name="CodiceVia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DenominazioneVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Lettera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Lotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Palazzina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Km" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Scala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Piano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Interno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "codiceVia",
    "denominazioneVia",
    "numero",
    "lettera",
    "lotto",
    "palazzina",
    "km",
    "scala",
    "piano",
    "interno",
    "serviceLevel"
})
@XmlRootElement(name = "VerificaDomiciliatiperIndirizzo")
public class VerificaDomiciliatiperIndirizzo {

    @XmlElement(name = "TipoInterr")
    @XmlSchemaType(name = "unsignedByte")
    protected short tipoInterr;
    @XmlElement(name = "CodiceVia")
    protected int codiceVia;
    @XmlElement(name = "DenominazioneVia")
    protected String denominazioneVia;
    @XmlElement(name = "Numero")
    protected short numero;
    @XmlElement(name = "Lettera")
    protected String lettera;
    @XmlElement(name = "Lotto")
    protected String lotto;
    @XmlElement(name = "Palazzina")
    protected String palazzina;
    @XmlElement(name = "Km")
    protected String km;
    @XmlElement(name = "Scala")
    protected String scala;
    @XmlElement(name = "Piano")
    protected String piano;
    @XmlElement(name = "Interno")
    protected String interno;
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
     * Recupera il valore della proprietà codiceVia.
     * 
     */
    public int getCodiceVia() {
        return codiceVia;
    }

    /**
     * Imposta il valore della proprietà codiceVia.
     * 
     */
    public void setCodiceVia(int value) {
        this.codiceVia = value;
    }

    /**
     * Recupera il valore della proprietà denominazioneVia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazioneVia() {
        return denominazioneVia;
    }

    /**
     * Imposta il valore della proprietà denominazioneVia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazioneVia(String value) {
        this.denominazioneVia = value;
    }

    /**
     * Recupera il valore della proprietà numero.
     * 
     */
    public short getNumero() {
        return numero;
    }

    /**
     * Imposta il valore della proprietà numero.
     * 
     */
    public void setNumero(short value) {
        this.numero = value;
    }

    /**
     * Recupera il valore della proprietà lettera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettera() {
        return lettera;
    }

    /**
     * Imposta il valore della proprietà lettera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettera(String value) {
        this.lettera = value;
    }

    /**
     * Recupera il valore della proprietà lotto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotto() {
        return lotto;
    }

    /**
     * Imposta il valore della proprietà lotto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotto(String value) {
        this.lotto = value;
    }

    /**
     * Recupera il valore della proprietà palazzina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalazzina() {
        return palazzina;
    }

    /**
     * Imposta il valore della proprietà palazzina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalazzina(String value) {
        this.palazzina = value;
    }

    /**
     * Recupera il valore della proprietà km.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKm() {
        return km;
    }

    /**
     * Imposta il valore della proprietà km.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKm(String value) {
        this.km = value;
    }

    /**
     * Recupera il valore della proprietà scala.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScala() {
        return scala;
    }

    /**
     * Imposta il valore della proprietà scala.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScala(String value) {
        this.scala = value;
    }

    /**
     * Recupera il valore della proprietà piano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiano() {
        return piano;
    }

    /**
     * Imposta il valore della proprietà piano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiano(String value) {
        this.piano = value;
    }

    /**
     * Recupera il valore della proprietà interno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterno() {
        return interno;
    }

    /**
     * Imposta il valore della proprietà interno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterno(String value) {
        this.interno = value;
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
