package cuidador.care.repository.documento;

import cuidador.care.model.documento.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
}
