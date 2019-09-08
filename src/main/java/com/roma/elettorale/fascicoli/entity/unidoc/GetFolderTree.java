
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
 *         &lt;element name="startNode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="livelli" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "startNode",
    "area",
    "livelli"
})
@XmlRootElement(name = "GetFolderTree")
public class GetFolderTree {

    @XmlElement(namespace = "http://tempuri.org/")
    protected long startNode;
    @XmlElement(namespace = "http://tempuri.org/")
    protected String area;
    @XmlElement(namespace = "http://tempuri.org/")
    protected int livelli;

    /**
     * Recupera il valore della proprietà startNode.
     * 
     */
    public long getStartNode() {
        return startNode;
    }

    /**
     * Imposta il valore della proprietà startNode.
     * 
     */
    public void setStartNode(long value) {
        this.startNode = value;
    }

    /**
     * Recupera il valore della proprietà area.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Imposta il valore della proprietà area.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Recupera il valore della proprietà livelli.
     * 
     */
    public int getLivelli() {
        return livelli;
    }

    /**
     * Imposta il valore della proprietà livelli.
     * 
     */
    public void setLivelli(int value) {
        this.livelli = value;
    }

}
