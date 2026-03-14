package com.example.AmparaCare.DTO.atendimento;

import com.example.AmparaCare.model.Atendimento;
import com.example.AmparaCare.model.StatusAtendimento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public record DadosListagemAtendimento(

        Long id,
        String cliente,
        String cuidador,

        LocalDate data,
        LocalTime hora,

        StatusAtendimento status,
        String observacao,

        BigDecimal valor

) {

    public DadosListagemAtendimento(Atendimento atendimento){
        this(
                atendimento.getId(),
                atendimento.getCliente().getNome(),
                atendimento.getCuidador().getNome(),
                atendimento.getData(),
                atendimento.getHora(),
                atendimento.getStatus(),
                atendimento.getObservacao(),
                atendimento.getValor()
        );
    }
}