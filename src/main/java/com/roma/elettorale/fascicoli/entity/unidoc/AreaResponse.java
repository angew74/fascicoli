
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AreaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AreaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Msg" type="{}Messaggio" minOccurs="0"/>
 *         &lt;element name="IdRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DenArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Root" type="{}FolderResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaResponse", namespace = "", propOrder = {
    "msg",
    "idRegistro",
    "denArea",
    "codRegistro",
    "root"
})
public class AreaResponse {

    @XmlElement(name = "Msg")
    protected Messaggio msg;
    @XmlElement(name = "IdRegistro")
    protected int idRegistro;
    @XmlElement(name = "DenArea")
    protected String denArea;
    @XmlElement(name = "CodRegistro")
    protected String codRegistro;
    @XmlElement(name = "Root")
    protected FolderResponse root;

    /**
     * Recupera il valore della proprietà msg.
     * 
     * @return
     *     possible object is
     *     {@link Messaggio }
     *     
     */
    public Messaggio getMsg() {
        return msg;
    }

    /**
     * Imposta il valore della proprietà msg.
     * 
     * @param value
     *     allowed object is
     *     {@link Messaggio }
     *     
     */
    public void setMsg(Messaggio value) {
        this.msg = value;
    }

    /**
     * Recupera il valore della proprietà idRegistro.
     * 
     */
    public int getIdRegistro() {
        return idRegistro;
    }

    /**
     * Imposta il valore della proprietà idRegistro.
     * 
     */
    public void setIdRegistro(int value) {
        this.idRegistro = value;
    }

    /**
     * Recupera il valore della proprietà denArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenArea() {
        return denArea;
    }

    /**
     * Imposta il valore della proprietà denArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenArea(String value) {
        this.denArea = value;
    }

    /**
     * Recupera il valore della proprietà codRegistro.
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
     * Imposta il valore della proprietà codRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegistro(String value) {
        this.codRegistro = value;
    }

    /**
     * Recupera il valore della proprietà root.
     * 
     * @return
     *     possible object is
     *     {@link FolderResponse }
     *     
     */
    public FolderResponse getRoot() {
        return root;
    }

    /**
     * Imposta il valore della proprietà root.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderResponse }
     *     
     */
    public void setRoot(FolderResponse value) {
        this.root = value;
    }

}
