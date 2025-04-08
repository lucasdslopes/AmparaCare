package com.inova.AmparaCare.entity.servico;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Emergencia extends Servico {

    @Column(name = "tipoEmergencia")
    private String tipoEmergencia;
    @Column(name = "medicoResponsavel")
    private String medicoResponsavel;
    @Column(name = "gravidade")
    private String gravidade;



}