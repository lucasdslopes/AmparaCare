package com.inova.AmparaCare.repository.servico;

import com.inova.AmparaCare.entity.servico.Emergencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergenciaRepository extends JpaRepository<Emergencia,Long> {
}


