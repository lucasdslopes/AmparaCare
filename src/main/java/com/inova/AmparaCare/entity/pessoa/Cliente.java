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
public class Cliente extends Pessoa {

    @Column(name = "senha")
    private String senha;
    @Column(name = "email")
    private String email;
    @Column(name = "idDispositivo")
    private String idDispositivo;



}