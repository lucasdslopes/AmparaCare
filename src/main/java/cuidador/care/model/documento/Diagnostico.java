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
public class Diagnostico extends Documento {

	@Column(name = "estadoGeral")
	private String estadoGeral;
	@Column(name = "sinaisVitais")
	private String sinaisVitais;
	@Column(name = "idDispositivo")
	private String idDispositivo;
	@Column(name = "idCuidador")
	private String idCuidador;
	@Column(name = "idServico")
	private String idServico;
	@Column(name = "sinaisQueda")
	private String sinaisQueda;




}
