package com.roma.elettorale.fascicoli.sviluppo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "PENALI")
public class penali  {




    @Id
    @Column(name = "ID_ELEMENTO")
    private Integer id;

    @Column(name = "codice_individuale")
    private String codiceindividuale;

    @Column(name = "codice_fiscale")
    private String codicefiscale;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "data_nascita")
    private String datanascita;


    @Column(name = "flg_operazione")
    private Integer flgoperazione;

    @Column(name = "data_operazione")
    private LocalDateTime dataoperazione;

    @Column(name = "programma_operazione")
    private String programmaelaborazione;

    @Column(name = "descrizione_errore")
    private String descrizioneerrore;

    @Column(name = "ref_id_casellario")
    private Integer refidcasellario;

    @Column(name="PAHTFILE")
    private String pathFile;

    @Column(name="esito")
    private String esito;

    @Column(name="DESC_ESITO")
    private String descrizioneEsito;

    @Column(name = "sinonimi")
    private String sinonimi;

    @Column(name = "aliasrichiamo")
    private String aliasrichiamo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodiceindividuale() {
        return codiceindividuale;
    }

    public void setCodiceindividuale(String codiceindividuale) {
        this.codiceindividuale = codiceindividuale;
    }



    public Integer getFlgoperazione() {
        return flgoperazione;
    }

    public void setFlgoperazione(Integer flgoperazione) {
        this.flgoperazione = flgoperazione;
    }

    public LocalDateTime getDataoperazione() {
        return dataoperazione;
    }

    public void setDataoperazione(LocalDateTime dataoperazione) {
        this.dataoperazione = dataoperazione;
    }

    public String getProgrammaelaborazione() {
        return programmaelaborazione;
    }

    public void setProgrammaelaborazione(String programmaelaborazione) {
        this.programmaelaborazione = programmaelaborazione;
    }

    public String getDescrizioneerrore() {
        return descrizioneerrore;
    }

    public void setDescrizioneerrore(String descrizioneerrore) {
        this.descrizioneerrore = descrizioneerrore;
    }


    public String getCodicefiscale() {
        return codicefiscale;
    }

    public void setCodicefiscale(String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getRefidcasellario() {
        return refidcasellario;
    }

    public void setRefidcasellario(Integer refidcasellario) {
        this.refidcasellario = refidcasellario;
    }

    public String getSinonimi() {
        return sinonimi;
    }

    public void setSinonimi(String sinonimi) {
        this.sinonimi = sinonimi;
    }

    public String getAliasrichiamo() {
        return aliasrichiamo;
    }

    public void setAliasrichiamo(String aliasrichiamo) {
        this.aliasrichiamo = aliasrichiamo;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getEsito() {
        return esito;
    }

    public void setEsito(String esito) {
        this.esito = esito;
    }

    public String getDatanascita() {
        return datanascita;
    }

    public void setDatanascita(String datanascita) {
        this.datanascita = datanascita;
    }

    public String getDescrizioneEsito() {
        return descrizioneEsito;
    }

    public void setDescrizioneEsito(String descrizioneEsito) {
        this.descrizioneEsito = descrizioneEsito;
    }
}
