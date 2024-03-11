-- create dept table
create table dept(
    deptno int primary key,
    dname varchar(20),
    loc varchar(20),
    branchno int
);
-- insert data into dept table
insert into dept values(10, 'ACCOUNTING', 'NEW YORK', 1);
insert into dept values(20, 'RESEARCH', 'DALLAS', 2);
insert into dept values(30, 'SALES', 'CHICAGO', 3);
insert into dept values(40, 'OPERATIONS', 'BOSTON', 4);

SELECT * FROM dept WHERE deptno = 10;


select * from whoami;