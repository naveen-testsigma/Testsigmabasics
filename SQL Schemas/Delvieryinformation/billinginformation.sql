create table billinginformation
(
    id  BIGINT(10) not null auto_increment,
    package varchar(50) default NULL,
    rate varchar(15) default NULL,
    customerid integer default NULL,
    primary key(id),
    foreign key(customerid)
        references customer(id)
        ON DELETE cascade
);