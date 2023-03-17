create table product_category  ( product_category_id int, name varchar(10), description varchar(100), primary key(product_category_id) );
create table product_wishlist(
product_wishlist_id int,
name varchar(10),
product_category_id int,
primary key(product_wishlist_id),
foreign key(product_wishlist_id)
references product_category(product_category_id)
);
create table product(
product_id int,
product_name varchar(10),
product_description varchar(200),
product_price varchar(10),
product_category_id int,
product_wishlist_id int,
primary key(product_id),
foreign key(product_category_id)
references product_category(product_category_id),
foreign key(product_wishlist_id)
references product_wishlist(product_wishlist_id)
);

create table user
(
user_id int,
username varchar(10),
password varchar(10),
first_name varchar(10),
last_name varchar(10),
mobile varchar(10),
address varchar(200),
primary key(user_id)
);

create table shopping_session
(
shopping_session_id int,
user_id int,
total decimal,
primary key(shopping_session_id),
foreign key(user_id)
references user(user_id)
);

create table cart
(
cart_id int,
shopping_session_id int,
product_id int,
quantity int,
primary key(cart_id),
foreign key(shopping_session_id)
references shopping_session(shopping_session_id),
foreign key(product_id)
references product(product_id)
);

create table payment
(
payment_id int,
amount int,
status varchar(5),
provider varchar(5),
primary key(payment_id)
);
create table order_items
(
order_id int,
payment_id int,
product_id int,
quantity varchar(3),
description varchar(100),
primary key(order_id),
foreign key(payment_id)
references payment(payment_id),
foreign key(product_id)
references product(product_id)
);
