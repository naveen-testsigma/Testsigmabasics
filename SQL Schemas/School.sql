create database school;
use school;

create table parent(
parent_id int not null,
primary key(parent_id),
name varchar(13),
email varchar(20),
age int(2),
mobile int(10)
);
create table student
(student_id int unique not null,
name varchar(13),
email varchar(20),
age int(2),
dob date,
mobile int(10),
parent_id int,
primary key(student_id),
foreign key(parent_id)
references parent(parent_id)
);
insert into parent values
(1,"Nixon","nixon@gmai.com",45,324324232), 
(2,"Srini","srini@gmail.com",35,4353453535), 
(3,"Raksha","raksha@gmail.com",43,832847283), 
(4,"Monesh","monesh@gmail.com",46,923984923);
insert into student values
(1,"Numero Uno","uno@gmail.com",20,"2000-12-27",3242342,1),
(2,"Secondro Uno","secoo@gmail.com",20,"2000-10-7",3242342,1),
(3,"srinison","usrin@gmail.com",20,"2000-6-2",3242342,2),
(4,"rakshason","rasksno@gmail.com",20,"2000-2-4",3242342,3),
(5,"moneson","umoso@gmail.com",20,"2000-3-4",3242342,4),
(6,"moneson2","uno@gmail.com",20,"2000-1-20",3242342,4);
select * from parent,student
where student.parent_id = parent.parent_id;
create table subject
( subject_name varchar(10),
 subject_code varchar(5),
 primary key(subject_code)
);
insert into subject values
("Maths","MA100"),
("Science","SC100"),
("English","EC100"),
("Chemistry","CE100");
select*from subject;
delete from subject
where subject_code ="CE100";
select * from subject;