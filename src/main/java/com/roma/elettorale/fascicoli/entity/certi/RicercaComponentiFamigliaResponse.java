
package com.roma.elettorale.fascicoli.entity.certi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="componentiFamiglia" type="{http://www.comune.roma.it/certificati/data}ArrayOfComponenteFamigliaType" minOccurs="0" form="unqualified"/>
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
    "componentiFamiglia"
})
@XmlRootElement(name = "ricercaComponentiFamigliaResponse")
public class RicercaComponentiFamigliaResponse {

    protected ArrayOfComponenteFamigliaType componentiFamiglia;

    /**
     * Recupera il valore della proprietà componentiFamiglia.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComponenteFamigliaType }
     *     
     */
    public ArrayOfComponenteFamigliaType getComponentiFamiglia() {
        return componentiFamiglia;
    }

    /**
     * Imposta il valore della proprietà componentiFamiglia.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComponenteFamigliaType }
     *     
     */
    public void setComponentiFamiglia(ArrayOfComponenteFamigliaType value) {
        this.componentiFamiglia = value;
    }

}
