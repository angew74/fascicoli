
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UnidocFolder complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnidocFolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cercami" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefIdRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RefIdPadre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdFolder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NomeFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://tempuri.org/}Area" minOccurs="0"/>
 *         &lt;element name="Deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidocFolder", propOrder = {
    "cercami",
    "path",
    "refIdRegistro",
    "refIdPadre",
    "idFolder",
    "nomeFolder",
    "area",
    "deleted"
})
public class UnidocFolder {

    @XmlElement(name = "Cercami", namespace = "http://tempuri.org/")
    protected String cercami;
    @XmlElement(name = "Path", namespace = "http://tempuri.org/")
    protected String path;
    @XmlElement(name = "RefIdRegistro", namespace = "http://tempuri.org/")
    protected int refIdRegistro;
    @XmlElement(name = "RefIdPadre", namespace = "http://tempuri.org/")
    protected int refIdPadre;
    @XmlElement(name = "IdFolder", namespace = "http://tempuri.org/")
    protected int idFolder;
    @XmlElement(name = "NomeFolder", namespace = "http://tempuri.org/")
    protected String nomeFolder;
    @XmlElement(name = "Area", namespace = "http://tempuri.org/")
    protected Area area;
    @XmlElement(name = "Deleted", namespace = "http://tempuri.org/")
    protected boolean deleted;

    /**
     * Recupera il valore della proprieta cercami.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCercami() {
        return cercami;
    }

    /**
     * Imposta il valore della proprieta cercami.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCercami(String value) {
        this.cercami = value;
    }

    /**
     * Recupera il valore della proprieta path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Imposta il valore della proprieta path.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Recupera il valore della proprieta refIdRegistro.
     * 
     */
    public int getRefIdRegistro() {
        return refIdRegistro;
    }

    /**
     * Imposta il valore della proprieta refIdRegistro.
     * 
     */
    public void setRefIdRegistro(int value) {
        this.refIdRegistro = value;
    }

    /**
     * Recupera il valore della proprieta refIdPadre.
     * 
     */
    public int getRefIdPadre() {
        return refIdPadre;
    }

    /**
     * Imposta il valore della proprieta refIdPadre.
     * 
     */
    public void setRefIdPadre(int value) {
        this.refIdPadre = value;
    }

    /**
     * Recupera il valore della proprieta idFolder.
     * 
     */
    public int getIdFolder() {
        return idFolder;
    }

    /**
     * Imposta il valore della proprieta idFolder.
     * 
     */
    public void setIdFolder(int value) {
        this.idFolder = value;
    }

    /**
     * Recupera il valore della proprieta nomeFolder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFolder() {
        return nomeFolder;
    }

    /**
     * Imposta il valore della proprieta nomeFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFolder(String value) {
        this.nomeFolder = value;
    }

    /**
     * Recupera il valore della proprieta area.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getArea() {
        return area;
    }

    /**
     * Imposta il valore della proprieta area.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setArea(Area value) {
        this.area = value;
    }

    /**
     * Recupera il valore della proprieta deleted.
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Imposta il valore della proprieta deleted.
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
    }

}
