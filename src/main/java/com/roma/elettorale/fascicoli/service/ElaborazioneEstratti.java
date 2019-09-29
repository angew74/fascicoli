package com.roma.elettorale.fascicoli.service;


import com.roma.elettorale.fascicoli.entity.anagrafe.EstrattoNascita;
import com.roma.elettorale.fascicoli.entity.anagrafe.RichiestaEstratto;
import com.roma.elettorale.fascicoli.entity.veri.VERICODRESPONSE;
import com.roma.elettorale.fascicoli.entity.veri.VeriData;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import org.apache.poi.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
;

@Component
public class ElaborazioneEstratti {


    @Autowired
    Environment env;

    @Autowired
    AnagrafeClient anagrafeClient;

    @Autowired
    TransformationFile transformationFile;

    Logger logger = LoggerFactory.getLogger(ElaborazioneEstratti.class);

    public byte[] getEstrattoNascita(String codiceindividuale,VeriData veriData, StringBuilder msg) {
        byte[] result = null;
        msg.append("");
        RichiestaEstratto richiestaEstratto = createRequest(codiceindividuale,veriData);
        String estrattoDocument = anagrafeClient.GetEstratto(richiestaEstratto);
        EstrattoNascita estratto = transformationFile.convertXmltoEstrattoNascita(estrattoDocument);
        if (IsEstrattoDisponibile(estratto))
        {
            Document xdoc = null;
            String h = estratto.getHtml().replace("<br>", "<br />");
            // aggiunta valori "fissi"
            estratto.setSostituita(env.getProperty("sostituita"));
            estratto.setUtente(env.getProperty("firma"));
            Document estrattoCompleto = transformationFile.convertClassToDocument(estratto);
            String xsltTransformation = env.getProperty("xslStyleSheet");
            // parte di controllo
            String estrattoFinale = transformationFile.applyXSLToXml(estrattoCompleto,xsltTransformation);
            result =transformationFile.createPdf(estrattoFinale);
        }
        else {
            msg.append(estratto.getDescrizione());
            logger.info("Estratto Nascita non disponibile: "+ msg);
        }
        return result;
    }

    public RichiestaEstratto createRequest(String codiceindividuale,VeriData veriData )
    {
        RichiestaEstratto richiestaEstratto = new RichiestaEstratto();
        richiestaEstratto.setCodiceIndividuale(codiceindividuale);
        richiestaEstratto.setUtente(env.getProperty("utente"));
        richiestaEstratto.setPassword(env.getProperty("password"));
        richiestaEstratto.setDipartimento(env.getProperty("dipartimento"));
        richiestaEstratto.setAnnoAtto(veriData.getAttoNascita().Anno);
        richiestaEstratto.setNumAtto(veriData.getAttoNascita().Numero);
        richiestaEstratto.setParteAtto(veriData.getAttoNascita().Parte);
        richiestaEstratto.setSerieAtto(veriData.getAttoNascita().Serie);
        return  richiestaEstratto;
    }
    /// <summary>
    ///
    /// </summary>
    /// <param name="estratto"></param>
    /// <returns></returns>
    private boolean IsEstrattoDisponibile(EstrattoNascita estratto)
    {
        boolean vero = true;
       if(estratto.getCodice() == null || estratto.getCodice().equals(""))
       {
           vero = true;
           return  vero;
       }
        if(estratto.getDataNas() == null || estratto.getDataNas().equals(""))
        {
            vero = false;
            return  vero;
        }
        return  vero;
    }

}
