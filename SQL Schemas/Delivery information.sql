create table customer
(customerid integer unsigned unique,
primary key(customerid),
firstname varchar(20),
lastname varchar(20),
phoneno integer
);


create table deliveryinformation
(
deliverynumber bigint unsigned unique,
address varchar(100),
customerid integer,
primary key(deliverynumber),
foreign key(customerid)
references customer(customerid)
);

create table billinginformation
(
billingnumber bigint unsigned unique,
package varchar(50),
rate varchar(15),
customerid integer,
primary key(billingnumber),
foreign key(customerid)
references customer(customerid)
);

create table orderinformation
(
ordercode integer unsigned unique,
customerid integer,
billingnumber bigint,
itemtype varchar(50),
primary key(ordercode),
foreign key(customerid)
references customer(customerid),
foreign key(billingnumber)
references billinginformation(billingnumber)
);