
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
 *         &lt;element name="Ricerca" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Parametri" maxOccurs="unbounded">
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
 *                             &lt;element name="SituazioneAllaData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="AnnoDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="AnnoA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Padre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Madre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="ComuneNas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="CodiceStrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Sedime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Strada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="TipoCivico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="IntervalloDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Lettera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="IntervalloA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Scala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Piano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Interno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Lotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Palazzina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                             &lt;element name="Kilometro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="da" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *                 &lt;attribute name="per" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *                 &lt;attribute name="TipoRicerca" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *                 &lt;attribute name="FiltroPersone" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
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
    "ricerca"
})
@XmlRootElement(name = "VERIRIC", namespace = "http://tempuri.org/VeriRic.xsd")
public class VERIRIC {

    @XmlElement(name = "Ricerca")
    protected VERIRIC.Ricerca ricerca;

    /**
     * Recupera il valore della propriet ricerca.
     * 
     * @return
     *     possible object is
     *     {@link VERIRIC.Ricerca }
     *     
     */
    public VERIRIC.Ricerca getRicerca() {
        return ricerca;
    }

    /**
     * Imposta il valore della propriet ricerca.
     * 
     * @param value
     *     allowed object is
     *     {@link VERIRIC.Ricerca }
     *     
     */
    public void setRicerca(VERIRIC.Ricerca value) {
        this.ricerca = value;
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
     *         &lt;element name="Parametri" maxOccurs="unbounded">
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
     *                   &lt;element name="SituazioneAllaData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="AnnoDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="AnnoA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Padre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Madre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="ComuneNas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="CodiceStrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Sedime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Strada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="TipoCivico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="IntervalloDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Lettera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="IntervalloA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Scala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Piano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Interno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Lotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Palazzina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                   &lt;element name="Kilometro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="da" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
     *       &lt;attribute name="per" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
     *       &lt;attribute name="TipoRicerca" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
     *       &lt;attribute name="FiltroPersone" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parametri"
    })
    public static class Ricerca {

        @XmlElement(name = "Parametri", required = true)
        protected List<VERIRIC.Ricerca.Parametri> parametri;
        @XmlAttribute(name = "da")
        protected String da;
        @XmlAttribute(name = "per")
        protected String per;
        @XmlAttribute(name = "TipoRicerca")
        protected String tipoRicerca;
        @XmlAttribute(name = "FiltroPersone")
        protected String filtroPersone;

        /**
         * Gets the value of the parametri property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parametri property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParametri().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VERIRIC.Ricerca.Parametri }
         * 
         * 
         */
        public List<VERIRIC.Ricerca.Parametri> getParametri() {
            if (parametri == null) {
                parametri = new ArrayList<VERIRIC.Ricerca.Parametri>();
            }
            return this.parametri;
        }
        public void setParametri(ArrayList<Parametri> list) {
            if (list != null) {
                parametri =list;
            }
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
         * Recupera il valore della propriet tipoRicerca.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoRicerca() {
            if (tipoRicerca == null) {
                return "";
            } else {
                return tipoRicerca;
            }
        }

        /**
         * Imposta il valore della propriet tipoRicerca.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoRicerca(String value) {
            this.tipoRicerca = value;
        }

        /**
         * Recupera il valore della propriet filtroPersone.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFiltroPersone() {
            if (filtroPersone == null) {
                return "";
            } else {
                return filtroPersone;
            }
        }

        /**
         * Imposta il valore della propriet filtroPersone.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFiltroPersone(String value) {
            this.filtroPersone = value;
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
         *         &lt;element name="SituazioneAllaData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="AnnoDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="AnnoA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Padre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Madre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="ComuneNas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="CodiceStrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Sedime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Strada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="TipoCivico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="IntervalloDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Lettera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="IntervalloA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Scala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Piano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Interno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Lotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Palazzina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
         *         &lt;element name="Kilometro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
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
            "situazioneAllaData",
            "annoDa",
            "annoA",
            "padre",
            "madre",
            "comuneNas",
            "codiceStrada",
            "sedime",
            "strada",
            "tipoCivico",
            "intervalloDa",
            "lettera",
            "intervalloA",
            "scala",
            "piano",
            "interno",
            "lotto",
            "palazzina",
            "kilometro"
        })
        public static class Parametri {

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
            @XmlElementRef(name = "SituazioneAllaData", type = JAXBElement.class, required = false)
            protected JAXBElement<String> situazioneAllaData;
            @XmlElementRef(name = "AnnoDa", type = JAXBElement.class, required = false)
            protected JAXBElement<String> annoDa;
            @XmlElementRef(name = "AnnoA", type = JAXBElement.class, required = false)
            protected JAXBElement<String> annoA;
            @XmlElementRef(name = "Padre", type = JAXBElement.class, required = false)
            protected JAXBElement<String> padre;
            @XmlElementRef(name = "Madre", type = JAXBElement.class, required = false)
            protected JAXBElement<String> madre;
            @XmlElementRef(name = "ComuneNas", type = JAXBElement.class, required = false)
            protected JAXBElement<String> comuneNas;
            @XmlElementRef(name = "CodiceStrada", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codiceStrada;
            @XmlElementRef(name = "Sedime", type = JAXBElement.class, required = false)
            protected JAXBElement<String> sedime;
            @XmlElementRef(name = "Strada", type = JAXBElement.class, required = false)
            protected JAXBElement<String> strada;
            @XmlElementRef(name = "TipoCivico", type = JAXBElement.class, required = false)
            protected JAXBElement<String> tipoCivico;
            @XmlElementRef(name = "IntervalloDa", type = JAXBElement.class, required = false)
            protected JAXBElement<String> intervalloDa;
            @XmlElementRef(name = "Lettera", type = JAXBElement.class, required = false)
            protected JAXBElement<String> lettera;
            @XmlElementRef(name = "IntervalloA", type = JAXBElement.class, required = false)
            protected JAXBElement<String> intervalloA;
            @XmlElementRef(name = "Scala", type = JAXBElement.class, required = false)
            protected JAXBElement<String> scala;
            @XmlElementRef(name = "Piano", type = JAXBElement.class, required = false)
            protected JAXBElement<String> piano;
            @XmlElementRef(name = "Interno", type = JAXBElement.class, required = false)
            protected JAXBElement<String> interno;
            @XmlElementRef(name = "Lotto", type = JAXBElement.class, required = false)
            protected JAXBElement<String> lotto;
            @XmlElementRef(name = "Palazzina", type = JAXBElement.class, required = false)
            protected JAXBElement<String> palazzina;
            @XmlElementRef(name = "Kilometro", type = JAXBElement.class, required = false)
            protected JAXBElement<String> kilometro;

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
             * Recupera il valore della propriet situazioneAllaData.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSituazioneAllaData() {
                return situazioneAllaData;
            }

            /**
             * Imposta il valore della propriet situazioneAllaData.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSituazioneAllaData(JAXBElement<String> value) {
                this.situazioneAllaData = value;
            }

            /**
             * Recupera il valore della propriet annoDa.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getAnnoDa() {
                return annoDa;
            }

            /**
             * Imposta il valore della propriet annoDa.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setAnnoDa(JAXBElement<String> value) {
                this.annoDa = value;
            }

            /**
             * Recupera il valore della propriet annoA.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getAnnoA() {
                return annoA;
            }

            /**
             * Imposta il valore della propriet annoA.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setAnnoA(JAXBElement<String> value) {
                this.annoA = value;
            }

            /**
             * Recupera il valore della propriet padre.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getPadre() {
                return padre;
            }

            /**
             * Imposta il valore della propriet padre.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setPadre(JAXBElement<String> value) {
                this.padre = value;
            }

            /**
             * Recupera il valore della propriet madre.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getMadre() {
                return madre;
            }

            /**
             * Imposta il valore della propriet madre.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setMadre(JAXBElement<String> value) {
                this.madre = value;
            }

            /**
             * Recupera il valore della propriet comuneNas.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getComuneNas() {
                return comuneNas;
            }

            /**
             * Imposta il valore della propriet comuneNas.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setComuneNas(JAXBElement<String> value) {
                this.comuneNas = value;
            }

            /**
             * Recupera il valore della propriet codiceStrada.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodiceStrada() {
                return codiceStrada;
            }

            /**
             * Imposta il valore della propriet codiceStrada.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodiceStrada(JAXBElement<String> value) {
                this.codiceStrada = value;
            }

            /**
             * Recupera il valore della propriet sedime.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSedime() {
                return sedime;
            }

            /**
             * Imposta il valore della propriet sedime.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSedime(JAXBElement<String> value) {
                this.sedime = value;
            }

            /**
             * Recupera il valore della propriet strada.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getStrada() {
                return strada;
            }

            /**
             * Imposta il valore della propriet strada.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setStrada(JAXBElement<String> value) {
                this.strada = value;
            }

            /**
             * Recupera il valore della propriet tipoCivico.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTipoCivico() {
                return tipoCivico;
            }

            /**
             * Imposta il valore della propriet tipoCivico.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTipoCivico(JAXBElement<String> value) {
                this.tipoCivico = value;
            }

            /**
             * Recupera il valore della propriet intervalloDa.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getIntervalloDa() {
                return intervalloDa;
            }

            /**
             * Imposta il valore della propriet intervalloDa.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setIntervalloDa(JAXBElement<String> value) {
                this.intervalloDa = value;
            }

            /**
             * Recupera il valore della propriet lettera.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getLettera() {
                return lettera;
            }

            /**
             * Imposta il valore della propriet lettera.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setLettera(JAXBElement<String> value) {
                this.lettera = value;
            }

            /**
             * Recupera il valore della propriet intervalloA.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getIntervalloA() {
                return intervalloA;
            }

            /**
             * Imposta il valore della propriet intervalloA.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setIntervalloA(JAXBElement<String> value) {
                this.intervalloA = value;
            }

            /**
             * Recupera il valore della propriet scala.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getScala() {
                return scala;
            }

            /**
             * Imposta il valore della propriet scala.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setScala(JAXBElement<String> value) {
                this.scala = value;
            }

            /**
             * Recupera il valore della propriet piano.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getPiano() {
                return piano;
            }

            /**
             * Imposta il valore della propriet piano.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setPiano(JAXBElement<String> value) {
                this.piano = value;
            }

            /**
             * Recupera il valore della propriet interno.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getInterno() {
                return interno;
            }

            /**
             * Imposta il valore della propriet interno.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setInterno(JAXBElement<String> value) {
                this.interno = value;
            }

            /**
             * Recupera il valore della propriet lotto.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getLotto() {
                return lotto;
            }

            /**
             * Imposta il valore della propriet lotto.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setLotto(JAXBElement<String> value) {
                this.lotto = value;
            }

            /**
             * Recupera il valore della propriet palazzina.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getPalazzina() {
                return palazzina;
            }

            /**
             * Imposta il valore della propriet palazzina.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setPalazzina(JAXBElement<String> value) {
                this.palazzina = value;
            }

            /**
             * Recupera il valore della propriet kilometro.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getKilometro() {
                return kilometro;
            }

            /**
             * Imposta il valore della propriet kilometro.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setKilometro(JAXBElement<String> value) {
                this.kilometro = value;
            }

        }

    }

}
