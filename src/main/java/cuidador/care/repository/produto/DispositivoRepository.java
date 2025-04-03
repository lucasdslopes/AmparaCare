package cuidador.care.repository.produto;

import cuidador.care.model.produto.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DispositivoRepository extends JpaRepository<Dispositivo,Long> {
}
