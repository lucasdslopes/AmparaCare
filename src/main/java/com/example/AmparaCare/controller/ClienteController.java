package com.example.AmparaCare.controller;

import com.example.AmparaCare.DTO.DadosAtualizacaoCliente;
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
@RequestMapping("/clientes")
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

    @GetMapping("/{id}")
    public DadosListagemCliente buscarPorId(@PathVariable Long id){
        var cliente = repository.findById(id)
                .orElseThrow(()->new RuntimeException("Cliente não encontrado"));
        return new DadosListagemCliente(cliente);
    }

    @PutMapping("/{cpf}")
    @Transactional
    public void atualizarPorCpf(@PathVariable String cpf,@RequestBody @Valid DadosAtualizacaoCliente dados){
        var cliente = repository.findByCpf(cpf).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        cliente.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

}
