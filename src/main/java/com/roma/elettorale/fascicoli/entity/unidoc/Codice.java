package com.roma.elettorale.fascicoli.entity.unidoc;
public class Codice
{
    private String xmlns;

    private String content;

    public String getXmlns ()
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [xmlns = "+xmlns+", content = "+content+"]";
    }
}

