
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
public class ObjectFactoryVeriRic {

    private final static QName _VERIRICRicercaParametriIntervalloDa_QNAME = new QName("", "IntervalloDa");
    private final static QName _VERIRICRicercaParametriComuneNas_QNAME = new QName("", "ComuneNas");
    private final static QName _VERIRICRicercaParametriAnnoDa_QNAME = new QName("", "AnnoDa");
    private final static QName _VERIRICRicercaParametriMadre_QNAME = new QName("", "Madre");
    private final static QName _VERIRICRicercaParametriCodiceFiscale_QNAME = new QName("", "CodiceFiscale");
    private final static QName _VERIRICRicercaParametriLotto_QNAME = new QName("", "Lotto");
    private final static QName _VERIRICRicercaParametriLettera_QNAME = new QName("", "Lettera");
    private final static QName _VERIRICRicercaParametriIntervalloA_QNAME = new QName("", "IntervalloA");
    private final static QName _VERIRICRicercaParametriInterno_QNAME = new QName("", "Interno");
    private final static QName _VERIRICRicercaParametriStrada_QNAME = new QName("", "Strada");
    private final static QName _VERIRICRicercaParametriPalazzina_QNAME = new QName("", "Palazzina");
    private final static QName _VERIRICRicercaParametriKilometro_QNAME = new QName("", "Kilometro");
    private final static QName _VERIRICRicercaParametriCodiceFamiglia_QNAME = new QName("", "CodiceFamiglia");
    private final static QName _VERIRICRicercaParametriSituazioneAllaData_QNAME = new QName("", "SituazioneAllaData");
    private final static QName _VERIRICRicercaParametriScala_QNAME = new QName("", "Scala");
    private final static QName _VERIRICRicercaParametriCognomePersona_QNAME = new QName("", "CognomePersona");
    private final static QName _VERIRICRicercaParametriTipoCivico_QNAME = new QName("", "TipoCivico");
    private final static QName _VERIRICRicercaParametriCodiceStrada_QNAME = new QName("", "CodiceStrada");
    private final static QName _VERIRICRicercaParametriSedime_QNAME = new QName("", "Sedime");
    private final static QName _VERIRICRicercaParametriPiano_QNAME = new QName("", "Piano");
    private final static QName _VERIRICRicercaParametriPadre_QNAME = new QName("", "Padre");
    private final static QName _VERIRICRicercaParametriAnnoA_QNAME = new QName("", "AnnoA");
    private final static QName _VERIRICRicercaParametriSessoPersona_QNAME = new QName("", "SessoPersona");
    private final static QName _VERIRICRicercaParametriNomePersona_QNAME = new QName("", "NomePersona");
    private final static QName _VERIRICRicercaParametriDataDiNascitaPersona_QNAME = new QName("", "DataDiNascitaPersona");
    private final static QName _VERIRICRicercaParametriCodiceIndiv_QNAME = new QName("", "CodiceIndiv");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.roma.elettorale.fascicoli.entity.veri
     * 
     */
    public ObjectFactoryVeriRic() {
    }

    /**
     * Create an instance of {@link VERIRIC }
     * 
     */
    public VERIRIC createVERIRIC() {
        return new VERIRIC();
    }

    /**
     * Create an instance of {@link VERIRIC.Ricerca }
     * 
     */
    public VERIRIC.Ricerca createVERIRICRicerca() {
        return new VERIRIC.Ricerca();
    }

    /**
     * Create an instance of {@link VERIRIC.Ricerca.Parametri }
     * 
     */
    public VERIRIC.Ricerca.Parametri createVERIRICRicercaParametri() {
        return new VERIRIC.Ricerca.Parametri();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IntervalloDa", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriIntervalloDa(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriIntervalloDa_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComuneNas", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriComuneNas(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriComuneNas_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AnnoDa", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriAnnoDa(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriAnnoDa_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Madre", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriMadre(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriMadre_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceFiscale", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriCodiceFiscale(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriCodiceFiscale_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Lotto", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriLotto(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriLotto_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Lettera", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriLettera(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriLettera_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IntervalloA", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriIntervalloA(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriIntervalloA_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Interno", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriInterno(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriInterno_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Strada", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriStrada(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriStrada_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Palazzina", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriPalazzina(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriPalazzina_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Kilometro", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriKilometro(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriKilometro_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceFamiglia", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriCodiceFamiglia(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriCodiceFamiglia_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SituazioneAllaData", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriSituazioneAllaData(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriSituazioneAllaData_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Scala", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriScala(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriScala_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CognomePersona", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriCognomePersona(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriCognomePersona_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TipoCivico", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriTipoCivico(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriTipoCivico_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceStrada", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriCodiceStrada(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriCodiceStrada_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Sedime", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriSedime(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriSedime_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Piano", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriPiano(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriPiano_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Padre", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriPadre(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriPadre_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AnnoA", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriAnnoA(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriAnnoA_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SessoPersona", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriSessoPersona(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriSessoPersona_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NomePersona", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriNomePersona(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriNomePersona_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DataDiNascitaPersona", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriDataDiNascitaPersona(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriDataDiNascitaPersona_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodiceIndiv", scope = VERIRIC.Ricerca.Parametri.class)
    public JAXBElement<String> createVERIRICRicercaParametriCodiceIndiv(String value) {
        return new JAXBElement<String>(_VERIRICRicercaParametriCodiceIndiv_QNAME, String.class, VERIRIC.Ricerca.Parametri.class, value);
    }

}
