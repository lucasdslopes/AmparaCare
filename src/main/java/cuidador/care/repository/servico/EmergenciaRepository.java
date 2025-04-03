package cuidador.care.repository.servico;

import cuidador.care.model.servico.Emergencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmergenciaRepository extends JpaRepository<Emergencia,Long> {
}
