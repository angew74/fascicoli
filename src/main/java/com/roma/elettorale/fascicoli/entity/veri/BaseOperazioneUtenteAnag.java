
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseOperazioneUtenteAnag complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseOperazioneUtenteAnag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_operazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseOperazioneUtenteAnag", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "username",
    "dataOperazione",
    "operazione"
})
public class BaseOperazioneUtenteAnag {

    @XmlElementRef(name = "Username", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username;
    @XmlElementRef(name = "Data_operazione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataOperazione;
    @XmlElementRef(name = "Operazione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operazione;

    /**
     * Recupera il valore della proprietà username.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Imposta il valore della proprietà username.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = value;
    }

    /**
     * Recupera il valore della proprietà dataOperazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataOperazione() {
        return dataOperazione;
    }

    /**
     * Imposta il valore della proprietà dataOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataOperazione(JAXBElement<String> value) {
        this.dataOperazione = value;
    }

    /**
     * Recupera il valore della proprietà operazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperazione() {
        return operazione;
    }

    /**
     * Imposta il valore della proprietà operazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperazione(JAXBElement<String> value) {
        this.operazione = value;
    }

}
