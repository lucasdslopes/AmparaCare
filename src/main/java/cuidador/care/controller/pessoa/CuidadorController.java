package cuidador.care.controller.pessoa;

import cuidador.care.model.pessoa.Cuidador;
import cuidador.care.repository.pessoa.CuidadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cuidador")
public class CuidadorController {

    @Autowired
    private CuidadorRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Cuidador cuidador) {
        repository.save(cuidador);
    }

    @GetMapping
    public List<Cuidador> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Cuidador getById(@PathVariable Long id) {
        Optional<Cuidador> cuidador = repository.findById(id);
        return cuidador.orElse(null);
    }

    @PutMapping("/{id}")
    public Cuidador atualizar(@PathVariable Long id, @RequestBody Cuidador cuidador) {
        if (repository.existsById(id)) {
            cuidador.setId(id);
            return repository.save(cuidador);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }
}
