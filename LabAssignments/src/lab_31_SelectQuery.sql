mysql> create table emp ( EMPNO INT NOT NULL,
    -> ENAME VARCHAR(30) NOT NULL,
    -> JOB VARCHAR(35) NOT NULL,
    -> MGR INT NOT NULL,
    -> HIREDATE DATE NOT NULL,
    -> SAL INT NOT NULL,
    -> COMM INT NOT NULL,
    -> DEPTNO INT NOT NULL);
Query OK, 0 rows affected (0.60 sec)

mysql> DESC EMP;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| EMPNO    | int         | NO   |     | NULL    |       |
| ENAME    | varchar(30) | NO   |     | NULL    |       |
| JOB      | varchar(35) | NO   |     | NULL    |       |
| MGR      | int         | NO   |     | NULL    |       |
| HIREDATE | date        | NO   |     | NULL    |       |
| SAL      | int         | NO   |     | NULL    |       |
| COMM     | int         | NO   |     | NULL    |       |
| DEPTNO   | int         | NO   |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
INSERT INTO EMP VALUES 
(7396, 'SMITH', 'CLERK', 7902,'1980-12-17',800,80,20),
(7499, 'ALLEN', 'SALESMAN', 7698,'1981-10-20',1600,160,30),
(7521, 'WARD', 'SALESMAN', 7698,'1981-02-02',1250,125,30),
(7566, 'JONES', 'MANAGER', 7839,'1981-01-08',2975,297.5,20),
(7698, 'MARTIN', 'SALESMAN', 7698,'1981-09-28',1250,125,30),
(7782, 'BLAKE', 'MANAGER', 7839,'1981-05-01',2850,285,30),
(7788, 'CLARK', 'ANALYST', 7566,'1981-06-08',2450,245,10),
(7839, 'SCOTT', 'PRESIDENT', 7788,'1981-12-09',3000,300,20),
(7876, 'KING', 'CLERK', 7698,'1983-01-12',5000,500,10),
(7654, 'ADAMS', 'CLERK', 7698,'1981-12-03',1100,110,20);

****************************************************************************************

1)	Retrieve all the rows and columns from the Emp table.

select * from emp;

mysql> select * from emp;
+-------+--------+-----------+------+------------+------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL  | COMM | DEPTNO |
+-------+--------+-----------+------+------------+------+------+--------+
|  7396 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 |   80 |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-10-20 | 1600 |  160 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-02 | 1250 |  125 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-01-08 | 2975 |  298 |     20 |
|  7698 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 |  125 |     30 |
|  7782 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 |  285 |     30 |
|  7788 | CLARK  | ANALYST   | 7566 | 1981-06-08 | 2450 |  245 |     10 |
|  7839 | SCOTT  | PRESIDENT | 7788 | 1981-12-09 | 3000 |  300 |     20 |
|  7876 | KING   | CLERK     | 7698 | 1983-01-12 | 5000 |  500 |     10 |
|  7654 | ADAMS  | CLERK     | 7698 | 1981-12-03 | 1100 |  110 |     20 |
+-------+--------+-----------+------+------------+------+------+--------+

****************************************************************************************

2)	Retrieve employee name and job from the Emp table.

mysql> select ename, job from emp;
+--------+-----------+
| ename  | job       |
+--------+-----------+
| SMITH  | CLERK     |
| ALLEN  | SALESMAN  |
| WARD   | SALESMAN  |
| JONES  | MANAGER   |
| MARTIN | SALESMAN  |
| BLAKE  | MANAGER   |
| CLARK  | ANALYST   |
| SCOTT  | PRESIDENT |
| KING   | CLERK     |
| ADAMS  | CLERK     |
+--------+-----------+
10 rows in set (0.00 sec)

****************************************************************************************


3)	Retrieve employee name as name, mgr as manager id from the Emp table.

mysql> SELECT ENAME AS NAME, MGR AS MANAGERID FROM EMP;
+--------+-----------+
| NAME   | MANAGERID |
+--------+-----------+
| SMITH  |      7902 |
| ALLEN  |      7698 |
| WARD   |      7698 |
| JONES  |      7839 |
| MARTIN |      7698 |
| BLAKE  |      7839 |
| CLARK  |      7566 |
| SCOTT  |      7788 |
| KING   |      7698 |
| ADAMS  |      7698 |
+--------+-----------+
10 rows in set (0.00 sec)

****************************************************************************************
4)	Retrieve the jobs present in the Emp table.
mysql> SELECT JOB FROM EMP;
+-----------+
| JOB       |
+-----------+
| CLERK     |
| SALESMAN  |
| SALESMAN  |
| MANAGER   |
| SALESMAN  |
| MANAGER   |
| ANALYST   |
| PRESIDENT |
| CLERK     |
| CLERK     |
+-----------+
10 rows in set (0.00 sec)

****************************************************************************************

5)	Display the name, job, salary and net salary (salary + commission) of all managers.
mysql> SELECT ename, job, sal ,(sal + comm) as netsalary FROM EMP where job ='MANAGER';
+-------+---------+------+-----------+
| ename | job     | sal  | netsalary |
+-------+---------+------+-----------+
| JONES | MANAGER | 2975 |      3273 |
| BLAKE | MANAGER | 2850 |      3135 |
+-------+---------+------+-----------+
2 rows in set (0.02 sec)

****************************************************************************************
6)	Display the name, hire date, salary of all employees 
belonging to either department 10 or 20.
mysql> SELECT ENAME,HIREDATE,SAL,DEPTNO FROM EMP WHERE DEPTNO =10 OR DEPTNO=20;
+-------+------------+------+--------+
| ENAME | HIREDATE   | SAL  | DEPTNO |
+-------+------------+------+--------+
| SMITH | 1980-12-17 |  800 |     20 |
| JONES | 1981-01-08 | 2975 |     20 |
| CLARK | 1981-06-08 | 2450 |     10 |
| SCOTT | 1981-12-09 | 3000 |     20 |
| KING  | 1983-01-12 | 5000 |     10 |
| ADAMS | 1981-12-03 | 1100 |     20 |
+-------+------------+------+--------+
6 rows in set (0.00 sec)
****************************************************************************************

7)	Display the rows of all employees whose name contains exactly 5 characters.

mysql> SELECT * FROM EMP WHERE ENAME LIKE '_____';
+-------+-------+-----------+------+------------+------+------+--------+
| EMPNO | ENAME | JOB       | MGR  | HIREDATE   | SAL  | COMM | DEPTNO |
+-------+-------+-----------+------+------------+------+------+--------+
|  7396 | SMITH | CLERK     | 7902 | 1980-12-17 |  800 |   80 |     20 |
|  7499 | ALLEN | SALESMAN  | 7698 | 1981-10-20 | 1600 |  160 |     30 |
|  7566 | JONES | MANAGER   | 7839 | 1981-01-08 | 2975 |  298 |     20 |
|  7782 | BLAKE | MANAGER   | 7839 | 1981-05-01 | 2850 |  285 |     30 |
|  7788 | CLARK | ANALYST   | 7566 | 1981-06-08 | 2450 |  245 |     10 |
|  7839 | SCOTT | PRESIDENT | 7788 | 1981-12-09 | 3000 |  300 |     20 |
|  7654 | ADAMS | CLERK     | 7698 | 1981-12-03 | 1100 |  110 |     20 |
+-------+-------+-----------+------+------------+------+------+--------+
7 rows in set (0.03 sec)

****************************************************************************************
8)	Display the employee numbers, jobs, names, and salaries of all employees 
whose name contains ‘LL’ in them.

mysql> SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE ENAME LIKE '%LL%';
+-------+-------+----------+------+
| EMPNO | ENAME | JOB      | SAL  |
+-------+-------+----------+------+
|  7499 | ALLEN | SALESMAN | 1600 |
+-------+-------+----------+------+
1 row in set (0.02 sec)

****************************************************************************************
9)	Display the records of all employees who have joined in the year 1981.

mysql> SELECT * FROM EMP WHERE HIREDATE LIKE '1981%';
+-------+--------+-----------+------+------------+------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL  | COMM | DEPTNO |
+-------+--------+-----------+------+------------+------+------+--------+
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-10-20 | 1600 |  160 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-02 | 1250 |  125 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-01-08 | 2975 |  298 |     20 |
|  7698 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 |  125 |     30 |
|  7782 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 |  285 |     30 |
|  7788 | CLARK  | ANALYST   | 7566 | 1981-06-08 | 2450 |  245 |     10 |
|  7839 | SCOTT  | PRESIDENT | 7788 | 1981-12-09 | 3000 |  300 |     20 |
|  7654 | ADAMS  | CLERK     | 7698 | 1981-12-03 | 1100 |  110 |     20 |
+-------+--------+-----------+------+------------+------+------+--------+
8 rows in set (0.00 sec)

****************************************************************************************
10)	Display the records of all employees arranged according to 
job wise in descending order and according to names in ascending order.

mysql> SELECT * FROM EMP ORDER BY JOB DESC,ENAME ASC;
+-------+--------+-----------+------+------------+------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL  | COMM | DEPTNO |
+-------+--------+-----------+------+------------+------+------+--------+
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-10-20 | 1600 |  160 |     30 |
|  7698 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 |  125 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-02 | 1250 |  125 |     30 |
|  7839 | SCOTT  | PRESIDENT | 7788 | 1981-12-09 | 3000 |  300 |     20 |
|  7782 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 |  285 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-01-08 | 2975 |  298 |     20 |
|  7654 | ADAMS  | CLERK     | 7698 | 1981-12-03 | 1100 |  110 |     20 |
|  7876 | KING   | CLERK     | 7698 | 1983-01-12 | 5000 |  500 |     10 |
|  7396 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 |   80 |     20 |
|  7788 | CLARK  | ANALYST   | 7566 | 1981-06-08 | 2450 |  245 |     10 |
+-------+--------+-----------+------+------------+------+------+--------+
10 rows in set (0.00 sec)