package com.inova.AmparaCare.repository.produto;

import com.inova.AmparaCare.entity.produto.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo,Long> {
}
