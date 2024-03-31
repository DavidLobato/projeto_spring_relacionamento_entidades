package br.com.relacionamento.entidade.Exemplo01.controller;

import br.com.relacionamento.entidade.Exemplo01.model.Colaborador;
import br.com.relacionamento.entidade.Exemplo01.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @RequestMapping("/listar")
    public Iterable<Colaborador> listar() {
        return colaboradorRepository.findAll();
    }

    @PostMapping("cadastrar")
    public Colaborador cadastrar(@RequestBody Colaborador obj) {
        return colaboradorRepository.save(obj);
    }
}
