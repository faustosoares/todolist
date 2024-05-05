package br.com.estacio.todo.controller;

import br.com.estacio.todo.dto.DadosCadastroTarefa;
import br.com.estacio.todo.dto.DadosDetalhamentoTarefa;
import br.com.estacio.todo.dto.DadosListagemTarefa;
import br.com.estacio.todo.model.Tarefa;
import br.com.estacio.todo.service.TarefaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroTarefa dados, UriComponentsBuilder uriBuilder){
        var tarefa = new Tarefa(dados);
        service.salvar(tarefa);

        var uri =  uriBuilder.path("/tarefas/{id}").buildAndExpand(tarefa.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoTarefa(tarefa));

    }

    @GetMapping
    public List<DadosListagemTarefa> listar(){
        List<Tarefa> tarefas = service.listar();

        return tarefas.stream().map(DadosListagemTarefa::new).toList();
    }



}
