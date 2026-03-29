package com.c4rloos0.Trabalho_PRW3_Spring.Veiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "veiculos")
@Entity(name = "Veiculo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(VeiculoDTO veiculo) {
        this.marca = veiculo.marca();
        this.modelo = veiculo.modelo();
        this.ano = veiculo.ano();
    }

}
