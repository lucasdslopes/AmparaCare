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
public class Manutencao extends Servico {

    @Column(name = "custo")
    private float custo;
    @Column(name = "dataManutencao")
    private String dataManutencao;
    @Column(name = "status")
    private String status;


}