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
 *         &lt;element name="TipoRange" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="CodiceVia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DenominazioneVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDa" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="NumeroA" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="LottoDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LottoA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PalazzinaDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PalazzinaA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KmDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KmA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "tipoRange",
    "codiceVia",
    "denominazioneVia",
    "numeroDa",
    "numeroA",
    "lottoDa",
    "lottoA",
    "palazzinaDa",
    "palazzinaA",
    "kmDa",
    "kmA",
    "serviceLevel"
})
@XmlRootElement(name = "VerificaDomXRangeCivici")
public class VerificaDomXRangeCivici {

    @XmlElement(name = "TipoInterr")
    @XmlSchemaType(name = "unsignedByte")
    protected short tipoInterr;
    @XmlElement(name = "TipoRange")
    @XmlSchemaType(name = "unsignedByte")
    protected short tipoRange;
    @XmlElement(name = "CodiceVia")
    protected int codiceVia;
    @XmlElement(name = "DenominazioneVia")
    protected String denominazioneVia;
    @XmlElement(name = "NumeroDa")
    protected short numeroDa;
    @XmlElement(name = "NumeroA")
    protected short numeroA;
    @XmlElement(name = "LottoDa")
    protected String lottoDa;
    @XmlElement(name = "LottoA")
    protected String lottoA;
    @XmlElement(name = "PalazzinaDa")
    protected String palazzinaDa;
    @XmlElement(name = "PalazzinaA")
    protected String palazzinaA;
    @XmlElement(name = "KmDa")
    protected String kmDa;
    @XmlElement(name = "KmA")
    protected String kmA;
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
     * Recupera il valore della proprietà tipoRange.
     * 
     */
    public short getTipoRange() {
        return tipoRange;
    }

    /**
     * Imposta il valore della proprietà tipoRange.
     * 
     */
    public void setTipoRange(short value) {
        this.tipoRange = value;
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
     * Recupera il valore della proprietà numeroDa.
     * 
     */
    public short getNumeroDa() {
        return numeroDa;
    }

    /**
     * Imposta il valore della proprietà numeroDa.
     * 
     */
    public void setNumeroDa(short value) {
        this.numeroDa = value;
    }

    /**
     * Recupera il valore della proprietà numeroA.
     * 
     */
    public short getNumeroA() {
        return numeroA;
    }

    /**
     * Imposta il valore della proprietà numeroA.
     * 
     */
    public void setNumeroA(short value) {
        this.numeroA = value;
    }

    /**
     * Recupera il valore della proprietà lottoDa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLottoDa() {
        return lottoDa;
    }

    /**
     * Imposta il valore della proprietà lottoDa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLottoDa(String value) {
        this.lottoDa = value;
    }

    /**
     * Recupera il valore della proprietà lottoA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLottoA() {
        return lottoA;
    }

    /**
     * Imposta il valore della proprietà lottoA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLottoA(String value) {
        this.lottoA = value;
    }

    /**
     * Recupera il valore della proprietà palazzinaDa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalazzinaDa() {
        return palazzinaDa;
    }

    /**
     * Imposta il valore della proprietà palazzinaDa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalazzinaDa(String value) {
        this.palazzinaDa = value;
    }

    /**
     * Recupera il valore della proprietà palazzinaA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalazzinaA() {
        return palazzinaA;
    }

    /**
     * Imposta il valore della proprietà palazzinaA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalazzinaA(String value) {
        this.palazzinaA = value;
    }

    /**
     * Recupera il valore della proprietà kmDa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmDa() {
        return kmDa;
    }

    /**
     * Imposta il valore della proprietà kmDa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmDa(String value) {
        this.kmDa = value;
    }

    /**
     * Recupera il valore della proprietà kmA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmA() {
        return kmA;
    }

    /**
     * Imposta il valore della proprietà kmA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmA(String value) {
        this.kmA = value;
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
