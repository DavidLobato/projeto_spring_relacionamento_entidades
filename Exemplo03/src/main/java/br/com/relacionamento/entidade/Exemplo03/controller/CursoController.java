package br.com.relacionamento.entidade.Exemplo03.controller;

import br.com.relacionamento.entidade.Exemplo03.model.Curso;
import br.com.relacionamento.entidade.Exemplo03.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping("/listar")
    public Iterable<Curso> listar() {
        return cursoRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Curso cadastrar(@RequestBody Curso obj) {
        return cursoRepository.save(obj);
    }
}
