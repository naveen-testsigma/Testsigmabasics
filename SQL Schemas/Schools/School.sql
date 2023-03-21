create table Students(
                         id 				bigint(10) 	NOT NULL auto_increment,
                         Name			varchar(20) default null,
                         Standard 		int 		default null,
                         Section 		char(1) 	default null,
                         primary key(id)
);

create table Teachers(
                         id 				bigint(10) NOT NULL auto_increment,
                         Name 			varchar(20) default null,
                         Subject 		varchar(10) default null,
                         Class_room 		int			default null,
                         primary key(id)
);

create table Marks(
                      id 				bigint(10) 	NOT NULL unique,
                      Maths 			int 		default null,
                      Science 		int			default null,
                      primary key(id),
                      foreign key (id)
                          references Students(id)
                          on delete cascade
);