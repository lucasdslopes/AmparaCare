package com.inova.AmparaCare.service.documento;

import com.inova.AmparaCare.entity.documento.Diagnostico;

import java.util.List;

public interface DiagnosticoService {

    Diagnostico save(Diagnostico d);

    void delete(Diagnostico d);

    void deleteById(long id);

    List<Diagnostico> findAllDiagnostico();
    
}
