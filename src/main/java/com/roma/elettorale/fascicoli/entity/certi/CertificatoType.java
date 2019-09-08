
package com.roma.elettorale.fascicoli.entity.certi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CertificatoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertificatoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.comune.roma.it/certificati/data}InfoCertificatoType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="bin" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificatoType", propOrder = {
    "idDocumento",
    "bin"
})
public class CertificatoType
    extends InfoCertificatoType
{

    @XmlElement(name = "IdDocumento")
    protected String idDocumento;
    protected byte[] bin;

    /**
     * Recupera il valore della proprietà idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Imposta il valore della proprietà idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Recupera il valore della proprietà bin.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBin() {
        return bin;
    }

    /**
     * Imposta il valore della proprietà bin.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBin(byte[] value) {
        this.bin = value;
    }

}
