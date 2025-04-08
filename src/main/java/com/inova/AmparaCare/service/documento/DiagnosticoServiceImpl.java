package com.inova.AmparaCare.service.documento;

import com.inova.AmparaCare.entity.documento.Diagnostico;
import com.inova.AmparaCare.repository.documento.DiagnosticoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DiagnosticoServiceImpl implements DiagnosticoService {

    private DiagnosticoRepository repo;

    @Override
    @Transactional
    public Diagnostico save(Diagnostico d){return repo.save(d);}

    @Override
    @Transactional
    public void delete(final Diagnostico d){this.repo.delete(d);}

    @Override
    @Transactional
    public void deleteById(final long id){this.repo.deleteById(id);}

    @Transactional
    public Optional<Diagnostico> findById(final long id){return this.repo.findById(id);}

    @Transactional
    public List<Diagnostico> findAllDiagnostico(){return this.repo.findAll();}
}
