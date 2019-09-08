
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseDettaglioUserRespCRE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseDettaglioUserRespCRE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProgPrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDettaglioUserRespCRE", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "progPrat",
    "sesso",
    "cognome",
    "nome",
    "dataNascita",
    "esito"
})
public class BaseDettaglioUserRespCRE {

    @XmlElementRef(name = "ProgPrat", type = JAXBElement.class, required = false)
    protected JAXBElement<String> progPrat;
    @XmlElementRef(name = "Sesso", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sesso;
    @XmlElementRef(name = "Cognome", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cognome;
    @XmlElementRef(name = "Nome", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "DataNascita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataNascita;
    @XmlElementRef(name = "Esito", type = JAXBElement.class, required = false)
    protected JAXBElement<String> esito;

    /**
     * Recupera il valore della proprietà progPrat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgPrat() {
        return progPrat;
    }

    /**
     * Imposta il valore della proprietà progPrat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgPrat(JAXBElement<String> value) {
        this.progPrat = value;
    }

    /**
     * Recupera il valore della proprietà sesso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesso() {
        return sesso;
    }

    /**
     * Imposta il valore della proprietà sesso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesso(JAXBElement<String> value) {
        this.sesso = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCognome(JAXBElement<String> value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNome(JAXBElement<String> value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà dataNascita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataNascita() {
        return dataNascita;
    }

    /**
     * Imposta il valore della proprietà dataNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataNascita(JAXBElement<String> value) {
        this.dataNascita = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEsito(JAXBElement<String> value) {
        this.esito = value;
    }

}
