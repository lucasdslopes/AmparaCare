package com.example.AmparaCare.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPessoa(


        String nome,

        String genero,

        String telefone,

        String email,

        DadosEndereco endereco

) {


}
