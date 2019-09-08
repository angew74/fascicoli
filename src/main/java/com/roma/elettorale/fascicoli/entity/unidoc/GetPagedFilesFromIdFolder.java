
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
 *         &lt;element name="idFolder" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idFolder",
    "da",
    "per"
})
@XmlRootElement(name = "getPagedFilesFromIdFolder")
public class GetPagedFilesFromIdFolder {

    @XmlElement(namespace = "http://tempuri.org/")
    protected int idFolder;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int da;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int per;

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
