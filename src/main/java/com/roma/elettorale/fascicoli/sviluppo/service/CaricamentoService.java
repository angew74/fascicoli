package com.roma.elettorale.fascicoli.sviluppo.service;

import com.roma.elettorale.fascicoli.sviluppo.contract.ICaricamentoService;
import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;
import com.roma.elettorale.fascicoli.sviluppo.repository.CaricamentoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CaricamentoService implements ICaricamentoService {

    @Autowired
    CaricamentoDAO caricamentoDAO;

    @Override
    public List<caricamento> findFirst1000ByFlgoperazione(int flg) {
        return caricamentoDAO.findFirst1000ByFlgoperazione(flg);
    }

    @Override
    public List<caricamento> findFirst1000ByFlgoperazioneAndProgrammaelaborazione(int flg, String pgm) {
        return caricamentoDAO.findFirst1000ByFlgoperazioneAndProgrammaelaborazione(flg, pgm);
    }

    @Override
    public List<caricamento> findFirst1000ByFlgoperazioneAndCodicecertificato(int flg, String codice) {
        return caricamentoDAO.findFirst1000ByFlgoperazioneAndCodicecertificato(flg, codice);
    }



    @Override
    public void Save(caricamento c) {
        caricamentoDAO.saveAndFlush(c);
    }

}
