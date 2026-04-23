package com.c4rloos0.Trabalho_PRW3_Spring.Veiculo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record VeiculoDTO(
        @NotBlank
            String marca,
        @NotBlank
            String modelo,
        @Min(1886)
        @Max(2026)
        int ano) {
}
