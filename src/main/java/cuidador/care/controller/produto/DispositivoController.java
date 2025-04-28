package cuidador.care.controller.produto;

import cuidador.care.model.produto.Dispositivo;
import cuidador.care.repository.produto.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {

    @Autowired
    private DispositivoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Dispositivo dispositivo) {
        repository.save(dispositivo);
    }

    @GetMapping
    public List<Dispositivo> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Dispositivo getById(@PathVariable Long id) {
        Optional<Dispositivo> dispositivo = repository.findById(id);
        return dispositivo.orElse(null);
    }

    @PutMapping("/{id}")
    public Dispositivo atualizar(@PathVariable Long id, @RequestBody Dispositivo dispositivo) {
        if (repository.existsById(id)) {
            dispositivo.setId(id);
            return repository.save(dispositivo);
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
