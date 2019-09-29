package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadResponse", namespace = "", propOrder = {
        "message" ,
        "downloadUrl"
})
public class UploadResponse {

    public UploadResponse() {
        this.message = new message();
    }

    public UploadResponse(String codice, String livello, String attore, String descrizione) {
        this.message = new message();
    }


    public String getDownloadUrl() {
        return downloadUrl;
    }

    public message getMessage() {
        return message;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setMessage(message message) {
        this.message = message;
    }

    @XmlElement(name = "DownLoadUrl", namespace = "http://tempuri.org/")
    protected String downloadUrl;

    @XmlElement(name = "Message", namespace = "http://tempuri.org/")
    protected message message;


}
