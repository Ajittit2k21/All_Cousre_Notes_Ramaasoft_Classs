Database
=========
A database is an organized collection of data, stored and accessed electronically.

database 
	C/C++ level:  files(text files/Binary File)




DBMS : 
The database management system (DBMS) is the software that interacts with end users, 
applications, and the database itself to capture and analyze data. A general-purpose 
DBMS allows the definition, creation, querying, update, and administration of databases

RDBMs:
Relational DataBase Management 
it is the basis for SQL, and for all modern database systems like 
Oracle
MySql
MS SQL Server, 
IBM DB2,Microsoft Access. 

OORDBMs: Object oriented RDBMS
	user can define datatypes
	(composite)

oracle10g+
//Why Data Base

DataBase reduces redundancy
DataBase Controls Inconsistency
DataBase Facitilate Sharing of Data
DataBase ensures Security
DataBase maintains Integrity

database objects
A database object is any defined object in a database that is used to store or reference 
data.Anything which we make from create command is known as Database Object
SQL
1. Tables (Basic unit of storage composed rows and columns or central object)
2. Views  (Logically represents subsets of data from one or more tables)
3. Sequences (Generates primary key values)
4. Synonyms (Alternative name for an object)
5. Indexes (Improves the performance of some queries)

PL-SQL
1. Stored Procedure/function
2. cursor
3. packages
4. triggers


My Sql Introduction
*It is Open Source Software
*It is RBMS(Relational Datbase Mangement System)
*it is mostly used with java,php,python
*MySQL USE SQL LANGUAGE to intract database (DDL,DML,TCL,DCL)



SQL
When we create a table in database, two tables are created 

Data Dictionery-it defines s

pecifications of data


Data table-it carries actual data


DDL: Data defination language
it works on data dictionery for structure of data
is implicitly saved in memory when executed


DML: Data Manipulation Language
it works on data table for maintaining data

DML operations are carried in transaction phase,they are saved in memory using 
specific commands

TCL: Transaction Control Language
combination of commit and rollback is termed as TCL
TCL relates to DML only


DDL queries e.g. Create,Drop,Alter

DML queries
 insert- 	add/create a record
 update-	modify
 delete-	remove
 select-	search or show record



DDL Commands - Create - Drop - Alter - Rename - Truncate

1. How to create a database
create database databasename;
Ex:
create database Ramaasoft;

2.use DataBase/select Database

use databasename;
ex:
use Ramaasoft;
3.How to list DataBases present in DBMS
show databases;

4. How to remove a database
drop database databasename;
ex:
drop database Ramaasoft;


Table
In relational databases, and flat file databases, a table is a set of data elements 
using a model of vertical columns and horizontal rows, the cell being the unit where 
a row and column intersect. A table has a specified number of columns, but can have 
any number of rows.
1. how to create a table
CREATE  TABLE [IF NOT EXISTS] `TableName` (`fieldname` dataType [optional parameters
/constraints]) ENGINE = storage Engine;


DATA TYPES

Data types define the nature of the data that can be stored in a particular column of a table

MySQL has 3 main categories of data types namely

  Numeric,
  Text
  Date/time.

  
Numeric Data types:

TINYINT()	-128 to 127 normal 0 to 255 UNSIGNED.
SMALLINT( )	-32768 to 32767 normal 0 to 65535 UNSIGNED.
MEDIUMINT( )	-8388608 to 8388607 normal 0 to 16777215 UNSIGNED.
INT( )	-2147483648 to 2147483647 normal 0 to 4294967295 UNSIGNED.
BIGINT( )	-9223372036854775808 to 9223372036854775807 normal
0 to 18446744073709551615 UNSIGNED.
FLOAT	A small approximate number with a floating decimal point.


DOUBLE( , )	A large number with a floating decimal point.
DECIMAL( , )	A DOUBLE stored as a string , 
allowing for a fixed decimal point. Choice for storing currency values.


Text DataType:

CHAR( )	A fixed section from 0 to 255 characters long.
char(50)----abc------abc------------------------------(50)size

VARCHAR( )	A variable section from 0 to 65535 characters long.

TINYTEXT	A string with a maximum length of 255 characters.
TEXT	A string with a maximum length of 65535 characters.
BLOB	A string with a maximum length of 65535 characters.
MEDIUMTEXT	A string with a maximum length of 16777215 characters.
MEDIUMBLOB	A string with a maximum length of 16777215 characters.
LONGTEXT	A string with a maximum length of 4294967295 characters.
LONGBLOB	A string with a maximum length of 4294967295 characters.

char(10)
ab---------
varchar(10)
ab

Date / Time Datatype:

DATE	YYYY-MM-DD
DATETIME	YYYY-MM-DD HH:MM:SS
TIMESTAMP	YYYYMMDDHHMMSS
TIME	HH:MM:SS

Other special DataType:

ENUM	To store text value chosen from a list of predefined text values
SET	This is also used for storing text values chosen from a list of predefined text values. It can have multiple values.
BOOL	Synonym for TINYINT(1), used to store Boolean values
BINARY	Similar to CHAR, difference is texts are stored in binary format.
VARBINARY	Similar to VARCHAR, difference is texts are stored in binary format.

After the data type (constraints) you can specify other optional attributes for each column:

NOT NULL - Each row must contain a value for that column, null values are not allowed
DEFAULT value - Set a default value that is added when no other value is passed
UNSIGNED - Used for number types, limits the stored data to positive numbers and zero
AUTO INCREMENT - MySQL automatically increases the value of the field by 1 each time a new record 
is added

PRIMARY KEY - Used to uniquely identify the rows in a table. The column with PRIMARY KEY
setting is often an ID number, and is often used with AUTO_INCREMENT

Types of Keys in MySQL:

primary key(k)- A primary key is a field in a table which uniquely identifies each 
row/record in a database table. 
Primary keys must contain unique values. A primary key column cannot have NULL values


Candidate primary key(t)-any alternate key which can also work as primary key
is called candidate primary key

composite primary key(t)- if no single key is able to identify a record uniquely, 
two or more keys can be combined to do so

surrogate primary key- aritificial primary key
if no key or combination of keys can identify a record uniquely , 
we can add a new key to do so such a added attribute is said to be surrogate primary key

unique key
cant have duplicate values
but can have null values

not null key
where value is must
name column  is example


foreign key
is primary key in one table
and maintains relationship with another table, is called fk in another table

---------------------------------------------------------------------------------------

show table present in database

show tables;


The DROP Command

Syntax:
DROP TABLE <table_name>

Example:
DROP TABLE RamaasoftData;

The TRUNCATE Command

Syntax:
TRUNCATE TABLE <Table_name>

Example:
TRUNCATE TABLE RamaasoftData;

The RENAME Command

Syntax:
RENAME TABLE <OldTableName> TO <NewTableName>

Example:
RENAME  TABLE <RamaasoftData> TO <RamaaData>


The ALTER Table Command

By The use of ALTER TABLE Command we can modify our exiting table.

syntax:
ALTER TABLE<TableName>
ADD|Modify|DROP|CHANGE<Colum definition>
Adding New Columns


*add a new column or contraints
*modify existing column
*delete and existing col or contraints
* changing column name;
Syntax: 
ALTER TABLE <table_name>
         ADD (<NewColumnName> <Data_Type>(<size>),......n)

Example:
ALTER TABLE Student ADD (Age number(2), Marks number(3));


Dropping a Column from the Table

Syntax:
ALTER TABLE <table_name> DROP COLUMN <column_name>

Example:
ALTER TABLE Student DROP COLUMN Age;

Modifying Existing Table

Syntax:
ALTER TABLE <table_name> MODIFY (<column_name> <NewDataType>(<NewSize>))

Example:
ALTER TABLE Student MODIFY (Name Varchar2(40));

The Name column already exist in Student table, it was char and size 30, now it is modified by Varchar2 and size 40.

Restriction on the ALTER TABLE

Using the ALTER TABLE clause the following tasks cannot be performed.
Change the name of the table
Change the name of the column
Decrease the size of a column if table data exists


=====================================
DML Commands - Select - Insert - Update - Delete

Insert
INSERT INTO <tableName>[<columnlist>]
VALUES <list of values>;
a. full insert
(value for all columns is given)

insert into tablename values (v1,v2,..v3);

insert into student values (123,'avinash','it',5);

b. partial insert
(value for specific cols is given)

insert into student (rollno,branch,sem) values (124,'ec',4);
insert into tablename (c1,c2,c3) values (v1,v2,v3);

note: in insert query where clause is not used

*
Insert Record from another table
????

insert into netTable values
(select *from oldTable)

insert into new table(col1,col2,)
values (select col1,col1 from oldtable where condition)



SELECT ---------------


Syntax:
SELECT <[DISTINCT |ALL *]| COLUMN NAME(S)>
FROM<TABLE(S)> WHERE<condition>
ORDER BY<col name>[ASC/DESC];
show all records
	select * from tablename;

show specific cols-projection
	select col_list from tablename;

show specific rows-selection
	select * from tablename where condition;

to supress duplicate values
select distinct columnname from tablename;

Where Clause/ Condition
conditions can be written as
//Operator in mysql
column_name = value
column_name < value
column_name <= value
column_name > value
column_name >= value
column_name != value
column_name in (value1,value2,value3,...)
column_name not in (value1,value2,value3,...)
column_name between value1 and value2
column_name not between value1 and value2
column_name like 'value_with_wildcards'


column_name like 'value_with_wildcards'
	wildcards in sql query

	_	exactly 1 character can be anything
	%	0 or more characters can be anything

list name starting with a only
select name from student where name like 'a%'

list name ending with i only
select name from student where name like '%i'

list name containing 'kumar'
select name from student where name like '%kumar%'

list name of exactly 4 chars
select name from student where name like '__'

list name whose first and third char is a
select name from student where name like 'a_a%'

select name from student where name like 'b_t%'
select name from student where name like '%khan%'
//Doing Simple Calculation
select 4*3

//Using column aliases
select name,percent AS 'Student Result' form student;


2. update-to modify record

update tablename 
set
col1name=new_value,
col2name=new_value,
...
colnName=new_value
where condition;


if condition is skipped,all records get modified

value of primary key column is not changed


update student
 set
 name='prakash'
where rollno=124;

update student 
set
sem=sem+1;


=====================================
delete query

delete from tablename where condition;

when we use delete query a record is 
removed in totality


delete from student where rollno=123;

delete name,sem from student where rollno=123;
	--gives error


update student 
set 
name=null
where rollno=124;


//MySql functions
Numeric fucntions
mod() select mod(11,2)
power()
round()
sqrt()

String functions
contact(str1,str2)
lower()
lcase()
ltrim()
rtrim()
len()
substr(str,p,n)
bin()
ascii()
oct()

Date & Time Functions
now()
curdate()
sysdate()

date() select date(sysdate())
month() select month('2018-3-12')
                      yyyy-mm-dd
year()
					  
					  
Aggregate function
sum()
min()
max()
avg()
count() 
select count(name) form emp;
select count(*) form emp;