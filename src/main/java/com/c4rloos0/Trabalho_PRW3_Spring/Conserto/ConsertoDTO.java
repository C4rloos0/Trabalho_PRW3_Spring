package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ConsertoDTO(
        LocalDate entrada,
        LocalDate saida,
        @NotNull
            Long id_mecanico,
        @NotNull
            Long id_veiculo) {
    public ConsertoDTO(Conserto conserto) {
        this(conserto.getEntrada(),
                conserto.getSaida(),
                    conserto.getMecanico().getId(),
                        conserto.getVeiculo().getId());
    }
}
