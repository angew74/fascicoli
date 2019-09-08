
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseMultipleCall complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseMultipleCall">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="NumberRow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMultipleCall", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "recall",
    "numberRow"
})
public class BaseMultipleCall {

    @XmlElementRef(name = "Recall", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recall;
    @XmlElementRef(name = "NumberRow", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberRow;

    /**
     * Recupera il valore della proprietà recall.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecall() {
        return recall;
    }

    /**
     * Imposta il valore della proprietà recall.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecall(JAXBElement<String> value) {
        this.recall = value;
    }

    /**
     * Recupera il valore della proprietà numberRow.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberRow() {
        return numberRow;
    }

    /**
     * Imposta il valore della proprietà numberRow.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberRow(JAXBElement<String> value) {
        this.numberRow = value;
    }

}
