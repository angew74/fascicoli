//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.09.24 alle 10:06:42 AM CEST 
//


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
 * &lt;complexType name="CertificatoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.comune.roma.it/certificati/data}InfoCertificatoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="bin" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
