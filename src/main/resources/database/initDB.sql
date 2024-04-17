CREATE TABLE IF NOT EXISTS emploee
(
    id    INTEGER PRIMARY KEY ,
    name  VARCHAR(200) NOT NULL ,
    middle_name VARCHAR(200) NOT NULL,
    address VARCHAR(200) NOT NULL,
    department VARCHAR(200) NOT NULL,
    birth_day VARCHAR(200) NOT NULL,
    post VARCHAR(200) NOT NULL
);