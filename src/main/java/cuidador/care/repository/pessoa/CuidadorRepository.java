package cuidador.care.repository.pessoa;

import cuidador.care.model.pessoa.Cuidador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuidadorRepository extends JpaRepository<Cuidador, Long> {
}