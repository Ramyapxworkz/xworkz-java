create database cricket;
drop database cricker;
select user();
select database();

use cricket;
create table T20(serial_num int,total_num_of_teams int,team_name varchar(10),team_captain varchar(20),team_players int,number_batters int,number_bowlers int,num_all_rounder int,num_of_overs int,start_year int);
insert into T20 values(1,15,'RCB','virat kohli',21,6,9,8,20,2008);
select * from T20;

