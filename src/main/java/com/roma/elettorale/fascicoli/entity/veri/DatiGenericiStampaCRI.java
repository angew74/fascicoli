
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiGenericiStampaCRI complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiGenericiStampaCRI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataRichiesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="InvioRicorso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataDefinizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="UtenteRic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="AnnoPraticaRic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiGenericiStampaCRI", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "dataRichiesta",
    "invioRicorso",
    "dataDefinizione",
    "utenteRic",
    "annoPraticaRic"
})
public class DatiGenericiStampaCRI {

    @XmlElementRef(name = "DataRichiesta", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRichiesta;
    @XmlElementRef(name = "InvioRicorso", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invioRicorso;
    @XmlElementRef(name = "DataDefinizione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataDefinizione;
    @XmlElementRef(name = "UtenteRic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> utenteRic;
    @XmlElementRef(name = "AnnoPraticaRic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> annoPraticaRic;

    /**
     * Recupera il valore della proprietà dataRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataRichiesta() {
        return dataRichiesta;
    }

    /**
     * Imposta il valore della proprietà dataRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataRichiesta(JAXBElement<String> value) {
        this.dataRichiesta = value;
    }

    /**
     * Recupera il valore della proprietà invioRicorso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvioRicorso() {
        return invioRicorso;
    }

    /**
     * Imposta il valore della proprietà invioRicorso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvioRicorso(JAXBElement<String> value) {
        this.invioRicorso = value;
    }

    /**
     * Recupera il valore della proprietà dataDefinizione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataDefinizione() {
        return dataDefinizione;
    }

    /**
     * Imposta il valore della proprietà dataDefinizione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataDefinizione(JAXBElement<String> value) {
        this.dataDefinizione = value;
    }

    /**
     * Recupera il valore della proprietà utenteRic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUtenteRic() {
        return utenteRic;
    }

    /**
     * Imposta il valore della proprietà utenteRic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUtenteRic(JAXBElement<String> value) {
        this.utenteRic = value;
    }

    /**
     * Recupera il valore della proprietà annoPraticaRic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnnoPraticaRic() {
        return annoPraticaRic;
    }

    /**
     * Imposta il valore della proprietà annoPraticaRic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnnoPraticaRic(JAXBElement<String> value) {
        this.annoPraticaRic = value;
    }

}
