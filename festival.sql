create database Festival;
use festival;
select database();
create table festival_info(state_name varchar(20),
festival_name varchar(20),
festival_another_name varchar(50),
is_annual boolean,
 date int,
 month varchar(20),
 food varchar(20),
 type1 varchar(20),
 game varchar(20),
 price int);
 insert into festival_info values('karnataka','ugadi','Samvatsarādi',true,22,'march','obbattu','hindhu','jokali',10000);
 insert into festival_info values('Andrapradesh','Srivari Brahmotsavam','Sri Venkateswara Swami vari Brahmotsavam ',true,18,'september','obbattu','hindhu','indoor games',20000);
insert into festival_info values('Kerala','Onam','onam',true,30,'August','obbattu','hindhu','indoor game',10000);
insert into festival_info values('Rajasthan','Desert Festival','Desert Festival',true,30,'december','obbattu','hindhu','indoor game',10000);
insert into festival_info values('sikkim','Losoong Festival','Losoong Festival',true,30,'january','payasa','hindhu','indoor game',10000);



select * from festival_info;