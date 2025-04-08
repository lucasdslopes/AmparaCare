package com.inova.AmparaCare.entity.documento;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Diagnostico extends Documento {

    @Column(name = "estadoGeral")
    private String estadoGeral;
    @Column(name = "sinaisVitais")
    private String sinaisVitais;
    @Column(name = "idDispositivo")
    private String idDispositivo;
    @Column(name = "idCuidador")
    private String idCuidador;
    @Column(name = "idServico")
    private String idServico;
    @Column(name = "sinaisQueda")
    private String sinaisQueda;




}
