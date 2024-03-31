package br.com.relacionamento.entidade.Exemplo01.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "colaboradores")
@Getter
@Setter
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String nome;

    @OneToOne
    @JoinColumn(name = "codigo_cargo",referencedColumnName = "codigo")
    private Cargo cargo;
}
