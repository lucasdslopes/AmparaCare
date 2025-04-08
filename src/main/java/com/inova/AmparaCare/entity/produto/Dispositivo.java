package com.inova.AmparaCare.entity.produto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo extends Produto {

    @Column(name = "status")
    private String status;
    @Column(name = "versao")
    private String versao;

}