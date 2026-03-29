package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.Mecanico;
import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.MecanicoDTO;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.Veiculo;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.VeiculoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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

    @ManyToOne
    @JoinColumn(name = "id_mecanico")
    private Mecanico mecanico;
    @ManyToOne
    @JoinColumn(name = "id_veiculo")
    private Veiculo veiculo;

    public Conserto(ConsertoDTO conserto, Mecanico mecanico, Veiculo veiculo) {
        this.entrada = conserto.entrada();
        this.saida = conserto.saida();
        this.mecanico = mecanico;
        this.veiculo = veiculo;
    }

}
