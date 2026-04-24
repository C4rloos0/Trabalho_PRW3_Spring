package com.c4rloos0.Trabalho_PRW3_Spring.Mecanico;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record MecanicoDTO(
        @NotBlank
        String nome,
        @Min(0)
        int anos_experiencia) {
}
