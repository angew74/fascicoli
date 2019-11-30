package com.roma.elettorale.fascicoli.sviluppo.contract;

import com.roma.elettorale.fascicoli.sviluppo.entity.pacchettogiudice;

import java.time.LocalDate;
import java.util.List;

public interface IPacchettoGiudiceService {

    pacchettogiudice findById(Integer id);
    pacchettogiudice findByNumero(String numero);
    List<pacchettogiudice> findByDatacarimento(LocalDate data);
    void save(pacchettogiudice p);
    Integer maxNumero();
}
