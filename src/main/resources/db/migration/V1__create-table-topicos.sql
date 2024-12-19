create table topicos(

    id bigint not null auto_increment,
    idUsuario VARCHAR(255) NOT NULL DEFAULT '1',
    mensaje varchar(200) not null,
    nombreCurso varchar(100) not null,
    titulo varchar(100) not null,

    primary key(id)
);