package com.example.AmparaCare.DTO;

import jakarta.validation.constraints.NotBlank;

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
