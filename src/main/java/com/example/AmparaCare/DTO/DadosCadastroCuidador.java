package com.example.AmparaCare.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCuidador(

        @NotBlank
        String nome,
        @NotBlank
        String genero,
        @NotBlank
        String cpf,
        @NotNull
        String telefone,
        @NotNull
        String certificacao,
        String experiencia,
        @NotNull
        Boolean disponivel,
        @NotNull
        Double valorHora,
        @NotNull
        String email,
        @NotNull
        @Valid
        DadosEndereco endereco


) {
}
