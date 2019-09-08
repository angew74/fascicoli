
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseDivorzioType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseDivorzioType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}IdAttoStatoCivile">
 *       &lt;sequence>
 *         &lt;element name="TipoSentenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelDella" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Autorita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataSentenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoAutorita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelDellaAut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoritaAut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataSentenzaAut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataTimbro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataTrascrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRicorso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoritaRicorso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoRicorso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDivorzioType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "tipoSentenza",
    "delDella",
    "autorita",
    "dataSentenza",
    "tipoAutorita",
    "delDellaAut",
    "autoritaAut",
    "dataSentenzaAut",
    "dataTimbro",
    "dataTrascrizione",
    "dataRicorso",
    "autoritaRicorso",
    "tipoRicorso"
})
public class BaseDivorzioType
    extends IdAttoStatoCivile
{

    @XmlElementRef(name = "TipoSentenza", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoSentenza;
    @XmlElementRef(name = "DelDella", type = JAXBElement.class, required = false)
    protected JAXBElement<String> delDella;
    @XmlElementRef(name = "Autorita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autorita;
    @XmlElementRef(name = "DataSentenza", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataSentenza;
    @XmlElementRef(name = "TipoAutorita", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoAutorita;
    @XmlElementRef(name = "DelDellaAut", type = JAXBElement.class, required = false)
    protected JAXBElement<String> delDellaAut;
    @XmlElementRef(name = "AutoritaAut", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autoritaAut;
    @XmlElementRef(name = "DataSentenzaAut", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataSentenzaAut;
    @XmlElementRef(name = "DataTimbro", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataTimbro;
    @XmlElementRef(name = "DataTrascrizione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataTrascrizione;
    @XmlElementRef(name = "DataRicorso", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataRicorso;
    @XmlElementRef(name = "AutoritaRicorso", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autoritaRicorso;
    @XmlElementRef(name = "TipoRicorso", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoRicorso;

    /**
     * Recupera il valore della proprietà tipoSentenza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoSentenza() {
        return tipoSentenza;
    }

    /**
     * Imposta il valore della proprietà tipoSentenza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoSentenza(JAXBElement<String> value) {
        this.tipoSentenza = value;
    }

    /**
     * Recupera il valore della proprietà delDella.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDelDella() {
        return delDella;
    }

    /**
     * Imposta il valore della proprietà delDella.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDelDella(JAXBElement<String> value) {
        this.delDella = value;
    }

    /**
     * Recupera il valore della proprietà autorita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutorita() {
        return autorita;
    }

    /**
     * Imposta il valore della proprietà autorita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutorita(JAXBElement<String> value) {
        this.autorita = value;
    }

    /**
     * Recupera il valore della proprietà dataSentenza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataSentenza() {
        return dataSentenza;
    }

    /**
     * Imposta il valore della proprietà dataSentenza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataSentenza(JAXBElement<String> value) {
        this.dataSentenza = value;
    }

    /**
     * Recupera il valore della proprietà tipoAutorita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoAutorita() {
        return tipoAutorita;
    }

    /**
     * Imposta il valore della proprietà tipoAutorita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoAutorita(JAXBElement<String> value) {
        this.tipoAutorita = value;
    }

    /**
     * Recupera il valore della proprietà delDellaAut.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDelDellaAut() {
        return delDellaAut;
    }

    /**
     * Imposta il valore della proprietà delDellaAut.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDelDellaAut(JAXBElement<String> value) {
        this.delDellaAut = value;
    }

    /**
     * Recupera il valore della proprietà autoritaAut.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutoritaAut() {
        return autoritaAut;
    }

    /**
     * Imposta il valore della proprietà autoritaAut.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutoritaAut(JAXBElement<String> value) {
        this.autoritaAut = value;
    }

    /**
     * Recupera il valore della proprietà dataSentenzaAut.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataSentenzaAut() {
        return dataSentenzaAut;
    }

    /**
     * Imposta il valore della proprietà dataSentenzaAut.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataSentenzaAut(JAXBElement<String> value) {
        this.dataSentenzaAut = value;
    }

    /**
     * Recupera il valore della proprietà dataTimbro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataTimbro() {
        return dataTimbro;
    }

    /**
     * Imposta il valore della proprietà dataTimbro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataTimbro(JAXBElement<String> value) {
        this.dataTimbro = value;
    }

    /**
     * Recupera il valore della proprietà dataTrascrizione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataTrascrizione() {
        return dataTrascrizione;
    }

    /**
     * Imposta il valore della proprietà dataTrascrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataTrascrizione(JAXBElement<String> value) {
        this.dataTrascrizione = value;
    }

    /**
     * Recupera il valore della proprietà dataRicorso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataRicorso() {
        return dataRicorso;
    }

    /**
     * Imposta il valore della proprietà dataRicorso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataRicorso(JAXBElement<String> value) {
        this.dataRicorso = value;
    }

    /**
     * Recupera il valore della proprietà autoritaRicorso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutoritaRicorso() {
        return autoritaRicorso;
    }

    /**
     * Imposta il valore della proprietà autoritaRicorso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutoritaRicorso(JAXBElement<String> value) {
        this.autoritaRicorso = value;
    }

    /**
     * Recupera il valore della proprietà tipoRicorso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoRicorso() {
        return tipoRicorso;
    }

    /**
     * Imposta il valore della proprietà tipoRicorso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoRicorso(JAXBElement<String> value) {
        this.tipoRicorso = value;
    }

}
