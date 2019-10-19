
package com.roma.elettorale.fascicoli.entity.veri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="Elenco" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PersonaElenco" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CodiceIndiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="SessoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="CognomePersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="NomePersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="DataDiNascitaPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="CodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="CodiceFamiglia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="CodiceCittadinanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Cittadinanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="CodiceComuneNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="ComuneNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="FlagVivoResidente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="AnnoPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="NumeroPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="AllaData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="RapportoParentela" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="da" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *                 &lt;attribute name="per" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *                 &lt;attribute name="totale" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
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
    "elenco",
    "messaggi"
})
@XmlRootElement(name = "VERIRIC_RESP", namespace = "http://tempuri.org/VERIRIC_RESP.xsd")
public class VERIRICRESP {

    @XmlElement(name = "Elenco")
    protected VERIRICRESP.Elenco elenco;
    @XmlElement(name = "Messaggi")
    protected List<VERIRICRESP.Messaggi> messaggi;

    /**
     * Recupera il valore della propriet elenco.
     * 
     * @return
     *     possible object is
     *     {@link VERIRICRESP.Elenco }
     *     
     */
    public VERIRICRESP.Elenco getElenco() {
        return elenco;
    }

    /**
     * Imposta il valore della propriet elenco.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIRICRESP.Elenco }
     *     
     */
    public void setElenco(VERIRICRESP.Elenco value) {
        this.elenco = value;
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
     * {@link VERIRICRESP.Messaggi }
     * 
     * 
     */
    public List<VERIRICRESP.Messaggi> getMessaggi() {
        if (messaggi == null) {
            messaggi = new ArrayList<VERIRICRESP.Messaggi>();
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
     *                   &lt;element name="CodiceFamiglia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="CodiceCittadinanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Cittadinanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="CodiceComuneNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="ComuneNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="FlagVivoResidente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="AnnoPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="NumeroPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="AllaData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="RapportoParentela" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="da" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
     *       &lt;attribute name="per" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
     *       &lt;attribute name="totale" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "personaElenco"
    })
    public static class Elenco {

        @XmlElement(name = "PersonaElenco", required = true)
        protected List<VERIRICRESP.Elenco.PersonaElenco> personaElenco;
        @XmlAttribute(name = "da")
        protected String da;
        @XmlAttribute(name = "per")
        protected String per;
        @XmlAttribute(name = "totale")
        protected String totale;

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
         * {@link VERIRICRESP.Elenco.PersonaElenco }
         * 
         * 
         */
        public List<VERIRICRESP.Elenco.PersonaElenco> getPersonaElenco() {
            if (personaElenco == null) {
                personaElenco = new ArrayList<VERIRICRESP.Elenco.PersonaElenco>();
            }
            return this.personaElenco;
        }

        /**
         * Recupera il valore della propriet da.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDa() {
            if (da == null) {
                return "";
            } else {
                return da;
            }
        }

        /**
         * Imposta il valore della propriet da.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDa(String value) {
            this.da = value;
        }

        /**
         * Recupera il valore della propriet per.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPer() {
            if (per == null) {
                return "";
            } else {
                return per;
            }
        }

        /**
         * Imposta il valore della propriet per.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPer(String value) {
            this.per = value;
        }

        /**
         * Recupera il valore della propriet totale.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotale() {
            if (totale == null) {
                return "";
            } else {
                return totale;
            }
        }

        /**
         * Imposta il valore della propriet totale.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotale(String value) {
            this.totale = value;
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
         *         &lt;element name="CodiceFamiglia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="CodiceCittadinanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Cittadinanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="CodiceComuneNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="ComuneNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="FlagVivoResidente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="AnnoPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="NumeroPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="AllaData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="RapportoParentela" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "codiceFiscale",
            "codiceFamiglia",
            "codiceCittadinanza",
            "cittadinanza",
            "codiceComuneNascita",
            "comuneNascita",
            "descrizione",
            "flagVivoResidente",
            "annoPratica",
            "numeroPratica",
            "allaData",
            "rapportoParentela"
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
            @XmlElementRef(name = "CodiceFamiglia", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codiceFamiglia;
            @XmlElementRef(name = "CodiceCittadinanza", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codiceCittadinanza;
            @XmlElementRef(name = "Cittadinanza", type = JAXBElement.class, required = false)
            protected JAXBElement<String> cittadinanza;
            @XmlElementRef(name = "CodiceComuneNascita", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codiceComuneNascita;
            @XmlElementRef(name = "ComuneNascita", type = JAXBElement.class, required = false)
            protected JAXBElement<String> comuneNascita;
            @XmlElementRef(name = "Descrizione", type = JAXBElement.class, required = false)
            protected JAXBElement<String> descrizione;
            @XmlElementRef(name = "FlagVivoResidente", type = JAXBElement.class, required = false)
            protected JAXBElement<String> flagVivoResidente;
            @XmlElementRef(name = "AnnoPratica", type = JAXBElement.class, required = false)
            protected JAXBElement<String> annoPratica;
            @XmlElementRef(name = "NumeroPratica", type = JAXBElement.class, required = false)
            protected JAXBElement<String> numeroPratica;
            @XmlElementRef(name = "AllaData", type = JAXBElement.class, required = false)
            protected JAXBElement<String> allaData;
            @XmlElement(name = "RapportoParentela", required = true)
            protected String rapportoParentela;

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

            /**
             * Recupera il valore della propriet codiceFamiglia.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodiceFamiglia() {
                return codiceFamiglia;
            }

            /**
             * Imposta il valore della propriet codiceFamiglia.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodiceFamiglia(JAXBElement<String> value) {
                this.codiceFamiglia = value;
            }

            /**
             * Recupera il valore della propriet codiceCittadinanza.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodiceCittadinanza() {
                return codiceCittadinanza;
            }

            /**
             * Imposta il valore della propriet codiceCittadinanza.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodiceCittadinanza(JAXBElement<String> value) {
                this.codiceCittadinanza = value;
            }

            /**
             * Recupera il valore della propriet cittadinanza.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCittadinanza() {
                return cittadinanza;
            }

            /**
             * Imposta il valore della propriet cittadinanza.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCittadinanza(JAXBElement<String> value) {
                this.cittadinanza = value;
            }

            /**
             * Recupera il valore della propriet codiceComuneNascita.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodiceComuneNascita() {
                return codiceComuneNascita;
            }

            /**
             * Imposta il valore della propriet codiceComuneNascita.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodiceComuneNascita(JAXBElement<String> value) {
                this.codiceComuneNascita = value;
            }

            /**
             * Recupera il valore della propriet comuneNascita.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getComuneNascita() {
                return comuneNascita;
            }

            /**
             * Imposta il valore della propriet comuneNascita.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setComuneNascita(JAXBElement<String> value) {
                this.comuneNascita = value;
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

            /**
             * Recupera il valore della propriet flagVivoResidente.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getFlagVivoResidente() {
                return flagVivoResidente;
            }

            /**
             * Imposta il valore della propriet flagVivoResidente.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setFlagVivoResidente(JAXBElement<String> value) {
                this.flagVivoResidente = value;
            }

            /**
             * Recupera il valore della propriet annoPratica.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getAnnoPratica() {
                return annoPratica;
            }

            /**
             * Imposta il valore della propriet annoPratica.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setAnnoPratica(JAXBElement<String> value) {
                this.annoPratica = value;
            }

            /**
             * Recupera il valore della propriet numeroPratica.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getNumeroPratica() {
                return numeroPratica;
            }

            /**
             * Imposta il valore della propriet numeroPratica.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setNumeroPratica(JAXBElement<String> value) {
                this.numeroPratica = value;
            }

            /**
             * Recupera il valore della propriet allaData.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getAllaData() {
                return allaData;
            }

            /**
             * Imposta il valore della propriet allaData.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setAllaData(JAXBElement<String> value) {
                this.allaData = value;
            }

            /**
             * Recupera il valore della propriet rapportoParentela.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRapportoParentela() {
                return rapportoParentela;
            }

            /**
             * Imposta il valore della propriet rapportoParentela.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRapportoParentela(String value) {
                this.rapportoParentela = value;
            }

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
         * Recupera il valore della propriet� codice.
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
         * Imposta il valore della propriet� codice.
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
         * Recupera il valore della propriet� livello.
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
         * Imposta il valore della propriet� livello.
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
         * Recupera il valore della propriet� descrizione.
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
         * Imposta il valore della propriet� descrizione.
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

}
