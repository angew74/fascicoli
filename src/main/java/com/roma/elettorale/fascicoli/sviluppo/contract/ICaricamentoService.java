package com.roma.elettorale.fascicoli.sviluppo.contract;

import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;

import java.util.List;

public interface ICaricamentoService {


    List<caricamento> findFirst1000ByFlgoperazione(int flg);
    List<caricamento> findFirst1000ByFlgoperazioneAndProgrammaelaborazione(int flg,String pgm);
    List<caricamento> findFirst1000ByFlgoperazioneAndCodicecertificato(int flg,String codice);
    void Save(caricamento list);

}




