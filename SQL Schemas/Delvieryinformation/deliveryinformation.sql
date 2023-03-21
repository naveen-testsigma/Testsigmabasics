create table deliveryinformation
(
    id BIGINT(10) NOT NULL AUTO_INCREMENT,
    address VARCHAR(100) DEFAULT NULL,
    customerid integer DEFAULT NULL,
    primary key(id),
    foreign key(customerid)
        references customer(id)
        ON DELETE CASCADE
);