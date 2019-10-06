package com.roma.elettorale.fascicoli.service;


import com.roma.elettorale.fascicoli.configuration.SoapClientCertiConfig;
import com.roma.elettorale.fascicoli.entity.certi.*;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.saaj.SaajSoapMessage;


import javax.xml.namespace.QName;
import javax.xml.transform.TransformerConfigurationException;
import java.util.*;


@Component
public class CertificatiClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(CertificatiClient.class);

    @Autowired
    Environment env;

    @Autowired
    PasswordCallBack passwordCallBack;

    @Autowired
    TransformationFile transformationFile;


    public CertificatoType GeneraCertificato(String cfRichiedente, String cfIntestatario, String iprichiedente, String codiceCertificato, StringBuilder esito) {
        String FixedClientId = env.getProperty("clientid");
        CertificatoType certificatoType = new CertificatoType();
        try {
            String idFlusso = ExecuteInizializza(FixedClientId, cfRichiedente, cfIntestatario, iprichiedente, esito);
            String iduso = env.getProperty("idtipouso");
            if (esito.toString().equals("")) {
                certificatoType = ExecuteVerificaAndRichiestaSingola(FixedClientId, cfRichiedente, iprichiedente, cfIntestatario, idFlusso, codiceCertificato, iduso, "", esito);
            } else {
                return certificatoType;
            }
        } catch (Exception ex) {
            if (esito.equals("")) {
                logger.error("ERR_01: " + ex.getMessage());
                esito.append("ERR_01: " + ex.getMessage());
            }
        }
        return certificatoType;
    }

    private String ExecuteInizializza(String idClient, String cfRichiedente, String cfIntestatario, String ipRichiedente, StringBuilder esito) {
        String idFlusso = "";
        boolean intestatarioTrovato = false;
        try {

            String descrUrlCertiService = env.getProperty("certificatiservice");
            ObjectFactory objectFactory = new ObjectFactory();
            RichiestaCredenzialiResponse credenzialiTypeResponse = objectFactory.createRichiestaCredenzialiResponse();
            TransactionRequestType transactionRequestType = objectFactory.createTransactionRequestType();
            transactionRequestType.setIdTransazione("");
            transactionRequestType.setCodiceFiscaleRichiedente(cfRichiedente);
            transactionRequestType.setCodiceFiscaleIntestatario(cfIntestatario);
            transactionRequestType.setSistema(idClient);
            transactionRequestType.setIdPod("");
            SoapClientCertiConfig soapClientCertiConfig = new SoapClientCertiConfig();
            WebServiceTemplate webServiceTemplate = soapClientCertiConfig.webServiceTemplate();
            webServiceTemplate.setDefaultUri(descrUrlCertiService);
            RichiestaCredenziali richiestaCredenziali = objectFactory.createRichiestaCredenziali();
            richiestaCredenziali.setTransactionRequest(transactionRequestType);
            credenzialiTypeResponse = (RichiestaCredenzialiResponse) webServiceTemplate.marshalSendAndReceive(richiestaCredenziali, new WebServiceMessageCallback() {
                public void doWithMessage(WebServiceMessage message) {
                    SaajSoapMessage soapMessage = (SaajSoapMessage) message;
                    soapMessage.setSoapAction("http://www.comune.roma.it/certificati/richiestaCredenziali");
                    SoapHeaderElement messageId = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "MessageID", "wsa"));
                    UUID uuid = UUID.randomUUID();
                    messageId.setText("uuid:" + uuid.toString());
                    SoapHeaderElement to = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "To", "wsa"));
                    to.setText("http://10.173.9.48/CertiWS/CertiService.asmx");
                    SoapHeaderElement action = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "Action", "wsa"));
                    action.setText("http://www.comune.roma.it/certificati/richiestaCredenziali");
                    final String mesPrefix = "wsa";
                    final String mesNamespaceUri = "http://schemas.xmlsoap.org/ws/2004/03/addressing";

                }
            });
            CredenzialiType credenzialiType = credenzialiTypeResponse.getCredenziali();
            if (credenzialiType == null && credenzialiType.getIdFlusso() == null)
                idFlusso = "";
            else
                idFlusso = credenzialiType.getIdFlusso();
        } catch (TransformerConfigurationException e) {
            logger.error("ERR_18: " + e.getMessage());
            esito.append("ERR_18: " + e.getMessage());
            return idFlusso;
        } catch (Exception ex) {
            logger.error("ERR_18: " + ex.getMessage());
            esito.append("ERR_18: " + ex.getMessage());
            return idFlusso;
        }
        return idFlusso;
    }

    private CertificatoType ExecuteVerificaAndRichiestaSingola(String idClient, String cfRichiedente, String ipRichiedente,
                                                               String cfIntestatario, String idFlusso, String idPublicCertificato, String idUso, String motivoEsenzione,StringBuilder esito) {
        InfoCertificatoType[] resp = null;
        ObjectFactory objectFactory = new ObjectFactory();
        CertificatoType ritorno = new CertificatoType();
        List<InfoCertificatoType> rifs = new ArrayList<InfoCertificatoType>();
        InfoCertificatoType rif = new InfoCertificatoType();
        rif.setIdNomeCertificato(idPublicCertificato);
        rif.setIdUso(idUso);
        rif.setIdMotivoEsenzione(motivoEsenzione);
        rifs.add(rif);
        CredenzialiType credenziali = new CredenzialiType();
        credenziali.setIdFlusso(idFlusso);
        TransactionRequestType transactionRequestType = new TransactionRequestType();
        credenziali.setTransactionData(transactionRequestType);
        TransactionRequestType transactionData = new TransactionRequestType();
        transactionData.setSistema(idClient);
        transactionData.setCodiceFiscaleIntestatario(cfIntestatario);
        transactionData.setCodiceFiscaleRichiedente(cfRichiedente);
        transactionData.setIdPod("");
        transactionData.setIdTransazione("");
        credenziali.setTransactionData(transactionData);
        VerificaEmettibilita verificaEmettibilita = objectFactory.createVerificaEmettibilita();
        verificaEmettibilita.setCredenziali(credenziali);
        ArrayOfInfoCertificatoType arrayOfInfoCertificatoType =objectFactory.createArrayOfInfoCertificatoType();
        arrayOfInfoCertificatoType.setCertificato(rifs);
        verificaEmettibilita.setCertificati(arrayOfInfoCertificatoType);
        try {
            String urlCertiService = env.getProperty("certificatiservice");
            SoapClientCertiConfig soapClientCertiConfig = new SoapClientCertiConfig();
            WebServiceTemplate webServiceTemplate = soapClientCertiConfig.webServiceTemplate();
            webServiceTemplate.setDefaultUri(urlCertiService);
            VerificaEmettibilitaResponse verificaEmettibilitaResponse = (VerificaEmettibilitaResponse) webServiceTemplate.marshalSendAndReceive(verificaEmettibilita, new WebServiceMessageCallback() {
                public void doWithMessage(WebServiceMessage message) {
                    SaajSoapMessage soapMessage = (SaajSoapMessage) message;
                    soapMessage.setSoapAction("http://www.comune.roma.it/certificati/verificaEmettibilita");
                    SoapHeaderElement messageId = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "MessageID", "wsa"));
                    UUID uuid = UUID.randomUUID();
                    messageId.setText("uuid:" + uuid.toString());
                    SoapHeaderElement to = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "To", "wsa"));
                    to.setText(env.getProperty("certificatiservice"));
                    SoapHeaderElement action = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "Action", "wsa"));
                    action.setText("http://www.comune.roma.it/certificati/verificaEmettibilita");
                    final String mesPrefix = "wsa";
                    final String mesNamespaceUri = "http://schemas.xmlsoap.org/ws/2004/03/addressing";
                }
            });
            // CertiService certiService = new CertiService(urlCertiService);
            // certiService.getComuneCertificatiBinding().verificaEmettibilita(credenziali, holderInfoCertificatoType);
          //  arrayOfInfoCertificatoType = (ArrayOfInfoCertificatoType) holderInfoCertificatoType.value;
            arrayOfInfoCertificatoType = verificaEmettibilitaResponse.getCertificati();
            InfoCertificatoType infoCertificatoType = arrayOfInfoCertificatoType.getCertificato().get(0);
            if (infoCertificatoType.isEmettibile() == true) {
                RichiestaCertificati richiestaCertificati = new RichiestaCertificati();
                richiestaCertificati.setCredenziali(credenziali);
                richiestaCertificati.setCertificati(arrayOfInfoCertificatoType);
                RichiestaCertificatiResponse richiestaCertificatiResponse = objectFactory.createRichiestaCertificatiResponse();
             richiestaCertificatiResponse = (RichiestaCertificatiResponse) webServiceTemplate.marshalSendAndReceive(richiestaCertificati, new WebServiceMessageCallback() {
                    public void doWithMessage(WebServiceMessage message) {
                        SaajSoapMessage soapMessage = (SaajSoapMessage) message;
                        soapMessage.setSoapAction("http://www.comune.roma.it/certificati/richiestaCertificati");
                        SoapHeaderElement messageId = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "MessageID", "wsa"));
                        UUID uuid = UUID.randomUUID();
                        messageId.setText("uuid:" + uuid.toString());
                        SoapHeaderElement to = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "To", "wsa"));
                        to.setText("http://10.173.2.184/CertiWS/CertiService.asmx");
                        SoapHeaderElement action = soapMessage.getSoapHeader().addHeaderElement(new QName("http://schemas.xmlsoap.org/ws/2004/03/addressing", "Action", "wsa"));
                        action.setText("http://www.comune.roma.it/certificati/richiestaCertificati");
                        final String mesPrefix = "wsa";
                        final String mesNamespaceUri = "http://schemas.xmlsoap.org/ws/2004/03/addressing";
                    }
                });
                ArrayOfCertificatoType newarrayOfInfoCertificatoType = richiestaCertificatiResponse.getCertificati();
                        // ArrayOfCertificatoType newarrayOfInfoCertificatoType = certiService.getComuneCertificatiBinding().richiestaCertificati(credenziali, arrayOfInfoCertificatoType);
                CertificatoType certificatoType = newarrayOfInfoCertificatoType.getCertificato().get(0);
                if (certificatoType != null && certificatoType.getBin() != null && certificatoType.getBin().length > 0) {
                    certificatoType.setEmettibile(true);
                    return certificatoType;
                } else {
                    CertificatoType cc = new CertificatoType();
                    cc.setEmettibile(true);
                    return cc;
                }
            } else {
                CertificatoType cc = new CertificatoType();
                cc.setEmettibile(false);
                return cc;
            }
        } catch (Exception ex) {
            logger.error("ERR_02: " + ex.getMessage());
            esito.append("ERR_02: " + ex.getMessage());
        }
        return ritorno;
    }
}
