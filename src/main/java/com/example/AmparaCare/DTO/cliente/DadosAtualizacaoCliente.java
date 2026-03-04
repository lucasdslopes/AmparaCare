package com.example.AmparaCare.DTO.cliente;

import com.example.AmparaCare.DTO.endereco.DadosEndereco;

public record DadosAtualizacaoCliente(


        String nome,
        String genero,
        String telefone,
        String condicoesMedicas,
        String contatoEmergencia,
        String email,
        DadosEndereco endereco
) {
}
