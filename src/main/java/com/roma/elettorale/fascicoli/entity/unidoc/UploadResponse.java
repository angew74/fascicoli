package com.roma.elettorale.fascicoli.entity.unidoc;

public class UploadResponse
{
    private Message Message;

    public Message getMessage ()
    {
        return Message;
    }

    public void setMessage (Message Message)
    {
        this.Message = Message;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Message = "+Message+"]";
    }
}