
package com.roma.elettorale.fascicoli.entity.certi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CredenzialiType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CredenzialiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFlusso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="transactionData" type="{http://www.comune.roma.it/certificati/data}TransactionRequestType" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredenzialiType", propOrder = {
    "idFlusso",
    "transactionData"
})
public class CredenzialiType {

    protected String idFlusso;
    protected TransactionRequestType transactionData;

    /**
     * Recupera il valore della proprietà idFlusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFlusso() {
        return idFlusso;
    }

    /**
     * Imposta il valore della proprietà idFlusso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFlusso(String value) {
        this.idFlusso = value;
    }

    /**
     * Recupera il valore della proprietà transactionData.
     * 
     * @return
     *     possible object is
     *     {@link TransactionRequestType }
     *     
     */
    public TransactionRequestType getTransactionData() {
        return transactionData;
    }

    /**
     * Imposta il valore della proprietà transactionData.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionRequestType }
     *     
     */
    public void setTransactionData(TransactionRequestType value) {
        this.transactionData = value;
    }

}
