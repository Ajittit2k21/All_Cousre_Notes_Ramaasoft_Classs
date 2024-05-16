JDBC 
	The database helps you to save data permanently in secondary storage devices and keeps
data ready for future reference, modification and addition. 

//mysql --server----Create,insert,delete,update
//primary---->?? ??  ?? ???,img

//video


Storage area

 1) Tempary Storage Areas
    buffers , java Objects
int ino     RAM 
  
 2) Perpament Storage Objects
    fileSystems ,DBMS
  //Servlet======>   -
   DBMS
   1)RDBMS 2) OODBMS 3) OORDBMS

 MYSQL/Oracle/IBM Db2/sybase

 The Process of interating with the database from
 java application is called as jdbc

                              2T   CoreJava
javaApplication(Interface)--Swing------JDBC------Mysql Server
                
                     Advjava 
   | JAVAEE          client                        webserver                                            database                                                  
UI Interface(html/css/javascript)----->WEBSERVER(Backend---SERVERside(Java(servlet)---)-------> jdbc---->MysqlServer
  webbrowser

   


 JDBC is an API, Which will provide predefined library to 
 connect with Database from java application in order to
 perfrom the basic database Operations
                          DDL
                            CreateDatabase,CreateTable Alter table  
                           Drop Database,Drop table
                           
//                        Table(Data) ---->insert,update,delete,select (DML)
 
The java.sql package contains classes and interfaces for JDBC API. 
A list of popular interfaces of JDBC API are given below:
a.	Driver interface
b.	Connection interface
c.	Statement interface
d.	PreparedStatement interface
e.	CallableStatement interface
f.	ResultSet interface
g.	ResultSetMetaData interface
h.	DatabaseMetaData interface
i.	RowSet interface

A list of popular classes of JDBC API are given below:
a.	DriverManager class
b.	Blob class
c.	Clob class
d.	Types class

What is API
API (Application programming interface) is a document that contains a description of all the features of a product or software. It represents classes and interfaces that software programs can follow to communicate with each other. An API can be created for applications, libraries, operating systems, etc.

JDBC Driver is a software component that enables java application to interact with the database. 
There are 4 types of JDBC drivers:
                                  //java----desktop/webappliction(java)
                                                                 
                                                                       API(Driver) class/interfaces----->Interact

                                                                              //DataBases  MYSQL/ORACLE/db2/sybase
1.	Type 1 (JDBC-ODBC bridge driver)
2.	Type 2(Native/partially java driver)
3.	Type 3 (Net Protocal or itermediate database server Driver)
4.	Type 4(Thin/Universal/pure/fully java driver)


JDBC-ODBC bridge driver

The JDBC-ODBC bridge driver uses ODBC driver to connect to the database. The JDBC-ODBC bridge driver converts JDBC method calls into the ODBC function calls. 
                                        C/C++
 

----------------------------------------------------------------------------
                                  webserver
                                ------------------------
  website--client---->request        servletContainter
                                     javaAPPlication
                                       +
                                     JDBC-ODBC bridge          Vendor
                                       Deriver------------------OS
                                                                ODBCDriver       (linux/mac/windows) 
                                    jdbc-----odbc--call----------odbc----interact with database
				  ------------------------
                                                          ----------------------->Oracle Server/MYSQLServer--->  
---------------------------------------------------------------------------- 
In Java 8, the JDBC-ODBC Bridge has been removed.


Advantages:
1. easy to use.
2.can be easily connected to any database.

Disadvantages:
1.Performance degraded because JDBC method call is converted into the    ODBC function calls.
2.The ODBC driver needs to be installed on the client machine.
 
Native-API driver

	The Native API driver uses the client-side libraries of the database. The driver converts JDBC method calls into native calls of the database API. It is not written entirely in java.

----------------------------------------------------------------------------
                                  webserver
                                ------------------------
  website--client---->request        servletContainter
                                     javaAPPlication
                                       +
                                     Native API driver          Vendor
                                       Deriver------------------ OS  ----->specific(Client)
                                                                 client must be install                                       
					                         
                                ------------------------
                                                          ----------------------->Oracle Server/MYSQLServer--->  
---------------------------------------------------------------------------- 
                    
Advantage:
1.performance upgraded than JDBC-ODBC bridge driver.
2.No platfrom dependent

Disadvantage:
2.The Native driver needs to be installed on the each client machine.
3.The Vendor client library needs to be installed on client machine.

Net Protocol driver

	The Network Protocol driver uses middleware (application server) that converts JDBC calls directly or indirectly into the vendor-specific database protocol. It is fully written in java.
 
Advantage:
1. No client side library is required because of application server       that can perform many tasks like auditing, load balancing, logging     etc.

 Disadvantages:
1.Network support is required on client machine.
2.Requires database-specific coding to be done in the middle 	tier.
3.Maintenance of Network Protocol driver becomes costly because it   ........requires database-specific coding to be done in the middle tier.

Thin driver
	The thin driver converts JDBC calls directly into the vendor-specific database protocol. That is why it is known as thin driver. It is fully written in Java language.
 
Advantage:
1.Better performance than all other drivers.
2.No software is required at client side or server side.
 Disadvantage:
3.Drivers depend on the Database.


steps to design JDBC Application:
1) Load and register the Deriver
	import java.sql.DriverManager;
	import com.mysql.jdbc.Connection;
	import com.mysql.jdbc.Statement;
2) Establish the connection between java application.

	a. Register the Driver
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		OR
	Class.forName("com.mysql.jdbc.Driver");
        //** not required
        
        b. Create the Connection
          Connection con = DriverManager.getConnection(url, username,password);
          url = "jdbc:mysql://localhost/Namedatabase";
           user = "root or your defined";
           password = "xxxx";

3) prepare either statement or prepared statement or 
   collable statement objects.
       a.Create the Statement
         Statement stmt = con.createStatement();
        

4) Write and execute SQL queries.
      1) executeQuery()===>select
		ex:ResultSet rs = stm.executeQuery("Select * from ramaasoft");
      2) executeUpdate() ===>Create,Insert, Update, Delete, Alter, Drop
		int noup = stmt.executeUpdate("Insert into ramaasoft.... ");
      3) execute()==>
                    both--->select and create,insert,update,delete,alter,drop 
5) close the connection
        con.close()


Imp:
* DriverManager, Connection, Statement, ResultSet, ResultSetMetaData all these classes
comes from java.sql package
* Driver should be registered and connection should be created only once. But statement and
query/update are repeated for every database operation.
* All methods mentioned above throws SQLException and Class.forName throws
ClassNotFoundException

ResultSet
* It is a collection of rows and columns
* It is an outcome of "executeQuery"
* This class comes from java.sql package


Methods from ResultSet
boolean first()
boolean next()
boolean previous()
boolean last()
boolean absolute(int rowno)
boolean relative(int rowno)
int getRow()
ResultSetMetaData getMetaData()
close()


ResultSetMetaData stores various column details
Methods of ResultSetMetaData
int getColumnCount()
// Number of columns in ResultSet
String getColumnName(int columnNumber)
// Returns Column Name
int getColumnType(int columnNumber)
// Returns Column Data Type


Executing INSERT statement
Statement insert
sql = "INSERT INTO TableName " +
                   "VALUES(intvalue, 'StringValue')";
stmt.executeUpdate(sql);

Statement vs PreparedStatement
*writing Query using String concatenation looks 
 very ugly and error prone.
*It allows us to execute dynamic queries with parameter inputs.

*It helps us in preventing SQL injection attacks because 
 it automatically escapes the special characters.
*It provides different types of setter methods to 
 set the input parameters for the query.
*It is faster than Statement. 

String sql = "INSERT INTO TableName (F2, F2, ..) VALUES (?, ?, ?, ?)";

 
PreparedStatement statement = conn.prepareStatement(sql);
statement.setInt(1, intvalue);
statement.setString(2, "Stringvalue");
statement.setFloat(3, floatvalue);
statement.setDouble(4, doublevalue);
 
int InCount = statement.executeUpdate();

if(InCount>0)
{
  message
}

Executing UPDATE statement

String sql = "UPDATE TableName SET F1=?, F2=?,.. WHERE SF=?";
 
PreparedStatement statement = conn.prepareStatement(sql);
statement.setInt(1, F1Value);
statement.setString(2, F2Value);
statement.setString(3, F3Value);
statement.setString(4, SFValue);
 
int updateCount = statement.executeUpdate();
if (updateCount > 0) {
    message
}

Executing DELETE statement

String sql = "DELETE FROM TableName WHERE SFname=?";
 
PreparedStatement statement = conn.prepareStatement(sql);
statement.setString(1, SFName);
 
int deleteCount = statement.executeUpdate();
if (DeleteCount > 0) {
    Message
}
