package cuidador.care.model.servico;

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
public class Emergencia extends Servico {

	@Column(name = "tipoEmergencia")
	private String tipoEmergencia;
	@Column(name = "medicoResponsavel")
	private String medicoResponsavel;
	@Column(name = "gravidade")
	private String gravidade;

	
	
}
