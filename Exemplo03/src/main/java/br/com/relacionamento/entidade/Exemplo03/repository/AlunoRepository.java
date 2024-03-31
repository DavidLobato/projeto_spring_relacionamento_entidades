package br.com.relacionamento.entidade.Exemplo03.repository;

import br.com.relacionamento.entidade.Exemplo03.model.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno,Long> {
}
