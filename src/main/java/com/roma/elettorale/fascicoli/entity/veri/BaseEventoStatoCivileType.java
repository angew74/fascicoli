
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseEventoStatoCivileType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseEventoStatoCivileType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}IdAttoStatoCivile">
 *       &lt;sequence>
 *         &lt;element name="DataEvtSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodComEvtSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesComEvtSs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseEventoStatoCivileType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "dataEvtSs",
    "codComEvtSs",
    "desComEvtSs"
})
@XmlSeeAlso({
    BaseMatrimonioType.class,
    BaseDecessoType.class
})
public class BaseEventoStatoCivileType
    extends IdAttoStatoCivile
{

    @XmlElementRef(name = "DataEvtSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataEvtSs;
    @XmlElementRef(name = "CodComEvtSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codComEvtSs;
    @XmlElementRef(name = "DesComEvtSs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desComEvtSs;

    /**
     * Recupera il valore della proprietà dataEvtSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataEvtSs() {
        return dataEvtSs;
    }

    /**
     * Imposta il valore della proprietà dataEvtSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataEvtSs(JAXBElement<String> value) {
        this.dataEvtSs = value;
    }

    /**
     * Recupera il valore della proprietà codComEvtSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodComEvtSs() {
        return codComEvtSs;
    }

    /**
     * Imposta il valore della proprietà codComEvtSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodComEvtSs(JAXBElement<String> value) {
        this.codComEvtSs = value;
    }

    /**
     * Recupera il valore della proprietà desComEvtSs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesComEvtSs() {
        return desComEvtSs;
    }

    /**
     * Imposta il valore della proprietà desComEvtSs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesComEvtSs(JAXBElement<String> value) {
        this.desComEvtSs = value;
    }

}
