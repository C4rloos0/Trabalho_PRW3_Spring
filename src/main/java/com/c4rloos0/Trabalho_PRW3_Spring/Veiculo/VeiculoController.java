package com.c4rloos0.Trabalho_PRW3_Spring.Veiculo;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody VeiculoDTO dados) {
        var veiculo = new Veiculo(dados);
        veiculoRepository.save(veiculo);
    }


}
