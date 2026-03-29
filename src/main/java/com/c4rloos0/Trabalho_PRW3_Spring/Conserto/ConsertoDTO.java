package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import java.time.LocalDate;

public record ConsertoDTO(LocalDate entrada, LocalDate saida, Long id_mecanico, Long id_veiculo) {
}
