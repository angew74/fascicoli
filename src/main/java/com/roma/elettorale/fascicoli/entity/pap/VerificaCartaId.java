//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.01 alle 09:39:08 AM CEST 
//


package com.roma.elettorale.fascicoli.entity.pap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Carta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "carta",
    "serviceLevel"
})
@XmlRootElement(name = "VerificaCartaId")
public class VerificaCartaId {

    @XmlElement(name = "Carta")
    protected String carta;
    @XmlElement(name = "ServiceLevel")
    @XmlSchemaType(name = "unsignedByte")
    protected short serviceLevel;

    /**
     * Recupera il valore della proprietà carta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarta() {
        return carta;
    }

    /**
     * Imposta il valore della proprietà carta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarta(String value) {
        this.carta = value;
    }

    /**
     * Recupera il valore della proprietà serviceLevel.
     * 
     */
    public short getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Imposta il valore della proprietà serviceLevel.
     * 
     */
    public void setServiceLevel(short value) {
        this.serviceLevel = value;
    }

}
