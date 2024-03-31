package br.com.relacionamento.entidade.Exemplo01.controller;

import br.com.relacionamento.entidade.Exemplo01.model.Cargo;
import br.com.relacionamento.entidade.Exemplo01.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoRepository cargoRepository;

    @GetMapping("/listar")
    public Iterable<Cargo> listar() {
        return cargoRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Cargo cadastrar(@RequestBody Cargo obj) {
        return cargoRepository.save(obj);
    }
}
