
package com.roma.elettorale.fascicoli.entity.certi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InfoCertificatoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InfoCertificatoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idNomeCertificato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="IdUso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="idMotivoEsenzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dicituraVariabile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="emettibile" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoCertificatoType", propOrder = {
    "idNomeCertificato",
    "idUso",
    "idMotivoEsenzione",
    "dicituraVariabile"
})
@XmlSeeAlso({
    CertificatoType.class
})
public class InfoCertificatoType {

    protected String idNomeCertificato;
    @XmlElement(name = "IdUso")
    protected String idUso;
    protected String idMotivoEsenzione;
    protected String dicituraVariabile;
    @XmlAttribute(name = "emettibile")
    protected Boolean emettibile;

    /**
     * Recupera il valore della proprietà idNomeCertificato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNomeCertificato() {
        return idNomeCertificato;
    }

    /**
     * Imposta il valore della proprietà idNomeCertificato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNomeCertificato(String value) {
        this.idNomeCertificato = value;
    }

    /**
     * Recupera il valore della proprietà idUso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUso() {
        return idUso;
    }

    /**
     * Imposta il valore della proprietà idUso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUso(String value) {
        this.idUso = value;
    }

    /**
     * Recupera il valore della proprietà idMotivoEsenzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMotivoEsenzione() {
        return idMotivoEsenzione;
    }

    /**
     * Imposta il valore della proprietà idMotivoEsenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMotivoEsenzione(String value) {
        this.idMotivoEsenzione = value;
    }

    /**
     * Recupera il valore della proprietà dicituraVariabile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicituraVariabile() {
        return dicituraVariabile;
    }

    /**
     * Imposta il valore della proprietà dicituraVariabile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicituraVariabile(String value) {
        this.dicituraVariabile = value;
    }

    /**
     * Recupera il valore della proprietà emettibile.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmettibile() {
        return emettibile;
    }

    /**
     * Imposta il valore della proprietà emettibile.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmettibile(Boolean value) {
        this.emettibile = value;
    }

}
