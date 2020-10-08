--liquibase formatted sql
--changeset cs:001

create table play(
id serial primary key
)
--rollback drop table hotels;