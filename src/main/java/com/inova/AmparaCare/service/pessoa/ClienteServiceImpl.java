package com.inova.AmparaCare.service.pessoa;
import com.inova.AmparaCare.entity.pessoa.Cliente;
import com.inova.AmparaCare.repository.pessoa.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService{

    private ClienteRepository repo;

    @Override
    @Transactional
    public Cliente save(Cliente c){return repo.save(c);}

    @Override
    @Transactional
    public void delete(final Cliente c){this.repo.delete(c);}

    @Override
    @Transactional
    public void deleteById(final long id){this.repo.deleteById(id);}

    @Transactional
    public Optional<Cliente> findById(final long id){return this.repo.findById(id);}

    @Transactional
    public List<Cliente> findAllCliente(){return this.repo.findAll();}

}
