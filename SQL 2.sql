create database country;
drop database country;

show databases;
use country;
select user();
select database();

create table city_info(id int,name_of_city varchar(8));
insert into city_info values(1,"Davanagere");

alter table city_info modify column name_of_city varchar(12);
select * from city_info;
create table state_name(id int, Name_of_state varchar(12));
insert into state_name values(2,'karnataka');
insert into state_name values(3,'rayachur');
select * from state_name;
