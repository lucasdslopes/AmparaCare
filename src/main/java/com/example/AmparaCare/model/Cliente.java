package com.example.AmparaCare.model;

import com.example.AmparaCare.DTO.DadosCadastroCliente;
import com.example.AmparaCare.DTO.DadosCadastroPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cliente")
@Entity(name = "Cliente")
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

}
