package com.inova.AmparaCare.service.produto;

import com.inova.AmparaCare.entity.produto.Dispositivo;
import com.inova.AmparaCare.repository.produto.DispositivoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DispositivoServiceImpl implements DispositivoService{

    private DispositivoRepository repo;

    @Override
    @Transactional
    public Dispositivo save(Dispositivo d){return repo.save(d);}

    @Override
    @Transactional
    public void delete(final Dispositivo d){this.repo.delete(d);}

    @Override
    @Transactional
    public void deleteById(final long id){this.repo.deleteById(id);}

    @Transactional
    public Optional<Dispositivo> findById(final long id){return this.repo.findById(id);}

    @Transactional
    public List<Dispositivo> findAllDispositivo(){return this.repo.findAll();}








}
