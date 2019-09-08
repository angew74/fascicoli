
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FileResponseList complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FileResponseList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListFiles" type="{}ArrayOfFileResponses" minOccurs="0"/>
 *         &lt;element name="Da" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Per" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Totale" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "FileResponseList", namespace = "", propOrder = {
    "listFiles",
    "da",
    "per",
    "totale",
    "msg"
})
public class FileResponseList {

    @XmlElement(name = "ListFiles")
    protected ArrayOfFileResponses listFiles;
    @XmlElement(name = "Da")
    protected int da;
    @XmlElement(name = "Per")
    protected int per;
    @XmlElement(name = "Totale")
    protected int totale;
    @XmlElement(name = "Msg")
    protected Messaggio msg;

    /**
     * Recupera il valore della proprietà listFiles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFileResponses }
     *     
     */
    public ArrayOfFileResponses getListFiles() {
        return listFiles;
    }

    /**
     * Imposta il valore della proprietà listFiles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFileResponses }
     *     
     */
    public void setListFiles(ArrayOfFileResponses value) {
        this.listFiles = value;
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

    /**
     * Recupera il valore della proprietà totale.
     * 
     */
    public int getTotale() {
        return totale;
    }

    /**
     * Imposta il valore della proprietà totale.
     * 
     */
    public void setTotale(int value) {
        this.totale = value;
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
