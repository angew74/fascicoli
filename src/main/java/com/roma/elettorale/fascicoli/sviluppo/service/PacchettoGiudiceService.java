package com.roma.elettorale.fascicoli.sviluppo.service;

import com.roma.elettorale.fascicoli.sviluppo.contract.IPacchettoGiudiceService;
import com.roma.elettorale.fascicoli.sviluppo.entity.pacchettogiudice;
import com.roma.elettorale.fascicoli.sviluppo.repository.PacchettoGiudiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PacchettoGiudiceService implements IPacchettoGiudiceService {

    @Autowired
    PacchettoGiudiceDAO pacchettoGiudiceDAO;

    @Override
    public pacchettogiudice findById(Integer id) {
        return pacchettoGiudiceDAO.findById(id);
    }

    @Override
    public pacchettogiudice findByNumero(String numero) {
        return pacchettoGiudiceDAO.findByNumero(numero);
    }

    @Override
    public List<pacchettogiudice> findByDatacarimento(LocalDate data) {
        return pacchettoGiudiceDAO.findByDatacarimento(data);
    }

    @Override
    public void save(pacchettogiudice p) {
pacchettoGiudiceDAO.save(p);
    }

    @Override
    public Integer maxNumero() {
        return pacchettoGiudiceDAO.getMaxId();
    }
}
