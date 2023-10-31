create database company;
use company;
create table employee(employee_name varchar(3),employee_id int ,employee_salary bigint);
insert into  employee values('chandu',1,10000000000000);

select * from employee;
alter table employee modify column employee_name varchar(7);

