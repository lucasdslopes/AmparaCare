package com.inova.AmparaCare.service.pessoa;

import com.inova.AmparaCare.entity.pessoa.Cuidador;

import java.util.List;

public interface CuidadorService {

    Cuidador save(Cuidador d);

    void delete(Cuidador c);

    void deleteById(long id);

    List<Cuidador> findAllCuidador();


}
