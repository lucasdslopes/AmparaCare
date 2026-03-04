package com.example.AmparaCare.DTO.cliente;

import com.example.AmparaCare.DTO.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCliente(

        @NotBlank
        String nome,
        @NotBlank
        String genero,
        @NotBlank
        String cpf,
        @NotNull
        String telefone,
        @NotBlank
        String condicoesMedicas,
        @NotBlank
        String contatoEmergencia,
        @NotBlank
        String email,
        @NotNull
        @Valid
        DadosEndereco endereco


) {
}
