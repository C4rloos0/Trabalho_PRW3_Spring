package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record ConsertoDTO(
        LocalDate entrada,
        LocalDate saida,
        @NotBlank
            Long id_mecanico,
        @NotBlank
            Long id_veiculo) {
}
