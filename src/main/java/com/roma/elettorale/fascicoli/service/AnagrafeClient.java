package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.entity.anagrafe.CallMapperWebMethod;
import com.roma.elettorale.fascicoli.entity.anagrafe.CallMapperWebMethodResponse;
import com.roma.elettorale.fascicoli.entity.anagrafe.ObjectFactory;
import com.roma.elettorale.fascicoli.entity.anagrafe.RichiestaEstratto;
import com.roma.elettorale.fascicoli.entity.veri.Ricerca;
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

@Component
public class AnagrafeClient extends WebServiceGatewaySupport {


    Logger logger = LoggerFactory.getLogger(ManageFiles.class);

    @Autowired
    Environment env;



    @Autowired
    TransformationFile ttransformation;

    public Document GetVeri(String codiceindividuale)
    {
        String service = env.getProperty("servizioveri");
        CallMapperWebMethod callMapperWebMethod = new CallMapperWebMethod();
        callMapperWebMethod.setDept(env.getProperty("dipartimento"));
        callMapperWebMethod.setPWD(env.getProperty("password"));
        callMapperWebMethod.setLogon(env.getProperty("utente"));
        callMapperWebMethod.setRemotHost(env.getProperty("hostname"));
        callMapperWebMethod.setServiceName(env.getProperty("hostserver"));
        callMapperWebMethod.setEnv(env.getProperty("enviroment"));
        callMapperWebMethod.setServizio(env.getProperty("servizio"));
        Ricerca ricerca = new Ricerca();
        Ricerca.Parametri parametri = new Ricerca.Parametri();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> codElement = new JAXBElement<String>(new QName("http://tempuri.org/VERICOD.xsd"),
                String.class, codiceindividuale);
       // factory.createBasePersonaAnagCodiceIndiv(codiceindividuale);
        parametri.setCodInd(codElement);
        ricerca.setParametri(parametri);
        ricerca.setTipoRicerca("1");
        ricerca.setTipoVerifica("VANA");
        ricerca.setFiltroPersone("");
       String verifica = ttransformation.jaxbObjectToXML(ricerca);
        callMapperWebMethod.setMAPPERES(verifica);
        CallMapperWebMethodResponse response = (CallMapperWebMethodResponse) getWebServiceTemplate()
                .marshalSendAndReceive(service, callMapperWebMethod);

        String xmlRisposta=  response.getDati();
        Document doc =  ttransformation.convertStringToXMLDocument(xmlRisposta);
        return doc;




    }

    public Document GetEstratto(RichiestaEstratto richiestaEstratto)
    {
        String service = env.getProperty("servizioveri");
        CallMapperWebMethod callMapperWebMethod = new CallMapperWebMethod();
        callMapperWebMethod.setDept(env.getProperty("dipartimento"));
        callMapperWebMethod.setPWD(env.getProperty("password"));
        callMapperWebMethod.setLogon(env.getProperty("utente"));
        callMapperWebMethod.setRemotHost(env.getProperty("hostname"));
        callMapperWebMethod.setServiceName(env.getProperty("hostserver"));
        callMapperWebMethod.setEnv(env.getProperty("enviroment"));
        callMapperWebMethod.setServizio(env.getProperty("servizio"));
        String ricerca = ttransformation.jaxbRichiestaEstrattoToXML(richiestaEstratto);
        callMapperWebMethod.setMAPPERES(ricerca);
        CallMapperWebMethodResponse response = (CallMapperWebMethodResponse) getWebServiceTemplate()
                .marshalSendAndReceive(service, callMapperWebMethod);

        String xmlRisposta=  response.getDati();
        Document doc =  ttransformation.convertStringToXMLDocument(xmlRisposta);
        return doc;
    }
}
