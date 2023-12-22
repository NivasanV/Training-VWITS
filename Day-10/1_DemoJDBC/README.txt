JDBC:
	It is stands for Java Database Connectivity
	It is an API that  allows java application to talk to any JDBC
	
Steps to use JDBC:
	1. Download the driver(JAR File) for the database we to use
	2. Add the JAR in the class path
	
		English Statement											Java Statement
			
	3. Load the driver						class.forName("Fully qualified  drive name as given by vender");
	4. Obtain the connection object			Connection con = DriverManager.getConnection("JDBC_URL","DB_USERNAME","DB_PASSWORD");
	5. Obtain prepared statement object		PreparedStatement pstmt;
											pstmt = con.preparedStatement("SQL_QUERY");
											
	6. Based on the type of QUERY fire the result
		case 1: if QUERY is DQL				case 1: ResultSet rs = pstmt.executeQuery();
		case 2: if QUERY is DML 			case 2: int noOfRowUpdated = pstmt.executeUpdate();
		
	7. Display the result					syso
	8. Close the resources					rs.close(), pstmt.close(), con.close();
	
Note:
	Step 3 in new version of Java is optional
	All JDBC API, classes, interfaces are available in java.sql package
	All method call in JDBC API throws SqlException

JDBC_URL has specific syntax as shown below

	protocol:subprotocal:subname [syntax]
	
	protocol is always jdbc.
	subprotocol is depends on  the database we are  using.
	subname  is depends on the database we are using which include IP and PORT number of the machine where we are running our database.
	
	In our case  JDBC_URL looks like as give below
		jdbc:mysql://localhost:3306
	