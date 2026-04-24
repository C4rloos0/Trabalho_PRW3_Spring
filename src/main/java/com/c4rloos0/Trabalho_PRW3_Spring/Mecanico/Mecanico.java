package com.c4rloos0.Trabalho_PRW3_Spring.Mecanico;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Embeddable
public class Mecanico {
    private String nome;
    private int anos_experiencia;

    public Mecanico(MecanicoDTO mecanico) {
        this.nome = mecanico.nome();
        this.anos_experiencia = mecanico.anos_experiencia();
    }

    public Mecanico() {}


}
