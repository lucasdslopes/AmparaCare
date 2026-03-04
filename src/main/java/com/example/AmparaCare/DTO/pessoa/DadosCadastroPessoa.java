package com.example.AmparaCare.DTO.pessoa;

import com.example.AmparaCare.DTO.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPessoa(

        @NotBlank
        String nome,

        @NotBlank
        String genero,

        @NotBlank
        String cpf,

        @NotNull
        String telefone,

        @NotBlank
        String email,

        @NotNull
        @Valid
        DadosEndereco endereco

) {
}
