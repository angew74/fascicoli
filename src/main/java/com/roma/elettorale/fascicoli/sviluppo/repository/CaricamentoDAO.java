package com.roma.elettorale.fascicoli.sviluppo.repository;

import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CaricamentoDAO extends JpaRepository<caricamento, Long> {

    List<caricamento> findFirst5000ByFlgoperazione(int flg);
    List<caricamento> findFirst1000ByFlgoperazioneAndProgrammaelaborazione(int flg,String pgm);
    List<caricamento> findFirst1000ByFlgoperazioneAndCodicecertificato(int flg,String codice);


}
