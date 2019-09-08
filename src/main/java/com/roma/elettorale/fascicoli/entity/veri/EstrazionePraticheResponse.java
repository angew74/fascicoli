
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EstrazionePraticheResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EstrazionePraticheResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataOperaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="AnnoPratRic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="NumeroPratRic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataPratRic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="StatusPratRic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CodComune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DesComune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CapComune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ConomeComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="UltimoUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataIniVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataInvAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataRitAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataInvCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DataRitCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DichiarPrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="TotRitr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="GiorniManc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstrazionePraticheResponse", namespace = "http://tempuri.org/TipiBase.xsd", propOrder = {
    "dataOperaz",
    "annoPratRic",
    "numeroPratRic",
    "dataPratRic",
    "statusPratRic",
    "codComune",
    "desComune",
    "capComune",
    "conomeComp",
    "ultimoUser",
    "dataIniVal",
    "dataInvAcc",
    "dataRitAcc",
    "dataInvCom",
    "dataRitCom",
    "dichiarPrat",
    "totRitr",
    "giorniManc"
})
public class EstrazionePraticheResponse {

    @XmlElement(name = "DataOperaz")
    protected String dataOperaz;
    @XmlElement(name = "AnnoPratRic")
    protected String annoPratRic;
    @XmlElement(name = "NumeroPratRic")
    protected String numeroPratRic;
    @XmlElement(name = "DataPratRic")
    protected String dataPratRic;
    @XmlElement(name = "StatusPratRic")
    protected String statusPratRic;
    @XmlElement(name = "CodComune")
    protected String codComune;
    @XmlElement(name = "DesComune")
    protected String desComune;
    @XmlElement(name = "CapComune")
    protected String capComune;
    @XmlElement(name = "ConomeComp")
    protected String conomeComp;
    @XmlElement(name = "UltimoUser")
    protected String ultimoUser;
    @XmlElement(name = "DataIniVal")
    protected String dataIniVal;
    @XmlElement(name = "DataInvAcc")
    protected String dataInvAcc;
    @XmlElement(name = "DataRitAcc")
    protected String dataRitAcc;
    @XmlElement(name = "DataInvCom")
    protected String dataInvCom;
    @XmlElement(name = "DataRitCom")
    protected String dataRitCom;
    @XmlElement(name = "DichiarPrat")
    protected String dichiarPrat;
    @XmlElement(name = "TotRitr")
    protected String totRitr;
    @XmlElement(name = "GiorniManc")
    protected String giorniManc;

    /**
     * Recupera il valore della proprietà dataOperaz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOperaz() {
        return dataOperaz;
    }

    /**
     * Imposta il valore della proprietà dataOperaz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOperaz(String value) {
        this.dataOperaz = value;
    }

    /**
     * Recupera il valore della proprietà annoPratRic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoPratRic() {
        return annoPratRic;
    }

    /**
     * Imposta il valore della proprietà annoPratRic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoPratRic(String value) {
        this.annoPratRic = value;
    }

    /**
     * Recupera il valore della proprietà numeroPratRic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPratRic() {
        return numeroPratRic;
    }

    /**
     * Imposta il valore della proprietà numeroPratRic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPratRic(String value) {
        this.numeroPratRic = value;
    }

    /**
     * Recupera il valore della proprietà dataPratRic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPratRic() {
        return dataPratRic;
    }

    /**
     * Imposta il valore della proprietà dataPratRic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPratRic(String value) {
        this.dataPratRic = value;
    }

    /**
     * Recupera il valore della proprietà statusPratRic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPratRic() {
        return statusPratRic;
    }

    /**
     * Imposta il valore della proprietà statusPratRic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPratRic(String value) {
        this.statusPratRic = value;
    }

    /**
     * Recupera il valore della proprietà codComune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodComune() {
        return codComune;
    }

    /**
     * Imposta il valore della proprietà codComune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodComune(String value) {
        this.codComune = value;
    }

    /**
     * Recupera il valore della proprietà desComune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesComune() {
        return desComune;
    }

    /**
     * Imposta il valore della proprietà desComune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesComune(String value) {
        this.desComune = value;
    }

    /**
     * Recupera il valore della proprietà capComune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapComune() {
        return capComune;
    }

    /**
     * Imposta il valore della proprietà capComune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapComune(String value) {
        this.capComune = value;
    }

    /**
     * Recupera il valore della proprietà conomeComp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConomeComp() {
        return conomeComp;
    }

    /**
     * Imposta il valore della proprietà conomeComp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConomeComp(String value) {
        this.conomeComp = value;
    }

    /**
     * Recupera il valore della proprietà ultimoUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimoUser() {
        return ultimoUser;
    }

    /**
     * Imposta il valore della proprietà ultimoUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimoUser(String value) {
        this.ultimoUser = value;
    }

    /**
     * Recupera il valore della proprietà dataIniVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIniVal() {
        return dataIniVal;
    }

    /**
     * Imposta il valore della proprietà dataIniVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIniVal(String value) {
        this.dataIniVal = value;
    }

    /**
     * Recupera il valore della proprietà dataInvAcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInvAcc() {
        return dataInvAcc;
    }

    /**
     * Imposta il valore della proprietà dataInvAcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInvAcc(String value) {
        this.dataInvAcc = value;
    }

    /**
     * Recupera il valore della proprietà dataRitAcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRitAcc() {
        return dataRitAcc;
    }

    /**
     * Imposta il valore della proprietà dataRitAcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRitAcc(String value) {
        this.dataRitAcc = value;
    }

    /**
     * Recupera il valore della proprietà dataInvCom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInvCom() {
        return dataInvCom;
    }

    /**
     * Imposta il valore della proprietà dataInvCom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInvCom(String value) {
        this.dataInvCom = value;
    }

    /**
     * Recupera il valore della proprietà dataRitCom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRitCom() {
        return dataRitCom;
    }

    /**
     * Imposta il valore della proprietà dataRitCom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRitCom(String value) {
        this.dataRitCom = value;
    }

    /**
     * Recupera il valore della proprietà dichiarPrat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDichiarPrat() {
        return dichiarPrat;
    }

    /**
     * Imposta il valore della proprietà dichiarPrat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDichiarPrat(String value) {
        this.dichiarPrat = value;
    }

    /**
     * Recupera il valore della proprietà totRitr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotRitr() {
        return totRitr;
    }

    /**
     * Imposta il valore della proprietà totRitr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotRitr(String value) {
        this.totRitr = value;
    }

    /**
     * Recupera il valore della proprietà giorniManc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiorniManc() {
        return giorniManc;
    }

    /**
     * Imposta il valore della proprietà giorniManc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiorniManc(String value) {
        this.giorniManc = value;
    }

}
