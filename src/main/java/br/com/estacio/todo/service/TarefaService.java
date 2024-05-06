package br.com.estacio.todo.service;

import br.com.estacio.todo.dto.DadosAtualizacaoTarefa;
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

    public void alterar(DadosAtualizacaoTarefa tarefaDto) {
        var tarefa = repository.getReferenceById(tarefaDto.id());

        tarefa.setDescricao(tarefaDto.descricao());
        tarefa.setTitulo(tarefaDto.titulo());
        tarefa.setSituacao(tarefaDto.situacao());
        tarefa.setPrioridade(tarefaDto.prioridade());

        repository.save(tarefa);
    }

    public void alterarParcialmente(DadosAtualizacaoTarefa tarefaDto) {
        var tarefa = repository.getReferenceById(tarefaDto.id());

        if(tarefaDto.descricao() != null) tarefa.setDescricao(tarefaDto.descricao());
        if(tarefaDto.titulo() != null) tarefa.setTitulo(tarefaDto.titulo());
        if(tarefaDto.situacao() != null) tarefa.setSituacao(tarefaDto.situacao());
        if(tarefaDto.prioridade() != null) tarefa.setPrioridade(tarefaDto.prioridade());

        repository.save(tarefa);
    }
}
