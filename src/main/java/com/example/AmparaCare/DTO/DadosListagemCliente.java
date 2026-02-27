package com.example.AmparaCare.DTO;

import com.example.AmparaCare.model.Cliente;

public record DadosListagemCliente(
        Long id,
        String nome,
        String genero,
        String cpf,
        String telefone,
        String condicoesMedicas,
        String contatoEmergencia,
        String email,
        DadosListagemEndereco endereco

) {
   public DadosListagemCliente(Cliente cliente){
       this(
               cliente.getId(),
               cliente.getNome(),
               cliente.getGenero(),
               cliente.getCpf(),
               cliente.getTelefone(),
               cliente.getCondicoesMedicas(),
               cliente.getContatoEmergencia(),
               cliente.getEmail(),
               new DadosListagemEndereco(cliente.getEndereco())
       );
   }
}
