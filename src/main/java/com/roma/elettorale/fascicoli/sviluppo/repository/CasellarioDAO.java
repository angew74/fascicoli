package com.roma.elettorale.fascicoli.sviluppo.repository;

import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;
import com.roma.elettorale.fascicoli.sviluppo.entity.casellario;
import com.roma.elettorale.fascicoli.sviluppo.entity.pacchetto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface CasellarioDAO extends JpaRepository<casellario, Long> {

    casellario findById(Integer id);
    casellario findByNumero(String numero);
    List<casellario> findByDatacarimento(LocalDate data);

}
