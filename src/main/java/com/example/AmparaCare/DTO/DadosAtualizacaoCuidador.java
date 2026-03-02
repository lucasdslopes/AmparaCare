package com.example.AmparaCare.DTO;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoCuidador(

        String nome,
        String genero,
        String telefone,
        String certificacao,
        String experiencia,
        Boolean disponivel,
        Double valorHora,
        String email,
        DadosEndereco endereco


) {
}
