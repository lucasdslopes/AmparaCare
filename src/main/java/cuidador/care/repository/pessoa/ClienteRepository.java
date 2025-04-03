package cuidador.care.repository.pessoa;

import cuidador.care.model.pessoa.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
