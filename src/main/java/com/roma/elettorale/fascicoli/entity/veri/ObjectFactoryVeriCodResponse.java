
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
public class ObjectFactoryVeriCodResponse {

    private final static QName _VERICODRESPONSEPersonaElencoSessoPersona_QNAME = new QName("", "SessoPersona");
    private final static QName _VERICODRESPONSEPersonaElencoNomePersona_QNAME = new QName("", "NomePersona");
    private final static QName _VERICODRESPONSEPersonaElencoCognomePersona_QNAME = new QName("", "CognomePersona");
    private final static QName _VERICODRESPONSEPersonaElencoDataDiNascitaPersona_QNAME = new QName("", "DataDiNascitaPersona");
    private final static QName _VERICODRESPONSEPersonaElencoCodiceFiscale_QNAME = new QName("", "CodiceFiscale");
    private final static QName _VERICODRESPONSEPersonaElencoCodiceIndiv_QNAME = new QName("", "CodiceIndiv");
    private final static QName _VERICODRESPONSEMessaggiLivello_QNAME = new QName("", "Livello");
    private final static QName _VERICODRESPONSEMessaggiDescrizione_QNAME = new QName("", "Descrizione");
    private final static QName _VERICODRESPONSEMessaggiCodice_QNAME = new QName("", "Codice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.roma.elettorale.fascicoli.entity.veri
     * 
     */
    public ObjectFactoryVeriCodResponse() {
    }

    /**
     * Create an instance of {@link VERICODRESPONSE }
     * 
     */
    public VERICODRESPONSE createVERICODRESPONSE() {
        return new VERICODRESPONSE();
    }

    /**
     * Create an instance of {@link VERICODRESPONSE.PersonaElenco }
     * 
     */
    public VERICODRESPONSE.PersonaElenco createVERICODRESPONSEPersonaElenco() {
        return new VERICODRESPONSE.PersonaElenco();
    }

    /**
     * Create an instance of {@link VERICODRESPONSE.Verifica }
     * 
     */
    public VERICODRESPONSE.Verifica createVERICODRESPONSEVerifica() {
        return new VERICODRESPONSE.Verifica();
    }

    /**
     * Create an instance of {@link VERICODRESPONSE.Messaggi }
     * 
     */
    public VERICODRESPONSE.Messaggi createVERICODRESPONSEMessaggi() {
        return new VERICODRESPONSE.Messaggi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SessoPersona", scope = VERICODRESPONSE.PersonaElenco.class)
    public JAXBElement<String> createVERICODRESPONSEPersonaElencoSessoPersona(String value) {
        return new JAXBElement<String>(_VERICODRESPONSEPersonaElencoSessoPersona_QNAME, String.class, VERICODRESPONSE.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NomePersona", scope = VERICODRESPONSE.PersonaElenco.class)
    public JAXBElement<String> createVERICODRESPONSEPersonaElencoNomePersona(String value) {
        return new JAXBElement<String>(_VERICODRESPONSEPersonaElencoNomePersona_QNAME, String.class, VERICODRESPONSE.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CognomePersona", scope = VERICODRESPONSE.PersonaElenco.class)
    public JAXBElement<String> createVERICODRESPONSEPersonaElencoCognomePersona(String value) {
        return new JAXBElement<String>(_VERICODRESPONSEPersonaElencoCognomePersona_QNAME, String.class, VERICODRESPONSE.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DataDiNascitaPersona", scope = VERICODRESPONSE.PersonaElenco.class)
    public JAXBElement<String> createVERICODRESPONSEPersonaElencoDataDiNascitaPersona(String value) {
        return new JAXBElement<String>(_VERICODRESPONSEPersonaElencoDataDiNascitaPersona_QNAME, String.class, VERICODRESPONSE.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceFiscale", scope = VERICODRESPONSE.PersonaElenco.class)
    public JAXBElement<String> createVERICODRESPONSEPersonaElencoCodiceFiscale(String value) {
        return new JAXBElement<String>(_VERICODRESPONSEPersonaElencoCodiceFiscale_QNAME, String.class, VERICODRESPONSE.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceIndiv", scope = VERICODRESPONSE.PersonaElenco.class)
    public JAXBElement<String> createVERICODRESPONSEPersonaElencoCodiceIndiv(String value) {
        return new JAXBElement<String>(_VERICODRESPONSEPersonaElencoCodiceIndiv_QNAME, String.class, VERICODRESPONSE.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Livello", scope = VERICODRESPONSE.Messaggi.class)
    public JAXBElement<String> createVERICODRESPONSEMessaggiLivello(String value) {
        return new JAXBElement<String>(_VERICODRESPONSEMessaggiLivello_QNAME, String.class, VERICODRESPONSE.Messaggi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Descrizione", scope = VERICODRESPONSE.Messaggi.class)
    public JAXBElement<String> createVERICODRESPONSEMessaggiDescrizione(String value) {
        return new JAXBElement<String>(_VERICODRESPONSEMessaggiDescrizione_QNAME, String.class, VERICODRESPONSE.Messaggi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Codice", scope = VERICODRESPONSE.Messaggi.class)
    public JAXBElement<String> createVERICODRESPONSEMessaggiCodice(String value) {
        return new JAXBElement<String>(_VERICODRESPONSEMessaggiCodice_QNAME, String.class, VERICODRESPONSE.Messaggi.class, value);
    }

}
