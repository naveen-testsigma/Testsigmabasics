create table customer
(id bigint(10)   not null     auto_increment,
 firstname       varchar(20)  default null,
 lastname        varchar(20)  default null,
 phoneno         bigint(10)   default null,
 primary key(id)
);

