
package com.roma.elettorale.fascicoli.entity.unidoc;

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
 *         &lt;element ref="{}firma" minOccurs="0"/>
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
    "firma"
})
@XmlRootElement(name = "signDocument")
public class SignDocument {

    protected UnidocsFirma firma;

    /**
     * Recupera il valore della proprietà firma.
     * 
     * @return
     *     possible object is
     *     {@link UnidocsFirma }
     *     
     */
    public UnidocsFirma getFirma() {
        return firma;
    }

    /**
     * Imposta il valore della proprietà firma.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidocsFirma }
     *     
     */
    public void setFirma(UnidocsFirma value) {
        this.firma = value;
    }

}
