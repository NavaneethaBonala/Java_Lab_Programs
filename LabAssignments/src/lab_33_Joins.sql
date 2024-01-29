--Lab_33_Joins

--Use the Database and table from Week9 Session1 lab.Perform the following commands on the table Student and Enrollment.
-- ******************************************************************************************
--View all the columns details from the Student Table
select * from student;
+-----------+-----------+----------+---------------------+--------+----------------------+------------+
| StudentID | FirstName | LastName | DateOfBirth         | Gender | Email                | Phone      |
+-----------+-----------+----------+---------------------+--------+----------------------+------------+
| S101      | John      | Doe      | 2000-10-10 00:00:00 | M      | john@example.com     | 9878457945 |
| S102      | Jane      | Smith    | 2013-08-08 00:00:00 | M      | jane@example.com     | 9977457745 |
| S103      | Alice     | Johnson  | 2011-09-08 00:00:00 | F      | alice@example.com    | 9876457845 |
| S104      | Anna      | Doe      | 2011-07-08 00:00:00 | F      | Anna.doe@india.com   | 9876457842 |
| S105      | Peter     | Parker   | 2011-06-05 00:00:00 | M      | p_parker@example.com | 9276457843 |
+-----------+-----------+----------+---------------------+--------+----------------------+------------+

--View all the columns details from the EnrollmentTable
 select * from enrollment;

 +--------------+----------------+-----------+----------+--------------+
| EnrollmentID | EnrollmentDate | StudentID | CourseID | InstructorID |
+--------------+----------------+-----------+----------+--------------+
| E1001        | 2020-09-25     | S101      | C101     | I101         |
| E1002        | 2020-07-08     | S102      | C101     | I101         |
| E1003        | 2020-07-10     | S103      | C102     | I102         |
+--------------+----------------+-----------+----------+--------------+
-- ******************************************************************************************


 1. INNER JOIN 2. LEFT JOIN 3. RIGHT JOIN 
-- Creating a Query to view  details of First Name , Email from Student table and  EnrollmentID from Enrollment table using INNER JOIN
1. SELECT s.FirstName,s.Email, e.EnrollmentID FROM Student s INNER JOIN Enrollment e ON s.StudentID = e.StudentID; 

+-----------+-------------------+--------------+
| FirstName | Email             | EnrollmentID |
+-----------+-------------------+--------------+
| John      | john@example.com  | E1001        |
| Jane      | jane@example.com  | E1002        |
| Alice     | alice@example.com | E1003        |
+-----------+-------------------+--------------+
-- ******************************************************************************************

--Creating a Query to view  details of First Name , Email from Student table and  EnrollmentID from Enrollment table using RIGHT JOIN
2. SELECT s.FirstName,s.Email, e.EnrollmentID FROM Student s RIGHT JOIN Enrollment e ON s.StudentID = e.StudentID;

+-----------+-------------------+--------------+
| FirstName | Email             | EnrollmentID |
+-----------+-------------------+--------------+
| John      | john@example.com  | E1001        |
| Jane      | jane@example.com  | E1002        |
| Alice     | alice@example.com | E1003        |
+-----------+-------------------+--------------+
-- ******************************************************************************************
-- Creating a Query to view details of EnrollmentID from Enrollment table and First Name , Email from Student table using RIGHT JOIN
 3. SELECT e.EnrollmentID,s.FirstName,s.Email FROM Enrollment e RIGHT JOIN Student s ON e.StudentID=s.StudentID;

+--------------+-----------+----------------------+
| EnrollmentID | FirstName | Email                |
+--------------+-----------+----------------------+
| E1001        | John      | john@example.com     |
| E1002        | Jane      | jane@example.com     |
| E1003        | Alice     | alice@example.com    |
| NULL         | Anna      | Anna.doe@india.com   |
| NULL         | Peter     | p_parker@example.com |
+--------------+-----------+----------------------+
-- ******************************************************************************************
// Creating a Query to view  details of First Name , Email from Student table and  EnrollmentID from Enrollment table using LEFT JOIN
 4. SELECT s.FirstName,s.Email, e.EnrollmentID FROM Student s LEFT JOIN Enrollment e ON s.StudentID = e.StudentID; 
 +-----------+----------------------+--------------+
| FirstName | Email                | EnrollmentID |
+-----------+----------------------+--------------+
| John      | john@example.com     | E1001        |
| Jane      | jane@example.com     | E1002        |
| Alice     | alice@example.com    | E1003        |
| Anna      | Anna.doe@india.com   | NULL         |
| Peter     | p_parker@example.com | NULL         |
+-----------+----------------------+--------------+
-- ******************************************************************************************

// Creating a Query to view details of EnrollmentID from Enrollment table and First Name , Email from Student table using LEFT JOIN
5.  SELECT e.EnrollmentID,s.FirstName,s.Email FROM Enrollment e LEFT JOIN Student s ON e.StudentID=s.StudentID;

+--------------+-----------+-------------------+
| EnrollmentID | FirstName | Email             |
+--------------+-----------+-------------------+
| E1001        | John      | john@example.com  |
| E1002        | Jane      | jane@example.com  |
| E1003        | Alice     | alice@example.com |
+--------------+-----------+-------------------+

