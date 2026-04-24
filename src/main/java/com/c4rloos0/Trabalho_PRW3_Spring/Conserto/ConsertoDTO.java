package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.MecanicoDTO;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.VeiculoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ConsertoDTO(
        LocalDate entrada,
        LocalDate saida,
        @Valid
        VeiculoDTO veiculo,
        @Valid
        MecanicoDTO mecanico
        ) {}
