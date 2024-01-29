--Lab_32_TableCreation

CREATE DATABASE EMPLOYEE;
USE EMPLOYEE;
CREATE TABLE EMP (
EMP_ID INT Primary Key,
FIRST_NAME VARCHAR(30) NOT NULL, 
LAST_NAME VARCHAR(30) NOT NULL, 
AGE INT , 
EMAIL VARCHAR(50)
);
-- ******************************************************************************************
--Task 1: Insert Data
--Write an SQL INSERT statement to insert data into the Employee table.

INSERT INTO EMP VALUES 
(1001,'John','Doe',22,'John@gmail.com'),
(1002,'Smith','parker',27,'Smith@gmail.com'),
(1003,'Miller','Mate',26,'Miller@gmail.com'),
(1004,'Johnson','Joe',23,'Johnson@gmail.com'),
(1005,'James','Jane',30,'James@gmail.com'),
(1006,'Park','Shin',32,'John@gmail.com'),
(1007,'Lokesh','Wang',24,'Smith@gmail.com'),
(1008,'Adam','Smit',35,'Miller@gmail.com'),
(1009,'Virat','Kohli',29,'Johnson@gmail.com'),
(1010,'Mann','Singh',27,'James@gmail.com');

SELECT * FROM EMP;
+--------+------------+-----------+------+-------------------+
| EMP_ID | FIRST_NAME | LAST_NAME | AGE  | EMAIL             |
+--------+------------+-----------+------+-------------------+
|   1001 | John       | Doe       |   22 | John@gmail.com    |
|   1002 | Smith      | parker    |   27 | Smith@gmail.com   |
|   1003 | Miller     | Mate      |   26 | Miller@gmail.com  |
|   1004 | Johnson    | Joe       |   23 | Johnson@gmail.com |
|   1005 | James      | Jane      |   30 | James@gmail.com   |
|   1006 | Park       | Shin      |   32 | John@gmail.com    |
|   1007 | Lokesh     | Wang      |   24 | Smith@gmail.com   |
|   1008 | Adam       | Smit      |   35 | Miller@gmail.com  |
|   1009 | Virat      | Kohli     |   29 | Johnson@gmail.com |
|   1010 | Mann       | Singh     |   27 | James@gmail.com   |
+--------+------------+-----------+------+-------------------+

-- ******************************************************************************************
--Task 2: Retrieving Data
-- Write an SQL SELECT statement to retrieve the first_name and last_name of all employees from the Employee table.
SELECT FIRST_NAME, LAST_NAME FROM EMP;

+------------+-----------+
| FIRST_NAME | LAST_NAME |
+------------+-----------+
| John       | Doe       |
| Smith      | parker    |
| Miller     | Mate      |
| Johnson    | Joe       |
| James      | Jane      |
| Park       | Shin      |
| Lokesh     | Wang      |
| Adam       | Smit      |
| Virat      | Kohli     |
| Mann       | Singh     |
+------------+-----------+

-- ******************************************************************************************

#Task 3: Filtering Data
#Write an SQL SELECT statement to retrieve the first_name, last_name, and age of employees who are older than 30 years.
SELECT FIRST_NAME, LAST_NAME, AGE FROM EMP WHERE AGE >30;
+------------+-----------+------+
| FIRST_NAME | LAST_NAME | AGE  |
+------------+-----------+------+
| James      | Jane      |   30 |
| Park       | Shin      |   32 |
| Adam       | Smit      |   35 |
+------------+-----------+------+

-- ******************************************************************************************
#Task 4: Updating Data
#Write an SQL UPDATE statement to increase the age of employees by 1 year for all
#employees older than 25.

UPDATE EMP SET AGE=AGE+1 WHERE AGE>25;
+--------+------------+-----------+------+-------------------+
| EMP_ID | FIRST_NAME | LAST_NAME | AGE  | EMAIL             |
+--------+------------+-----------+------+-------------------+
|   1001 | John       | Doe       |   22 | John@gmail.com    |
|   1002 | Smith      | parker    |   28 | Smith@gmail.com   |
|   1003 | Miller     | Mate      |   27 | Miller@gmail.com  |
|   1004 | Johnson    | Joe       |   23 | Johnson@gmail.com |
|   1005 | James      | Jane      |   31 | James@gmail.com   |
|   1006 | Park       | Shin      |   33 | John@gmail.com    |
|   1007 | Lokesh     | Wang      |   24 | Smith@gmail.com   |
|   1008 | Adam       | Smit      |   36 | Miller@gmail.com  |
|   1009 | Virat      | Kohli     |   30 | Johnson@gmail.com |
|   1010 | Mann       | Singh     |   28 | James@gmail.com   |
+--------+------------+-----------+------+-------------------+

------------------------------------------------------------------------------------------------------------
-- ASSIGNMENT 2 : 
-- Consider a simple database with one tables: BankAccount
-- BankAccount Table:
-- ● Columns: account_id (Primary Key), account_holder_name, account_balance

CREATE DATABASE BANK;
USE BANK;

CREATE TABLE BANKACCOUNT (
ACCOUNT_ID INT PRIMARY KEY,
ACCT_HOLDER_NAME VARCHAR(50) NOT NULL,
ACCT_BALANCE INT NOT NULL);

-- ******************************************************************************************
#Task 1: Insert Data
#Write an SQL INSERT statement to insert data into the BankAccount table.

INSERT INTO BANKACCOUNT VALUES
(101, 'JAMES JANE', 25000),
(102, 'SMITH WARNER', 30000),
(103 , 'MANN SINGH', 37000),
(104 , 'MILLER MATE', 28000),
(105 , 'JOHN DOE', 35000),
(106 , 'PARK SHIN', 40000);

SELECT * FROM BANKACCOUNT;
+------------+------------------+--------------+
| ACCOUNT_ID | ACCT_HOLDER_NAME | ACCT_BALANCE |
+------------+------------------+--------------+
|        101 | JAMES JANE       |        25000 |
|        102 | SMITH WARNER     |        30000 |
|        103 | MANN SINGH       |        37000 |
|        104 | MILLER MATE      |        28000 |
|        105 | JOHN DOE         |        35000 |
|        106 | PARK SHIN        |        40000 |
+------------+------------------+--------------+

-- ******************************************************************************************
-- Task 2: Retrieving Data
-- Write an SQL SELECT statement to retrieve the account_holder_name and
-- account_balance of all account holders from the BankAccount table.

SELECT ACCT_HOLDER_NAME, ACCT_BALANCE FROM BANKACCOUNT; 
+------------------+--------------+
| ACCT_HOLDER_NAME | ACCT_BALANCE |
+------------------+--------------+
| JAMES JANE       |        25000 |
| SMITH WARNER     |        30000 |
| MANN SINGH       |        37000 |
| MILLER MATE      |        28000 |
| JOHN DOE         |        35000 |
| PARK SHIN        |        40000 |
+------------------+--------------+


-- ******************************************************************************************

-- Task 3: Filtering Data
-- Write an SQL SELECT statement to retrieve the account_holder_name and
-- account_balance where the account_balance is more than 30,000.

SELECT ACCT_HOLDER_NAME, ACCT_BALANCE FROM BANKACCOUNT WHERE ACCT_BALANCE >30000;
+------------------+--------------+
| ACCT_HOLDER_NAME | ACCT_BALANCE |
+------------------+--------------+
| MANN SINGH       |        37000 |
| JOHN DOE         |        35000 |
| PARK SHIN        |        40000 |
+------------------+--------------+

-- ******************************************************************************************

-- Task 4: Updating Data
-- Write an SQL UPDATE statement to change the account_balance of the account holder
-- whose ID is 103 to 50,000.

UPDATE BANKACCOUNT SET ACCT_BALANCE=50000 WHERE ACCOUNT_ID=103;

SELECT * FROM BANKACCOUNT;
+------------+------------------+--------------+
| ACCOUNT_ID | ACCT_HOLDER_NAME | ACCT_BALANCE |
+------------+------------------+--------------+
|        101 | JAMES JANE       |        25000 |
|        102 | SMITH WARNER     |        30000 |
|        103 | MANN SINGH       |        50000 |
|        104 | MILLER MATE      |        28000 |
|        105 | JOHN DOE         |        35000 |
|        106 | PARK SHIN        |        40000 |
+------------+------------------+--------------+


-- ******************************************************************************************

