package com.example.AmparaCare.service;

import com.example.AmparaCare.DTO.atendimento.DadosCadastroAtendimento;
import com.example.AmparaCare.DTO.atendimento.DadosListagemAtendimento;
import com.example.AmparaCare.model.Atendimento;
import com.example.AmparaCare.model.Cliente;
import com.example.AmparaCare.model.Cuidador;
import com.example.AmparaCare.repository.AtendimentoRepository;
import com.example.AmparaCare.repository.ClienteRepository;
import com.example.AmparaCare.repository.CuidadorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoService {

    private final AtendimentoRepository atendimentoRepository;
    private final ClienteRepository clienteRepository;
    private final CuidadorRepository cuidadorRepository;

    public AtendimentoService(AtendimentoRepository atendimentoRepository,
                              ClienteRepository clienteRepository,
                              CuidadorRepository cuidadorRepository){
        this.atendimentoRepository = atendimentoRepository;
        this.clienteRepository = clienteRepository;
        this.cuidadorRepository = cuidadorRepository;
    }

    @Transactional
    public void cadastrar(DadosCadastroAtendimento dados, Long clienteLogadoId){

        Cliente cliente = clienteRepository.findById(clienteLogadoId)
                        .orElseThrow(()->new RuntimeException("Cliente não encontrado"));

        Cuidador cuidador = cuidadorRepository.findAll().stream()
                        .filter(Cuidador::estaDisponivel)
                        .findFirst()
                        .orElseThrow(()->new RuntimeException("Nenhum cuidador disponivel"));

        Atendimento atendimento = new Atendimento(dados,cliente,cuidador);
        atendimentoRepository.save(atendimento);

    }

    public List<DadosListagemAtendimento> listar(){
        return atendimentoRepository.findAll()
                .stream()
                .map(DadosListagemAtendimento::new)
                .toList();
    }

}
