
package com.roma.elettorale.fascicoli.entity.veri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.roma.elettorale.fascicoli.entity.veri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VERICODRicercaParametriCodFam_QNAME = new QName("http://tempuri.org/VERICOD.xsd", "CodFam");
    private final static QName _VERICODRicercaParametriDataRiferimento_QNAME = new QName("http://tempuri.org/VERICOD.xsd", "DataRiferimento");
    private final static QName _VERICODRicercaParametriCodFis_QNAME = new QName("http://tempuri.org/VERICOD.xsd", "CodFis");
    private final static QName _VERICODRicercaParametriCarID_QNAME = new QName("http://tempuri.org/VERICOD.xsd", "CarID");
    private final static QName _VERICODRicercaParametriCodInd_QNAME = new QName("http://tempuri.org/VERICOD.xsd", "CodInd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.roma.elettorale.fascicoli.entity.veri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VERICOD }
     * 
     */
    public VERICOD createVERICOD() {
        return new VERICOD();
    }

    /**
     * Create an instance of {@link VERICOD.Ricerca }
     * 
     */
    public VERICOD.Ricerca createVERICODRicerca() {
        return new VERICOD.Ricerca();
    }

    /**
     * Create an instance of {@link VERICOD.Ricerca.Parametri }
     * 
     */
    public VERICOD.Ricerca.Parametri createVERICODRicercaParametri() {
        return new VERICOD.Ricerca.Parametri();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/VERICOD.xsd", name = "CodFam", scope = VERICOD.Ricerca.Parametri.class)
    public JAXBElement<String> createVERICODRicercaParametriCodFam(String value) {
        return new JAXBElement<String>(_VERICODRicercaParametriCodFam_QNAME, String.class, VERICOD.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/VERICOD.xsd", name = "DataRiferimento", scope = VERICOD.Ricerca.Parametri.class)
    public JAXBElement<String> createVERICODRicercaParametriDataRiferimento(String value) {
        return new JAXBElement<String>(_VERICODRicercaParametriDataRiferimento_QNAME, String.class, VERICOD.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/VERICOD.xsd", name = "CodFis", scope = VERICOD.Ricerca.Parametri.class)
    public JAXBElement<String> createVERICODRicercaParametriCodFis(String value) {
        return new JAXBElement<String>(_VERICODRicercaParametriCodFis_QNAME, String.class, VERICOD.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/VERICOD.xsd", name = "CarID", scope = VERICOD.Ricerca.Parametri.class)
    public JAXBElement<String> createVERICODRicercaParametriCarID(String value) {
        return new JAXBElement<String>(_VERICODRicercaParametriCarID_QNAME, String.class, VERICOD.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/VERICOD.xsd", name = "CodInd", scope = VERICOD.Ricerca.Parametri.class)
    public JAXBElement<String> createVERICODRicercaParametriCodInd(String value) {
        return new JAXBElement<String>(_VERICODRicercaParametriCodInd_QNAME, String.class, VERICOD.Ricerca.Parametri.class, value);
    }

}
