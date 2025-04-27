package cuidador.care.controller.pessoa;

import cuidador.care.model.pessoa.Cliente;
import cuidador.care.repository.pessoa.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Cliente cliente){
        repository.save(cliente);
    }

    @GetMapping
    public List<Cliente> listar(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getById(@PathVariable Long id) {
        Optional<Cliente> cliente = repository.findById(id);
        return cliente.orElse(null);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        if (repository.existsById(id)) {
            cliente.setId(id);
            return repository.save(cliente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }


}}
