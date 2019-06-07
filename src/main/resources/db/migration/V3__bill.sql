create table bill
(
    id      serial constraint bill_pk primary key ,
    ordered_time    timestamp not null
);
create table item_in_bill
(
    bill_id        serial constraint bill___fk references bill,
    item_id        serial constraint item___fk references item,
    quantity       serial not null
);