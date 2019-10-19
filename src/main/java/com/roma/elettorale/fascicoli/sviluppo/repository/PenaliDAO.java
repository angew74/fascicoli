package com.roma.elettorale.fascicoli.sviluppo.repository;

import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;
import com.roma.elettorale.fascicoli.sviluppo.entity.casellario;
import com.roma.elettorale.fascicoli.sviluppo.entity.penali;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PenaliDAO extends JpaRepository<penali, Long> {

    List<penali> findFirst1000ByFlgoperazione(int flg);
    List<penali> findFirst1000ByFlgoperazioneAndProgrammaelaborazione(int flg,String pgm);
    List<penali> findFirst1000ByCodicefiscale(String codice);
}
