package com.roma.elettorale.fascicoli.sviluppo.repository;

import com.roma.elettorale.fascicoli.sviluppo.entity.pacchettogiudice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface PacchettoGiudiceDAO extends JpaRepository<pacchettogiudice, Long> {

    pacchettogiudice findById(Integer id);
    pacchettogiudice findByNumero(String numero);
    List<pacchettogiudice> findByDatacarimento(LocalDate data);
    @Query("SELECT coalesce(max(ch.numero), 0) FROM pacchettogiudice ch where id=(select max(id) from pacchettogiudice)")
    Integer getMaxId();
}
