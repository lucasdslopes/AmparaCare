package com.example.AmparaCare.controller;

import com.example.AmparaCare.DTO.DadosCadastroCuidador;
import com.example.AmparaCare.DTO.DadosListagemCuidador;
import com.example.AmparaCare.model.Cuidador;
import com.example.AmparaCare.repository.CuidadorRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cuidador")
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
}
