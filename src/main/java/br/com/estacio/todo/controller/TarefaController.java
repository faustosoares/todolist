package br.com.estacio.todo.controller;

import br.com.estacio.todo.dto.DadosCadastroTarefa;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tarefa")
public class TarefaController {

    @PostMapping("/json")
    public void cadastrarJson(@RequestBody String json){
        System.out.println(json);
    }

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroTarefa dados){
        System.out.println(dados);
    }

}
