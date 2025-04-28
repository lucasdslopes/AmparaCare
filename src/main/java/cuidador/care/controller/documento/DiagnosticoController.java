package cuidador.care.controller.documento;

import cuidador.care.model.documento.Diagnostico;
import cuidador.care.model.pessoa.Cliente;
import cuidador.care.repository.documento.DiagnosticoRepository;
import cuidador.care.repository.pessoa.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/diagnostico")
public class DiagnosticoController {

    @Autowired
    private DiagnosticoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Diagnostico diagnostico) {
        repository.save(diagnostico);
    }

    @GetMapping
    public List<Diagnostico> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Diagnostico getById(@PathVariable Long id) {
        Optional<Diagnostico> diagnostico = repository.findById(id);
        return diagnostico.orElse(null);
    }

    @PutMapping("/{id}")
    public Diagnostico atualizar(@PathVariable Long id, @RequestBody Diagnostico diagnostico) {
        if (repository.existsById(id)) {
            diagnostico.setId(id);
            return repository.save(diagnostico);
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
