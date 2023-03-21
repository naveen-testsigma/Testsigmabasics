create TABLE user(
                     id 				bigint(10)    	NOT NULL auto_increment,
                     first_name  	varchar(20)   	default NULL,
                     last_name		varchar(20) 	default NULL,
                     primary key(id)
);

create TABLE notes(
                      id		 		bigint(10)		NOT NULL unique,
                      note 			text 			default null,
                      primary key(id),
                      foreign key(id)
                          references user(id)
                          on delete cascade
);

create TABLE aboutNotes(
                           id 				bigint(10) 		NOT NULL unique,
                           created_date	datetime		default current_timestamp,
                           foreign key(id)
                               references notes(id)
                               on update cascade
);