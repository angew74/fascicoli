//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.09.24 alle 10:06:42 AM CEST 
//


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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credenziali" type="{http://www.comune.roma.it/certificati/data}CredenzialiType" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="certificati" type="{http://www.comune.roma.it/certificati/data}ArrayOfInfoCertificatoType" minOccurs="0" form="unqualified"/&gt;
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
    "credenziali",
    "certificati"
})
@XmlRootElement(name = "richiestaCertificati")
public class RichiestaCertificati {

    protected CredenzialiType credenziali;
    protected ArrayOfInfoCertificatoType certificati;

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
     *     {@link ArrayOfInfoCertificatoType }
     *     
     */
    public ArrayOfInfoCertificatoType getCertificati() {
        return certificati;
    }

    /**
     * Imposta il valore della proprietà certificati.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfoCertificatoType }
     *     
     */
    public void setCertificati(ArrayOfInfoCertificatoType value) {
        this.certificati = value;
    }

}
