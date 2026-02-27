package com.example.AmparaCare.model;

import com.example.AmparaCare.DTO.DadosCadastroCuidador;
import com.example.AmparaCare.DTO.DadosCadastroPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Cuidador") // JPA DO JAVA
@Table(name = "cuidador") // BANCO DE DADOS
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Cuidador extends Pessoa{

    private String certificacao;
    private String experiencia;
    private Boolean disponivel;
    private Double valorHora;

    public Cuidador(DadosCadastroCuidador dados){
        super(new DadosCadastroPessoa(
                dados.nome(),
                dados.genero(),
                dados.cpf(),
                dados.telefone(),
                dados.email(),
                dados.endereco()
        ));
        this.certificacao = dados.certificacao();
        this.experiencia = dados.experiencia();
        this.disponivel = dados.disponivel();
        this.valorHora = dados.valorHora();
    }

}
