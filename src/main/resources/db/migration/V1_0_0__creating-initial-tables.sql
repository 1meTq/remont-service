create table users
(
    id       bigserial primary key,
    name     text not null,
    lastname text not null
);

create table categories
(
    id          bigserial primary key,
    name        text not null,
    description text not null
);

create table tasks
(
    id          bigserial primary key,
    address     text   not null,
    description text   not null,
    price       bigint not null,
    user_id     bigint not null
        constraint tasks_user_id_fk references users,
    category_id bigint not null
        constraint tasks_category_id_fk references categories

);