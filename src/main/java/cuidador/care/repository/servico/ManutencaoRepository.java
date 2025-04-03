package cuidador.care.repository.servico;

import cuidador.care.model.servico.Manutencao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManutencaoRepository extends JpaRepository<Manutencao,Long> {
}
