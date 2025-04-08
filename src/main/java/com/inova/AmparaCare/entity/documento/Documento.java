package com.inova.AmparaCare.entity.documento;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Documento{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDocumento")
    private Long id;
    @Column(name = "dataSolicitacao")
    private String dataSolicitacao;
    @Column(name = "dataEmissao")
    private String dataEmissao;


}