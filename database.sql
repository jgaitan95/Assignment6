# To run it
# mysql -u root -p < library.sql
# enter pwd: goodyear123!@#

DROP DATABASE IF EXISTS employee_db;
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE Emps(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255));

INSERT INTO Emps(name) VALUES("Dr. Evil");
INSERT INTO Emps(name) VALUES("Mini Me");
INSERT INTO Emps(name) VALUES("Number Two");
INSERT INTO Emps(name) VALUES("Austin Power");

CREATE TABLE Skills(
	id INT AUTO_INCREMENT PRIMARY KEY,
	emp_name INT,
	skill VARCHAR(255));

INSERT INTO Skills(emp_name, skill) VALUES(1, "Butcher, Saucier, Baker");

INSERT INTO Skills(emp_name, skill) VALUES(2, "Saucier, Baker");

INSERT INTO Skills(emp_name, skill) VALUES(3, "Butcher, Dishwasher");

INSERT INTO Skills(emp_name, skill) VALUES(4, "Baker, Saucier");

CREATE TABLE Day_Available(
        id INT AUTO_INCREMENT PRIMARY KEY,
        emp_name INT,
	day VARCHAR(255));

INSERT INTO Day_Available(emp_name, day) VALUES(1, "Monday, Wednesday, Friday");

INSERT INTO Day_Available(emp_name, day) VALUES(2, "Tuesday, Wednesday, Friday");

INSERT INTO Day_Available(emp_name, day) VALUES(3, "Monday, Friday");

INSERT INTO Day_Available(emp_name, day) VALUES(4, "Tuesday, Thursday");

CREATE TABLE Time_Available(
        id INT AUTO_INCREMENT PRIMARY KEY,
	emp_name INT,
        time VARCHAR(255)
);

INSERT INTO Time_Available(emp_name, time) VALUES(1, "9, 10, 11, 12, 19, 20");

INSERT INTO Time_Available(emp_name, time) VALUES(2, "9, 10, 12, 14, 15, 16, 17, 18");

INSERT INTO Time_Available(emp_name, time) VALUES(3, "13, 14, 15, 16, 17, 18");
