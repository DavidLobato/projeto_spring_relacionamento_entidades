package br.com.relacionamento.entidade.Exemplo02.controller;

import br.com.relacionamento.entidade.Exemplo02.model.Postagem;
import br.com.relacionamento.entidade.Exemplo02.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

    @Autowired
    private PostagemRepository postagemRepository;

    @GetMapping("/listar")
    public Iterable<Postagem> listar() {
        return postagemRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem obj) {
        return postagemRepository.save(obj);
    }
}
