package com.example.AmparaCare.model;

import com.example.AmparaCare.DTO.DadosAtualizacaoCuidador;
import com.example.AmparaCare.DTO.DadosAtualizacaoPessoa;
import com.example.AmparaCare.DTO.DadosCadastroCuidador;
import com.example.AmparaCare.DTO.DadosCadastroPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Cuidadores") // JPA DO JAVA
@Table(name = "cuidadores") // BANCO DE DADOS
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

    public void atualizarInformacoes(@Valid DadosAtualizacaoCuidador dados){
        super.atualizarInformacoes(new DadosAtualizacaoPessoa(
                dados.nome(),
                dados.genero(),
                dados.telefone(),
                dados.email(),
                dados.endereco()
        ));
        if(dados.certificacao() != null){
            this.certificacao = dados.certificacao();
        }
        if(dados.experiencia() != null){
            this.experiencia = dados.experiencia();
        }
        if(dados.disponivel() != null){
            this.disponivel = dados.disponivel();
        }
        if(dados.valorHora() != null){
            this.valorHora = dados.valorHora();
        }
    }
}
