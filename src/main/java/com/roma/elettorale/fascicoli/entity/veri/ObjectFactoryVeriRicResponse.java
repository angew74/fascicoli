
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
public class ObjectFactoryVeriRicResponse {

    private final static QName _VERIRICRESPMessaggiLivello_QNAME = new QName("", "Livello");
    private final static QName _VERIRICRESPMessaggiDescrizione_QNAME = new QName("", "Descrizione");
    private final static QName _VERIRICRESPMessaggiCodice_QNAME = new QName("", "Codice");
    private final static QName _VERIRICRESPElencoPersonaElencoCodiceComuneNascita_QNAME = new QName("", "CodiceComuneNascita");
    private final static QName _VERIRICRESPElencoPersonaElencoComuneNascita_QNAME = new QName("", "ComuneNascita");
    private final static QName _VERIRICRESPElencoPersonaElencoCognomePersona_QNAME = new QName("", "CognomePersona");
    private final static QName _VERIRICRESPElencoPersonaElencoCodiceFiscale_QNAME = new QName("", "CodiceFiscale");
    private final static QName _VERIRICRESPElencoPersonaElencoNumeroPratica_QNAME = new QName("", "NumeroPratica");
    private final static QName _VERIRICRESPElencoPersonaElencoCodiceCittadinanza_QNAME = new QName("", "CodiceCittadinanza");
    private final static QName _VERIRICRESPElencoPersonaElencoSessoPersona_QNAME = new QName("", "SessoPersona");
    private final static QName _VERIRICRESPElencoPersonaElencoFlagVivoResidente_QNAME = new QName("", "FlagVivoResidente");
    private final static QName _VERIRICRESPElencoPersonaElencoAnnoPratica_QNAME = new QName("", "AnnoPratica");
    private final static QName _VERIRICRESPElencoPersonaElencoAllaData_QNAME = new QName("", "AllaData");
    private final static QName _VERIRICRESPElencoPersonaElencoNomePersona_QNAME = new QName("", "NomePersona");
    private final static QName _VERIRICRESPElencoPersonaElencoDataDiNascitaPersona_QNAME = new QName("", "DataDiNascitaPersona");
    private final static QName _VERIRICRESPElencoPersonaElencoCodiceFamiglia_QNAME = new QName("", "CodiceFamiglia");
    private final static QName _VERIRICRESPElencoPersonaElencoCodiceIndiv_QNAME = new QName("", "CodiceIndiv");
    private final static QName _VERIRICRESPElencoPersonaElencoCittadinanza_QNAME = new QName("", "Cittadinanza");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.roma.elettorale.fascicoli.entity.veri
     * 
     */
    public ObjectFactoryVeriRicResponse() {
    }

    /**
     * Create an instance of {@link VERIRICRESP }
     * 
     */
    public VERIRICRESP createVERIRICRESP() {
        return new VERIRICRESP();
    }

    /**
     * Create an instance of {@link VERIRICRESP.Elenco }
     * 
     */
    public VERIRICRESP.Elenco createVERIRICRESPElenco() {
        return new VERIRICRESP.Elenco();
    }

    /**
     * Create an instance of {@link VERIRICRESP.Messaggi }
     * 
     */
    public VERIRICRESP.Messaggi createVERIRICRESPMessaggi() {
        return new VERIRICRESP.Messaggi();
    }

    /**
     * Create an instance of {@link VERIRICRESP.Elenco.PersonaElenco }
     * 
     */
    public VERIRICRESP.Elenco.PersonaElenco createVERIRICRESPElencoPersonaElenco() {
        return new VERIRICRESP.Elenco.PersonaElenco();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Livello", scope = VERIRICRESP.Messaggi.class)
    public JAXBElement<String> createVERIRICRESPMessaggiLivello(String value) {
        return new JAXBElement<String>(_VERIRICRESPMessaggiLivello_QNAME, String.class, VERIRICRESP.Messaggi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Descrizione", scope = VERIRICRESP.Messaggi.class)
    public JAXBElement<String> createVERIRICRESPMessaggiDescrizione(String value) {
        return new JAXBElement<String>(_VERIRICRESPMessaggiDescrizione_QNAME, String.class, VERIRICRESP.Messaggi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Codice", scope = VERIRICRESP.Messaggi.class)
    public JAXBElement<String> createVERIRICRESPMessaggiCodice(String value) {
        return new JAXBElement<String>(_VERIRICRESPMessaggiCodice_QNAME, String.class, VERIRICRESP.Messaggi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceComuneNascita", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoCodiceComuneNascita(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoCodiceComuneNascita_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComuneNascita", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoComuneNascita(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoComuneNascita_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Descrizione", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoDescrizione(String value) {
        return new JAXBElement<String>(_VERIRICRESPMessaggiDescrizione_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CognomePersona", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoCognomePersona(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoCognomePersona_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceFiscale", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoCodiceFiscale(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoCodiceFiscale_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumeroPratica", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoNumeroPratica(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoNumeroPratica_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceCittadinanza", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoCodiceCittadinanza(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoCodiceCittadinanza_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SessoPersona", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoSessoPersona(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoSessoPersona_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FlagVivoResidente", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoFlagVivoResidente(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoFlagVivoResidente_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AnnoPratica", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoAnnoPratica(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoAnnoPratica_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AllaData", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoAllaData(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoAllaData_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NomePersona", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoNomePersona(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoNomePersona_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DataDiNascitaPersona", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoDataDiNascitaPersona(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoDataDiNascitaPersona_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceFamiglia", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoCodiceFamiglia(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoCodiceFamiglia_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceIndiv", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoCodiceIndiv(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoCodiceIndiv_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cittadinanza", scope = VERIRICRESP.Elenco.PersonaElenco.class)
    public JAXBElement<String> createVERIRICRESPElencoPersonaElencoCittadinanza(String value) {
        return new JAXBElement<String>(_VERIRICRESPElencoPersonaElencoCittadinanza_QNAME, String.class, VERIRICRESP.Elenco.PersonaElenco.class, value);
    }

}
