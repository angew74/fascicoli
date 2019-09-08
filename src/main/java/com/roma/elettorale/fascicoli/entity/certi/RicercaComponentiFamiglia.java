
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
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}int" form="unqualified"/>
 *         &lt;element name="codiceFiscaleRichiedente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
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
    "idClient",
    "codiceFiscaleRichiedente"
})
@XmlRootElement(name = "ricercaComponentiFamiglia")
public class RicercaComponentiFamiglia {

    protected int idClient;
    protected String codiceFiscaleRichiedente;

    /**
     * Recupera il valore della proprietà idClient.
     * 
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * Imposta il valore della proprietà idClient.
     * 
     */
    public void setIdClient(int value) {
        this.idClient = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscaleRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleRichiedente() {
        return codiceFiscaleRichiedente;
    }

    /**
     * Imposta il valore della proprietà codiceFiscaleRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleRichiedente(String value) {
        this.codiceFiscaleRichiedente = value;
    }

}
