package com.roma.elettorale.fascicoli.sviluppo.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CARICAMENTI_GIUDICI")
public class caricamentogiudice {


    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CARICAMENTI_GIUDICI_SEQ")
    @SequenceGenerator(name = "CARICAMENTI_GIUDICI_SEQ_ALL", sequenceName = "CARICAMENTI_GIUDICCI_SEQ")
    private Integer id;

    @Column(name = "codice_individuale")
    private String codiceindividuale;

    @Column(name = "codice_certificato")
    private String codicecertificato;

    @Column(name = "flg_operazione")
    private Integer flgoperazione;

    @Column(name = "data_operazione")
    private LocalDateTime dataoperazione;

    @Column(name = "programma_operazione")
    private String programmaelaborazione;

    @Column(name = "descrizione_errore")
    private String descrizioneerrore;

    @Column(name = "ref_id_pacchetto")
    private Integer refidpacchetto;

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

    public String getCodicecertificato() {
        return codicecertificato;
    }

    public void setCodicecertificato(String codicecertificato) {
        this.codicecertificato = codicecertificato;
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

    public Integer getRefidpacchetto() {
        return refidpacchetto;
    }

    public void setRefidpacchetto(Integer refidpacchetto) {
        this.refidpacchetto = refidpacchetto;
    }
}
