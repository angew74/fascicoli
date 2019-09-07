package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.entity.unidoc.*;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import com.roma.elettorale.fascicoli.helpers.enumerators.statusfiles;
import com.roma.elettorale.fascicoli.helpers.enumerators.unidocmetadata;
import com.roma.elettorale.fascicoli.helpers.enumerators.unidoctype;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class UnidocClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(UnidocClient.class);

    @Autowired
    Environment env;


    @Autowired
    TransformationFile ttransformation;


    /*
    Verifica che esista già un documento del genere per quella persona se è negativo risponde con una stringa vuota
    altrimenti restistuisce l'id del file già in archivio
     */

    public String controlFileVersion(unidoctype unidoctypeid, unidocmetadata idmetadata, String codInd, statusfiles statusRichiesta) {

        String service = env.getProperty("servizioverifica");
        String idfile = "";
        Integer id = 0;
        try {
            UnidocTypes unidocTypes = new UnidocTypes();
            unidocTypes.setIdType(unidoctypeid.ordinal());
            List<UnidocTypes> lt = new ArrayList<>();
            lt.add(unidocTypes);
            ArrayOfUnidocTypes t = new ArrayOfUnidocTypes();
            t.setUnidocTypes(lt);

            SearchFiles request = new SearchFiles();
            UnidocTypes[] types = new UnidocTypes[1];
            types[0] = unidocTypes;
            UnidocsMetadata searchMetadato = new UnidocsMetadata();
            searchMetadato.setIdMetadata(idmetadata.ordinal());
            searchMetadato.setValueMetadata(codInd);
            ArrayOfArrayOfUnidocsMetadata arrMetadata = new ArrayOfArrayOfUnidocsMetadata();
            List<ArrayOfUnidocsMetadata> list = new ArrayList<>();
            ArrayOfUnidocsMetadata arrayOfUnidocsMetadata = new ArrayOfUnidocsMetadata();
            List<UnidocsMetadata> l = new ArrayList<>();
            l.add(searchMetadato);
            arrayOfUnidocsMetadata.setUnidocsMetadata(l);
            list.set(0, arrayOfUnidocsMetadata);
            arrMetadata.setArrayOfUnidocsMetadata(list);
            request.setTypes(t);
            request.setDa(0);
            request.setPer(100);
            request.setOperatore("AND");
            ArrayOfStrings arrayOfString = new ArrayOfStrings();
            List<String> status = new ArrayList<>();
            status.add(statusRichiesta.label);
            arrayOfString.setString(status);
            request.setStatus(arrayOfString);
            log.info("Richiesta metadati per " + codInd);

            SearchFilesResponse response = (SearchFilesResponse) getWebServiceTemplate()
                    .marshalSendAndReceive(service, request);

            FileResponseList fileResponseList = response.getSearchFilesResult();
            if (fileResponseList.getListFiles() != null) {
                if (fileResponseList.getListFiles().getFileResponse() != null && fileResponseList.getListFiles().getFileResponse().size() != 0) {
                    id = fileResponseList.getListFiles().getFileResponse().get(0).getMetatag().getIdFile();
                    idfile = id.toString();
                }
            }
        } catch (Exception ex) {

        }
        return idfile;
    }


    public String postFileUpload(byte[] File, String nomeFile) {
        FileResponse responseFinal = new FileResponse();

        String service = env.getProperty("uploadFile");
        try {
            URL url = new URL(service);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");

            StringBuilder parameters = new StringBuilder();

            parameters.append("fileName=");
            parameters.append(nomeFile);
            parameters.append("&file=");
            parameters.append(URLEncoder.encode(new String(File),"UTF-8"));

            // parameters.put("", File);
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setRequestProperty("charset","UTF-8");
            con.setRequestProperty("Content-Length",Integer.toString(parameters.toString().getBytes().length));


            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setRequestProperty("charset","UTF-8");
            con.setRequestProperty("Content-Length",Integer.toString(parameters.toString().getBytes().length));

            DataOutputStream wr = new DataOutputStream(con.getOutputStream ());
            wr.writeBytes(parameters.toString());
            wr.flush();
            wr.close();
            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            Reader streamReader = null;

            if (status > 299) {
                streamReader = new InputStreamReader(con.getErrorStream());
            } else {
                streamReader = new InputStreamReader(con.getInputStream());
            }
            in.close();
            con.disconnect();
        } catch (Exception ex) {

        }

        /*
        WebRequest req = WebRequest.Create(ConfigurationManager.AppSettings["WSUpload"] + "?fileName=" + response.Chiave);
        req.Method = "POST";
        byte[] buffer = cert.bin;
        req.ContentLength = buffer.Length;
        Stream dataStream = req.GetRequestStream();
        dataStream.Write(buffer, 0, buffer.Length);
        dataStream.Close();*/
        return "";
    }
}
