package com.example.AmparaCare.model;

import com.example.AmparaCare.DTO.DadosAtualizacaoPessoa;
import com.example.AmparaCare.DTO.DadosCadastroPessoa;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Pessoas") // JPA DO JAVA
@Table(name = "pessoas") // BANCO DE DADOS
@EqualsAndHashCode(of = "id")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Getter
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    @Embedded
    private Endereco endereco;
    private String cpf;
    private String telefone;
    private String email;

    public Pessoa(DadosCadastroPessoa dados) {

        this.nome = dados.nome();
        this.genero = dados.genero();
        this.cpf = dados.cpf();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoPessoa dados){
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.genero() != null){
            this.genero = dados.genero();
        }
        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.email() != null){
            this.email = dados.email();
        }
        if (dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }

}
