package br.com.estacio.todo.dto;

import br.com.estacio.todo.enums.Prioridade;
import br.com.estacio.todo.enums.Situacao;
import br.com.estacio.todo.model.Tarefa;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosListagemTarefa(
        String titulo,
        String descricao,
        Situacao situacao,
        Prioridade prioridade
) {

    public DadosListagemTarefa(Tarefa tarefa){
        this(tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getSituacao(), tarefa.getPrioridade());
    }

}
