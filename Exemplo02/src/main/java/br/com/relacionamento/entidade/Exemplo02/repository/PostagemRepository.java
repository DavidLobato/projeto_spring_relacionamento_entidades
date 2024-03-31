package br.com.relacionamento.entidade.Exemplo02.repository;

import br.com.relacionamento.entidade.Exemplo02.model.Postagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends CrudRepository<Postagem,Long> {
}
