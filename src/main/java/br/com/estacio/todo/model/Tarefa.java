package br.com.estacio.todo.model;


import br.com.estacio.todo.enums.Prioridade;
import br.com.estacio.todo.enums.Situacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tarefa", schema = "todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Situacao situacao;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

}
