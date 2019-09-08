
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiRicercaPerMunicipioRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiRicercaPerMunicipioRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MunicipioRic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SedeRic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoOrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiRicercaPerMunicipioRequest", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "municipioRic",
    "sedeRic",
    "tipoOrd"
})
public class DatiRicercaPerMunicipioRequest {

    @XmlElementRef(name = "MunicipioRic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> municipioRic;
    @XmlElementRef(name = "SedeRic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sedeRic;
    @XmlElementRef(name = "TipoOrd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoOrd;

    /**
     * Recupera il valore della proprietà municipioRic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMunicipioRic() {
        return municipioRic;
    }

    /**
     * Imposta il valore della proprietà municipioRic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMunicipioRic(JAXBElement<String> value) {
        this.municipioRic = value;
    }

    /**
     * Recupera il valore della proprietà sedeRic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSedeRic() {
        return sedeRic;
    }

    /**
     * Imposta il valore della proprietà sedeRic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSedeRic(JAXBElement<String> value) {
        this.sedeRic = value;
    }

    /**
     * Recupera il valore della proprietà tipoOrd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoOrd() {
        return tipoOrd;
    }

    /**
     * Imposta il valore della proprietà tipoOrd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoOrd(JAXBElement<String> value) {
        this.tipoOrd = value;
    }

}
