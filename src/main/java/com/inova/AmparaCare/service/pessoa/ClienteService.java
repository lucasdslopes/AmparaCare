package com.inova.AmparaCare.service.pessoa;

import com.inova.AmparaCare.entity.pessoa.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente save(Cliente d);

    void delete(Cliente d);

    void deleteById(long id);

    List<Cliente> findAllCliente();

}
