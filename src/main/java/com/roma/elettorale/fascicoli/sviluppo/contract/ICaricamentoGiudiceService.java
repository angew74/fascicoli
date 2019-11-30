package com.roma.elettorale.fascicoli.sviluppo.contract;

import com.roma.elettorale.fascicoli.sviluppo.entity.caricamentogiudice;

import java.util.List;

public interface ICaricamentoGiudiceService {

    List<caricamentogiudice> findFirst1000ByFlgoperazione(int flg);
    List<caricamentogiudice> findFirst1000ByFlgoperazioneAndProgrammaelaborazione(int flg,String pgm);
    List<caricamentogiudice> findFirst1000ByFlgoperazioneAndCodicecertificato(int flg,String codice);
    void Save(caricamentogiudice list);
}
