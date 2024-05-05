package br.com.estacio.todo.dto;

import br.com.estacio.todo.enums.Prioridade;
import br.com.estacio.todo.enums.Situacao;

public record DadosCadastroTarefa(
        String titulo,
        String descricao,
        Situacao situacao,
        Prioridade prioridade) {
}
