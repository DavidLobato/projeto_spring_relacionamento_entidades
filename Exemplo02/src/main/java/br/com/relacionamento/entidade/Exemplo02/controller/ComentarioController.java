package br.com.relacionamento.entidade.Exemplo02.controller;

import br.com.relacionamento.entidade.Exemplo02.model.Comentario;
import br.com.relacionamento.entidade.Exemplo02.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping("/listar")
    public Iterable<Comentario> listar() {
        return comentarioRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Comentario cadastrar(@RequestBody Comentario obj) {
        return comentarioRepository.save(obj);
    }

}
