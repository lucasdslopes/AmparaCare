package com.inova.AmparaCare.service.produto;

import com.inova.AmparaCare.entity.produto.Dispositivo;

import java.util.List;

public interface DispositivoService {

    Dispositivo save(Dispositivo d);

    void delete(Dispositivo d);

    void deleteById(long id);

    List<Dispositivo> findAllDispositivo();


}
