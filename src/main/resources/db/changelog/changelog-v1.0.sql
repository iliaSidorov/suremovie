--liquibase formatted sql

--changeset bob:1
create table movies
(
    id bigint not null
        constraint movies_pk
            primary key,
    title varchar(255) not null,
    director varchar(55),
    year int not null
);

