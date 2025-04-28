package cuidador.care.controller.servico;

import cuidador.care.model.servico.Manutencao;
import cuidador.care.repository.servico.ManutencaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/manutencao")
public class ManutencaoController {

    @Autowired
    private ManutencaoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Manutencao manutencao) {
        repository.save(manutencao);
    }

    @GetMapping
    public List<Manutencao> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Manutencao getById(@PathVariable Long id) {
        Optional<Manutencao> manutencao = repository.findById(id);
        return manutencao.orElse(null);
    }

    @PutMapping("/{id}")
    public Manutencao atualizar(@PathVariable Long id, @RequestBody Manutencao manutencao) {
        if (repository.existsById(id)) {
            manutencao.setId(id);
            return repository.save(manutencao);
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
