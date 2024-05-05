package br.com.estacio.todo.controller;

import br.com.estacio.todo.dto.DadosCadastroTarefa;
import br.com.estacio.todo.model.Tarefa;
import br.com.estacio.todo.repository.TarefaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tarefa")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;

    @PostMapping("/json")
    public void cadastrarJson(@RequestBody String json){
        System.out.println(json);
    }

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroTarefa dados){

        repository.save(new Tarefa(dados));

    }

}
