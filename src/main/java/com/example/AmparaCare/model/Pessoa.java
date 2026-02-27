package com.example.AmparaCare.model;

import com.example.AmparaCare.DTO.DadosCadastroPessoa;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Pessoa") // JPA DO JAVA
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
}
