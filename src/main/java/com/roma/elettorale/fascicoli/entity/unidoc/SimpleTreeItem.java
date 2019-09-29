
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SimpleTreeItem complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SimpleTreeItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BaseResultItem">
 *       &lt;sequence>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Padre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleTreeItem", propOrder = {
    "path",
    "padre"
})
public class SimpleTreeItem
    extends BaseResultItem
{

    @XmlElement(name = "Path", namespace = "http://tempuri.org/")
    protected String path;
    @XmlElement(name = "Padre", namespace = "http://tempuri.org/")
    protected String padre;

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
     * Recupera il valore della proprieta padre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadre() {
        return padre;
    }

    /**
     * Imposta il valore della proprieta padre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadre(String value) {
        this.padre = value;
    }

}
