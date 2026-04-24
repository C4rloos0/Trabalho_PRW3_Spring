package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.Mecanico;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Table(name = "consertos")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conserto {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate entrada;
    private LocalDate saida;

    @Embedded
    private Veiculo veiculo;

    @Embedded
    private Mecanico mecanico;



    public Conserto(ConsertoDTO conserto) {
        this.entrada = LocalDate.parse(conserto.entrada(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.saida = LocalDate.parse(conserto.saida(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.veiculo = new Veiculo(conserto.veiculo());
        this.mecanico = new Mecanico(conserto.mecanico());
    }


}
