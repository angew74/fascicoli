package com.roma.elettorale.fascicoli.sviluppo.contract;

import com.roma.elettorale.fascicoli.sviluppo.entity.caricamento;
import com.roma.elettorale.fascicoli.sviluppo.entity.penali;

import java.util.List;

public interface IPenaliService {


    List<penali> findFirst1000ByFlgoperazione(int flg);
    List<penali> findFirst1000ByFlgoperazioneAndProgrammaelaborazione(int flg,String pgm);
    List<penali> findFirst1000ByCodicefiscale(String codice);
    void Save(penali list);
}
