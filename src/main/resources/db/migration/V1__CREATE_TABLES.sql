create table hibernate_sequence (
    next_val bigint
) engine=MyISAM;

insert into hibernate_sequence values ( 1 );

CREATE TABLE sum_values (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name varchar(64) ,
    value varchar(64),
    PRIMARY KEY (id)
) engine=MyISAM;

