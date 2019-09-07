package com.roma.elettorale.fascicoli.sviluppo.repository;

import com.roma.elettorale.fascicoli.sviluppo.entity.pacchetto;
import net.bytebuddy.asm.Advice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PacchettoDAO extends JpaRepository<pacchetto, Long> {

    pacchetto findById(Integer id);
    pacchetto findByNumero(String numero);
    List<pacchetto> findByDatacarimento(LocalDate data);
    @Query("SELECT coalesce(max(ch.numero), 0) FROM pacchetto ch")
    Integer getMaxId();
}
