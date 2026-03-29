package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.Mecanico;
import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.MecanicoRepository;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.Veiculo;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.VeiculoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consertos")
public class ConsertoController {
    @Autowired
    private ConsertoRepository consertoRepository;
    @Autowired
    private MecanicoRepository mecanicoRepository;
    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody ConsertoDTO dados) {
        Veiculo veiculo = veiculoRepository.getReferenceById(dados.id_veiculo());
        Mecanico mecanico = mecanicoRepository.getReferenceById(dados.id_mecanico());
        var conserto = new Conserto(dados,mecanico,veiculo);
        consertoRepository.save(conserto);
    }
}
