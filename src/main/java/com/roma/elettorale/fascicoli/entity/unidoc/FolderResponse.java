
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FolderResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FolderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdFolder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Msg" type="{}Messaggio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderResponse", namespace = "", propOrder = {
    "nomeFolder",
    "idFolder",
    "msg"
})
public class FolderResponse {

    @XmlElement(name = "NomeFolder")
    protected String nomeFolder;
    @XmlElement(name = "IdFolder")
    protected int idFolder;
    @XmlElement(name = "Msg")
    protected Messaggio msg;

    /**
     * Recupera il valore della proprietà nomeFolder.
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
     * Imposta il valore della proprietà nomeFolder.
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
     * Recupera il valore della proprietà idFolder.
     * 
     */
    public int getIdFolder() {
        return idFolder;
    }

    /**
     * Imposta il valore della proprietà idFolder.
     * 
     */
    public void setIdFolder(int value) {
        this.idFolder = value;
    }

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

}
