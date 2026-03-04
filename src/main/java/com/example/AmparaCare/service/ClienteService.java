package com.example.AmparaCare.service;

import com.example.AmparaCare.DTO.cliente.DadosAtualizacaoCliente;
import com.example.AmparaCare.DTO.cliente.DadosCadastroCliente;
import com.example.AmparaCare.DTO.cliente.DadosListagemCliente;
import com.example.AmparaCare.model.Cliente;
import com.example.AmparaCare.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    @Transactional
    public void cadastrar(DadosCadastroCliente dados) {

        if(repository.findByCpf(dados.cpf()).isPresent()){
            throw new RuntimeException("CPF já cadastrado");
        }
        if(repository.findByEmail(dados.email()).isPresent()){
            throw new RuntimeException("Email já cadastrado");
        }
        try {
            repository.save(new Cliente(dados));
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Email ou CPF já cadastrado");
        }

    }

    public List<DadosListagemCliente> listar(){
        return repository.findAll()
                .stream()
                .map(DadosListagemCliente::new)
                .toList();
    }

    public DadosListagemCliente buscarPorId(Long id){

        var cliente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        return new DadosListagemCliente(cliente);
    }

    @Transactional
    public void atualizarPorCpf(String cpf, DadosAtualizacaoCliente dados){
        var cliente = repository.findByCpf(cpf).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        cliente.atualizarInformacoes(dados);
    }

    @Transactional
    public void excluir(Long id){
        var cliente = repository.findById(id).orElseThrow(()->new RuntimeException("Cliente não encontrado"));
        repository.delete(cliente);
    }

}
