package br.com.relacionamento.entidade.Exemplo02.repository;

import br.com.relacionamento.entidade.Exemplo02.model.Comentario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentario,Long> {
}
