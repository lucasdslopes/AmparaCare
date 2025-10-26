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
public class Cliente extends Pessoa {

	@Column(name = "idDispositivo")
	private String idDispositivo;
	@Column(name = "limite_batimentos_min")
	private Integer limiteBatimentosMin = 50;
	@Column(name = "limite_batimentos_max")
	private Integer limiteBatimentosMax = 110;
	@Column(name = "condicoes_medicas")
	private String condicoesMedicas;



}
