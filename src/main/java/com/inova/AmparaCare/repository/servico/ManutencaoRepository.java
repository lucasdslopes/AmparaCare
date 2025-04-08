package com.inova.AmparaCare.repository.servico;

import com.inova.AmparaCare.entity.servico.Manutencao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManutencaoRepository extends JpaRepository<Manutencao,Long> {
}
