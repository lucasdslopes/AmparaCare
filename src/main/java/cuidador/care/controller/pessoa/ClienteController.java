package cuidador.care.controller.pessoa;

import cuidador.care.model.pessoa.Cliente;
import cuidador.care.repository.pessoa.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    public void cadastrar(@RequestBody Cliente cliente){
        repository.save(cliente);
    }

    @GetMapping
    public List<Cliente> listar(){
        return repository.findAll();
    }


}
