
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PraticaOriundo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PraticaOriundo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}BasePraticaCRAB">
 *       &lt;sequence>
 *         &lt;element name="CodiceIndiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Progressivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PraticaOriundo", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "codiceIndiv",
    "progressivo"
})
public class PraticaOriundo
    extends BasePraticaCRAB
{

    @XmlElementRef(name = "CodiceIndiv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceIndiv;
    @XmlElementRef(name = "Progressivo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> progressivo;

    /**
     * Recupera il valore della proprietà codiceIndiv.
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
     * Imposta il valore della proprietà codiceIndiv.
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
     * Recupera il valore della proprietà progressivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgressivo() {
        return progressivo;
    }

    /**
     * Imposta il valore della proprietà progressivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgressivo(JAXBElement<String> value) {
        this.progressivo = value;
    }

}
