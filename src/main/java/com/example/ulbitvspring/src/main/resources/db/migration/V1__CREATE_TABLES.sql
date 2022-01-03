create table hibernate_sequence (
    next_val bigint
) engine=MyISAM;

CREATE TABLE sum_values (
    name UNIQUE,
    value varchar(64),
    PRIMARY KEY (name)
) engine=MyISAM;

