package cuidador.care.model.pessoa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cuidador extends Pessoa {

	@Column(name = "experiencia_anos")
	private Integer experienciaAnos;
	@Column(name = "especialidades")
	private String especialidades;
	@Column(name = "avaliacao_media")
	private Double avaliacaoMedia = 0.0;

}
