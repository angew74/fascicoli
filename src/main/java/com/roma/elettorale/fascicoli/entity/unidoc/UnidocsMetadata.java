
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UnidocsMetadata complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnidocsMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMetadata" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomeMetadata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labelMetadata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrizioneMetadata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RefIdFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdVersioneDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valueMetadata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeBreve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nullable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardinalita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="versioningIdx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="namingIdx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refIdType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidocsMetadata", propOrder = {
    "idMetadata",
    "nomeMetadata",
    "labelMetadata",
    "descrizioneMetadata",
    "datatype",
    "indice",
    "refIdFile",
    "idVersioneDoc",
    "valueMetadata",
    "nomeBreve",
    "nullable",
    "cardinalita",
    "versioningIdx",
    "namingIdx",
    "refIdType"
})
public class UnidocsMetadata {

    @XmlElement(namespace = "http://tempuri.org/")
    protected int idMetadata;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String nomeMetadata;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String labelMetadata;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String descrizioneMetadata;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String datatype;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int indice;
    @XmlElement(name = "RefIdFile", namespace = "http://tempuri.org/")
    protected int refIdFile;
    @XmlElement(name = "IdVersioneDoc", namespace = "http://tempuri.org/")
    protected int idVersioneDoc;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String valueMetadata;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String nomeBreve;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String nullable;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int cardinalita;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int versioningIdx;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int namingIdx;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int refIdType;

    /**
     * Recupera il valore della proprieta idMetadata.
     * 
     */
    public int getIdMetadata() {
        return idMetadata;
    }

    /**
     * Imposta il valore della proprieta idMetadata.
     * 
     */
    public void setIdMetadata(int value) {
        this.idMetadata = value;
    }

    /**
     * Recupera il valore della proprieta nomeMetadata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMetadata() {
        return nomeMetadata;
    }

    /**
     * Imposta il valore della proprieta nomeMetadata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMetadata(String value) {
        this.nomeMetadata = value;
    }

    /**
     * Recupera il valore della proprieta labelMetadata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelMetadata() {
        return labelMetadata;
    }

    /**
     * Imposta il valore della proprieta labelMetadata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelMetadata(String value) {
        this.labelMetadata = value;
    }

    /**
     * Recupera il valore della proprieta descrizioneMetadata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneMetadata() {
        return descrizioneMetadata;
    }

    /**
     * Imposta il valore della proprieta descrizioneMetadata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneMetadata(String value) {
        this.descrizioneMetadata = value;
    }

    /**
     * Recupera il valore della proprieta datatype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatatype() {
        return datatype;
    }

    /**
     * Imposta il valore della proprieta datatype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatype(String value) {
        this.datatype = value;
    }

    /**
     * Recupera il valore della proprieta indice.
     * 
     */
    public int getIndice() {
        return indice;
    }

    /**
     * Imposta il valore della proprieta indice.
     * 
     */
    public void setIndice(int value) {
        this.indice = value;
    }

    /**
     * Recupera il valore della proprieta refIdFile.
     * 
     */
    public int getRefIdFile() {
        return refIdFile;
    }

    /**
     * Imposta il valore della proprieta refIdFile.
     * 
     */
    public void setRefIdFile(int value) {
        this.refIdFile = value;
    }

    /**
     * Recupera il valore della proprieta idVersioneDoc.
     * 
     */
    public int getIdVersioneDoc() {
        return idVersioneDoc;
    }

    /**
     * Imposta il valore della proprieta idVersioneDoc.
     * 
     */
    public void setIdVersioneDoc(int value) {
        this.idVersioneDoc = value;
    }

    /**
     * Recupera il valore della proprieta valueMetadata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueMetadata() {
        return valueMetadata;
    }

    /**
     * Imposta il valore della proprieta valueMetadata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueMetadata(String value) {
        this.valueMetadata = value;
    }

    /**
     * Recupera il valore della proprieta nomeBreve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBreve() {
        return nomeBreve;
    }

    /**
     * Imposta il valore della proprieta nomeBreve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBreve(String value) {
        this.nomeBreve = value;
    }

    /**
     * Recupera il valore della proprieta nullable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullable() {
        return nullable;
    }

    /**
     * Imposta il valore della proprieta nullable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullable(String value) {
        this.nullable = value;
    }

    /**
     * Recupera il valore della proprieta cardinalita.
     * 
     */
    public int getCardinalita() {
        return cardinalita;
    }

    /**
     * Imposta il valore della proprieta cardinalita.
     * 
     */
    public void setCardinalita(int value) {
        this.cardinalita = value;
    }

    /**
     * Recupera il valore della proprieta versioningIdx.
     * 
     */
    public int getVersioningIdx() {
        return versioningIdx;
    }

    /**
     * Imposta il valore della proprieta versioningIdx.
     * 
     */
    public void setVersioningIdx(int value) {
        this.versioningIdx = value;
    }

    /**
     * Recupera il valore della proprieta namingIdx.
     * 
     */
    public int getNamingIdx() {
        return namingIdx;
    }

    /**
     * Imposta il valore della proprieta namingIdx.
     * 
     */
    public void setNamingIdx(int value) {
        this.namingIdx = value;
    }

    /**
     * Recupera il valore della proprieta refIdType.
     * 
     */
    public int getRefIdType() {
        return refIdType;
    }

    /**
     * Imposta il valore della proprieta refIdType.
     * 
     */
    public void setRefIdType(int value) {
        this.refIdType = value;
    }

}
