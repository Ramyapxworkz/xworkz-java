create database company1;
use company1;
create table Employee(Employee_name varchar(300) not null,Employee_id int primary key,
Employee_email varchar(300) not null unique,Employee_number double unique);
 
 insert into Employee values('Ramya',222,'rramya@gmail.com',3344556677); 
 insert into Employee values ('Radhika',212,'Radhika1@gmail.com',3244556677);
 insert into Employee values ('Roja',123,'Roja12@gmail.com',3254556677);
  insert into Employee values ('megha',456,'megha13@gmail.com',4244556677);
 insert into Employee values ('pooja',678,'pooja14@gmail.com',5244556677);
 insert into Employee values ('sushma',789,'sushma15@gmail.com',6244556677);
 insert into Employee values ('ganga',232,'ganga16@gmail.com',7244556677);
 insert into Employee values ('suchitra',234,'suchitra16@gmail.com',8244556677);
 insert into Employee values ('chandana',345,'chandana17@gmail.com',9244556677);
 insert into Employee values ('swathi',455,'swathi1@gmail.com',5644556677);
 insert into Employee values ('jamuna',667,'jamuna1@gmail.com',9944556677);

 select * from Employee where Employee_id=222;
 
 select * from Employee;
truncate table Employee;

create table Department(Department_name varchar(300) not null unique,
HR_name varchar(50) not null,
location varchar(200) not null,
Business_type varchar(200) not null unique,
email varchar(200) not null unique);
insert into Department values('Business Development','cxxcx','bangalore','sales','cxxcx@gmail.com');
insert into Department values('Assert management','rtr','bangalore','Asser','Asser@gmail.com');
insert into Department values('Creative service','ramya','bangalore','creative','ramya@gmail.com');
insert into Department values('production Development','varu','bangalore','production','varu@gmail.com');
insert into Department values('Organization Development','sihi','bangalore','organization','sihi@gmail.com');
insert into Department values('finance Development','anu','bangalore','finance','anu@gmail.com');
insert into Department values('Human Resource','suma','bangalore','human resource','suma@gmail.com');
insert into Department values('Administrative  Development','chandu','bangalore','administrativ','chandu@gmail.com');
insert into Department values('Machinery and Equipment Development','suhas','bangalore','machinery','suhas@gmail.com');
insert into Department values('Marketing And Sales Development','yuyy','bangalore','marketing','yuyy@gmail.com');

select * from Department where  Department_name='Creative service';
select * from Department;



