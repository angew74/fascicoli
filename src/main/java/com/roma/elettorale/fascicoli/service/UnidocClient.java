package com.roma.elettorale.fascicoli.service;

import com.roma.elettorale.fascicoli.entity.unidoc.*;
import com.roma.elettorale.fascicoli.helpers.MultipartUtil;
import com.roma.elettorale.fascicoli.helpers.TransformationFile;
import com.roma.elettorale.fascicoli.helpers.enumerators.statusfiles;
import com.roma.elettorale.fascicoli.helpers.enumerators.unidocmetadata;
import com.roma.elettorale.fascicoli.helpers.enumerators.unidoctype;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@Component
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


    public FileResponseList searchFiles(ArrayOfUnidocFolder folders, ArrayOfUnidocTypes types, ArrayOfArrayOfUnidocsMetadata metadata) throws Exception {

        FileResponseList fileResponseList = new FileResponseList();
        try {
            URL urlUnidocService = new URL(env.getProperty("serviziounidoc"));
            ControllerOperazioniWS controllerOperazioniWS = new ControllerOperazioniWS(urlUnidocService);
            String operatore = "AND";
            ArrayOfStrings status = new ArrayOfStrings();
            List<String> strings = new ArrayList<>();
            strings.add("1");
            int da = 0;
            int per = 100;
            fileResponseList = controllerOperazioniWS.getControllerOperazioniWSSoap().searchFiles(folders, types, metadata, operatore, status, da, per);
        } catch (Exception ex) {
            logger.error("ERR_12" + ex.getMessage() + " causa " + ex.getCause().getMessage());
            System.out.println("Exception: " + ex.getMessage() + " causa " + ex.getCause().getMessage());
            throw new Exception(ex.getMessage() + " causa " + ex.getCause().getMessage());
        }
        return fileResponseList;
    }

    public FileResponse addFile(FileRequest fileRequest) {
        FileResponse fileResponse = new FileResponse();
        try {
            URL urlUnidocService = new URL(env.getProperty("serviziounidoc"));
            ControllerOperazioniWS controllerOperazioniWS = new ControllerOperazioniWS(urlUnidocService);
          //  String service = env.getProperty("servizioverifica");
            fileResponse = controllerOperazioniWS.getControllerOperazioniWSSoap().addFile(fileRequest);

        } catch (Exception ex) {
            logger.error("ERR_15" + ex.getMessage());
            System.out.println("Exception: " + ex.getMessage());
        }
        return fileResponse;
    }

    public FolderResponse creaNuovaCartella(FileRequest fileRequest) {
        FolderResponse folderResponse = new FolderResponse();
        try {
            URL urlUnidocService = new URL(env.getProperty("serviziounidoc"));
            ControllerOperazioniWS controllerOperazioniWS = new ControllerOperazioniWS(urlUnidocService);
            String service = env.getProperty("servizioverifica");
            folderResponse = controllerOperazioniWS.getControllerOperazioniWSSoap().creaNuovaCartella(fileRequest);
        } catch (Exception ex) {
            logger.error("ERR_12" + ex.getMessage());
            System.out.println("Exception: " + ex.getMessage());
        }
        return folderResponse;
    }
    /*
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
*/


    public String postFileUploadRaw(byte[] File, String idfile) {
        String service = env.getProperty("uploadFile");
        StringBuilder response = new StringBuilder();
        response.append("OK");
        try {
            URL url = new URL(service);
            MultipartUtil multipartUtil = new MultipartUtil(service,"UTF-8",false);
            PrintWriter printWriter =  multipartUtil.setup_writer();
            multipartUtil.addFilePart(idfile,idfile,File);
            HttpURLConnection httpURLConnection =  multipartUtil.finish();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            int status = httpURLConnection.getResponseCode();
            UploadResponse uploadResponse = ttransformation.convertXmltoUploadResponse(content.toString()).getUploadResponse();
            Reader streamReader = null;
            if (status > 299) {
                streamReader = new InputStreamReader(httpURLConnection.getErrorStream());
                response = new StringBuilder();
                response.append("ERR_28 Errore di connessione status: " + status);
                logger.error("ERR_28 Errore di connessione status " + status);
            }
            in.close();
            httpURLConnection.disconnect();
        }
        catch (Exception ex) {
            logger.error("ERR_16BIS: " + ex.getMessage());
            response = new StringBuilder();
            response.append("ERR_16BIS: " + ex.getMessage());
            System.out.println("Exception: " + ex.getMessage());
        }
        return response.toString();
    }

    public String postFileUpload(byte[] File, String idfile) {
        String service = env.getProperty("uploadFile");
        StringBuilder response = new StringBuilder();
        response.append("OK");
        try {
            URL url = new URL(service);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            StringBuilder parameters = new StringBuilder();
            parameters.append("fileName=");
            parameters.append(idfile);
            parameters.append("&file=");
            parameters.append(URLEncoder.encode(new String(File), "UTF-8"));
            // parameters.put("", File);
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setRequestProperty("charset", "UTF-8");
            con.setRequestProperty("Content-Length", Integer.toString(parameters.toString().getBytes().length));
            con.setRequestMethod("POST");
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
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
            UploadResponse uploadResponse = ttransformation.convertXmltoUploadResponse(content.toString()).getUploadResponse();
            Reader streamReader = null;
            if (status > 299) {
                streamReader = new InputStreamReader(con.getErrorStream());
                response = new StringBuilder();
                response.append("ERR_28 Errore di connessione status: " + status);
                logger.error("ERR_28 Errore di connessione status " + status);
            }
            in.close();
            con.disconnect();
            if (!uploadResponse.getMessage().getCodice().equals("OK")) {
                response = new StringBuilder();
                logger.error("ERR_27" + uploadResponse.getMessage().getDescrizioneMessaggio());
                response.append("ERR_27 " + uploadResponse.getMessage().getDescrizioneMessaggio());
                System.out.println("Exception: " + uploadResponse.getMessage().getDescrizioneMessaggio());
            }
        } catch (Exception ex) {
            logger.error("ERR_16" + ex.getMessage());
            response = new StringBuilder();
            response.append("ERR_16 " + ex.getMessage());
            System.out.println("Exception: " + ex.getMessage());
        }
        return response.toString();
    }
}
