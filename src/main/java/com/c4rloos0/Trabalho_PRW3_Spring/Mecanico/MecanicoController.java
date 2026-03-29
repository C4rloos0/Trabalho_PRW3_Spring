package com.c4rloos0.Trabalho_PRW3_Spring.Mecanico;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mecanicos")
public class MecanicoController {
    @Autowired
    private MecanicoRepository mecanicoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody MecanicoDTO dados) {
        var mecanico = new Mecanico(dados);
        mecanicoRepository.save(mecanico);
    }
}
