
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PersonaInPraticaCRAB complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonaInPraticaCRAB">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}BasePersonaAnag">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="StatusPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaInPraticaCRAB", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "statusPersona",
    "descrizione"
})
@XmlSeeAlso({
    PersonaInPraticaCDF.class,
    PersonaInPraticaCRE.class,
    PersonaCRI.class
})
public class PersonaInPraticaCRAB
    extends BasePersonaAnag
{

    @XmlElementRef(name = "StatusPersona", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusPersona;
    @XmlElementRef(name = "Descrizione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizione;

    /**
     * Recupera il valore della proprietà statusPersona.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusPersona() {
        return statusPersona;
    }

    /**
     * Imposta il valore della proprietà statusPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusPersona(JAXBElement<String> value) {
        this.statusPersona = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
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
     * Imposta il valore della proprietà descrizione.
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
