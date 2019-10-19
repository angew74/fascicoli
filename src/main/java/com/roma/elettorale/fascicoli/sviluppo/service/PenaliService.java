package com.roma.elettorale.fascicoli.sviluppo.service;

import com.roma.elettorale.fascicoli.sviluppo.contract.IPenaliService;
import com.roma.elettorale.fascicoli.sviluppo.entity.penali;
import com.roma.elettorale.fascicoli.sviluppo.repository.PenaliDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class PenaliService implements IPenaliService {

    @Autowired
    PenaliDAO penaliDAO;

    @Override
    public List<penali> findFirst1000ByFlgoperazione(int flg) {
        return penaliDAO.findFirst1000ByFlgoperazione(flg);
    }

    @Override
    public List<penali> findFirst1000ByFlgoperazioneAndProgrammaelaborazione(int flg, String pgm) {
        return penaliDAO.findFirst1000ByFlgoperazioneAndProgrammaelaborazione(flg,pgm);
    }

    @Override
    public List<penali> findFirst1000ByCodicefiscale(String codice) {
        return penaliDAO.findFirst1000ByCodicefiscale(codice);
    }

    @Override
    public void Save(penali p) {
       penaliDAO.save(p);
    }
}
