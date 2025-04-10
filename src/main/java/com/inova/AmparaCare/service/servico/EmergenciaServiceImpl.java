package com.inova.AmparaCare.service.servico;

import com.inova.AmparaCare.entity.servico.Emergencia;
import com.inova.AmparaCare.repository.servico.EmergenciaRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EmergenciaServiceImpl implements EmergenciaService{

    private EmergenciaRepository repo;

    @Override
    @Transactional
    public Emergencia save(Emergencia e){return repo.save(e);}

    @Override
    @Transactional
    public void delete(final Emergencia e){this.repo.delete(e);}

    @Override
    @Transactional
    public void deleteById(final long id){this.repo.deleteById(id);}

    @Transactional
    public Optional<Emergencia> findById(final long id){return this.repo.findById(id);}

    @Transactional
    public List<Emergencia> findAllEmergencia(){return this.repo.findAll();}

}
