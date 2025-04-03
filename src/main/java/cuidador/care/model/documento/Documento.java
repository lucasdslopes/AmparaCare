package cuidador.care.model.documento;

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
public class Documento{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDocumento")
	private Long id;
	@Column(name = "dataSolicitacao")
	private String dataSolicitacao;
	@Column(name = "dataEmissao")
	private String dataEmissao;


}
