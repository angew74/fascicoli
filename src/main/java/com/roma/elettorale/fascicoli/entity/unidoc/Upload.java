package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.*;


public class Upload
{
   private UploadResponse UploadResponse;

    public UploadResponse getUploadResponse ()
    {
        return UploadResponse;
    }

    public void setUploadResponse (UploadResponse UploadResponse)
    {
        this.UploadResponse = UploadResponse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [UploadResponse = "+UploadResponse+"]";
    }
}

