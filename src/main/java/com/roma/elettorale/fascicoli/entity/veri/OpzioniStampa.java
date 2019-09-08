
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OpzioniStampa complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OpzioniStampa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Anteprima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Copie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
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
@XmlType(name = "OpzioniStampa", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "anteprima",
    "copie",
    "numberRow"
})
public class OpzioniStampa {

    @XmlElementRef(name = "Anteprima", type = JAXBElement.class, required = false)
    protected JAXBElement<String> anteprima;
    @XmlElementRef(name = "Copie", type = JAXBElement.class, required = false)
    protected JAXBElement<String> copie;
    @XmlElementRef(name = "NumberRow", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberRow;

    /**
     * Recupera il valore della proprietà anteprima.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnteprima() {
        return anteprima;
    }

    /**
     * Imposta il valore della proprietà anteprima.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnteprima(JAXBElement<String> value) {
        this.anteprima = value;
    }

    /**
     * Recupera il valore della proprietà copie.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopie() {
        return copie;
    }

    /**
     * Imposta il valore della proprietà copie.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopie(JAXBElement<String> value) {
        this.copie = value;
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
