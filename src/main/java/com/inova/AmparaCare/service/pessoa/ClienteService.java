package com.inova.AmparaCare.service.pessoa;

import com.inova.AmparaCare.entity.pessoa.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente save(Cliente c);

    void delete(Cliente c);

    void deleteById(long id);

    List<Cliente> findAllCliente();

}
