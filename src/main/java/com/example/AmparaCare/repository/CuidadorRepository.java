package com.example.AmparaCare.repository;

import com.example.AmparaCare.model.Cuidador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CuidadorRepository extends JpaRepository<Cuidador, Long> {

    Optional<Cuidador> findByCpf(String cpf);
}
