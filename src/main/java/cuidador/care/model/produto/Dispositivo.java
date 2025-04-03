package cuidador.care.model.produto;

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
public class Dispositivo extends Produto {

	@Column(name = "status")
	private String status;
	@Column(name = "versao")
	private String versao;

}
