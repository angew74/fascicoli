
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
 *         &lt;element name="credenziali" type="{http://www.comune.roma.it/certificati/data}CredenzialiType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="certificati" type="{http://www.comune.roma.it/certificati/data}ArrayOfString" minOccurs="0" form="unqualified"/>
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
    "credenziali",
    "certificati"
})
@XmlRootElement(name = "confermaStampa")
public class ConfermaStampa {

    protected CredenzialiType credenziali;
    protected ArrayOfString certificati;

    /**
     * Recupera il valore della proprietà credenziali.
     * 
     * @return
     *     possible object is
     *     {@link CredenzialiType }
     *     
     */
    public CredenzialiType getCredenziali() {
        return credenziali;
    }

    /**
     * Imposta il valore della proprietà credenziali.
     * 
     * @param value
     *     allowed object is
     *     {@link CredenzialiType }
     *     
     */
    public void setCredenziali(CredenzialiType value) {
        this.credenziali = value;
    }

    /**
     * Recupera il valore della proprietà certificati.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCertificati() {
        return certificati;
    }

    /**
     * Imposta il valore della proprietà certificati.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCertificati(ArrayOfString value) {
        this.certificati = value;
    }

}
