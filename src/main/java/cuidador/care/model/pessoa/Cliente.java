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

	@Column(name = "senha")
	private String senha;
	@Column(name = "email")
	private String email;
	@Column(name = "idDispositivo")
	private String idDispositivo;
	

	
}
