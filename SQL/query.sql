CREATE TABLE employee (
    ID int NOT NULL,
    name varchar(255) NOT NULL,
    email varchar(255),
    dob date,
	dept varchar(255),
    PRIMARY KEY (ID)
);
INSERT INTO `microservice`.`employee` (`ID`, `name`, `email`, `dob`, `dept`) 
VALUES ('3', 'Udhai', 'udhai@gmail.com', '1998-01-01', 'EEE');

select * from employee;