package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsertoService {
    @Autowired
    private ConsertoRepository consertoRepository;

    public List<ConsertoDTO> listar() {
        List<Conserto> consertos = consertoRepository.findAll();
        return consertos.stream().map(c -> new ConsertoDTO(c.getEntrada(),
                c.getSaida(),c.getMecanico().getId(),
                c.getVeiculo().getId())).toList();
    }


}
