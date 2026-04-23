package com.c4rloos0.Trabalho_PRW3_Spring.Veiculo;

import jakarta.validation.constraints.NotBlank;

public record VeiculoDTO(
        @NotBlank
            String marca,
        @NotBlank
            String modelo,
        int ano) {
}
