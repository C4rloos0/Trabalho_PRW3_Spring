package com.c4rloos0.Trabalho_PRW3_Spring.Conserto;

public record DadosConsertoDTO(String nome, String marca, String modelo, int ano) {
    public DadosConsertoDTO(Conserto conserto) {
        this(conserto.getMecanico().getNome(),conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo(),conserto.getVeiculo().getAno());
    }

}


