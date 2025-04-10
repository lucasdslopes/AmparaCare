package com.inova.AmparaCare.service.servico;

import com.inova.AmparaCare.entity.servico.Manutencao;

import java.util.List;

public interface ManutencaoService {

    Manutencao save(Manutencao m);

    void delete(Manutencao m);

    void deleteById(long id);

    List<Manutencao> findAllManutencao();
}
