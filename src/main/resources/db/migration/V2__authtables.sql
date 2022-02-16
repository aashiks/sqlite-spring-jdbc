create table users
(
    uid           integer primary key,
    username      text    not null unique,
    password      text    not null,
    creation_date text    not null,
    email_address text    not null,
    enabled       integer not null
);

create table roles
(
    uid  integer not null,
    role text not null,
    foreign key (uid) references users (uid)
);
