package br.com.relacionamento.entidade.Exemplo03.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cursos")
@Getter
@Setter
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String curso;
    @ManyToMany(mappedBy = "cursos")
    private List<Aluno> alunos = new ArrayList<>();
}
