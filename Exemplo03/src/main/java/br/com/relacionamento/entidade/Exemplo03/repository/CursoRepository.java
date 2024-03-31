package br.com.relacionamento.entidade.Exemplo03.repository;

import br.com.relacionamento.entidade.Exemplo03.model.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso,Long> {
}
