package lab_34_JDBC_conn;

//write a java program to connect with mysql database to fetch all the columns and rows from a table.
//import the Built-in Package Declaration
import java.sql.*;
//Class Declaration
public class JDBCConn {
	// Main Declaration
	public static void main(String[] args) {
		// Using Try and Catch Block to Avoid Exceptions error 
		try {
			//register and load the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//using drivermanager establish the DB connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_details", "root", "0000");
			// To display if DataBase is connected successfully
			System.out.println("Connected to Database Successfully");
			// Creating a Statement interface to accept static query
			Statement st = conn.createStatement();
			// Storing the result of the executequery() into the Resultset rs
			ResultSet rs = st.executeQuery("Select * from EMP");
			// While loop checks for the next element
			while(rs.next())
			{	//to display Details of all the columns
				System.out.println(rs.getMetaData());
				//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6)+"\t"+rs.getInt(7)+"\t"+rs.getInt(8));
			}
			// Catch Block 			
		}catch(Exception e)
		{	//Prints the type of Exception if error occurs
			System.out.println("Exception "+e);
		}

	}

}

