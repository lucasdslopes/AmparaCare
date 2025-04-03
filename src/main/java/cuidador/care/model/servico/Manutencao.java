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
public class Manutencao extends Servico {

	@Column(name = "custo")
	private float custo;
	@Column(name = "dataManutencao")
	private String dataManutencao;
	@Column(name = "status")
	private String status;

	
}