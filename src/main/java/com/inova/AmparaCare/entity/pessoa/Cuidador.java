package com.inova.AmparaCare.entity.pessoa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Cuidador extends Pessoa {

    @Column(name = "telefone")
    private int telefone;


}

