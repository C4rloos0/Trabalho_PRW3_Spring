create table consertos(
        id bigint auto_increment primary key,
        entrada date not null,
        saida date,
        id_mecanico bigint not null,
        id_veiculo bigint not null,
        constraint fk_mec_cons foreign key (id_mecanico) references mecanicos(id),
        constraint fk_veic_cons foreign key (id_veiculo) references veiculos(id)
);