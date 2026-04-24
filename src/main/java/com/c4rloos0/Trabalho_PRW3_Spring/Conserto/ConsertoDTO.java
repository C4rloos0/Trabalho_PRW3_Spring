package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.MecanicoDTO;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.VeiculoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;


public record ConsertoDTO(
        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}", message = "Data deve estar no formato dd/mm/aaaa")
        String entrada,
        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}", message = "Data deve estar no formato dd/mm/aaaa")
        String saida,
        @Valid
        VeiculoDTO veiculo,
        @Valid
        MecanicoDTO mecanico
        ) {}
