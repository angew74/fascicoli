
package com.roma.elettorale.fascicoli.entity.anagrafe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Logon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Servizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Env" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAPPERES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemotHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "logon",
    "dept",
    "pwd",
    "servizio",
    "env",
    "mapperes",
    "remotHost",
    "serviceName"
})
@XmlRootElement(name = "CallMapperWebMethod")
public class CallMapperWebMethod {

    @XmlElement(name = "Logon")
    protected String logon;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "PWD")
    protected String pwd;
    @XmlElement(name = "Servizio")
    protected String servizio;
    @XmlElement(name = "Env")
    protected String env;
    @XmlElement(name = "MAPPERES")
    protected String mapperes;
    @XmlElement(name = "RemotHost")
    protected String remotHost;
    @XmlElement(name = "ServiceName")
    protected String serviceName;

    /**
     * Recupera il valore della proprieta logon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogon() {
        return logon;
    }

    /**
     * Imposta il valore della proprieta logon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogon(String value) {
        this.logon = value;
    }

    /**
     * Recupera il valore della proprieta dept.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Imposta il valore della proprieta dept.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Recupera il valore della proprieta pwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWD() {
        return pwd;
    }

    /**
     * Imposta il valore della proprieta pwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWD(String value) {
        this.pwd = value;
    }

    /**
     * Recupera il valore della proprieta servizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServizio() {
        return servizio;
    }

    /**
     * Imposta il valore della proprieta servizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServizio(String value) {
        this.servizio = value;
    }

    /**
     * Recupera il valore della proprieta env.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnv() {
        return env;
    }

    /**
     * Imposta il valore della proprieta env.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnv(String value) {
        this.env = value;
    }

    /**
     * Recupera il valore della proprieta mapperes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAPPERES() {
        return mapperes;
    }

    /**
     * Imposta il valore della proprieta mapperes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAPPERES(String value) {
        this.mapperes = value;
    }

    /**
     * Recupera il valore della proprieta remotHost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemotHost() {
        return remotHost;
    }

    /**
     * Imposta il valore della proprieta remotHost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemotHost(String value) {
        this.remotHost = value;
    }

    /**
     * Recupera il valore della proprieta serviceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Imposta il valore della proprieta serviceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

}
