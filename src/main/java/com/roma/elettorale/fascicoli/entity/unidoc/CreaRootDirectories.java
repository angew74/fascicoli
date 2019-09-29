
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
 *         &lt;element name="root" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirs" type="{http://tempuri.org/}ArrayOfStrings" minOccurs="0"/>
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
    "root",
    "dirs"
})
@XmlRootElement(name = "creaRootDirectories")
public class CreaRootDirectories {

    @XmlElement(namespace = "http://tempuri.org/")
    protected String root;
    @XmlElement(namespace = "http://tempuri.org/")
    protected ArrayOfStrings dirs;

    /**
     * Recupera il valore della proprieta root.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoot() {
        return root;
    }

    /**
     * Imposta il valore della proprieta root.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoot(String value) {
        this.root = value;
    }

    /**
     * Recupera il valore della proprieta dirs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStrings }
     *     
     */
    public ArrayOfStrings getDirs() {
        return dirs;
    }

    /**
     * Imposta il valore della proprieta dirs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStrings }
     *     
     */
    public void setDirs(ArrayOfStrings value) {
        this.dirs = value;
    }

}
