
package com.roma.elettorale.fascicoli.entity.veri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="PersonaElenco" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CodiceIndiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="SessoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="CognomePersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="NomePersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="DataDiNascitaPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="CodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Verifica">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RawXml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Messaggi" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Livello" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "personaElenco",
    "verifica",
    "messaggi"
})
@XmlRootElement(name = "VERICOD_RESPONSE", namespace = "http://tempuri.org/VERICOD_RESP.xsd")
public class VERICODRESPONSE {

    @XmlElement(name = "PersonaElenco", required = true)
    protected List<VERICODRESPONSE.PersonaElenco> personaElenco;
    @XmlElement(name = "Verifica", required = true)
    protected VERICODRESPONSE.Verifica verifica;
    @XmlElement(name = "Messaggi")
    protected List<VERICODRESPONSE.Messaggi> messaggi;

    /**
     * Gets the value of the personaElenco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personaElenco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonaElenco().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VERICODRESPONSE.PersonaElenco }
     * 
     * 
     */
    public List<VERICODRESPONSE.PersonaElenco> getPersonaElenco() {
        if (personaElenco == null) {
            personaElenco = new ArrayList<VERICODRESPONSE.PersonaElenco>();
        }
        return this.personaElenco;
    }

    /**
     * Recupera il valore della propriet verifica.
     * 
     * @return
     *     possible object is
     *     {@link VERICODRESPONSE.Verifica }
     *     
     */
    public VERICODRESPONSE.Verifica getVerifica() {
        return verifica;
    }

    /**
     * Imposta il valore della propriet verifica.
     * 
     * @param value
     *     allowed object is
     *     {@link VERICODRESPONSE.Verifica }
     *     
     */
    public void setVerifica(VERICODRESPONSE.Verifica value) {
        this.verifica = value;
    }

    /**
     * Gets the value of the messaggi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaggi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaggi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VERICODRESPONSE.Messaggi }
     * 
     * 
     */
    public List<VERICODRESPONSE.Messaggi> getMessaggi() {
        if (messaggi == null) {
            messaggi = new ArrayList<VERICODRESPONSE.Messaggi>();
        }
        return this.messaggi;
    }


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
     *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Livello" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "codice",
        "livello",
        "descrizione"
    })
    public static class Messaggi {

        @XmlElementRef(name = "Codice", type = JAXBElement.class, required = false)
        protected JAXBElement<String> codice;
        @XmlElementRef(name = "Livello", type = JAXBElement.class, required = false)
        protected JAXBElement<String> livello;
        @XmlElementRef(name = "Descrizione", type = JAXBElement.class, required = false)
        protected JAXBElement<String> descrizione;

        /**
         * Recupera il valore della propriet codice.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCodice() {
            return codice;
        }

        /**
         * Imposta il valore della propriet codice.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCodice(JAXBElement<String> value) {
            this.codice = value;
        }

        /**
         * Recupera il valore della propriet livello.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLivello() {
            return livello;
        }

        /**
         * Imposta il valore della propriet livello.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLivello(JAXBElement<String> value) {
            this.livello = value;
        }

        /**
         * Recupera il valore della propriet descrizione.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDescrizione() {
            return descrizione;
        }

        /**
         * Imposta il valore della propriet descrizione.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDescrizione(JAXBElement<String> value) {
            this.descrizione = value;
        }

    }


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
     *         &lt;element name="CodiceIndiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *         &lt;element name="SessoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *         &lt;element name="CognomePersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *         &lt;element name="NomePersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *         &lt;element name="DataDiNascitaPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *         &lt;element name="CodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
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
        "codiceIndiv",
        "sessoPersona",
        "cognomePersona",
        "nomePersona",
        "dataDiNascitaPersona",
        "codiceFiscale"
    })
    public static class PersonaElenco {

        @XmlElementRef(name = "CodiceIndiv", type = JAXBElement.class, required = false)
        protected JAXBElement<String> codiceIndiv;
        @XmlElementRef(name = "SessoPersona", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sessoPersona;
        @XmlElementRef(name = "CognomePersona", type = JAXBElement.class, required = false)
        protected JAXBElement<String> cognomePersona;
        @XmlElementRef(name = "NomePersona", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nomePersona;
        @XmlElementRef(name = "DataDiNascitaPersona", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dataDiNascitaPersona;
        @XmlElementRef(name = "CodiceFiscale", type = JAXBElement.class, required = false)
        protected JAXBElement<String> codiceFiscale;

        /**
         * Recupera il valore della propriet codiceIndiv.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCodiceIndiv() {
            return codiceIndiv;
        }

        /**
         * Imposta il valore della propriet codiceIndiv.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCodiceIndiv(JAXBElement<String> value) {
            this.codiceIndiv = value;
        }

        /**
         * Recupera il valore della propriet sessoPersona.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSessoPersona() {
            return sessoPersona;
        }

        /**
         * Imposta il valore della propriet sessoPersona.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSessoPersona(JAXBElement<String> value) {
            this.sessoPersona = value;
        }

        /**
         * Recupera il valore della propriet cognomePersona.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCognomePersona() {
            return cognomePersona;
        }

        /**
         * Imposta il valore della propriet cognomePersona.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCognomePersona(JAXBElement<String> value) {
            this.cognomePersona = value;
        }

        /**
         * Recupera il valore della propriet nomePersona.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNomePersona() {
            return nomePersona;
        }

        /**
         * Imposta il valore della propriet nomePersona.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNomePersona(JAXBElement<String> value) {
            this.nomePersona = value;
        }

        /**
         * Recupera il valore della propriet dataDiNascitaPersona.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDataDiNascitaPersona() {
            return dataDiNascitaPersona;
        }

        /**
         * Imposta il valore della propriet dataDiNascitaPersona.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDataDiNascitaPersona(JAXBElement<String> value) {
            this.dataDiNascitaPersona = value;
        }

        /**
         * Recupera il valore della propriet codiceFiscale.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCodiceFiscale() {
            return codiceFiscale;
        }

        /**
         * Imposta il valore della propriet codiceFiscale.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCodiceFiscale(JAXBElement<String> value) {
            this.codiceFiscale = value;
        }

    }


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
     *         &lt;element name="RawXml" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "rawXml"
    })
    public static class Verifica {

        @XmlElement(name = "RawXml", required = true)
        protected String rawXml;

        /**
         * Recupera il valore della propriet rawXml.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRawXml() {
            return rawXml;
        }

        /**
         * Imposta il valore della propriet rawXml.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRawXml(String value) {
            this.rawXml = value;
        }

    }

}
