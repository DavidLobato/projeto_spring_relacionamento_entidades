package br.com.relacionamento.entidade.Exemplo01.repository;

import br.com.relacionamento.entidade.Exemplo01.model.Colaborador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends CrudRepository<Colaborador,Long> {
}
