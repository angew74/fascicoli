
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FileRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FileRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Info" type="{}FileMetatag" minOccurs="0"/>
 *         &lt;element name="RefIdFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileRequest", namespace = "", propOrder = {
    "idTipoDocumento",
    "idFile",
    "file",
    "info",
    "refIdFile",
    "idDoc"
})
public class FileRequest {

    @XmlElement(name = "IdTipoDocumento")
    protected int idTipoDocumento;
    @XmlElement(name = "IdFile")
    protected int idFile;
    @XmlElement(name = "File")
    protected byte[] file;
    @XmlElement(name = "Info")
    protected FileMetatag info;
    @XmlElement(name = "RefIdFile")
    protected int refIdFile;
    @XmlElement(name = "IdDoc")
    protected int idDoc;

    /**
     * Recupera il valore della proprietà idTipoDocumento.
     * 
     */
    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Imposta il valore della proprietà idTipoDocumento.
     * 
     */
    public void setIdTipoDocumento(int value) {
        this.idTipoDocumento = value;
    }

    /**
     * Recupera il valore della proprietà idFile.
     * 
     */
    public int getIdFile() {
        return idFile;
    }

    /**
     * Imposta il valore della proprietà idFile.
     * 
     */
    public void setIdFile(int value) {
        this.idFile = value;
    }

    /**
     * Recupera il valore della proprietà file.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFile() {
        return file;
    }

    /**
     * Imposta il valore della proprietà file.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFile(byte[] value) {
        this.file = value;
    }

    /**
     * Recupera il valore della proprietà info.
     * 
     * @return
     *     possible object is
     *     {@link FileMetatag }
     *     
     */
    public FileMetatag getInfo() {
        return info;
    }

    /**
     * Imposta il valore della proprietà info.
     * 
     * @param value
     *     allowed object is
     *     {@link FileMetatag }
     *     
     */
    public void setInfo(FileMetatag value) {
        this.info = value;
    }

    /**
     * Recupera il valore della proprietà refIdFile.
     * 
     */
    public int getRefIdFile() {
        return refIdFile;
    }

    /**
     * Imposta il valore della proprietà refIdFile.
     * 
     */
    public void setRefIdFile(int value) {
        this.refIdFile = value;
    }

    /**
     * Recupera il valore della proprietà idDoc.
     * 
     */
    public int getIdDoc() {
        return idDoc;
    }

    /**
     * Imposta il valore della proprietà idDoc.
     * 
     */
    public void setIdDoc(int value) {
        this.idDoc = value;
    }

}
