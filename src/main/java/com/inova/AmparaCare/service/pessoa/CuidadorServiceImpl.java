package com.inova.AmparaCare.service.pessoa;

import com.inova.AmparaCare.entity.pessoa.Cliente;
import com.inova.AmparaCare.entity.pessoa.Cuidador;
import com.inova.AmparaCare.repository.pessoa.CuidadorRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CuidadorServiceImpl implements CuidadorService{

    private CuidadorRepository repo;

    @Override
    @Transactional
    public Cuidador save(Cuidador c){return repo.save(c);}

    @Override
    @Transactional
    public void delete(final Cuidador c){this.repo.delete(c);}

    @Override
    @Transactional
    public void deleteById(final long id){this.repo.deleteById(id);}

    @Transactional
    public Optional<Cuidador> findById(final long id){return this.repo.findById(id);}

    @Transactional
    public List<Cuidador> findAllCuidador(){return this.repo.findAll();}

}
