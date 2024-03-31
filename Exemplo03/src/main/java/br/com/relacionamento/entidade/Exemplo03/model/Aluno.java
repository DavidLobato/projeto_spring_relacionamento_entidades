package br.com.relacionamento.entidade.Exemplo03.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alunos")
@Getter
@Setter
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String aluno;
    @ManyToMany
    @JoinTable(
            name = "tabela_auxiliar",
            joinColumns = {@JoinColumn(name = "codigo_aluno", referencedColumnName = "codigo")},
            inverseJoinColumns = {@JoinColumn(name = "codigo_curso", referencedColumnName = "codigo")}
    )
    private List<Curso> cursos = new ArrayList<>();

}
