package cuidador.care.controller.servico;

import cuidador.care.model.servico.Emergencia;
import cuidador.care.repository.servico.EmergenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emergencia")
public class EmergenciaController {

    @Autowired
    private EmergenciaRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Emergencia emergencia) {
        repository.save(emergencia);
    }

    @GetMapping
    public List<Emergencia> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Emergencia getById(@PathVariable Long id) {
        Optional<Emergencia> emergencia = repository.findById(id);
        return emergencia.orElse(null);
    }

    @PutMapping("/{id}")
    public Emergencia atualizar(@PathVariable Long id, @RequestBody Emergencia emergencia) {
        if (repository.existsById(id)) {
            emergencia.setId(id);
            return repository.save(emergencia);
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
