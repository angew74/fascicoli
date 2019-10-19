package com.roma.elettorale.fascicoli.sviluppo.service;


import com.roma.elettorale.fascicoli.sviluppo.contract.ICasellarioService;
import com.roma.elettorale.fascicoli.sviluppo.entity.casellario;
import com.roma.elettorale.fascicoli.sviluppo.repository.CasellarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class CasellarioService implements ICasellarioService {

    @Autowired
    CasellarioDAO casellarioDAO;

    @Override
    public casellario findById(Integer id) {
        return casellarioDAO.findById(id);
    }

    @Override
    public casellario findByNumero(String numero) {
        return casellarioDAO.findByNumero(numero);
    }

    @Override
    public List<casellario> findByDatacarimento(LocalDate data) {
        return casellarioDAO.findByDatacarimento(data);
    }

    @Override
    public void save(casellario p) {
        casellarioDAO.saveAndFlush(p);
    }
}
