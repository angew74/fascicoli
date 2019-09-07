
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseDatiUnlock complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseDatiUnlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserSblocca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DipUserSblocca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDatiUnlock", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipoPratica",
    "userSblocca",
    "dipUserSblocca"
})
public class BaseDatiUnlock {

    @XmlElementRef(name = "TipoPratica", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPratica;
    @XmlElementRef(name = "UserSblocca", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userSblocca;
    @XmlElementRef(name = "DipUserSblocca", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dipUserSblocca;

    /**
     * Recupera il valore della proprietà tipoPratica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPratica() {
        return tipoPratica;
    }

    /**
     * Imposta il valore della proprietà tipoPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPratica(JAXBElement<String> value) {
        this.tipoPratica = value;
    }

    /**
     * Recupera il valore della proprietà userSblocca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserSblocca() {
        return userSblocca;
    }

    /**
     * Imposta il valore della proprietà userSblocca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserSblocca(JAXBElement<String> value) {
        this.userSblocca = value;
    }

    /**
     * Recupera il valore della proprietà dipUserSblocca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDipUserSblocca() {
        return dipUserSblocca;
    }

    /**
     * Imposta il valore della proprietà dipUserSblocca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDipUserSblocca(JAXBElement<String> value) {
        this.dipUserSblocca = value;
    }

}
