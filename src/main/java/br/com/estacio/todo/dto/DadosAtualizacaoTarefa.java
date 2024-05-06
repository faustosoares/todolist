package br.com.estacio.todo.dto;

import br.com.estacio.todo.enums.Prioridade;
import br.com.estacio.todo.enums.Situacao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTarefa(
        @NotNull
        Long id,
        String titulo,
        String descricao,
        Prioridade prioridade,
        Situacao situacao
) {
}
