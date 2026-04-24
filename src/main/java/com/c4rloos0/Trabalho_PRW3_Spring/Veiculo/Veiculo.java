package com.c4rloos0.Trabalho_PRW3_Spring.Veiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Veiculo(VeiculoDTO veiculoDTO) {
        this.marca = veiculoDTO.marca();
        this.modelo = veiculoDTO.modelo();
        this.ano = veiculoDTO.ano();
        this.cor = veiculoDTO.cor();
    }

    public Veiculo() {}



}
