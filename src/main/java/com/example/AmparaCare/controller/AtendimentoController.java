package com.example.AmparaCare.controller;

import com.example.AmparaCare.DTO.atendimento.DadosCadastroAtendimento;
import com.example.AmparaCare.DTO.atendimento.DadosListagemAtendimento;
import com.example.AmparaCare.service.AtendimentoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

    private final AtendimentoService service;

    public AtendimentoController(AtendimentoService service){
        this.service = service;
    }


    @PostMapping("/clientes/{clienteId}")
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid DadosCadastroAtendimento dados, @PathVariable Long clienteId){
        service.cadastrar(dados, clienteId);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<DadosListagemAtendimento>> listar(){
        var lista = service.listar();
        return ResponseEntity.ok(lista);
    }

}
