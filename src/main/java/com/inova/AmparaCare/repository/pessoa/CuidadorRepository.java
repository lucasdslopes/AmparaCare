package com.inova.AmparaCare.repository.pessoa;

import com.inova.AmparaCare.entity.pessoa.Cuidador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuidadorRepository extends JpaRepository<Cuidador, Long> {
}
