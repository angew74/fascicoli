
package com.roma.elettorale.fascicoli.entity.veri;

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
 *         &lt;element name="Ricerca">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Parametri">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CodFis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DataRiferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodFam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CarID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TipoVerifica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FiltroPersone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TipoRicerca" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ricerca"
})
@XmlRootElement(name = "VERICOD", namespace = "http://tempuri.org/VERICOD.xsd")
public class VERICOD {

    @XmlElement(name = "Ricerca", namespace = "http://tempuri.org/VERICOD.xsd", required = true)
    protected VERICOD.Ricerca ricerca;

    /**
     * Recupera il valore della propriet ricerca.
     * 
     * @return
     *     possible object is
     *     {@link VERICOD.Ricerca }
     *     
     */
    public VERICOD.Ricerca getRicerca() {
        return ricerca;
    }

    /**
     * Imposta il valore della propriet ricerca.
     * 
     * @param value
     *     allowed object is
     *     {@link VERICOD.Ricerca }
     *     
     */
    public void setRicerca(VERICOD.Ricerca value) {
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
     *         &lt;element name="Parametri">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CodFis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DataRiferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodFam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CarID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TipoVerifica" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FiltroPersone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TipoRicerca" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "parametri",
        "tipoVerifica",
        "filtroPersone",
        "tipoRicerca"
    })
    public static class Ricerca {

        @XmlElement(name = "Parametri", namespace = "http://tempuri.org/VERICOD.xsd", required = true)
        protected VERICOD.Ricerca.Parametri parametri;
        @XmlElement(name = "TipoVerifica", namespace = "http://tempuri.org/VERICOD.xsd", required = true)
        protected String tipoVerifica;
        @XmlElement(name = "FiltroPersone", namespace = "http://tempuri.org/VERICOD.xsd", required = true)
        protected String filtroPersone;
        @XmlElement(name = "TipoRicerca", namespace = "http://tempuri.org/VERICOD.xsd", required = true)
        protected String tipoRicerca;

        /**
         * Recupera il valore della propriet parametri.
         * 
         * @return
         *     possible object is
         *     {@link VERICOD.Ricerca.Parametri }
         *     
         */
        public VERICOD.Ricerca.Parametri getParametri() {
            return parametri;
        }

        /**
         * Imposta il valore della propriet parametri.
         * 
         * @param value
         *     allowed object is
         *     {@link VERICOD.Ricerca.Parametri }
         *     
         */
        public void setParametri(VERICOD.Ricerca.Parametri value) {
            this.parametri = value;
        }

        /**
         * Recupera il valore della propriet tipoVerifica.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoVerifica() {
            return tipoVerifica;
        }

        /**
         * Imposta il valore della propriet tipoVerifica.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoVerifica(String value) {
            this.tipoVerifica = value;
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
            return filtroPersone;
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
         * Recupera il valore della propriet tipoRicerca.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoRicerca() {
            return tipoRicerca;
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
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CodFis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DataRiferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodFam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CarID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "codFis",
            "codInd",
            "dataRiferimento",
            "codFam",
            "carID"
        })
        public static class Parametri {

            @XmlElementRef(name = "CodFis", namespace = "http://tempuri.org/VERICOD.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codFis;
            @XmlElementRef(name = "CodInd", namespace = "http://tempuri.org/VERICOD.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codInd;
            @XmlElementRef(name = "DataRiferimento", namespace = "http://tempuri.org/VERICOD.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<String> dataRiferimento;
            @XmlElementRef(name = "CodFam", namespace = "http://tempuri.org/VERICOD.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codFam;
            @XmlElementRef(name = "CarID", namespace = "http://tempuri.org/VERICOD.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<String> carID;

            /**
             * Recupera il valore della propriet codFis.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodFis() {
                return codFis;
            }

            /**
             * Imposta il valore della propriet codFis.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodFis(JAXBElement<String> value) {
                this.codFis = value;
            }

            /**
             * Recupera il valore della propriet codInd.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodInd() {
                return codInd;
            }

            /**
             * Imposta il valore della propriet codInd.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodInd(JAXBElement<String> value) {
                this.codInd = value;
            }

            /**
             * Recupera il valore della propriet dataRiferimento.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getDataRiferimento() {
                return dataRiferimento;
            }

            /**
             * Imposta il valore della propriet dataRiferimento.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setDataRiferimento(JAXBElement<String> value) {
                this.dataRiferimento = value;
            }

            /**
             * Recupera il valore della propriet codFam.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodFam() {
                return codFam;
            }

            /**
             * Imposta il valore della propriet codFam.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodFam(JAXBElement<String> value) {
                this.codFam = value;
            }

            /**
             * Recupera il valore della propriet carID.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCarID() {
                return carID;
            }

            /**
             * Imposta il valore della propriet carID.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCarID(JAXBElement<String> value) {
                this.carID = value;
            }

        }

    }

}
