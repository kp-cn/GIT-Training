-- create table depart(
-- deptid int primary key,
-- deptname varchar(199));

\d+ depart;
truncate depart;
insert into depart(deptid,deptname)
	select empid, 'here' from emp;
select * from depart;