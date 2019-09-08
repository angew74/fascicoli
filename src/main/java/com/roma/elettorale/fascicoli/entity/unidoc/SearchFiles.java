
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folders" type="{http://tempuri.org/}ArrayOfUnidocFolder" minOccurs="0"/>
 *         &lt;element name="types" type="{http://tempuri.org/}ArrayOfUnidocTypes" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://tempuri.org/}ArrayOfArrayOfUnidocsMetadata" minOccurs="0"/>
 *         &lt;element name="operatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://tempuri.org/}ArrayOfStrings" minOccurs="0"/>
 *         &lt;element name="da" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="per" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "folders",
    "types",
    "metadata",
    "operatore",
    "status",
    "da",
    "per"
})
@XmlRootElement(name = "searchFiles")
public class SearchFiles {

    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfUnidocFolder folders;
    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfUnidocTypes types;
    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfArrayOfUnidocsMetadata metadata;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String operatore;
    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfStrings status;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int da;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int per;

    /**
     * Recupera il valore della proprietà folders.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnidocFolder }
     *     
     */
    public ArrayOfUnidocFolder getFolders() {
        return folders;
    }

    /**
     * Imposta il valore della proprietà folders.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnidocFolder }
     *     
     */
    public void setFolders(ArrayOfUnidocFolder value) {
        this.folders = value;
    }

    /**
     * Recupera il valore della proprietà types.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnidocTypes }
     *     
     */
    public ArrayOfUnidocTypes getTypes() {
        return types;
    }

    /**
     * Imposta il valore della proprietà types.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnidocTypes }
     *     
     */
    public void setTypes(ArrayOfUnidocTypes value) {
        this.types = value;
    }

    /**
     * Recupera il valore della proprietà metadata.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfUnidocsMetadata }
     *     
     */
    public ArrayOfArrayOfUnidocsMetadata getMetadata() {
        return metadata;
    }

    /**
     * Imposta il valore della proprietà metadata.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfUnidocsMetadata }
     *     
     */
    public void setMetadata(ArrayOfArrayOfUnidocsMetadata value) {
        this.metadata = value;
    }

    /**
     * Recupera il valore della proprietà operatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatore() {
        return operatore;
    }

    /**
     * Imposta il valore della proprietà operatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatore(String value) {
        this.operatore = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStrings }
     *     
     */
    public ArrayOfStrings getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStrings }
     *     
     */
    public void setStatus(ArrayOfStrings value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà da.
     * 
     */
    public int getDa() {
        return da;
    }

    /**
     * Imposta il valore della proprietà da.
     * 
     */
    public void setDa(int value) {
        this.da = value;
    }

    /**
     * Recupera il valore della proprietà per.
     * 
     */
    public int getPer() {
        return per;
    }

    /**
     * Imposta il valore della proprietà per.
     * 
     */
    public void setPer(int value) {
        this.per = value;
    }

}
