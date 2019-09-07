package com.roma.elettorale.fascicoli.sviluppo.contract;

import com.roma.elettorale.fascicoli.sviluppo.entity.pacchetto;

import java.time.LocalDate;
import java.util.List;

public interface IPacchettoService  {

    pacchetto findById(Integer id);
    pacchetto findByNumero(String numero);
    List<pacchetto> findByDatacarimento(LocalDate data);
    void save(pacchetto p);
    Integer maxNumero();

}
