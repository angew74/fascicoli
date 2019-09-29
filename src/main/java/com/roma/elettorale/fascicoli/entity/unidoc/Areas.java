
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Areas complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Areas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Root" type="{}UnidocFolders" minOccurs="0"/>
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
@XmlType(name = "Areas", namespace = "", propOrder = {
    "root",
    "idArea",
    "denominazioneArea",
    "flgAttivo",
    "codRegistro"
})
public class Areas {

    @XmlElement(name = "Root")
    protected UnidocFolders root;
    @XmlElement(name = "IdArea")
    protected int idArea;
    @XmlElement(name = "DenominazioneArea")
    protected String denominazioneArea;
    @XmlElement(name = "FlgAttivo")
    protected int flgAttivo;
    @XmlElement(name = "CodRegistro")
    protected String codRegistro;

    /**
     * Recupera il valore della proprieta root.
     * 
     * @return
     *     possible object is
     *     {@link UnidocFolders }
     *     
     */
    public UnidocFolders getRoot() {
        return root;
    }

    /**
     * Imposta il valore della proprieta root.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidocFolders }
     *     
     */
    public void setRoot(UnidocFolders value) {
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
