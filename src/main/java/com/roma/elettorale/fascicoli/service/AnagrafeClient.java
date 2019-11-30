package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.entity.anagrafe.*;
import com.roma.elettorale.fascicoli.entity.veri.Ricerca;
import com.roma.elettorale.fascicoli.entity.veri.VERICOD;
import com.roma.elettorale.fascicoli.entity.veri.VERICODRESPONSE;
import com.roma.elettorale.fascicoli.entity.veri.VERIRIC;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.w3c.dom.Document;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static java.lang.System.out;

@Component
public class AnagrafeClient extends WebServiceGatewaySupport {


    Logger logger = LoggerFactory.getLogger(AnagrafeClient.class);

    @Autowired
    Environment env;


    @Autowired
    TransformationFile ttransformation;


    public String GetVeriByCodFis(String codicefiscale) {
        String xmlRisposta = "";
        try {
            VERICOD.Ricerca.Parametri parametri = new VERICOD.Ricerca.Parametri();
            ObjectFactory factory = new ObjectFactory();
            VERICOD v = new VERICOD();
            VERICOD.Ricerca ricerca = new VERICOD.Ricerca();
            JAXBElement<String> codElement = new JAXBElement<String>(new QName("CodFis"),
                    String.class, codicefiscale);
            parametri.setCodFis(codElement);
            ricerca.setParametri(parametri);
            ricerca.setTipoRicerca("2");
            ricerca.setTipoVerifica("VANA");
            ricerca.setFiltroPersone("");
            v.setRicerca(ricerca);
            String verifica = ttransformation.jaxbObjectToXMLVericod(v);
            verifica += "#";
            String servizio = env.getProperty("servizioveri");
            xmlRisposta = callMapper(verifica, servizio);
        } catch (Exception ex) {
            logger.error("ERR_33" + ex.getMessage());
        }
        return xmlRisposta;
    }

    public String GetVeri(String codiceindividuale) {
        String xmlRisposta = "";
        try {

            VERICOD.Ricerca.Parametri parametri = new VERICOD.Ricerca.Parametri();
            ObjectFactory factory = new ObjectFactory();
            VERICOD v = new VERICOD();
            VERICOD.Ricerca ricerca = new VERICOD.Ricerca();
            JAXBElement<String> codElement = new JAXBElement<String>(new QName("CodInd"),
                    String.class, codiceindividuale);
            // factory.createBasePersonaAnagCodiceIndiv(codiceindividuale);
            parametri.setCodInd(codElement);
            ricerca.setParametri(parametri);
            ricerca.setTipoRicerca("1");
            ricerca.setTipoVerifica("VANA");
            ricerca.setFiltroPersone("");
            v.setRicerca(ricerca);
            String verifica = ttransformation.jaxbObjectToXMLVericod(v);
            verifica += "#";
            String servizio = env.getProperty("servizioveri");
            xmlRisposta = callMapper(verifica, servizio);
            //  doc = ttransformation.convertStringToXMLDocument(xmlRisposta.replace("#", " "));
        } catch (Exception ex) {
            logger.error("ERR_13" + ex.getMessage());
        }
        return xmlRisposta;


    }


    public String callMapper(String verifica, String servizio) throws MalformedURLException {
        String xmlRisposta = "";
        String dipartimento = env.getProperty("dipartimento");
        String password = env.getProperty("password");
        String utente = env.getProperty("utente");
        String remotehost = env.getProperty("remotehost");
        String servicename = env.getProperty("servicename");
        String enviroment = env.getProperty("enviroment");
        URL urlAnagrafe = new URL(env.getProperty("servizioanagrafe"));
        IntegrationSmart serviceAnagrafe = new IntegrationSmart(urlAnagrafe);
        Holder<String> datiMapper = new Holder<>();
        Holder<Integer> tpur = new Holder<Integer>();
        Holder<Boolean> callMapperWebMethodResult = new Holder<Boolean>();
        serviceAnagrafe.getIntegrationSmartSoap().callMapperWebMethod(utente, dipartimento, password,
                servizio, enviroment, verifica, remotehost, servicename,
                callMapperWebMethodResult,
                datiMapper, tpur);
        xmlRisposta = (String) datiMapper.value;
        return xmlRisposta;
    }

    public String GetEstratto(RichiestaEstratto richiestaEstratto) {
        String xmlRisposta = "";
        try {
            String richiesta = ttransformation.jaxbRichiestaEstrattoToXML(richiestaEstratto);
            richiesta += "#";
            String servizio = env.getProperty("servizioestratto");
            xmlRisposta = callMapper(richiesta, servizio);
        } catch (Exception ex) {
            logger.error("ERR_14" + ex.getMessage());
        }
        return xmlRisposta;
    }

    public String GetGP25(Document doc) {
        String servizio = env.getProperty("serviziogp25");
        String xmlRisposta = "";
        try {
            String richiesta = ttransformation.convertDocumentToString(doc);
            xmlRisposta = callMapper(richiesta, servizio);
        } catch (Exception ex) {
            logger.error("ERR_34" + ex.getMessage());
        }
        return xmlRisposta;
    }

    public String GetVeriByDatiAnag(String nome, String cognome) {

        String xmlRisposta = "";
        try {
            VERIRIC.Ricerca ricerca = new VERIRIC.Ricerca();
            ricerca.setDa("1");
            ricerca.setPer("10");
            ricerca.setTipoRicerca("ANAG_PARZ");
            ricerca.setFiltroPersone("TUTTI");
            VERIRIC.Ricerca.Parametri parametri = new VERIRIC.Ricerca.Parametri();
            String annoda = env.getProperty("annoda");
            JAXBElement<String> stringAnnoda = new JAXBElement<String>(new QName("annoDa"),
                    String.class, annoda);
            stringAnnoda.setValue(annoda);
            LocalDateTime l = LocalDateTime.now().minusYears(16);
            Integer annoa = l.getYear();
            JAXBElement<String> stringAnnoa = new JAXBElement<String>(new QName("annoA"),
                    String.class, annoa.toString());
            parametri.setAnnoA(stringAnnoa);
            parametri.setAnnoDa(stringAnnoda);
            JAXBElement<String> nomeString = new JAXBElement<String>(new QName("nomePersona"),
                    String.class, nome.toString());
            parametri.setNomePersona(nomeString);
            JAXBElement<String> cognomeString = new JAXBElement<String>(new QName("cognomePersona"),
                    String.class, cognome.toString());
            parametri.setCognomePersona(cognomeString);
            ArrayList<VERIRIC.Ricerca.Parametri> lparametri = new ArrayList<VERIRIC.Ricerca.Parametri>();
            lparametri.add(parametri);
            ricerca.setParametri(lparametri);
            VERIRIC veriric = new VERIRIC();
            veriric.setRicerca(ricerca);
            String verifica = ttransformation.jaxbObjectToXMLVeriric(veriric);
            verifica += "#";
            String servizio = env.getProperty("servizioeveriric");
            xmlRisposta = callMapper(verifica, servizio);
        } catch (Exception ex) {
            logger.error("ERR_34" + ex.getMessage());
        }
        return xmlRisposta;
    }
}
