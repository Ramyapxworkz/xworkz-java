create database worldcup;
use worldcup;
select database();
create table worldcup(serial_num int,total_num_of_teams int,team_name varchar(10),team_captain varchar(20),team_players int,number_batters int,number_bowlers int,num_all_rounder int,num_of_overs int,start_year int);
insert into worldcup values(1,10,'India','Rohit Sharma',11,6,6,8,100,2008);
select * from worldcup;

