create table item
(
    id          serial constraint share_pk primary key,
    name        varchar(20) not null,
    description varchar(200) not null,
    image       varchar(200) not null,
    price       serial not null,
    additional_details  varchar(100)
);

create unique index item_name
    on item (name);