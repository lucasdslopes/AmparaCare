package com.example.AmparaCare.controller;

import com.example.AmparaCare.DTO.cuidador.DadosAtualizacaoCuidador;
import com.example.AmparaCare.DTO.cuidador.DadosCadastroCuidador;
import com.example.AmparaCare.DTO.cuidador.DadosListagemCuidador;
import com.example.AmparaCare.model.Cuidador;
import com.example.AmparaCare.repository.CuidadorRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuidadores")
public class CuidadorController {

    @Autowired
    private CuidadorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCuidador dados){
        repository.save(new Cuidador(dados));
    }

    @GetMapping
    public List<DadosListagemCuidador> listar(){
        return  repository.findAll().stream().map(DadosListagemCuidador::new).toList();
    }

    @GetMapping("/{id}")
    public DadosListagemCuidador buscarPorId(@PathVariable Long id){
        var cuidador = repository.findById(id)
                .orElseThrow(()->new RuntimeException("Cliente não encontrado"));
        return new DadosListagemCuidador(cuidador);
    }

    @PutMapping("/{cpf}")
    @Transactional
    public void atualizarPorCpf(@PathVariable String cpf, @RequestBody @Valid DadosAtualizacaoCuidador dados){
        var cuidador = repository.findByCpf(cpf).orElseThrow(()->new RuntimeException("Cliente não encontrado"));
        cuidador.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }


}
