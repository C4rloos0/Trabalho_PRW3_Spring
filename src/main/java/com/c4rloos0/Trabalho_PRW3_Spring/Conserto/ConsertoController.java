package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consertos")
public class ConsertoController {
    @Autowired
    private ConsertoRepository consertoRepository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid ConsertoDTO dados) {
        var conserto = new Conserto(dados);
        consertoRepository.save(conserto);
    }

    @GetMapping
    public Page<Conserto> listar(Pageable pageable) {
        return consertoRepository.findAll(pageable);
    }

    @GetMapping("resumido")
    public List<DadosConsertoDTO> listarDados() {
        return consertoRepository.findAll().stream().map(DadosConsertoDTO::new).toList();
    }


}
