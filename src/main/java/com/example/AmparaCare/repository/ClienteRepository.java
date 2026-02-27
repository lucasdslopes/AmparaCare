package com.example.AmparaCare.repository;

import com.example.AmparaCare.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
