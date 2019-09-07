
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseDatiAnnullamentoPraticaCrab complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseDatiAnnullamentoPraticaCrab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataAnnullamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAnnull" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDatiAnnullamentoPraticaCrab", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "dataAnnullamento",
    "noteAnnull"
})
public class BaseDatiAnnullamentoPraticaCrab {

    @XmlElementRef(name = "DataAnnullamento", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAnnullamento;
    @XmlElementRef(name = "NoteAnnull", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteAnnull;

    /**
     * Recupera il valore della proprietà dataAnnullamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAnnullamento() {
        return dataAnnullamento;
    }

    /**
     * Imposta il valore della proprietà dataAnnullamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAnnullamento(JAXBElement<String> value) {
        this.dataAnnullamento = value;
    }

    /**
     * Recupera il valore della proprietà noteAnnull.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAnnull() {
        return noteAnnull;
    }

    /**
     * Imposta il valore della proprietà noteAnnull.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAnnull(JAXBElement<String> value) {
        this.noteAnnull = value;
    }

}
