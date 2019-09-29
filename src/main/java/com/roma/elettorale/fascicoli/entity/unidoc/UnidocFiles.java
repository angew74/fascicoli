
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per UnidocFiles complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnidocFiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListaMetadati" type="{}ArrayOfUnidocsMetadatas" minOccurs="0"/>
 *         &lt;element name="UtenteCancellazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RefIdFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Versione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeOriginale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtenteInserimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataInserimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PgmInserimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FlgStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataDelete" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RefIdType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NomeFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnidocType" type="{}UnidocTypess" minOccurs="0"/>
 *         &lt;element name="UnidocFolder" type="{}UnidocFolders" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidocFiles", namespace = "", propOrder = {
    "verDetails",
    "listaMetadati",
    "utenteCancellazione",
    "idFile",
    "refIdFile",
    "versione",
    "path",
    "nome",
    "ext",
    "hash",
    "nomeOriginale",
    "utenteInserimento",
    "dataInserimento",
    "pgmInserimento",
    "idDoc",
    "flgStatus",
    "dataDelete",
    "refIdType",
    "nomeFolder",
    "unidocType",
    "unidocFolder"
})
public class UnidocFiles {

    @XmlElement(name = "VerDetails")
    protected String verDetails;
    @XmlElement(name = "ListaMetadati")
    protected ArrayOfUnidocsMetadatas listaMetadati;
    @XmlElement(name = "UtenteCancellazione")
    protected String utenteCancellazione;
    @XmlElement(name = "IdFile")
    protected int idFile;
    @XmlElement(name = "RefIdFile")
    protected int refIdFile;
    @XmlElement(name = "Versione")
    protected String versione;
    @XmlElement(name = "Path")
    protected String path;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Ext")
    protected String ext;
    @XmlElement(name = "Hash")
    protected String hash;
    @XmlElement(name = "NomeOriginale")
    protected String nomeOriginale;
    @XmlElement(name = "UtenteInserimento")
    protected String utenteInserimento;
    @XmlElement(name = "DataInserimento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInserimento;
    @XmlElement(name = "PgmInserimento")
    protected String pgmInserimento;
    @XmlElement(name = "IdDoc")
    protected int idDoc;
    @XmlElement(name = "FlgStatus")
    protected String flgStatus;
    @XmlElement(name = "DataDelete", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDelete;
    @XmlElement(name = "RefIdType")
    protected int refIdType;
    @XmlElement(name = "NomeFolder")
    protected String nomeFolder;
    @XmlElement(name = "UnidocType")
    protected UnidocTypess unidocType;
    @XmlElement(name = "UnidocFolder")
    protected UnidocFolders unidocFolder;

    /**
     * Recupera il valore della proprieta verDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerDetails() {
        return verDetails;
    }

    /**
     * Imposta il valore della proprieta verDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerDetails(String value) {
        this.verDetails = value;
    }

    /**
     * Recupera il valore della proprieta listaMetadati.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnidocsMetadatas }
     *     
     */
    public ArrayOfUnidocsMetadatas getListaMetadati() {
        return listaMetadati;
    }

    /**
     * Imposta il valore della proprieta listaMetadati.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnidocsMetadatas }
     *     
     */
    public void setListaMetadati(ArrayOfUnidocsMetadatas value) {
        this.listaMetadati = value;
    }

    /**
     * Recupera il valore della proprieta utenteCancellazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtenteCancellazione() {
        return utenteCancellazione;
    }

    /**
     * Imposta il valore della proprieta utenteCancellazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtenteCancellazione(String value) {
        this.utenteCancellazione = value;
    }

    /**
     * Recupera il valore della proprieta idFile.
     * 
     */
    public int getIdFile() {
        return idFile;
    }

    /**
     * Imposta il valore della proprieta idFile.
     * 
     */
    public void setIdFile(int value) {
        this.idFile = value;
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
     * Recupera il valore della proprieta versione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersione() {
        return versione;
    }

    /**
     * Imposta il valore della proprieta versione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersione(String value) {
        this.versione = value;
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
     * Recupera il valore della proprieta nome.
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
     * Imposta il valore della proprieta nome.
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
     * Recupera il valore della proprieta ext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt() {
        return ext;
    }

    /**
     * Imposta il valore della proprieta ext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt(String value) {
        this.ext = value;
    }

    /**
     * Recupera il valore della proprieta hash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Imposta il valore della proprieta hash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Recupera il valore della proprieta nomeOriginale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOriginale() {
        return nomeOriginale;
    }

    /**
     * Imposta il valore della proprieta nomeOriginale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOriginale(String value) {
        this.nomeOriginale = value;
    }

    /**
     * Recupera il valore della proprieta utenteInserimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtenteInserimento() {
        return utenteInserimento;
    }

    /**
     * Imposta il valore della proprieta utenteInserimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtenteInserimento(String value) {
        this.utenteInserimento = value;
    }

    /**
     * Recupera il valore della proprieta dataInserimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInserimento() {
        return dataInserimento;
    }

    /**
     * Imposta il valore della proprieta dataInserimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInserimento(XMLGregorianCalendar value) {
        this.dataInserimento = value;
    }

    /**
     * Recupera il valore della proprieta pgmInserimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgmInserimento() {
        return pgmInserimento;
    }

    /**
     * Imposta il valore della proprieta pgmInserimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgmInserimento(String value) {
        this.pgmInserimento = value;
    }

    /**
     * Recupera il valore della proprieta idDoc.
     * 
     */
    public int getIdDoc() {
        return idDoc;
    }

    /**
     * Imposta il valore della proprieta idDoc.
     * 
     */
    public void setIdDoc(int value) {
        this.idDoc = value;
    }

    /**
     * Recupera il valore della proprieta flgStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgStatus() {
        return flgStatus;
    }

    /**
     * Imposta il valore della proprieta flgStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgStatus(String value) {
        this.flgStatus = value;
    }

    /**
     * Recupera il valore della proprieta dataDelete.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDelete() {
        return dataDelete;
    }

    /**
     * Imposta il valore della proprieta dataDelete.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDelete(XMLGregorianCalendar value) {
        this.dataDelete = value;
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
     * Recupera il valore della proprieta unidocType.
     * 
     * @return
     *     possible object is
     *     {@link UnidocTypess }
     *     
     */
    public UnidocTypess getUnidocType() {
        return unidocType;
    }

    /**
     * Imposta il valore della proprieta unidocType.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidocTypess }
     *     
     */
    public void setUnidocType(UnidocTypess value) {
        this.unidocType = value;
    }

    /**
     * Recupera il valore della proprieta unidocFolder.
     * 
     * @return
     *     possible object is
     *     {@link UnidocFolders }
     *     
     */
    public UnidocFolders getUnidocFolder() {
        return unidocFolder;
    }

    /**
     * Imposta il valore della proprieta unidocFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidocFolders }
     *     
     */
    public void setUnidocFolder(UnidocFolders value) {
        this.unidocFolder = value;
    }

}
