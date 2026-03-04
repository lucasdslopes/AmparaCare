package com.example.AmparaCare.DTO.pessoa;

import com.example.AmparaCare.DTO.endereco.DadosEndereco;

public record DadosAtualizacaoPessoa(


        String nome,

        String genero,

        String telefone,

        String email,

        DadosEndereco endereco

) {


}
