package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.Mecanico;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.Veiculo;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

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



}
