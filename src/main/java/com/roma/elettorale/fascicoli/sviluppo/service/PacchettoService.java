package com.roma.elettorale.fascicoli.sviluppo.service;

import com.roma.elettorale.fascicoli.sviluppo.contract.IPacchettoService;
import com.roma.elettorale.fascicoli.sviluppo.entity.pacchetto;
import com.roma.elettorale.fascicoli.sviluppo.repository.PacchettoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class PacchettoService implements IPacchettoService {

    @Autowired
    PacchettoDAO pacchettoDAO;

    @Override
    public pacchetto findById(Integer id) {
        return pacchettoDAO.findById(id);
    }

    @Override
    public pacchetto findByNumero(String numero) {
        return pacchettoDAO.findByNumero(numero);
    }

    @Override
    public List<pacchetto> findByDatacarimento(LocalDate data) {
        return pacchettoDAO.findByDatacarimento(data);
    }

    @Override
    public void save(pacchetto p) {
        pacchettoDAO.save(p);
    }

    @Override
    public Integer maxNumero() {
        return pacchettoDAO.getMaxId();
    }
}
