
create table orderinformation
(
    id BIGINT(10) NOT NULL auto_increment,
    customerid integer  default null,
    billingnumber bigint default null,
    itemtype varchar(50) default null,
    primary key(ordercode),
    foreign key(customerid)
        references customer(id)
        on delete cascade ,
    foreign key(billingnumber)
        references billinginformation(id)
        on delete cascade
);