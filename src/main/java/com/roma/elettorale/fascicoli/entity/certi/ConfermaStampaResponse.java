
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
 *         &lt;element name="esitoConferma" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
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
    "esitoConferma"
})
@XmlRootElement(name = "confermaStampaResponse")
public class ConfermaStampaResponse {

    protected boolean esitoConferma;

    /**
     * Recupera il valore della proprietà esitoConferma.
     * 
     */
    public boolean isEsitoConferma() {
        return esitoConferma;
    }

    /**
     * Imposta il valore della proprietà esitoConferma.
     * 
     */
    public void setEsitoConferma(boolean value) {
        this.esitoConferma = value;
    }

}
