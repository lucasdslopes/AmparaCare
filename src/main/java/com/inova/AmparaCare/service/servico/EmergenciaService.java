package com.inova.AmparaCare.service.servico;

import com.inova.AmparaCare.entity.servico.Emergencia;

import java.util.List;

public interface EmergenciaService {

    Emergencia save(Emergencia e);

    void delete(Emergencia d);

    void deleteById(long id);

    List<Emergencia> findAllEmergencia();


}
