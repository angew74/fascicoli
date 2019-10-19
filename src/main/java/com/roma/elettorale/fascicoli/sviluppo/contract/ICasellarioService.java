package com.roma.elettorale.fascicoli.sviluppo.contract;

import com.roma.elettorale.fascicoli.sviluppo.entity.casellario;

import java.time.LocalDate;
import java.util.List;

public interface ICasellarioService {

    casellario findById(Integer id);
    casellario findByNumero(String numero);
    List<casellario> findByDatacarimento(LocalDate data);
    void save(casellario p);
}
