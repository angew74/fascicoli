
package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.roma.elettorale.fascicoli.entity.unidoc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Request_QNAME = new QName("", "request");
    private final static QName _CreaRootDirectoriesResult_QNAME = new QName("", "creaRootDirectoriesResult");
    private final static QName _Email_QNAME = new QName("", "Email");
    private final static QName _UpdateMergeResult_QNAME = new QName("", "UpdateMergeResult");
    private final static QName _WorkflowGetStatusResult_QNAME = new QName("", "WorkflowGetStatusResult");
    private final static QName _WorkflowStartResult_QNAME = new QName("", "WorkflowStartResult");
    private final static QName _ModificaMetadatoResult_QNAME = new QName("", "modificaMetadatoResult");
    private final static QName _GetPagedFilesFromIdFolderStatusResult_QNAME = new QName("", "getPagedFilesFromIdFolderStatusResult");
    private final static QName _GetMetadatiByTipoDocResult_QNAME = new QName("", "GetMetadatiByTipoDocResult");
    private final static QName _GetPagedFilesFromIdFolderResult_QNAME = new QName("", "getPagedFilesFromIdFolderResult");
    private final static QName _WorkflowChangeStatusResult_QNAME = new QName("", "WorkflowChangeStatusResult");
    private final static QName _File_QNAME = new QName("", "file");
    private final static QName _AggiungiMetadatoResult_QNAME = new QName("", "aggiungiMetadatoResult");
    private final static QName _CreaNuovoRegistroResult_QNAME = new QName("", "creaNuovoRegistroResult");
    private final static QName _GetFileDetailsResult_QNAME = new QName("", "GetFileDetailsResult");
    private final static QName _WfDetachResult_QNAME = new QName("", "WfDetachResult");
    private final static QName _SignDocumentResult_QNAME = new QName("", "signDocumentResult");
    private final static QName _GetInfoAboutFileResult_QNAME = new QName("", "GetInfoAboutFileResult");
    private final static QName _MoveFileResult_QNAME = new QName("", "moveFileResult");
    private final static QName _CreaNuovaCartellaResult_QNAME = new QName("", "CreaNuovaCartellaResult");
    private final static QName _Firma_QNAME = new QName("", "firma");
    private final static QName _SendMailResult_QNAME = new QName("", "sendMailResult");
    private final static QName _DeleteFileResult_QNAME = new QName("", "deleteFileResult");
    private final static QName _AddFileResult_QNAME = new QName("", "AddFileResult");
    private final static QName _FileToSave_QNAME = new QName("", "fileToSave");
    private final static QName _SearchFilesResult_QNAME = new QName("", "searchFilesResult");
    private final static QName _AssociaFileFolderResult_QNAME = new QName("", "AssociaFileFolderResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.roma.elettorale.fascicoli.entity.unidoc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AggiungiMetadato }
     * 
     */
    public AggiungiMetadato createAggiungiMetadato() {
        return new AggiungiMetadato();
    }

    /**
     * Create an instance of {@link UnidocsMetadata }
     * 
     */
    public UnidocsMetadata createUnidocsMetadata() {
        return new UnidocsMetadata();
    }

    /**
     * Create an instance of {@link WorkflowGetStatusResponse }
     * 
     */
    public WorkflowGetStatusResponse createWorkflowGetStatusResponse() {
        return new WorkflowGetStatusResponse();
    }

    /**
     * Create an instance of {@link WorkFlow }
     * 
     */
    public WorkFlow createWorkFlow() {
        return new WorkFlow();
    }

    /**
     * Create an instance of {@link GetRegistriByFiltroCodiceResponse }
     * 
     */
    public GetRegistriByFiltroCodiceResponse createGetRegistriByFiltroCodiceResponse() {
        return new GetRegistriByFiltroCodiceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAreaResponse }
     * 
     */
    public ArrayOfAreaResponse createArrayOfAreaResponse() {
        return new ArrayOfAreaResponse();
    }

    /**
     * Create an instance of {@link GetFileDetailsResponse }
     * 
     */
    public GetFileDetailsResponse createGetFileDetailsResponse() {
        return new GetFileDetailsResponse();
    }

    /**
     * Create an instance of {@link FileResponse }
     * 
     */
    public FileResponse createFileResponse() {
        return new FileResponse();
    }

    /**
     * Create an instance of {@link GetFolderTree }
     * 
     */
    public GetFolderTree createGetFolderTree() {
        return new GetFolderTree();
    }

    /**
     * Create an instance of {@link SendMail }
     * 
     */
    public SendMail createSendMail() {
        return new SendMail();
    }

    /**
     * Create an instance of {@link UnidocMail }
     * 
     */
    public UnidocMail createUnidocMail() {
        return new UnidocMail();
    }

    /**
     * Create an instance of {@link AddFileResponse }
     * 
     */
    public AddFileResponse createAddFileResponse() {
        return new AddFileResponse();
    }

    /**
     * Create an instance of {@link GetPagedFilesFromIdFolderStatusResponse }
     * 
     */
    public GetPagedFilesFromIdFolderStatusResponse createGetPagedFilesFromIdFolderStatusResponse() {
        return new GetPagedFilesFromIdFolderStatusResponse();
    }

    /**
     * Create an instance of {@link FileResponseList }
     * 
     */
    public FileResponseList createFileResponseList() {
        return new FileResponseList();
    }

    /**
     * Create an instance of {@link DeleteFileResponse }
     * 
     */
    public DeleteFileResponse createDeleteFileResponse() {
        return new DeleteFileResponse();
    }

    /**
     * Create an instance of {@link GetFoldersByArea }
     * 
     */
    public GetFoldersByArea createGetFoldersByArea() {
        return new GetFoldersByArea();
    }

    /**
     * Create an instance of {@link GetPagedFilesFromIdFolder }
     * 
     */
    public GetPagedFilesFromIdFolder createGetPagedFilesFromIdFolder() {
        return new GetPagedFilesFromIdFolder();
    }

    /**
     * Create an instance of {@link GetFileUrl }
     * 
     */
    public GetFileUrl createGetFileUrl() {
        return new GetFileUrl();
    }

    /**
     * Create an instance of {@link GetFilesFromPathFolder }
     * 
     */
    public GetFilesFromPathFolder createGetFilesFromPathFolder() {
        return new GetFilesFromPathFolder();
    }

    /**
     * Create an instance of {@link SignDocumentResponse }
     * 
     */
    public SignDocumentResponse createSignDocumentResponse() {
        return new SignDocumentResponse();
    }

    /**
     * Create an instance of {@link GetSubFoldersFromIdFolder }
     * 
     */
    public GetSubFoldersFromIdFolder createGetSubFoldersFromIdFolder() {
        return new GetSubFoldersFromIdFolder();
    }

    /**
     * Create an instance of {@link WorkflowChangeStatus }
     * 
     */
    public WorkflowChangeStatus createWorkflowChangeStatus() {
        return new WorkflowChangeStatus();
    }

    /**
     * Create an instance of {@link GetFilesFromPathFolderResponse }
     * 
     */
    public GetFilesFromPathFolderResponse createGetFilesFromPathFolderResponse() {
        return new GetFilesFromPathFolderResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFileResponse }
     * 
     */
    public ArrayOfFileResponse createArrayOfFileResponse() {
        return new ArrayOfFileResponse();
    }

    /**
     * Create an instance of {@link AddFile }
     * 
     */
    public AddFile createAddFile() {
        return new AddFile();
    }

    /**
     * Create an instance of {@link FileRequest }
     * 
     */
    public FileRequest createFileRequest() {
        return new FileRequest();
    }

    /**
     * Create an instance of {@link GetDocumentiByArea }
     * 
     */
    public GetDocumentiByArea createGetDocumentiByArea() {
        return new GetDocumentiByArea();
    }

    /**
     * Create an instance of {@link AssociaFileFolderResponse }
     * 
     */
    public AssociaFileFolderResponse createAssociaFileFolderResponse() {
        return new AssociaFileFolderResponse();
    }

    /**
     * Create an instance of {@link CreaNuovaCartellaResponse }
     * 
     */
    public CreaNuovaCartellaResponse createCreaNuovaCartellaResponse() {
        return new CreaNuovaCartellaResponse();
    }

    /**
     * Create an instance of {@link FolderResponse }
     * 
     */
    public FolderResponse createFolderResponse() {
        return new FolderResponse();
    }

    /**
     * Create an instance of {@link GetFolderTreeResponse }
     * 
     */
    public GetFolderTreeResponse createGetFolderTreeResponse() {
        return new GetFolderTreeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSimpleTreeItem }
     * 
     */
    public ArrayOfSimpleTreeItem createArrayOfSimpleTreeItem() {
        return new ArrayOfSimpleTreeItem();
    }

    /**
     * Create an instance of {@link MoveFile }
     * 
     */
    public MoveFile createMoveFile() {
        return new MoveFile();
    }

    /**
     * Create an instance of {@link GetFileDetails }
     * 
     */
    public GetFileDetails createGetFileDetails() {
        return new GetFileDetails();
    }

    /**
     * Create an instance of {@link GetMetadatiByTipoDoc }
     * 
     */
    public GetMetadatiByTipoDoc createGetMetadatiByTipoDoc() {
        return new GetMetadatiByTipoDoc();
    }

    /**
     * Create an instance of {@link ModificaMetadatoResponse }
     * 
     */
    public ModificaMetadatoResponse createModificaMetadatoResponse() {
        return new ModificaMetadatoResponse();
    }

    /**
     * Create an instance of {@link SignDocument }
     * 
     */
    public SignDocument createSignDocument() {
        return new SignDocument();
    }

    /**
     * Create an instance of {@link UnidocsFirma }
     * 
     */
    public UnidocsFirma createUnidocsFirma() {
        return new UnidocsFirma();
    }

    /**
     * Create an instance of {@link GetCodiceIndividualeResponse }
     * 
     */
    public GetCodiceIndividualeResponse createGetCodiceIndividualeResponse() {
        return new GetCodiceIndividualeResponse();
    }

    /**
     * Create an instance of {@link GetSubFoldersFromIdFolderResponse }
     * 
     */
    public GetSubFoldersFromIdFolderResponse createGetSubFoldersFromIdFolderResponse() {
        return new GetSubFoldersFromIdFolderResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFolderResponse }
     * 
     */
    public ArrayOfFolderResponse createArrayOfFolderResponse() {
        return new ArrayOfFolderResponse();
    }

    /**
     * Create an instance of {@link SearchFilesResponse }
     * 
     */
    public SearchFilesResponse createSearchFilesResponse() {
        return new SearchFilesResponse();
    }

    /**
     * Create an instance of {@link WorkflowStart }
     * 
     */
    public WorkflowStart createWorkflowStart() {
        return new WorkflowStart();
    }

    /**
     * Create an instance of {@link GetPagedFilesFromIdFolderStatus }
     * 
     */
    public GetPagedFilesFromIdFolderStatus createGetPagedFilesFromIdFolderStatus() {
        return new GetPagedFilesFromIdFolderStatus();
    }

    /**
     * Create an instance of {@link GetInfoAboutFile }
     * 
     */
    public GetInfoAboutFile createGetInfoAboutFile() {
        return new GetInfoAboutFile();
    }

    /**
     * Create an instance of {@link WfDetachResponse }
     * 
     */
    public WfDetachResponse createWfDetachResponse() {
        return new WfDetachResponse();
    }

    /**
     * Create an instance of {@link AggiungiMetadatoResponse }
     * 
     */
    public AggiungiMetadatoResponse createAggiungiMetadatoResponse() {
        return new AggiungiMetadatoResponse();
    }

    /**
     * Create an instance of {@link CreaNuovoRegistro }
     * 
     */
    public CreaNuovoRegistro createCreaNuovoRegistro() {
        return new CreaNuovoRegistro();
    }

    /**
     * Create an instance of {@link GetDocumentiByAreaResponse }
     * 
     */
    public GetDocumentiByAreaResponse createGetDocumentiByAreaResponse() {
        return new GetDocumentiByAreaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentiPerAree }
     * 
     */
    public ArrayOfDocumentiPerAree createArrayOfDocumentiPerAree() {
        return new ArrayOfDocumentiPerAree();
    }

    /**
     * Create an instance of {@link GetInfoAboutFileResponse }
     * 
     */
    public GetInfoAboutFileResponse createGetInfoAboutFileResponse() {
        return new GetInfoAboutFileResponse();
    }

    /**
     * Create an instance of {@link MoveFileResponse }
     * 
     */
    public MoveFileResponse createMoveFileResponse() {
        return new MoveFileResponse();
    }

    /**
     * Create an instance of {@link UpdateMergeResponse }
     * 
     */
    public UpdateMergeResponse createUpdateMergeResponse() {
        return new UpdateMergeResponse();
    }

    /**
     * Create an instance of {@link SearchFiles }
     * 
     */
    public SearchFiles createSearchFiles() {
        return new SearchFiles();
    }

    /**
     * Create an instance of {@link ArrayOfUnidocFolder }
     * 
     */
    public ArrayOfUnidocFolder createArrayOfUnidocFolder() {
        return new ArrayOfUnidocFolder();
    }

    /**
     * Create an instance of {@link ArrayOfUnidocTypes }
     * 
     */
    public ArrayOfUnidocTypes createArrayOfUnidocTypes() {
        return new ArrayOfUnidocTypes();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfUnidocsMetadata }
     * 
     */
    public ArrayOfArrayOfUnidocsMetadata createArrayOfArrayOfUnidocsMetadata() {
        return new ArrayOfArrayOfUnidocsMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfStrings }
     * 
     */
    public ArrayOfStrings createArrayOfStrings() {
        return new ArrayOfStrings();
    }

    /**
     * Create an instance of {@link WorkflowChangeStatusResponse }
     * 
     */
    public WorkflowChangeStatusResponse createWorkflowChangeStatusResponse() {
        return new WorkflowChangeStatusResponse();
    }

    /**
     * Create an instance of {@link CreaRootDirectories }
     * 
     */
    public CreaRootDirectories createCreaRootDirectories() {
        return new CreaRootDirectories();
    }

    /**
     * Create an instance of {@link GetMetadatiByTipoDocResponse }
     * 
     */
    public GetMetadatiByTipoDocResponse createGetMetadatiByTipoDocResponse() {
        return new GetMetadatiByTipoDocResponse();
    }

    /**
     * Create an instance of {@link DeleteFile }
     * 
     */
    public DeleteFile createDeleteFile() {
        return new DeleteFile();
    }

    /**
     * Create an instance of {@link GetFileUrlResponse }
     * 
     */
    public GetFileUrlResponse createGetFileUrlResponse() {
        return new GetFileUrlResponse();
    }

    /**
     * Create an instance of {@link GetFilesFromIdFolderResponse }
     * 
     */
    public GetFilesFromIdFolderResponse createGetFilesFromIdFolderResponse() {
        return new GetFilesFromIdFolderResponse();
    }

    /**
     * Create an instance of {@link WorkflowGetStatus }
     * 
     */
    public WorkflowGetStatus createWorkflowGetStatus() {
        return new WorkflowGetStatus();
    }

    /**
     * Create an instance of {@link GetFilesFromIdFolder }
     * 
     */
    public GetFilesFromIdFolder createGetFilesFromIdFolder() {
        return new GetFilesFromIdFolder();
    }

    /**
     * Create an instance of {@link AssociaFileFolder }
     * 
     */
    public AssociaFileFolder createAssociaFileFolder() {
        return new AssociaFileFolder();
    }

    /**
     * Create an instance of {@link GetRegistriByFiltroCodice }
     * 
     */
    public GetRegistriByFiltroCodice createGetRegistriByFiltroCodice() {
        return new GetRegistriByFiltroCodice();
    }

    /**
     * Create an instance of {@link GetPagedFilesFromIdFolderResponse }
     * 
     */
    public GetPagedFilesFromIdFolderResponse createGetPagedFilesFromIdFolderResponse() {
        return new GetPagedFilesFromIdFolderResponse();
    }

    /**
     * Create an instance of {@link GetFoldersByAreaResponse }
     * 
     */
    public GetFoldersByAreaResponse createGetFoldersByAreaResponse() {
        return new GetFoldersByAreaResponse();
    }

    /**
     * Create an instance of {@link CreaRootDirectoriesResponse }
     * 
     */
    public CreaRootDirectoriesResponse createCreaRootDirectoriesResponse() {
        return new CreaRootDirectoriesResponse();
    }

    /**
     * Create an instance of {@link WfDetach }
     * 
     */
    public WfDetach createWfDetach() {
        return new WfDetach();
    }

    /**
     * Create an instance of {@link CreaNuovoRegistroResponse }
     * 
     */
    public CreaNuovoRegistroResponse createCreaNuovoRegistroResponse() {
        return new CreaNuovoRegistroResponse();
    }

    /**
     * Create an instance of {@link ModificaMetadato }
     * 
     */
    public ModificaMetadato createModificaMetadato() {
        return new ModificaMetadato();
    }

    /**
     * Create an instance of {@link SendMailResponse }
     * 
     */
    public SendMailResponse createSendMailResponse() {
        return new SendMailResponse();
    }

    /**
     * Create an instance of {@link UpdateMerge }
     * 
     */
    public UpdateMerge createUpdateMerge() {
        return new UpdateMerge();
    }

    /**
     * Create an instance of {@link WorkflowStartResponse }
     * 
     */
    public WorkflowStartResponse createWorkflowStartResponse() {
        return new WorkflowStartResponse();
    }

    /**
     * Create an instance of {@link GetCodiceIndividuale }
     * 
     */
    public GetCodiceIndividuale createGetCodiceIndividuale() {
        return new GetCodiceIndividuale();
    }

    /**
     * Create an instance of {@link CreaNuovaCartella }
     * 
     */
    public CreaNuovaCartella createCreaNuovaCartella() {
        return new CreaNuovaCartella();
    }

    /**
     * Create an instance of {@link DocumentiPerAree }
     * 
     */
    public DocumentiPerAree createDocumentiPerAree() {
        return new DocumentiPerAree();
    }

    /**
     * Create an instance of {@link SimpleTreeItem }
     * 
     */
    public SimpleTreeItem createSimpleTreeItem() {
        return new SimpleTreeItem();
    }

    /**
     * Create an instance of {@link ArrayOfUnidocsMetadata }
     * 
     */
    public ArrayOfUnidocsMetadata createArrayOfUnidocsMetadata() {
        return new ArrayOfUnidocsMetadata();
    }

    /**
     * Create an instance of {@link UnidocTypes }
     * 
     */
    public UnidocTypes createUnidocTypes() {
        return new UnidocTypes();
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link BaseResultItem }
     * 
     */
    public BaseResultItem createBaseResultItem() {
        return new BaseResultItem();
    }

    /**
     * Create an instance of {@link UnidocFolder }
     * 
     */
    public UnidocFolder createUnidocFolder() {
        return new UnidocFolder();
    }

    /**
     * Create an instance of {@link ArrayOfStringss }
     * 
     */
    public ArrayOfStringss createArrayOfStringss() {
        return new ArrayOfStringss();
    }

    /**
     * Create an instance of {@link Messaggio }
     * 
     */
    public Messaggio createMessaggio() {
        return new Messaggio();
    }

    /**
     * Create an instance of {@link ArrayOfUnidocFiles }
     * 
     */
    public ArrayOfUnidocFiles createArrayOfUnidocFiles() {
        return new ArrayOfUnidocFiles();
    }

    /**
     * Create an instance of {@link UnidocTypess }
     * 
     */
    public UnidocTypess createUnidocTypess() {
        return new UnidocTypess();
    }

    /**
     * Create an instance of {@link Metadato }
     * 
     */
    public Metadato createMetadato() {
        return new Metadato();
    }

    /**
     * Create an instance of {@link ArrayOfUnidocsMetadatas }
     * 
     */
    public ArrayOfUnidocsMetadatas createArrayOfUnidocsMetadatas() {
        return new ArrayOfUnidocsMetadatas();
    }

    /**
     * Create an instance of {@link UnidocsMetadatas }
     * 
     */
    public UnidocsMetadatas createUnidocsMetadatas() {
        return new UnidocsMetadatas();
    }

    /**
     * Create an instance of {@link AreaResponse }
     * 
     */
    public AreaResponse createAreaResponse() {
        return new AreaResponse();
    }

    /**
     * Create an instance of {@link FileWf }
     * 
     */
    public FileWf createFileWf() {
        return new FileWf();
    }

    /**
     * Create an instance of {@link ArrayOfWfStatus }
     * 
     */
    public ArrayOfWfStatus createArrayOfWfStatus() {
        return new ArrayOfWfStatus();
    }

    /**
     * Create an instance of {@link UnidocFolders }
     * 
     */
    public UnidocFolders createUnidocFolders() {
        return new UnidocFolders();
    }

    /**
     * Create an instance of {@link Wf }
     * 
     */
    public Wf createWf() {
        return new Wf();
    }

    /**
     * Create an instance of {@link Areas }
     * 
     */
    public Areas createAreas() {
        return new Areas();
    }

    /**
     * Create an instance of {@link ArrayOfFileWf }
     * 
     */
    public ArrayOfFileWf createArrayOfFileWf() {
        return new ArrayOfFileWf();
    }

    /**
     * Create an instance of {@link WfStatus }
     * 
     */
    public WfStatus createWfStatus() {
        return new WfStatus();
    }

    /**
     * Create an instance of {@link ArrayOfFileResponses }
     * 
     */
    public ArrayOfFileResponses createArrayOfFileResponses() {
        return new ArrayOfFileResponses();
    }

    /**
     * Create an instance of {@link UnidocFiles }
     * 
     */
    public UnidocFiles createUnidocFiles() {
        return new UnidocFiles();
    }

    /**
     * Create an instance of {@link ArrayOfMetadato }
     * 
     */
    public ArrayOfMetadato createArrayOfMetadato() {
        return new ArrayOfMetadato();
    }

    /**
     * Create an instance of {@link FileMetatag }
     * 
     */
    public FileMetatag createFileMetatag() {
        return new FileMetatag();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "request")
    public JAXBElement<FileRequest> createRequest(FileRequest value) {
        return new JAXBElement<FileRequest>(_Request_QNAME, FileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creaRootDirectoriesResult")
    public JAXBElement<FolderResponse> createCreaRootDirectoriesResult(FolderResponse value) {
        return new JAXBElement<FolderResponse>(_CreaRootDirectoriesResult_QNAME, FolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidocMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email")
    public JAXBElement<UnidocMail> createEmail(UnidocMail value) {
        return new JAXBElement<UnidocMail>(_Email_QNAME, UnidocMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UpdateMergeResult")
    public JAXBElement<FileResponse> createUpdateMergeResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_UpdateMergeResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WorkflowGetStatusResult")
    public JAXBElement<WorkFlow> createWorkflowGetStatusResult(WorkFlow value) {
        return new JAXBElement<WorkFlow>(_WorkflowGetStatusResult_QNAME, WorkFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WorkflowStartResult")
    public JAXBElement<WorkFlow> createWorkflowStartResult(WorkFlow value) {
        return new JAXBElement<WorkFlow>(_WorkflowStartResult_QNAME, WorkFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modificaMetadatoResult")
    public JAXBElement<FileResponse> createModificaMetadatoResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_ModificaMetadatoResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponseList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "getPagedFilesFromIdFolderStatusResult")
    public JAXBElement<FileResponseList> createGetPagedFilesFromIdFolderStatusResult(FileResponseList value) {
        return new JAXBElement<FileResponseList>(_GetPagedFilesFromIdFolderStatusResult_QNAME, FileResponseList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GetMetadatiByTipoDocResult")
    public JAXBElement<FileResponse> createGetMetadatiByTipoDocResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_GetMetadatiByTipoDocResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponseList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "getPagedFilesFromIdFolderResult")
    public JAXBElement<FileResponseList> createGetPagedFilesFromIdFolderResult(FileResponseList value) {
        return new JAXBElement<FileResponseList>(_GetPagedFilesFromIdFolderResult_QNAME, FileResponseList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WorkflowChangeStatusResult")
    public JAXBElement<WorkFlow> createWorkflowChangeStatusResult(WorkFlow value) {
        return new JAXBElement<WorkFlow>(_WorkflowChangeStatusResult_QNAME, WorkFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "file")
    public JAXBElement<FileRequest> createFile(FileRequest value) {
        return new JAXBElement<FileRequest>(_File_QNAME, FileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "aggiungiMetadatoResult")
    public JAXBElement<FileResponse> createAggiungiMetadatoResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_AggiungiMetadatoResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creaNuovoRegistroResult")
    public JAXBElement<FileResponse> createCreaNuovoRegistroResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_CreaNuovoRegistroResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GetFileDetailsResult")
    public JAXBElement<FileResponse> createGetFileDetailsResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_GetFileDetailsResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WfDetachResult")
    public JAXBElement<WorkFlow> createWfDetachResult(WorkFlow value) {
        return new JAXBElement<WorkFlow>(_WfDetachResult_QNAME, WorkFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "signDocumentResult")
    public JAXBElement<FileResponse> createSignDocumentResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_SignDocumentResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GetInfoAboutFileResult")
    public JAXBElement<FileResponse> createGetInfoAboutFileResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_GetInfoAboutFileResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "moveFileResult")
    public JAXBElement<FileResponse> createMoveFileResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_MoveFileResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CreaNuovaCartellaResult")
    public JAXBElement<FolderResponse> createCreaNuovaCartellaResult(FolderResponse value) {
        return new JAXBElement<FolderResponse>(_CreaNuovaCartellaResult_QNAME, FolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidocsFirma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "firma")
    public JAXBElement<UnidocsFirma> createFirma(UnidocsFirma value) {
        return new JAXBElement<UnidocsFirma>(_Firma_QNAME, UnidocsFirma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sendMailResult")
    public JAXBElement<FileResponse> createSendMailResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_SendMailResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "deleteFileResult")
    public JAXBElement<FileResponse> createDeleteFileResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_DeleteFileResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AddFileResult")
    public JAXBElement<FileResponse> createAddFileResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_AddFileResult_QNAME, FileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fileToSave")
    public JAXBElement<FileRequest> createFileToSave(FileRequest value) {
        return new JAXBElement<FileRequest>(_FileToSave_QNAME, FileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponseList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchFilesResult")
    public JAXBElement<FileResponseList> createSearchFilesResult(FileResponseList value) {
        return new JAXBElement<FileResponseList>(_SearchFilesResult_QNAME, FileResponseList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AssociaFileFolderResult")
    public JAXBElement<FileResponse> createAssociaFileFolderResult(FileResponse value) {
        return new JAXBElement<FileResponse>(_AssociaFileFolderResult_QNAME, FileResponse.class, null, value);
    }

}
