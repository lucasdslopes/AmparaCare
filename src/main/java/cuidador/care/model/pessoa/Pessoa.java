package cuidador.care.model.pessoa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPessoa")
	private Long id;
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "nome")
	private String nome;
	@Column(name = "genero")
	private String genero;
	@Column(name = "endereco")
	private String endereco;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "senha")
	private Long senha;
	@Column(name = "email")
	private String email;
	@Column(name = "telefone")
	private String telefone;

}