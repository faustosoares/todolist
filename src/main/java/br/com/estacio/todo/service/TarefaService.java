package br.com.estacio.todo.service;

import br.com.estacio.todo.dto.DadosListagemTarefa;
import br.com.estacio.todo.model.Tarefa;
import br.com.estacio.todo.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public Page<DadosListagemTarefa> listarPaginado(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemTarefa::new);
    }

}
