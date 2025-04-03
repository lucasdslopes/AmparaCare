package cuidador.care.controller.pessoa;

import cuidador.care.model.pessoa.Cuidador;
import cuidador.care.repository.pessoa.CuidadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cuidador")
public class CuidadorController {

    @Autowired
    private CuidadorRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Cuidador cuidador){
        repository.save(cuidador);
    }

    @GetMapping
    public List<Cuidador> listar() {
        return repository.findAll();
    }



}
