package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.Mecanico;
import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.MecanicoRepository;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.Veiculo;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.VeiculoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consertos")
public class ConsertoController {
    @Autowired
    private ConsertoRepository consertoRepository;
    @Autowired
    private MecanicoRepository mecanicoRepository;
    @Autowired
    private VeiculoRepository veiculoRepository;
    @Autowired
    private ConsertoService consertoService;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody ConsertoDTO dados) {
        Veiculo veiculo = veiculoRepository.getReferenceById(dados.id_veiculo());
        Mecanico mecanico = mecanicoRepository.getReferenceById(dados.id_mecanico());
        var conserto = new Conserto(dados,mecanico,veiculo);
        consertoRepository.save(conserto);
    }

    @GetMapping
    public Page<ConsertoDTO> listar(
            @PageableDefault() Pageable pageable
    ) {
        return consertoRepository.findAll(pageable).map(ConsertoDTO::new);
    }


}
