package com.example.AmparaCare.controller;

import com.example.AmparaCare.DTO.cuidador.DadosAtualizacaoCuidador;
import com.example.AmparaCare.DTO.cuidador.DadosCadastroCuidador;
import com.example.AmparaCare.DTO.cuidador.DadosListagemCuidador;
import com.example.AmparaCare.service.CuidadorService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuidadores")
public class CuidadorController {

    private final CuidadorService service;

    public CuidadorController(CuidadorService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid DadosCadastroCuidador dados){
        service.cadastrar(dados);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<DadosListagemCuidador>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosListagemCuidador> buscarPorId(@PathVariable Long id){
       return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PutMapping("/{cpf}")
    public ResponseEntity<Void> atualizarPorCpf(@PathVariable String cpf, @RequestBody @Valid DadosAtualizacaoCuidador dados){
        service.atualizarPorCpf(cpf,dados);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

}
