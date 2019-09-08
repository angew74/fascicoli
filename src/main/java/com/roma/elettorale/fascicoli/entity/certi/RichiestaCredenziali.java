
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
 *         &lt;element name="transactionRequest" type="{http://www.comune.roma.it/certificati/data}TransactionRequestType" minOccurs="0" form="unqualified"/>
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
    "transactionRequest"
})
@XmlRootElement(name = "richiestaCredenziali")
public class RichiestaCredenziali {

    protected TransactionRequestType transactionRequest;

    /**
     * Recupera il valore della proprietà transactionRequest.
     * 
     * @return
     *     possible object is
     *     {@link TransactionRequestType }
     *     
     */
    public TransactionRequestType getTransactionRequest() {
        return transactionRequest;
    }

    /**
     * Imposta il valore della proprietà transactionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionRequestType }
     *     
     */
    public void setTransactionRequest(TransactionRequestType value) {
        this.transactionRequest = value;
    }

}
