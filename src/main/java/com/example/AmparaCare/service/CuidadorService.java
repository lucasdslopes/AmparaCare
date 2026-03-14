package com.example.AmparaCare.service;

import com.example.AmparaCare.DTO.cuidador.DadosAtualizacaoCuidador;
import com.example.AmparaCare.DTO.cuidador.DadosCadastroCuidador;
import com.example.AmparaCare.DTO.cuidador.DadosListagemCuidador;
import com.example.AmparaCare.model.Cuidador;
import com.example.AmparaCare.repository.CuidadorRepository;
import jakarta.transaction.Transactional;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuidadorService {

    private final CuidadorRepository repository;

    public CuidadorService(CuidadorRepository repository){
        this.repository = repository;
    }

    @Transactional
    public void cadastrar(DadosCadastroCuidador dados){
        try {
            repository.save(new Cuidador(dados));
        } catch (DataIntegrityViolationException e){
            throw new RuntimeException("Email ou CPF já cadastrado");
        }
    }

    public List<DadosListagemCuidador> listar(){
        return repository.findAll()
                .stream()
                .map(DadosListagemCuidador::new)
                .toList();
    }

    public DadosListagemCuidador buscarPorId(Long id){
        var cuidador = repository.findById(id)
                .orElseThrow(()->new RuntimeException("Cuidador não encontrado"));

        return new DadosListagemCuidador(cuidador);
    }

    @Transactional
    public void atualizarPorCpf(String cpf, DadosAtualizacaoCuidador dados){
        var cuidador = repository.findByCpf(cpf).orElseThrow(()->new RuntimeException("Cuidador não encontrado"));

        cuidador.atualizarInformacoes(dados);
    }

    @Transactional
    public void excluir(Long id){
        var cuidador = repository.findById(id).orElseThrow(()->new RuntimeException("Cuidador não encontrado "));
        repository.delete(cuidador);
    }
}
