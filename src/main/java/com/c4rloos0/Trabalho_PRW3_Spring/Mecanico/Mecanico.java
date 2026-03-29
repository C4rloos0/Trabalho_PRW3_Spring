package com.c4rloos0.Trabalho_PRW3_Spring.Mecanico;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "mecanicos")
@Entity(name = "Mecanico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Mecanico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int experiencia;

    public Mecanico(MecanicoDTO mecanico) {
        this.nome = mecanico.nome();
        this.experiencia = mecanico.experiencia();
    }

}
