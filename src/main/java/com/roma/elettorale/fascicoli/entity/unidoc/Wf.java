
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Wf complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Wf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WfStatusList" type="{}ArrayOfWfStatus" minOccurs="0"/>
 *         &lt;element name="FileWfList" type="{}ArrayOfFileWf" minOccurs="0"/>
 *         &lt;element name="DescrizioneWf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeWf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeWf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdWf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wf", namespace = "", propOrder = {
    "wfStatusList",
    "fileWfList",
    "descrizioneWf",
    "nomeWf",
    "codeWf",
    "idWf"
})
public class Wf {

    @XmlElement(name = "WfStatusList")
    protected ArrayOfWfStatus wfStatusList;
    @XmlElement(name = "FileWfList")
    protected ArrayOfFileWf fileWfList;
    @XmlElement(name = "DescrizioneWf")
    protected String descrizioneWf;
    @XmlElement(name = "NomeWf")
    protected String nomeWf;
    @XmlElement(name = "CodeWf")
    protected String codeWf;
    @XmlElement(name = "IdWf")
    protected int idWf;

    /**
     * Recupera il valore della proprieta wfStatusList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWfStatus }
     *     
     */
    public ArrayOfWfStatus getWfStatusList() {
        return wfStatusList;
    }

    /**
     * Imposta il valore della proprieta wfStatusList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWfStatus }
     *     
     */
    public void setWfStatusList(ArrayOfWfStatus value) {
        this.wfStatusList = value;
    }

    /**
     * Recupera il valore della proprieta fileWfList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFileWf }
     *     
     */
    public ArrayOfFileWf getFileWfList() {
        return fileWfList;
    }

    /**
     * Imposta il valore della proprieta fileWfList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFileWf }
     *     
     */
    public void setFileWfList(ArrayOfFileWf value) {
        this.fileWfList = value;
    }

    /**
     * Recupera il valore della proprieta descrizioneWf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneWf() {
        return descrizioneWf;
    }

    /**
     * Imposta il valore della proprieta descrizioneWf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneWf(String value) {
        this.descrizioneWf = value;
    }

    /**
     * Recupera il valore della proprieta nomeWf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeWf() {
        return nomeWf;
    }

    /**
     * Imposta il valore della proprieta nomeWf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeWf(String value) {
        this.nomeWf = value;
    }

    /**
     * Recupera il valore della proprieta codeWf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeWf() {
        return codeWf;
    }

    /**
     * Imposta il valore della proprieta codeWf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeWf(String value) {
        this.codeWf = value;
    }

    /**
     * Recupera il valore della proprieta idWf.
     * 
     */
    public int getIdWf() {
        return idWf;
    }

    /**
     * Imposta il valore della proprieta idWf.
     * 
     */
    public void setIdWf(int value) {
        this.idWf = value;
    }

}
