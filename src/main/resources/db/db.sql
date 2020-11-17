
to get here, you create a folder under resources, called db then create a file 'db' and give it the .sql extension

drop user if exist 'petuser'@ 'localhost';
Create user 'petuser' @ 'localhost' identified by 'petuser123';
grant all privileges petstoredb.* to 'petuser' @ 'localhost';
flush privileges;  //this will create the database in the external

drop database if exists petstoredb;
create database petstoredb;