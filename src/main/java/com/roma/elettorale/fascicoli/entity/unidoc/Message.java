package com.roma.elettorale.fascicoli.entity.unidoc;

import javax.xml.bind.annotation.XmlElement;

public class Message
{
    private DescrizioneMessaggio DescrizioneMessaggio;

    private Attore Attore;

    private Livello Livello;

    private Codice Codice;

    public DescrizioneMessaggio getDescrizioneMessaggio ()
    {
        return DescrizioneMessaggio;
    }

    public void setDescrizioneMessaggio (DescrizioneMessaggio DescrizioneMessaggio)
    {
        this.DescrizioneMessaggio = DescrizioneMessaggio;
    }

    public Attore getAttore ()
    {
        return Attore;
    }

    public void setAttore (Attore Attore)
    {
        this.Attore = Attore;
    }

    public Livello getLivello ()
    {
        return Livello;
    }

    public void setLivello (Livello Livello)
    {
        this.Livello = Livello;
    }

    public Codice getCodice ()
    {
        return Codice;
    }

    public void setCodice (Codice Codice)
    {
        this.Codice = Codice;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DescrizioneMessaggio = "+DescrizioneMessaggio+", Attore = "+Attore+", Livello = "+Livello+", Codice = "+Codice+"]";
    }
}

