package br.com.estacio.todo.dto;

import br.com.estacio.todo.enums.Prioridade;
import br.com.estacio.todo.enums.Situacao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTarefa(
        @NotBlank
        String titulo,

        @NotBlank
        String descricao,
        Situacao situacao,
        @NotNull
        Prioridade prioridade) {
}
