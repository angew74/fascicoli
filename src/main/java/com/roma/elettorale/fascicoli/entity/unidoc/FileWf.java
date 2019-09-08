
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per FileWf complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FileWf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnidocFileList" type="{}ArrayOfUnidocFiles" minOccurs="0"/>
 *         &lt;element name="WfDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StatusPrevId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StatusIsCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WfGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WfInstanceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefIdDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RefIdWf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RefIdFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileWf", namespace = "", propOrder = {
    "unidocFileList",
    "wfDeleted",
    "statusDate",
    "statusPrevId",
    "statusIsCurrent",
    "statusCode",
    "wfGroupCode",
    "wfInstanceCode",
    "refIdDoc",
    "refIdWf",
    "refIdFile"
})
public class FileWf {

    @XmlElement(name = "UnidocFileList")
    protected ArrayOfUnidocFiles unidocFileList;
    @XmlElement(name = "WfDeleted")
    protected boolean wfDeleted;
    @XmlElement(name = "StatusDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(name = "StatusPrevId")
    protected int statusPrevId;
    @XmlElement(name = "StatusIsCurrent")
    protected boolean statusIsCurrent;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "WfGroupCode")
    protected String wfGroupCode;
    @XmlElement(name = "WfInstanceCode")
    protected String wfInstanceCode;
    @XmlElement(name = "RefIdDoc")
    protected int refIdDoc;
    @XmlElement(name = "RefIdWf")
    protected int refIdWf;
    @XmlElement(name = "RefIdFile")
    protected int refIdFile;

    /**
     * Recupera il valore della proprietà unidocFileList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnidocFiles }
     *     
     */
    public ArrayOfUnidocFiles getUnidocFileList() {
        return unidocFileList;
    }

    /**
     * Imposta il valore della proprietà unidocFileList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnidocFiles }
     *     
     */
    public void setUnidocFileList(ArrayOfUnidocFiles value) {
        this.unidocFileList = value;
    }

    /**
     * Recupera il valore della proprietà wfDeleted.
     * 
     */
    public boolean isWfDeleted() {
        return wfDeleted;
    }

    /**
     * Imposta il valore della proprietà wfDeleted.
     * 
     */
    public void setWfDeleted(boolean value) {
        this.wfDeleted = value;
    }

    /**
     * Recupera il valore della proprietà statusDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Imposta il valore della proprietà statusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Recupera il valore della proprietà statusPrevId.
     * 
     */
    public int getStatusPrevId() {
        return statusPrevId;
    }

    /**
     * Imposta il valore della proprietà statusPrevId.
     * 
     */
    public void setStatusPrevId(int value) {
        this.statusPrevId = value;
    }

    /**
     * Recupera il valore della proprietà statusIsCurrent.
     * 
     */
    public boolean isStatusIsCurrent() {
        return statusIsCurrent;
    }

    /**
     * Imposta il valore della proprietà statusIsCurrent.
     * 
     */
    public void setStatusIsCurrent(boolean value) {
        this.statusIsCurrent = value;
    }

    /**
     * Recupera il valore della proprietà statusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Imposta il valore della proprietà statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Recupera il valore della proprietà wfGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWfGroupCode() {
        return wfGroupCode;
    }

    /**
     * Imposta il valore della proprietà wfGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWfGroupCode(String value) {
        this.wfGroupCode = value;
    }

    /**
     * Recupera il valore della proprietà wfInstanceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWfInstanceCode() {
        return wfInstanceCode;
    }

    /**
     * Imposta il valore della proprietà wfInstanceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWfInstanceCode(String value) {
        this.wfInstanceCode = value;
    }

    /**
     * Recupera il valore della proprietà refIdDoc.
     * 
     */
    public int getRefIdDoc() {
        return refIdDoc;
    }

    /**
     * Imposta il valore della proprietà refIdDoc.
     * 
     */
    public void setRefIdDoc(int value) {
        this.refIdDoc = value;
    }

    /**
     * Recupera il valore della proprietà refIdWf.
     * 
     */
    public int getRefIdWf() {
        return refIdWf;
    }

    /**
     * Imposta il valore della proprietà refIdWf.
     * 
     */
    public void setRefIdWf(int value) {
        this.refIdWf = value;
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

}
