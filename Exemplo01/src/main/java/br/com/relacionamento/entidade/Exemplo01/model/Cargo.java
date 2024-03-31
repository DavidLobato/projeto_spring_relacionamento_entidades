package br.com.relacionamento.entidade.Exemplo01.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.loadtime.Agent;

@Entity
@Table(name="cargos")
@Getter
@Setter
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String cargo;
    private double salario;
}
