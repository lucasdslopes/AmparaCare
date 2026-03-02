package com.example.AmparaCare.model;

import com.example.AmparaCare.DTO.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "clientes")
@Entity(name = "Clientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente extends Pessoa{

    private String condicoesMedicas;
    private String contatoEmergencia;

    public Cliente(DadosCadastroCliente dados){
        super(new DadosCadastroPessoa(
                dados.nome(),
                dados.genero(),
                dados.cpf(),
                dados.telefone(),
                dados.email(),
                dados.endereco()
        ));
        this.condicoesMedicas = dados.condicoesMedicas();
        this.contatoEmergencia = dados.contatoEmergencia();
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoCliente dados){
        super.atualizarInformacoes(new DadosAtualizacaoPessoa(
                dados.nome(),
                dados.genero(),
                dados.telefone(),
                dados.email(),
                dados.endereco()
        ));
        if(dados.condicoesMedicas()!=null){
            this.condicoesMedicas = dados.condicoesMedicas();
        }
        if(dados.contatoEmergencia()!= null){
            this.contatoEmergencia = dados.contatoEmergencia();
        }
    }

}
