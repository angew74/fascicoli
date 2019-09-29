
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BasePermessoSoggiornoAnagType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasePermessoSoggiornoAnagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoPermesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Permesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodQuestura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesQuestura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRinn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataScad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRichNuovo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePermessoSoggiornoAnagType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipoPermesso",
    "permesso",
    "codQuestura",
    "desQuestura",
    "dataRil",
    "dataRinn",
    "dataScad",
    "dataRichNuovo"
})
public class BasePermessoSoggiornoAnagType {

    @XmlElementRef(name = "TipoPermesso", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPermesso;
    @XmlElementRef(name = "Permesso", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permesso;
    @XmlElementRef(name = "CodQuestura", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codQuestura;
    @XmlElementRef(name = "DesQuestura", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desQuestura;
    @XmlElementRef(name = "DataRil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRil;
    @XmlElementRef(name = "DataRinn", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRinn;
    @XmlElementRef(name = "DataScad", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataScad;
    @XmlElementRef(name = "DataRichNuovo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRichNuovo;

    /**
     * Recupera il valore della proprieta tipoPermesso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPermesso() {
        return tipoPermesso;
    }

    /**
     * Imposta il valore della proprieta tipoPermesso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPermesso(JAXBElement<String> value) {
        this.tipoPermesso = value;
    }

    /**
     * Recupera il valore della proprieta permesso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermesso() {
        return permesso;
    }

    /**
     * Imposta il valore della proprieta permesso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermesso(JAXBElement<String> value) {
        this.permesso = value;
    }

    /**
     * Recupera il valore della proprieta codQuestura.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodQuestura() {
        return codQuestura;
    }

    /**
     * Imposta il valore della proprieta codQuestura.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodQuestura(JAXBElement<String> value) {
        this.codQuestura = value;
    }

    /**
     * Recupera il valore della proprieta desQuestura.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesQuestura() {
        return desQuestura;
    }

    /**
     * Imposta il valore della proprieta desQuestura.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesQuestura(JAXBElement<String> value) {
        this.desQuestura = value;
    }

    /**
     * Recupera il valore della proprieta dataRil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataRil() {
        return dataRil;
    }

    /**
     * Imposta il valore della proprieta dataRil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataRil(JAXBElement<String> value) {
        this.dataRil = value;
    }

    /**
     * Recupera il valore della proprieta dataRinn.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataRinn() {
        return dataRinn;
    }

    /**
     * Imposta il valore della proprieta dataRinn.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataRinn(JAXBElement<String> value) {
        this.dataRinn = value;
    }

    /**
     * Recupera il valore della proprieta dataScad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataScad() {
        return dataScad;
    }

    /**
     * Imposta il valore della proprieta dataScad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataScad(JAXBElement<String> value) {
        this.dataScad = value;
    }

    /**
     * Recupera il valore della proprieta dataRichNuovo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataRichNuovo() {
        return dataRichNuovo;
    }

    /**
     * Imposta il valore della proprieta dataRichNuovo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataRichNuovo(JAXBElement<String> value) {
        this.dataRichNuovo = value;
    }

}
