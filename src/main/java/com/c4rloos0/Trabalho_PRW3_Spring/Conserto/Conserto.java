package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

import com.c4rloos0.Trabalho_PRW3_Spring.Mecanico.Mecanico;
import com.c4rloos0.Trabalho_PRW3_Spring.Veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import java.time.LocalDate;

@Table(name = "consertos")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
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
        this.entrada = conserto.entrada();
        this.saida = conserto.saida();
        this.veiculo = new Veiculo(conserto.veiculo());
        this.mecanico = new Mecanico(conserto.mecanico());
    }


}
