
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PersonaInPraticaCDF complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonaInPraticaCDF">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}PersonaInPraticaCRAB">
 *       &lt;sequence>
 *         &lt;element name="Rappar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pagina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EsitoCompAcc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MotivoEsitoCompAcc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaInPraticaCDF", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "rappar",
    "pagina",
    "esitoCompAcc",
    "motivoEsitoCompAcc"
})
public class PersonaInPraticaCDF
    extends PersonaInPraticaCRAB
{

    @XmlElementRef(name = "Rappar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rappar;
    @XmlElement(name = "Pagina")
    protected String pagina;
    @XmlElement(name = "EsitoCompAcc", required = true)
    protected String esitoCompAcc;
    @XmlElement(name = "MotivoEsitoCompAcc", required = true)
    protected String motivoEsitoCompAcc;

    /**
     * Recupera il valore della proprietà rappar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRappar() {
        return rappar;
    }

    /**
     * Imposta il valore della proprietà rappar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRappar(JAXBElement<String> value) {
        this.rappar = value;
    }

    /**
     * Recupera il valore della proprietà pagina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagina() {
        return pagina;
    }

    /**
     * Imposta il valore della proprietà pagina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagina(String value) {
        this.pagina = value;
    }

    /**
     * Recupera il valore della proprietà esitoCompAcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsitoCompAcc() {
        return esitoCompAcc;
    }

    /**
     * Imposta il valore della proprietà esitoCompAcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsitoCompAcc(String value) {
        this.esitoCompAcc = value;
    }

    /**
     * Recupera il valore della proprietà motivoEsitoCompAcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoEsitoCompAcc() {
        return motivoEsitoCompAcc;
    }

    /**
     * Imposta il valore della proprietà motivoEsitoCompAcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoEsitoCompAcc(String value) {
        this.motivoEsitoCompAcc = value;
    }

}
