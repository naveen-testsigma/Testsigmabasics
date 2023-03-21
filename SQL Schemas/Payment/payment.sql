create table product_category
( id BIGINT(10) not null auto_increment,
name varchar(10) default null,
description varchar(100) default null,
primary key(id)
);
create table product_wishlist(
id BIGINT(10) not null auto_increment,
name varchar(10) default null,
product_category_id bigint(10) default null,
primary key(id),
foreign key(product_category_id)
references product_category(id)
ON DELETE CASCADE
);
create table product(
id bigint(10) not null auto_increment,
product_name varchar(10) default null,
product_description varchar(200) default null,
product_price varchar(10) default null,
product_category_id int default null,
product_wishlist_id int default null,
primary key(id),
foreign key(product_category_id)
references product_category(id)
    ON DELETE CASCADE ,
foreign key(product_wishlist_id)
references product_wishlist(id)
    ON DELETE CASCADE
);

create table user
(
id bigint(10) not null auto_increment,
username varchar(10) default null,
password varchar(10) default null,
first_name varchar(10) default null,
last_name varchar(10) default null,
mobile varchar(10) default null,
address varchar(200)  default null,
primary key(id)
);

create table shopping_session
(
id bigint(10) not null auto_increment,
user_id int  default null,
total decimal  default null,
primary key(id),
foreign key(user_id)
references user(id)
    ON DELETE CASCADE
);

create table cart
(
id bigint(10) not null auto_increment,
shopping_session_id int  default null,
product_id int  default null,
quantity int  default null,
primary key(id),
foreign key(shopping_session_id)
references shopping_session(id)
    ON DELETE CASCADE ,
foreign key(product_id)
references product(id)
    ON DELETE CASCADE
);

create table payment
(
id BIGINT(10) not null auto_increment,
amount int  default null,
status varchar(5)  default null,
provider varchar(5)  default null,
primary key(id)
);
create table order_items
(
id bigint(10) not null auto_increment,
payment_id int  default null,
product_id int  default null,
quantity varchar(3)  default null,
description varchar(100)  default null,
primary key(id),
foreign key(payment_id)
references payment(id)
    ON DELETE CASCADE ,
foreign key(product_id)
references product(id)
    ON DELETE CASCADE
);
