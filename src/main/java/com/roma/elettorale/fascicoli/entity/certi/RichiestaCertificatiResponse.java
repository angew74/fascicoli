
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
 *         &lt;element name="certificati" type="{http://www.comune.roma.it/certificati/data}ArrayOfCertificatoType" minOccurs="0" form="unqualified"/>
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
    "certificati"
})
@XmlRootElement(name = "richiestaCertificatiResponse")
public class RichiestaCertificatiResponse {

    protected ArrayOfCertificatoType certificati;

    /**
     * Recupera il valore della proprietà certificati.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCertificatoType }
     *     
     */
    public ArrayOfCertificatoType getCertificati() {
        return certificati;
    }

    /**
     * Imposta il valore della proprietà certificati.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCertificatoType }
     *     
     */
    public void setCertificati(ArrayOfCertificatoType value) {
        this.certificati = value;
    }

}
