package com.roma.elettorale.fascicoli.sviluppo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "PACCHETTI")
public class pacchetto {


    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PACCHETTI_SEQ")
    @SequenceGenerator(name = "PACCHETTI_SEQ_ALL", sequenceName = "PACCHETTI_SEQ")
    private Integer id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "file_caricamento")
    private String filecaricamento;


    @Column(name = "data_caricamento")
    private LocalDate datacarimento;

    @Column(name = "numero_record")
    private Integer numerorecord;

    @Column(name = "numero_codici")
    private Integer numerocodici;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFilecaricamento() {
        return filecaricamento;
    }

    public void setFilecaricamento(String filecaricamento) {
        this.filecaricamento = filecaricamento;
    }

    public LocalDate getDatacarimento() {
        return datacarimento;
    }

    public void setDatacarimento(LocalDate datacarimento) {
        this.datacarimento = datacarimento;
    }

    public Integer getNumerorecord() {
        return numerorecord;
    }

    public void setNumerorecord(Integer numerorecord) {
        this.numerorecord = numerorecord;
    }


    public Integer getNumerocodici() {
        return numerocodici;
    }

    public void setNumerocodici(Integer numerocodici) {
        this.numerocodici = numerocodici;
    }
}
