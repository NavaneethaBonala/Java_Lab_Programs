//Write a java program to check user given username and password with login table and give successful and failure message.

package lab_35_Login;// Package Declaration
// Built-in Package Declaration
import java.sql.*;
import java.util.Scanner;
// Class Declaration
public class Login {
	// Main Method
	public static void main(String[] args) {
		// Scanner class to accept input from user
		Scanner sc= new Scanner(System.in);
		// Using Try and Catch Block to Avoid Exceptions error 
		try {
			//register and load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//using drivermanager establish the DB connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "0000");
			System.out.println("DB connection established");
			// data members
			String user, pwd;

			//accept username and password from user
			System.out.println("Enter Username ");
			user=sc.next();
			System.out.println("Enter password ");
			pwd=sc.next();

			//verify the given username and password with DB using PreparedStatement
			PreparedStatement st1 = conn.prepareStatement("select * from login where user='"+ user +"' and password='"+ pwd +"'");
			// Store the Result of the PreparedStatement in to ResultSet
			ResultSet rs1 = st1.executeQuery();
			// if -else to check username and password
			if(rs1.next())
			{ // condition is true
				System.out.println("Login Successful");
			}
			else// condition is false
				System.out.println("Invalid username or password!!!");		
			// catch block 
		}catch(Exception e)
		{	// displays the type of Exception if occured
			System.out.println(e);
		}

	}

}
