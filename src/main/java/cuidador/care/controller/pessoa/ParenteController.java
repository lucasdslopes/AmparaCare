package cuidador.care.controller.pessoa;

import cuidador.care.model.pessoa.Parente;
import cuidador.care.repository.pessoa.ParenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/parente")
public class ParenteController {

    @Autowired
    private ParenteRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Parente parente){repository.save(parente);}

    @GetMapping
    public List<Parente> listar() {return repository.findAll();}

    @GetMapping("/{id}")
    public Parente getById(@PathVariable Long id){
        Optional<Parente> parente = repository.findById(id);
        return parente.orElse(null);
    }

    @PutMapping("/{id}")
    public Parente atualizar(@PathVariable Long id,@RequestBody Parente parente){
        if(repository.existsById(id)){
            parente.setId(id);
            return repository.save(parente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        }
    }
}
