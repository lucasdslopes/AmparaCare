package com.example.AmparaCare.DTO.cuidador;

import com.example.AmparaCare.DTO.endereco.DadosEndereco;

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
