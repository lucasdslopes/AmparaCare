package com.example.AmparaCare.controller;

import com.example.AmparaCare.DTO.cliente.DadosAtualizacaoCliente;
import com.example.AmparaCare.DTO.cliente.DadosCadastroCliente;
import com.example.AmparaCare.DTO.cliente.DadosListagemCliente;
import com.example.AmparaCare.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service){
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid DadosCadastroCliente dados){
        service.cadastrar(dados);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<DadosListagemCliente>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosListagemCliente> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PutMapping("/{cpf}")
    public ResponseEntity<Void> atualizarPorCpf(@PathVariable String cpf,@RequestBody @Valid DadosAtualizacaoCliente dados){
       service.atualizarPorCpf(cpf, dados);
       return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

}
