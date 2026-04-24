create table consertos(
        id bigint auto_increment primary key,
        entrada date not null,
        saida date,
        marca varchar(25) not null,
        modelo varchar(25) not null,
        ano int not null,
        nome varchar(25) not null,
        anos_experiencia int not null
);