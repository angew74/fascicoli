package com.roma.elettorale.fascicoli.sviluppo.repository;

import com.roma.elettorale.fascicoli.sviluppo.entity.caricamentogiudice;
import com.roma.elettorale.fascicoli.sviluppo.entity.pacchettogiudice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface CaricamentoGiudiceDAO extends JpaRepository<caricamentogiudice, Long> {

    List<caricamentogiudice> findFirst1000ByFlgoperazione(int flg);
    List<caricamentogiudice> findFirst1000ByFlgoperazioneAndProgrammaelaborazione(int flg,String pgm);
    List<caricamentogiudice> findFirst1000ByFlgoperazioneAndCodicecertificato(int flg,String codice);
}
