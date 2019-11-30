package com.roma.elettorale.fascicoli.sviluppo.service;

import com.roma.elettorale.fascicoli.sviluppo.contract.ICaricamentoGiudiceService;
import com.roma.elettorale.fascicoli.sviluppo.entity.caricamentogiudice;
import com.roma.elettorale.fascicoli.sviluppo.repository.CaricamentoGiudiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CaricamentoGiudiceService implements ICaricamentoGiudiceService {

    @Autowired
    CaricamentoGiudiceDAO caricamentoGiudiceDAO;

    @Override
    public List<caricamentogiudice> findFirst1000ByFlgoperazione(int flg) {
        return caricamentoGiudiceDAO.findFirst1000ByFlgoperazione(flg);
    }

    @Override
    public List<caricamentogiudice> findFirst1000ByFlgoperazioneAndProgrammaelaborazione(int flg, String pgm) {
        return caricamentoGiudiceDAO.findFirst1000ByFlgoperazioneAndProgrammaelaborazione(flg,pgm);
    }

    @Override
    public List<caricamentogiudice> findFirst1000ByFlgoperazioneAndCodicecertificato(int flg, String codice) {
        return caricamentoGiudiceDAO.findFirst1000ByFlgoperazioneAndCodicecertificato(flg,codice);
    }

    @Override
    public void Save(caricamentogiudice list) {
        caricamentoGiudiceDAO.save(list);
    }
}
