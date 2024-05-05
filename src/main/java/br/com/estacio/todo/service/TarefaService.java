package br.com.estacio.todo.service;

import br.com.estacio.todo.dto.DadosListagemTarefa;
import br.com.estacio.todo.model.Tarefa;
import br.com.estacio.todo.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public void salvar(Tarefa tarefa){
        repository.save(tarefa);
    }

    public List<Tarefa> listar(){
        return repository.findAll();
    }

}
