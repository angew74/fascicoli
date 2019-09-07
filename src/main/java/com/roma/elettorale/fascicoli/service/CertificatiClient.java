package com.roma.elettorale.fascicoli.service;


import com.roma.elettorale.fascicoli.entity.certi.*;
import org.dom4j.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class CertificatiClient  extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(UnidocClient.class);

    @Autowired
    Environment env;

    public String ExecuteInizializza(String idClient, String cfRichiedente, String cfIntestatario, String ipRichiedente)
    {
        String idFlusso = "";
        boolean intestatarioTrovato = false;
        try {
            TransactionRequestType request = new TransactionRequestType();
            String servizio = env.getProperty("certificatiservice");
            request.setIdTransazione("");
            request.setCodiceFiscaleRichiedente(cfRichiedente);
            request.setCodiceFiscaleIntestatario(cfIntestatario);
            String FixedClientId = env.getProperty("clientid");
            request.setSistema(FixedClientId);

            request.setIdPod("");

            RichiestaCredenzialiResponse response = (RichiestaCredenzialiResponse) getWebServiceTemplate()
                    .marshalSendAndReceive(servizio, request);

            intestatarioTrovato = response.isIntestatarioTrovato();
            CredenzialiType credenzialiType = response.getCredenziali();

            //idFlusso = ws.richiestaCredenziali(int.Parse(idClient), String.Empty, cfRichiedente, cfIntestatario, out intestatarioTrovato);

            if (!intestatarioTrovato)
                idFlusso = "";
            else
                idFlusso = credenzialiType.getIdFlusso();
        }
        catch (Exception ex)
        {

        }
            return  idFlusso;
    }

    public CertificatoType ExecuteVerificaAndRichiestaSingola(String idClient, String cfRichiedente, String ipRichiedente,
                                                              String cfIntestatario, String idFlusso, String idPublicCertificato, String idUso, String motivoEsenzione)
    {
        InfoCertificatoType[] resp = null;
        CertificatoType ritorno = new CertificatoType();
        InfoCertificatoType[] rifs = new InfoCertificatoType[1];
        InfoCertificatoType rif = new InfoCertificatoType();
        rif.setIdNomeCertificato(idPublicCertificato);
        rif.setIdUso(idUso);
        rif.setIdMotivoEsenzione(motivoEsenzione);
        rifs[0] = rif;
        String servizio = env.getProperty("certificatiservice");
        CredenzialiType credenziali = new CredenzialiType();
        credenziali.setIdFlusso(idFlusso);
        TransactionRequestType transactionRequestType = new TransactionRequestType();
        credenziali.setTransactionData(transactionRequestType);
        TransactionRequestType transactionData =  new TransactionRequestType();
        transactionData.setSistema(idClient);
        transactionData.setCodiceFiscaleIntestatario(cfIntestatario);
        transactionData.setCodiceFiscaleRichiedente(cfRichiedente);
        transactionData.setIdPod("");
        transactionData.setIdTransazione("");
        credenziali.setTransactionData(transactionData);
        RichiestaCredenziali richiestaCredenziali = new RichiestaCredenziali();
        richiestaCredenziali.setTransactionRequest(transactionRequestType);
        try
        {
            resp = (InfoCertificatoType[]) getWebServiceTemplate()
                    .marshalSendAndReceive(servizio, credenziali);

            if (resp[0].isEmettibile() == true)
            {
                RichiestaCertificati richiestaCertificati = new RichiestaCertificati();
                richiestaCertificati.setCredenziali(credenziali);
                CertificatoType[] cert = (CertificatoType[]) getWebServiceTemplate()
                        .marshalSendAndReceive(servizio, richiestaCertificati);
                // CertificatoType[] cert = ws.richiestaCertificati(credenziali, resp);
                if (cert[0] != null && cert[0].getBin() !=null && cert[0].getBin().length >0)
                {
                    cert[0].setEmettibile(true);
                    return cert[0];
                }

                else
                {
                    CertificatoType cc = new CertificatoType();
                    cc.setEmettibile(true);
                    return cc;

                }
            }
            else
            {
                CertificatoType cc = new CertificatoType();
                cc.setEmettibile(false);
                return cc;
            }
        }
        catch (Exception ex)
        {

        }
        return ritorno;
    }
}
