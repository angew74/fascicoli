
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FileResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Chiave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Metatag" type="{}FileMetatag" minOccurs="0"/>
 *         &lt;element name="Esito" type="{}Messaggio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileResponse", namespace = "", propOrder = {
    "chiave",
    "metatag",
    "esito"
})
public class FileResponse {

    @XmlElement(name = "Chiave")
    protected int chiave;
    @XmlElement(name = "Metatag")
    protected FileMetatag metatag;
    @XmlElement(name = "Esito")
    protected Messaggio esito;

    /**
     * Recupera il valore della proprietà chiave.
     * 
     */
    public int getChiave() {
        return chiave;
    }

    /**
     * Imposta il valore della proprietà chiave.
     * 
     */
    public void setChiave(int value) {
        this.chiave = value;
    }

    /**
     * Recupera il valore della proprietà metatag.
     * 
     * @return
     *     possible object is
     *     {@link FileMetatag }
     *     
     */
    public FileMetatag getMetatag() {
        return metatag;
    }

    /**
     * Imposta il valore della proprietà metatag.
     * 
     * @param value
     *     allowed object is
     *     {@link FileMetatag }
     *     
     */
    public void setMetatag(FileMetatag value) {
        this.metatag = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link Messaggio }
     *     
     */
    public Messaggio getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link Messaggio }
     *     
     */
    public void setEsito(Messaggio value) {
        this.esito = value;
    }

}
