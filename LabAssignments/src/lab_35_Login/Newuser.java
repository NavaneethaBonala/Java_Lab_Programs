//write a program to insert new user details to the login table

package lab_35_Login;// Package Declaration
//Built-in Package Declaration
import java.util.*;
import java.sql.*;

public class Newuser {

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
			//Store username and password in DB Login table using PreparedStatement
			PreparedStatement ps = conn.prepareStatement(" insert into login values (?,?)");
			// set given input to the variable
			ps.setString(1,user);
			ps.setString(2,pwd);

			int affectedrows = ps.executeUpdate();
			// if -else to check username and password
			if(affectedrows>0)
			{ // condition is true
				System.out.println("New User Added Successfully");
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





