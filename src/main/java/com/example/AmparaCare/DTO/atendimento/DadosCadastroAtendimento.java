package com.example.AmparaCare.DTO.atendimento;

import com.example.AmparaCare.model.StatusAtendimento;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public record DadosCadastroAtendimento(

        @NotNull
        LocalDate data,
        @NotNull
        LocalTime hora,
        @NotNull
        StatusAtendimento status,
        String observacao,
        @NotNull
        @Positive
        BigDecimal valor

) {
}
