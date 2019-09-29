
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Area complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Area">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Root" type="{http://tempuri.org/}UnidocFolder" minOccurs="0"/>
 *         &lt;element name="IdArea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DenominazioneArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlgAttivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", propOrder = {
    "root",
    "idArea",
    "denominazioneArea",
    "flgAttivo",
    "codRegistro"
})
public class Area {

    @XmlElement(name = "Root", namespace = "http://tempuri.org/")
    protected UnidocFolder root;
    @XmlElement(name = "IdArea", namespace = "http://tempuri.org/")
    protected int idArea;
    @XmlElement(name = "DenominazioneArea", namespace = "http://tempuri.org/")
    protected String denominazioneArea;
    @XmlElement(name = "FlgAttivo", namespace = "http://tempuri.org/")
    protected int flgAttivo;
    @XmlElement(name = "CodRegistro", namespace = "http://tempuri.org/")
    protected String codRegistro;

    /**
     * Recupera il valore della proprieta root.
     * 
     * @return
     *     possible object is
     *     {@link UnidocFolder }
     *     
     */
    public UnidocFolder getRoot() {
        return root;
    }

    /**
     * Imposta il valore della proprieta root.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidocFolder }
     *     
     */
    public void setRoot(UnidocFolder value) {
        this.root = value;
    }

    /**
     * Recupera il valore della proprieta idArea.
     * 
     */
    public int getIdArea() {
        return idArea;
    }

    /**
     * Imposta il valore della proprieta idArea.
     * 
     */
    public void setIdArea(int value) {
        this.idArea = value;
    }

    /**
     * Recupera il valore della proprieta denominazioneArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazioneArea() {
        return denominazioneArea;
    }

    /**
     * Imposta il valore della proprieta denominazioneArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazioneArea(String value) {
        this.denominazioneArea = value;
    }

    /**
     * Recupera il valore della proprieta flgAttivo.
     * 
     */
    public int getFlgAttivo() {
        return flgAttivo;
    }

    /**
     * Imposta il valore della proprieta flgAttivo.
     * 
     */
    public void setFlgAttivo(int value) {
        this.flgAttivo = value;
    }

    /**
     * Recupera il valore della proprieta codRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRegistro() {
        return codRegistro;
    }

    /**
     * Imposta il valore della proprieta codRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegistro(String value) {
        this.codRegistro = value;
    }

}
