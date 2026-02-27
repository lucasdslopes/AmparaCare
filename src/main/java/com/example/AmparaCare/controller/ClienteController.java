package com.example.AmparaCare.controller;

import com.example.AmparaCare.DTO.DadosCadastroCliente;
import com.example.AmparaCare.DTO.DadosListagemCliente;
import com.example.AmparaCare.model.Cliente;
import com.example.AmparaCare.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dados){
        repository.save(new Cliente(dados));
    }

    @GetMapping
    public List<DadosListagemCliente> listar(){
        return repository.findAll().stream().map(DadosListagemCliente::new).toList();
    }

}
