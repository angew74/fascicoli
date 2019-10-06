package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.configuration.SoapClientPAPConfig;
import com.roma.elettorale.fascicoli.entity.pap.ObjectFactory;
import com.roma.elettorale.fascicoli.entity.pap.VerificaAnagrafica;
import com.roma.elettorale.fascicoli.entity.pap.VerificaAnagraficaResponse;
import com.roma.elettorale.fascicoli.extensions.NullHostnameVerifier;
import com.roma.elettorale.fascicoli.extensions.UnTrustworthyTrustManager;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import com.roma.elettorale.fascicoli.helpers.enumerators.tipointerrogazione;
import org.apache.tools.ant.taskdefs.Javadoc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapElement;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import java.util.TimeZone;
import java.util.UUID;


@Component
public class PortaApplicativaClient {

    Logger logger = LoggerFactory.getLogger(PortaApplicativaClient.class);

    @Autowired
    Environment env;

    long TICKS_AT_EPOCH = 621355968000000000L;

    private String BRAGHET = "\u003C";

    private String CLOSEBRAGHET = "\u003E";

    @Autowired
    TransformationFile transformationFile;


    public VerificaAnagraficaResponse getService(String servizio, String codiceIndividuale, String livello) {
        VerificaAnagraficaResponse vana = new VerificaAnagraficaResponse();
        try {
            ObjectFactory objectFactory = new ObjectFactory();
            String descrUrlPAPService = env.getProperty("papservice");
            SoapClientPAPConfig soapClientCertiConfig = new SoapClientPAPConfig();
            WebServiceTemplate webServiceTemplate = soapClientCertiConfig.webServiceTemplate();
            webServiceTemplate.setDefaultUri(descrUrlPAPService);
            VerificaAnagrafica vanarequest = objectFactory.createVerificaAnagrafica();
            vanarequest.setCodiceIndividuale(codiceIndividuale);
            Short tipo = (short) tipointerrogazione.CODICE_INDIVIDUALE.ordinal();
            Short livelloShort = Short.parseShort(livello);
            vanarequest.setTipoInterr(tipo);
            vanarequest.setServiceLevel(livelloShort);
            HostnameVerifier verifier = new NullHostnameVerifier();
            HttpsUrlConnectionMessageSender sender = new HttpsUrlConnectionMessageSender();
            sender.setHostnameVerifier(verifier);
            sender.setTrustManagers(new TrustManager[]{new UnTrustworthyTrustManager()});
            webServiceTemplate.setMessageSender(sender);
            vana = (VerificaAnagraficaResponse) webServiceTemplate.marshalSendAndReceive(vanarequest, new WebServiceMessageCallback() {
                public void doWithMessage(WebServiceMessage message) throws TransformerException {
                    SaajSoapMessage soapMessage = (SaajSoapMessage) message;
                    soapMessage.setSoapAction("http://servizi.comune.roma.it/verificheanagrafiche/VerificaAnagrafica");
                    SoapHeaderElement messageId = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "MessageID", "wsa"));
                    UUID uuid = UUID.randomUUID();
                    messageId.setText("uuid:" + uuid.toString());
                    SoapHeaderElement to = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "To", "wsa"));
                    to.setText(env.getProperty("papservice"));
                    SoapHeaderElement action = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "Action", "wsa"));
                    action.setText("http://servizi.comune.roma.it/verificheanagrafiche/VerificaAnagrafica");

                   // SoapHeaderElement ReplyTo = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "ReplyTo", "wsa"));
                 //   SoapHeaderElement from = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "From", "wsa"));
                  //  from.setMustUnderstand(false);
                    QName qname = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "wsu");
              //       from.addAttribute(qname,"Id:" +uuid.toString());
                 //   ReplyTo.addAttribute(qname,"Id:" +uuid.toString());
                    SoapHeaderElement SecurityTokenReference = soapMessage.getSoapHeader().addHeaderElement(new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "SecurityTokenReference", "wsse"));
                  //  QName qname = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "wsu");
                    SecurityTokenReference.addAttribute(qname,"Id:" +uuid.toString());
                    String tick = String.valueOf((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) * 10000 + TICKS_AT_EPOCH);
                   //  SoapHeaderElement logHeader = soapMessage.getSoapHeader().addHeaderElement(new QName("http://servizi.comune.roma.it/verificheanagrafiche", "LogHeader", "ns1"));
                    SoapHeaderElement logHeader =  soapMessage.getSoapHeader().addHeaderElement(new QName("http://servizi.comune.roma.it/verificheanagrafiche", "LogHeader", "NS1"));
                 //   logHeader.setText("\u003C0NS1:LogGuid/>AfQRXxbXD8Z4UosSBYNXYJrB/</NS1:LogGuid/>");
                    // String logg = "&#60;ns1:LogGuid&#62;AfQRXxbXD8Z4UosSBYNXYJrB/V0=&#60;/ns1:LogGuid&#62;";
                   //  String logg = "&lt;ns1:LogGuid&gt;AfQRXxbXD8Z4UosSBYNXYJrB/V0=&lt;/ns1:LogGuid&gt;";
                   // logHeader.setText(logg);

                     logHeader.setText(BRAGHET+"ns1:LogGuid" + CLOSEBRAGHET + tick + BRAGHET +"/ns1:LogGuid" + CLOSEBRAGHET);
                    // logHeader.setLogGuid(tick);
                    //     SoapHeaderElement logguid = soapMessage.getSoapHeader().addHeaderElement(new QName("http://servizi.comune.roma.it/verificheanagrafiche", "LogHeader", "ns1"));

                    //   logHeader.setLogGuid(logguid);
                    // String doc = transformationFile.convertDocumentToString(transformationFile.convertClassToDocument(logHeader));

                }
            });

        } catch (Exception ex) {
            logger.error("ERR_23 dettagli: " + ex.getMessage() + " " + ex.getCause());
            ex.printStackTrace();

        }
        return vana;
    }
}
