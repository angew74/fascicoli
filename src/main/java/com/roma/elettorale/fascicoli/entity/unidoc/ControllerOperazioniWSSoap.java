
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ControllerOperazioniWSSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ControllerOperazioniWSSoap {


    /**
     * 
     * Ritorna lo stato corrente di un workflow associato a un wf_istance_id
     * 
     * 
     * @param wfIstanceId
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.WorkFlow
     */
    @WebMethod(operationName = "WorkflowGetStatus", action = "http://tempuri.org/WorkflowGetStatus")
    @WebResult(name = "WorkflowGetStatusResult", targetNamespace = "")
    @RequestWrapper(localName = "WorkflowGetStatus", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.WorkflowGetStatus")
    @ResponseWrapper(localName = "WorkflowGetStatusResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.WorkflowGetStatusResponse")
    public WorkFlow workflowGetStatus(
        @WebParam(name = "wfIstanceId", targetNamespace = "http://tempuri.org/")
        String wfIstanceId);

    /**
     * Avvia un workflow
     * 
     * @param workflowCode
     * @param idFile
     * @param startStatus
     * @param customId
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.WorkFlow
     */
    @WebMethod(operationName = "WorkflowStart", action = "http://tempuri.org/WorkflowStart")
    @WebResult(name = "WorkflowStartResult", targetNamespace = "")
    @RequestWrapper(localName = "WorkflowStart", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.WorkflowStart")
    @ResponseWrapper(localName = "WorkflowStartResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.WorkflowStartResponse")
    public WorkFlow workflowStart(
        @WebParam(name = "idFile", targetNamespace = "http://tempuri.org/")
        String idFile,
        @WebParam(name = "workflowCode", targetNamespace = "http://tempuri.org/")
        String workflowCode,
        @WebParam(name = "customId", targetNamespace = "http://tempuri.org/")
        String customId,
        @WebParam(name = "startStatus", targetNamespace = "http://tempuri.org/")
        String startStatus);

    /**
     * Aggiorna lo stato nel workflow
     * 
     * @param newStatus
     * @param currentStatus
     * @param wfInstanceID
     * @param refIdFile
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.WorkFlow
     */
    @WebMethod(operationName = "WorkflowChangeStatus", action = "http://tempuri.org/WorkflowChangeStatus")
    @WebResult(name = "WorkflowChangeStatusResult", targetNamespace = "")
    @RequestWrapper(localName = "WorkflowChangeStatus", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.WorkflowChangeStatus")
    @ResponseWrapper(localName = "WorkflowChangeStatusResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.WorkflowChangeStatusResponse")
    public WorkFlow workflowChangeStatus(
        @WebParam(name = "wfInstanceID", targetNamespace = "http://tempuri.org/")
        String wfInstanceID,
        @WebParam(name = "currentStatus", targetNamespace = "http://tempuri.org/")
        String currentStatus,
        @WebParam(name = "newStatus", targetNamespace = "http://tempuri.org/")
        String newStatus,
        @WebParam(name = "refIdFile", targetNamespace = "http://tempuri.org/")
        int refIdFile);

    /**
     * Marca tutti i record come deleted
     * 
     * @param wfInstanceId
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.WorkFlow
     */
    @WebMethod(operationName = "WfDetach", action = "http://tempuri.org/WfDetach")
    @WebResult(name = "WfDetachResult", targetNamespace = "")
    @RequestWrapper(localName = "WfDetach", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.WfDetach")
    @ResponseWrapper(localName = "WfDetachResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.WfDetachResponse")
    public WorkFlow wfDetach(
        @WebParam(name = "wf_instance_id", targetNamespace = "http://tempuri.org/")
        String wfInstanceId);

    /**
     * 
     * Ritorna l'URL del file desiderato individuandolo tramite ID.
     * 
     * 
     * @param getFileUrlResult
     * @param nomeOriginale
     * @param idFile
     */
    @WebMethod(operationName = "GetFileUrl", action = "http://tempuri.org/GetFileUrl")
    @RequestWrapper(localName = "GetFileUrl", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFileUrl")
    @ResponseWrapper(localName = "GetFileUrlResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFileUrlResponse")
    public void getFileUrl(
        @WebParam(name = "idFile", targetNamespace = "http://tempuri.org/")
        int idFile,
        @WebParam(name = "GetFileUrlResult", targetNamespace = "http://tempuri.org/", mode = WebParam.Mode.OUT)
        Holder<String> getFileUrlResult,
        @WebParam(name = "nomeOriginale", targetNamespace = "http://tempuri.org/", mode = WebParam.Mode.OUT)
        Holder<String> nomeOriginale);

    /**
     * 
     * Permette di archiviare un file sul server. Restituisce un messaggio di esito e diversi metadati inerenti il file inserito. In caso di errore ritorna il IdFile = -1.
     * 
     * 
     * @param request
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(operationName = "AddFile", action = "http://tempuri.org/AddFile")
    @WebResult(name = "AddFileResult", targetNamespace = "")
    @RequestWrapper(localName = "AddFile", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.AddFile")
    @ResponseWrapper(localName = "AddFileResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.AddFileResponse")
    public FileResponse addFile(
        @WebParam(name = "request", targetNamespace = "")
        FileRequest request);

    /**
     * 
     * Restituisce le informazioni inerenti una versione specifica di un file. Se il valore della versione passata \ufffd vuota, viene restituita la prima versione del fileIn caso di errore ritorna il IdFile = -1. Ritorna IdFile = 0 se non trova corrispondenze.
     * 
     * 
     * @param versione
     * @param idDoc
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(operationName = "GetInfoAboutFile", action = "http://tempuri.org/GetInfoAboutFile")
    @WebResult(name = "GetInfoAboutFileResult", targetNamespace = "")
    @RequestWrapper(localName = "GetInfoAboutFile", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetInfoAboutFile")
    @ResponseWrapper(localName = "GetInfoAboutFileResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetInfoAboutFileResponse")
    public FileResponse getInfoAboutFile(
        @WebParam(name = "idDoc", targetNamespace = "http://tempuri.org/")
        int idDoc,
        @WebParam(name = "versione", targetNamespace = "http://tempuri.org/")
        String versione);

    /**
     * 
     * @param codiceFiscale
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCodiceIndividuale", action = "http://tempuri.org/GetCodiceIndividuale")
    @WebResult(name = "GetCodiceIndividualeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCodiceIndividuale", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetCodiceIndividuale")
    @ResponseWrapper(localName = "GetCodiceIndividualeResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetCodiceIndividualeResponse")
    public String getCodiceIndividuale(
        @WebParam(name = "codiceFiscale", targetNamespace = "http://tempuri.org/")
        String codiceFiscale);

    /**
     * 
     * Crea una nuova cartella. Restituisce un oggetto di tipo FolderResponse dove \ufffd contenuto l'id della folder
     * 
     * 
     * @param request
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FolderResponse
     */
    @WebMethod(operationName = "CreaNuovaCartella", action = "http://tempuri.org/CreaNuovaCartella")
    @WebResult(name = "CreaNuovaCartellaResult", targetNamespace = "")
    @RequestWrapper(localName = "CreaNuovaCartella", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.CreaNuovaCartella")
    @ResponseWrapper(localName = "CreaNuovaCartellaResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.CreaNuovaCartellaResponse")
    public FolderResponse creaNuovaCartella(
        @WebParam(name = "request", targetNamespace = "")
        FileRequest request);

    /**
     * 
     * @param file
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(operationName = "AssociaFileFolder", action = "http://tempuri.org/AssociaFileFolder")
    @WebResult(name = "AssociaFileFolderResult", targetNamespace = "")
    @RequestWrapper(localName = "AssociaFileFolder", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.AssociaFileFolder")
    @ResponseWrapper(localName = "AssociaFileFolderResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.AssociaFileFolderResponse")
    public FileResponse associaFileFolder(
        @WebParam(name = "file", targetNamespace = "")
        FileRequest file);

    /**
     * 
     * @param idTipoDoc
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(operationName = "GetMetadatiByTipoDoc", action = "http://tempuri.org/GetMetadatiByTipoDoc")
    @WebResult(name = "GetMetadatiByTipoDocResult", targetNamespace = "")
    @RequestWrapper(localName = "GetMetadatiByTipoDoc", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetMetadatiByTipoDoc")
    @ResponseWrapper(localName = "GetMetadatiByTipoDocResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetMetadatiByTipoDocResponse")
    public FileResponse getMetadatiByTipoDoc(
        @WebParam(name = "id_tipoDoc", targetNamespace = "http://tempuri.org/")
        int idTipoDoc);

    /**
     * 
     * @param idArea
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.ArrayOfDocumentiPerAree
     */
    @WebMethod(action = "http://tempuri.org/getDocumentiByArea")
    @WebResult(name = "getDocumentiByAreaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getDocumentiByArea", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetDocumentiByArea")
    @ResponseWrapper(localName = "getDocumentiByAreaResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetDocumentiByAreaResponse")
    public ArrayOfDocumentiPerAree getDocumentiByArea(
        @WebParam(name = "id_area", targetNamespace = "http://tempuri.org/")
        int idArea);

    /**
     * 
     * @param m
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(action = "http://tempuri.org/aggiungiMetadato")
    @WebResult(name = "aggiungiMetadatoResult", targetNamespace = "")
    @RequestWrapper(localName = "aggiungiMetadato", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.AggiungiMetadato")
    @ResponseWrapper(localName = "aggiungiMetadatoResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.AggiungiMetadatoResponse")
    public FileResponse aggiungiMetadato(
        @WebParam(name = "m", targetNamespace = "http://tempuri.org/")
        UnidocsMetadata m);

    /**
     * 
     * Restituisce la lista di file all'interno di una directory individuata dal'ID
     * 
     * 
     * @param idFolder
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.ArrayOfFileResponse
     */
    @WebMethod(action = "http://tempuri.org/getFilesFromIdFolder")
    @WebResult(name = "getFilesFromIdFolderResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getFilesFromIdFolder", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFilesFromIdFolder")
    @ResponseWrapper(localName = "getFilesFromIdFolderResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFilesFromIdFolderResponse")
    public ArrayOfFileResponse getFilesFromIdFolder(
        @WebParam(name = "idFolder", targetNamespace = "http://tempuri.org/")
        int idFolder);

    /**
     * 
     * Restituisce la lista di file all'interno di una directory individuata dal path
     * 
     * 
     * @param path
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.ArrayOfFileResponse
     */
    @WebMethod(action = "http://tempuri.org/getFilesFromPathFolder")
    @WebResult(name = "getFilesFromPathFolderResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getFilesFromPathFolder", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFilesFromPathFolder")
    @ResponseWrapper(localName = "getFilesFromPathFolderResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFilesFromPathFolderResponse")
    public ArrayOfFileResponse getFilesFromPathFolder(
        @WebParam(name = "path", targetNamespace = "http://tempuri.org/")
        String path);

    /**
     * 
     * @param area
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.ArrayOfFolderResponse
     */
    @WebMethod(action = "http://tempuri.org/getFoldersByArea")
    @WebResult(name = "getFoldersByAreaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getFoldersByArea", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFoldersByArea")
    @ResponseWrapper(localName = "getFoldersByAreaResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFoldersByAreaResponse")
    public ArrayOfFolderResponse getFoldersByArea(
        @WebParam(name = "area", targetNamespace = "http://tempuri.org/")
        int area);

    /**
     * 
     * @param area
     * @param livelli
     * @param startNode
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.ArrayOfSimpleTreeItem
     */
    @WebMethod(operationName = "GetFolderTree", action = "http://tempuri.org/GetFolderTree")
    @WebResult(name = "GetFolderTreeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetFolderTree", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFolderTree")
    @ResponseWrapper(localName = "GetFolderTreeResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFolderTreeResponse")
    public ArrayOfSimpleTreeItem getFolderTree(
        @WebParam(name = "startNode", targetNamespace = "http://tempuri.org/")
        long startNode,
        @WebParam(name = "area", targetNamespace = "http://tempuri.org/")
        String area,
        @WebParam(name = "livelli", targetNamespace = "http://tempuri.org/")
        int livelli);

    /**
     * 
     * @param idFolder
     * @param idFile
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(action = "http://tempuri.org/moveFile")
    @WebResult(name = "moveFileResult", targetNamespace = "")
    @RequestWrapper(localName = "moveFile", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.MoveFile")
    @ResponseWrapper(localName = "moveFileResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.MoveFileResponse")
    public FileResponse moveFile(
        @WebParam(name = "id_file", targetNamespace = "http://tempuri.org/")
        int idFile,
        @WebParam(name = "id_folder", targetNamespace = "http://tempuri.org/")
        int idFolder);

    /**
     * 
     * @param request
     * @param lastVersion
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(action = "http://tempuri.org/deleteFile")
    @WebResult(name = "deleteFileResult", targetNamespace = "")
    @RequestWrapper(localName = "deleteFile", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.DeleteFile")
    @ResponseWrapper(localName = "deleteFileResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.DeleteFileResponse")
    public FileResponse deleteFile(
        @WebParam(name = "request", targetNamespace = "")
        FileRequest request,
        @WebParam(name = "lastVersion", targetNamespace = "http://tempuri.org/")
        boolean lastVersion);

    /**
     * 
     * @param request
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(operationName = "GetFileDetails", action = "http://tempuri.org/GetFileDetails")
    @WebResult(name = "GetFileDetailsResult", targetNamespace = "")
    @RequestWrapper(localName = "GetFileDetails", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFileDetails")
    @ResponseWrapper(localName = "GetFileDetailsResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetFileDetailsResponse")
    public FileResponse getFileDetails(
        @WebParam(name = "request", targetNamespace = "")
        FileRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(action = "http://tempuri.org/modificaMetadato")
    @WebResult(name = "modificaMetadatoResult", targetNamespace = "")
    @RequestWrapper(localName = "modificaMetadato", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.ModificaMetadato")
    @ResponseWrapper(localName = "modificaMetadatoResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.ModificaMetadatoResponse")
    public FileResponse modificaMetadato(
        @WebParam(name = "request", targetNamespace = "")
        FileRequest request);

    /**
     * 
     * @param codRegistro
     * @param denArea
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(action = "http://tempuri.org/creaNuovoRegistro")
    @WebResult(name = "creaNuovoRegistroResult", targetNamespace = "")
    @RequestWrapper(localName = "creaNuovoRegistro", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.CreaNuovoRegistro")
    @ResponseWrapper(localName = "creaNuovoRegistroResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.CreaNuovoRegistroResponse")
    public FileResponse creaNuovoRegistro(
        @WebParam(name = "denArea", targetNamespace = "http://tempuri.org/")
        String denArea,
        @WebParam(name = "codRegistro", targetNamespace = "http://tempuri.org/")
        String codRegistro);

    /**
     * 
     * @param root
     * @param dirs
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FolderResponse
     */
    @WebMethod(action = "http://tempuri.org/creaRootDirectories")
    @WebResult(name = "creaRootDirectoriesResult", targetNamespace = "")
    @RequestWrapper(localName = "creaRootDirectories", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.CreaRootDirectories")
    @ResponseWrapper(localName = "creaRootDirectoriesResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.CreaRootDirectoriesResponse")
    public FolderResponse creaRootDirectories(
        @WebParam(name = "root", targetNamespace = "http://tempuri.org/")
        String root,
        @WebParam(name = "dirs", targetNamespace = "http://tempuri.org/")
        ArrayOfStrings dirs);

    /**
     * 
     * @param idFolder
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.ArrayOfFolderResponse
     */
    @WebMethod(action = "http://tempuri.org/getSubFoldersFromIdFolder")
    @WebResult(name = "getSubFoldersFromIdFolderResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getSubFoldersFromIdFolder", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetSubFoldersFromIdFolder")
    @ResponseWrapper(localName = "getSubFoldersFromIdFolderResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetSubFoldersFromIdFolderResponse")
    public ArrayOfFolderResponse getSubFoldersFromIdFolder(
        @WebParam(name = "idFolder", targetNamespace = "http://tempuri.org/")
        int idFolder);

    /**
     * 
     * @param nome
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.ArrayOfAreaResponse
     */
    @WebMethod(action = "http://tempuri.org/getRegistriByFiltroCodice")
    @WebResult(name = "getRegistriByFiltroCodiceResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getRegistriByFiltroCodice", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetRegistriByFiltroCodice")
    @ResponseWrapper(localName = "getRegistriByFiltroCodiceResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetRegistriByFiltroCodiceResponse")
    public ArrayOfAreaResponse getRegistriByFiltroCodice(
        @WebParam(name = "nome", targetNamespace = "http://tempuri.org/")
        String nome);

    /**
     * 
     * @param firma
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(action = "http://tempuri.org/signDocument")
    @WebResult(name = "signDocumentResult", targetNamespace = "")
    @RequestWrapper(localName = "signDocument", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.SignDocument")
    @ResponseWrapper(localName = "signDocumentResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.SignDocumentResponse")
    public FileResponse signDocument(
        @WebParam(name = "firma", targetNamespace = "")
        UnidocsFirma firma);

    /**
     * 
     * @param email
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(action = "http://tempuri.org/sendMail")
    @WebResult(name = "sendMailResult", targetNamespace = "")
    @RequestWrapper(localName = "sendMail", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.SendMail")
    @ResponseWrapper(localName = "sendMailResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.SendMailResponse")
    public FileResponse sendMail(
        @WebParam(name = "Email", targetNamespace = "")
        UnidocMail email);

    /**
     * 
     * @param fileToSave
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponse
     */
    @WebMethod(operationName = "UpdateMerge", action = "http://tempuri.org/UpdateMerge")
    @WebResult(name = "UpdateMergeResult", targetNamespace = "")
    @RequestWrapper(localName = "UpdateMerge", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.UpdateMerge")
    @ResponseWrapper(localName = "UpdateMergeResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.UpdateMergeResponse")
    public FileResponse updateMerge(
        @WebParam(name = "fileToSave", targetNamespace = "")
        FileRequest fileToSave);

    /**
     * 
     * Restituisce la lista di file paginata all'interno di una directory individuata dal'ID
     * 
     * 
     * @param idFolder
     * @param per
     * @param da
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponseList
     */
    @WebMethod(action = "http://tempuri.org/getPagedFilesFromIdFolder")
    @WebResult(name = "getPagedFilesFromIdFolderResult", targetNamespace = "")
    @RequestWrapper(localName = "getPagedFilesFromIdFolder", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetPagedFilesFromIdFolder")
    @ResponseWrapper(localName = "getPagedFilesFromIdFolderResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetPagedFilesFromIdFolderResponse")
    public FileResponseList getPagedFilesFromIdFolder(
        @WebParam(name = "idFolder", targetNamespace = "http://tempuri.org/")
        int idFolder,
        @WebParam(name = "da", targetNamespace = "http://tempuri.org/")
        int da,
        @WebParam(name = "per", targetNamespace = "http://tempuri.org/")
        int per);

    /**
     * 
     * Restituisce la lista di file paginata all'interno di una directory individuata dal'ID
     * 
     * 
     * @param idFolder
     * @param per
     * @param da
     * @param status
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponseList
     */
    @WebMethod(action = "http://tempuri.org/getPagedFilesFromIdFolderStatus")
    @WebResult(name = "getPagedFilesFromIdFolderStatusResult", targetNamespace = "")
    @RequestWrapper(localName = "getPagedFilesFromIdFolderStatus", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetPagedFilesFromIdFolderStatus")
    @ResponseWrapper(localName = "getPagedFilesFromIdFolderStatusResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.GetPagedFilesFromIdFolderStatusResponse")
    public FileResponseList getPagedFilesFromIdFolderStatus(
        @WebParam(name = "idFolder", targetNamespace = "http://tempuri.org/")
        int idFolder,
        @WebParam(name = "status", targetNamespace = "http://tempuri.org/")
        String status,
        @WebParam(name = "da", targetNamespace = "http://tempuri.org/")
        int da,
        @WebParam(name = "per", targetNamespace = "http://tempuri.org/")
        int per);

    /**
     * Ricerca i files secondo i criteri specificati
     * 
     * @param types
     * @param metadata
     * @param folders
     * @param operatore
     * @param per
     * @param da
     * @param status
     * @return
     *     returns com.roma.elettorale.fascicoli.entity.unidoc.FileResponseList
     */
    @WebMethod(action = "http://tempuri.org/searchFiles")
    @WebResult(name = "searchFilesResult", targetNamespace = "")
    @RequestWrapper(localName = "searchFiles", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.SearchFiles")
    @ResponseWrapper(localName = "searchFilesResponse", targetNamespace = "http://tempuri.org/", className = "com.roma.elettorale.fascicoli.entity.unidoc.SearchFilesResponse")
    public FileResponseList searchFiles(
        @WebParam(name = "folders", targetNamespace = "http://tempuri.org/")
        ArrayOfUnidocFolder folders,
        @WebParam(name = "types", targetNamespace = "http://tempuri.org/")
        ArrayOfUnidocTypes types,
        @WebParam(name = "metadata", targetNamespace = "http://tempuri.org/")
        ArrayOfArrayOfUnidocsMetadata metadata,
        @WebParam(name = "operatore", targetNamespace = "http://tempuri.org/")
        String operatore,
        @WebParam(name = "status", targetNamespace = "http://tempuri.org/")
        ArrayOfStrings status,
        @WebParam(name = "da", targetNamespace = "http://tempuri.org/")
        int da,
        @WebParam(name = "per", targetNamespace = "http://tempuri.org/")
        int per);

}
