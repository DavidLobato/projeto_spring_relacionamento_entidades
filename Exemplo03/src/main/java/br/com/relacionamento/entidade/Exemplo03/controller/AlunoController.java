package br.com.relacionamento.entidade.Exemplo03.controller;


import br.com.relacionamento.entidade.Exemplo03.model.Aluno;
import br.com.relacionamento.entidade.Exemplo03.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/listar")
    public Iterable<Aluno> listar() {
        return alunoRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Aluno cadastrar(@RequestBody Aluno obj) {
        return alunoRepository.save(obj);
    }
}
