package com.example.AmparaCare.DTO;

import com.example.AmparaCare.model.Endereco;

public record DadosListagemEndereco(

        String logradouro,
        String bairro,
        String cep,
        String numero,
        String complemento,
        String cidade,
        String uf

) {

    public DadosListagemEndereco(Endereco endereco){
        this(
                endereco.getLogradouro(),
                endereco.getBairro(),
                endereco.getCep(),
                endereco.getNumero(),
                endereco.getComplemento(),
                endereco.getCidade(),
                endereco.getUf()
        );
    }

}
