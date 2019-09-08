
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BasePersonaInFamigliaAnag complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BasePersonaInFamigliaAnag">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/TipiBase.xsd}BasePersonaAnag">
 *       &lt;sequence>
 *         &lt;element name="RapportoParentela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePersonaInFamigliaAnag", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "rapportoParentela"
})
public class BasePersonaInFamigliaAnag
    extends BasePersonaAnag
{

    @XmlElement(name = "RapportoParentela")
    protected String rapportoParentela;

    /**
     * Recupera il valore della proprietà rapportoParentela.
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
     * Imposta il valore della proprietà rapportoParentela.
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
