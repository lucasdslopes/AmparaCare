package com.inova.AmparaCare.service.servico;

import com.inova.AmparaCare.entity.servico.Manutencao;
import com.inova.AmparaCare.repository.servico.ManutencaoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ManutencaoServiceImpl implements ManutencaoService {

    private ManutencaoRepository repo;

    @Override
    @Transactional
    public Manutencao save(Manutencao m){return repo.save(m);}

    @Override
    @Transactional
    public void delete(final Manutencao m){this.repo.delete(m);}

    @Override
    @Transactional
    public void deleteById(final long id){this.repo.deleteById(id);}

    @Transactional
    public Optional<Manutencao> findById(final long id){return this.repo.findById(id);}

    @Transactional
    public List<Manutencao> findAllManutencao(){return this.repo.findAll();}

}



