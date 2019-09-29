package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.entity.anagrafe.*;
import com.roma.elettorale.fascicoli.entity.veri.Ricerca;
import com.roma.elettorale.fascicoli.entity.veri.VERICOD;
import com.roma.elettorale.fascicoli.entity.veri.VERICODRESPONSE;
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
import java.net.URL;

import static java.lang.System.out;

@Component
public class AnagrafeClient extends WebServiceGatewaySupport {


    Logger logger = LoggerFactory.getLogger(ManageFiles.class);

    @Autowired
    Environment env;


    @Autowired
    TransformationFile ttransformation;

    public String GetVeri(String codiceindividuale) {
        String xmlRisposta = "";
        try {
            String dipartimento = env.getProperty("dipartimento");
            String password = env.getProperty("password");
            String utente = env.getProperty("utente");
            String remotehost = env.getProperty("remotehost");
            String servicename = env.getProperty("servicename");
            String enviroment = env.getProperty("enviroment");
            String servizio = env.getProperty("servizioveri");
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
            //  doc = ttransformation.convertStringToXMLDocument(xmlRisposta.replace("#", " "));
        } catch (Exception ex) {
            logger.error("ERR_13" + ex.getMessage());
        }
        return xmlRisposta;


    }

    public String GetEstratto(RichiestaEstratto richiestaEstratto) {
        String xmlRisposta = "";
        try {
            String dipartimento = env.getProperty("dipartimento");
            String password = env.getProperty("password");
            String utente = env.getProperty("utente");
            String remotehost = env.getProperty("remotehost");
            String servicename = env.getProperty("servicename");
            String enviroment = env.getProperty("enviroment");
            String servizio = env.getProperty("servizioestratto");
            String richiesta = ttransformation.jaxbRichiestaEstrattoToXML(richiestaEstratto);
            richiesta += "#";
            URL urlAnagrafe = new URL(env.getProperty("servizioanagrafe"));
            IntegrationSmart serviceAnagrafe = new IntegrationSmart(urlAnagrafe);
            Holder<String> datiMapper = new Holder<>();
            Holder<Integer> tpur = new Holder<Integer>();
            Holder<Boolean> callMapperWebMethodResult = new Holder<Boolean>();
            serviceAnagrafe.getIntegrationSmartSoap().callMapperWebMethod(utente, dipartimento, password,
                    servizio, enviroment, richiesta, remotehost, servicename,
                    callMapperWebMethodResult,
                    datiMapper, tpur);
            xmlRisposta = (String) datiMapper.value;
        } catch (Exception ex) {
            logger.error("ERR_14" + ex.getMessage());
        }
        return xmlRisposta;
    }
}
