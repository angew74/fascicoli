
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseRichiestaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseRichiestaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdPratica" type="{http://tempuri.org/TipiBase.xsd}BasePraticaCRAB"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRichiestaType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "idPratica"
})
public class BaseRichiestaType {

    @XmlElement(name = "IdPratica", required = true)
    protected BasePraticaCRAB idPratica;

    /**
     * Recupera il valore della proprietà idPratica.
     * 
     * @return
     *     possible object is
     *     {@link BasePraticaCRAB }
     *     
     */
    public BasePraticaCRAB getIdPratica() {
        return idPratica;
    }

    /**
     * Imposta il valore della proprietà idPratica.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePraticaCRAB }
     *     
     */
    public void setIdPratica(BasePraticaCRAB value) {
        this.idPratica = value;
    }

}
