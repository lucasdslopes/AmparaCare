package com.example.AmparaCare.DTO;

import com.example.AmparaCare.model.Cuidador;

public record DadosListagemCuidador(

        Long id,
        String nome,
        String genero,
        String cpf,
        String telefone,
        String certificacao,
        String experiencia,
        Boolean disponivel,
        Double valorHora,
        String email,
        DadosListagemEndereco endereco
) {
    public DadosListagemCuidador(Cuidador cuidador){
        this(
                cuidador.getId(),
                cuidador.getNome(),
                cuidador.getGenero(),
                cuidador.getCpf(),
                cuidador.getTelefone(),
                cuidador.getCertificacao(),
                cuidador.getExperiencia(),
                cuidador.getDisponivel(),
                cuidador.getValorHora(),
                cuidador.getEmail(),
                new DadosListagemEndereco(cuidador.getEndereco())
        );
    }
}
