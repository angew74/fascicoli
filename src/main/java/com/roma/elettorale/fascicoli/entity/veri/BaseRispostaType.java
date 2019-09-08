
package com.roma.elettorale.fascicoli.entity.veri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseRispostaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseRispostaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="Messaggio" type="{http://tempuri.org/TipiBase.xsd}BaseMessaggioAnag"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRispostaType", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "messaggio"
})
public class BaseRispostaType {

    @XmlElement(name = "Messaggio", required = true)
    protected List<BaseMessaggioAnag> messaggio;

    /**
     * Gets the value of the messaggio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messaggio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessaggio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseMessaggioAnag }
     * 
     * 
     */
    public List<BaseMessaggioAnag> getMessaggio() {
        if (messaggio == null) {
            messaggio = new ArrayList<BaseMessaggioAnag>();
        }
        return this.messaggio;
    }

}
