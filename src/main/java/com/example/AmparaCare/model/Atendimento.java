package com.example.AmparaCare.model;

import com.example.AmparaCare.DTO.atendimento.DadosAtualizacaoAtendimento;
import com.example.AmparaCare.DTO.atendimento.DadosCadastroAtendimento;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Table(name = "atendimentos")
@Entity(name = "Atendimentos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "cuidador_id")
    private Cuidador cuidador;

    private LocalDate data;

    private LocalTime hora;

    @Enumerated(EnumType.STRING)
    private StatusAtendimento status;

    private String observacao;

    private BigDecimal valor;

    public Atendimento(DadosCadastroAtendimento dados, Cliente cliente, Cuidador cuidador){
        this.cliente = cliente;
        this.cuidador = cuidador;
        this.data = dados.data();
        this.hora = dados.hora();
        this.status = dados.status();
        this.observacao = dados.observacao();
        this.valor = dados.valor();
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoAtendimento dados){
        if(dados.data() != null){
            this.data = dados.data();
        }
        if(dados.hora() != null){
            this.hora = dados.hora();
        }
        if(dados.status() != null){
            this.status = dados.status();
        }
        if(dados.observacao() != null){
            this.observacao = dados.observacao();
        }
        if(dados.valor() != null){
            this.valor = dados.valor();
        }
    }
}
