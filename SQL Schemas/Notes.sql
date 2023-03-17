create database Notekeepingdatabase;
use notekeepingdatabase;

create table Usertable
(
userID int ,
username varchar(10),
password varchar(10),
first_name varchar(10),
last_name varchar(10),
primary key(userID)
);

create table notetable
(
noteID int not null,
userID int ,
note_title varchar(10),
note_text varchar(10),
foreign key(userID)
references usertable(userID),
primary key(noteID)
);

create table checklistTable
(
checklistID int not null,
userID int ,
checklist_name varchar(10),
foreign key(userID)
references usertable(userID),
primary key(checklistID)
);


insert into usertable values
(1,"roblox","roblox","sign","her"),
(2,"meinkarf","meinkarf","shin","soz"),
(3,"grandtheif","grandtheif","fals","slaf")
;

 insert into notetable values
 (3,1,"note3","this is"),
 (4,1,"note4","this is"),
 (1,2,"note1","not good"),
 (2,2,"note2","not good"),
 (3,2,"note3","not good"),
 (1,3,"note1","grea"),
 (2,3,"note2","great "),
 (3,3,"note3","realling")
 ;
select * from notetable;
select * from notetable,usertable
where notetable.userid = notetable.userid;
drop table notetable,usertable,checklisttable;