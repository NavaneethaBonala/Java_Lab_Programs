package lab_36_EmpAllRecords;// package declaration
// Built in package declaration
import java.sql.*;
import java.util.*;
// class declaration
public class EmpDBconnect {
	// class members
	public Connection conn;
	private final String user="root";
	private final String pwd="0000";

	// create a method to connect to the Database
	public void Dbconnect()
	{
		// using try and catch block 
		try {
			//register and loading the drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connect to a database
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_details", user, pwd);
			//System.out.println("DB connection succeeded..");
		}
		// catch block 
		catch(Exception e)
		{	//to display if Exception occurred
			System.out.println(e);
		}
	}
	// Create a method to Login Using username and Password as parameters
	public void loginCredential(String username, String password) throws Exception
	{	// calling the Dbconnect method
		Dbconnect();
		// Prepared statement to accept username and password as inputs
		PreparedStatement ps  = conn.prepareStatement("select * from login where username=? and password=?");
		// assign username and password to the parameter index respectively
		ps.setString(1, username);
		ps.setString(2, password);
		// resultset to store the query result 
		ResultSet rs = ps.executeQuery();
		// checks if username & password match 
		if(rs.next())
			// if condition is true
		{	// calling the empCRUD method
			empCRUD();
		}
		else// if condition is false
			System.out.println("InValid username and password!!!");
	}

	// creating the method to call the required method
	public void empCRUD() throws Exception

	{	// scanner class to accept input from keyboard
		Scanner sc = new Scanner(System.in);
		int test=1;
		// while loop for repeated execution
		while(test==1)
		{

			System.out.println("\nEmployee Management System");
			System.out.println("1. Add New Employee");
			System.out.println("2. search an Employee");
			System.out.println("3. View All Employee Details");
			System.out.println("4.Exit");
			System.out.println("----------------------------");
			System.out.println("Enter your choice between 1 to 4 : ");

			int choice = sc.nextInt();
			// Switch case to choose the different choices
			switch(choice)
			{
			case 1:
				addemp();
				break;

			case 2:
				searchById();
				break;

			case 3:
				viewAll();
				break;

			case 4:
				test=0;
			}
		}
	}
	// created Method to add the employee details
	public void addemp()throws Exception
	{	// calling the DB connection method
		Dbconnect();
		Scanner sc = new Scanner(System.in);
		String fname, lastname, mailid;
		int id, age;
		System.out.println("Enter Employee id ");
		id=sc.nextInt();

		System.out.println("Enter Employee First Name ");
		fname=sc.next();

		System.out.println("Enter Employee Last Name ");
		lastname=sc.next();

		System.out.println("Enter Age of the Employee ");
		age=sc.nextInt();

		System.out.println("Enter MailID ");
		mailid=sc.next();
		// prepared statement for dynamic parameters
		PreparedStatement ps = conn.prepareStatement("insert into emp1 values (?,?,?,?,?)");
		// Set the suitable datatype member at parameter index
		ps.setInt(1,id);
		ps.setString(2,fname);
		ps.setString(3, lastname);
		ps.setInt(4, age);
		ps.setString(5, mailid);
		// execute update to check the count of rows are changed
		int affectedrows=ps.executeUpdate();
		//checks if the row count increased
		if(affectedrows>0)
			System.out.println("Record added Successfully..");
		else
			System.out.println("Failed to add Record!!");
	}
	// Method to search for the employee by using the Id no
	public void searchById() throws Exception
	{	// calling the DB connection method
		Dbconnect();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee id to search ");
		int id = sc.nextInt();
		// prepared statement for dynamic parameters
		PreparedStatement ps  = conn.prepareStatement("select * from emp1 where age =?");
		ps.setInt(1, id);
		// REsult set stores the result of the Executed query 
		ResultSet rs = ps.executeQuery();
		// if result has the next value to exceute it displays the result
		if(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
		}
		else
			System.out.println("No employee found for the id "+ id);
	}
	// Method to view  the All employee details 
	public void viewAll() throws Exception
	{	// calling the DB connection method
		Dbconnect();
		//  statement for static parameters
		Statement st  = conn.createStatement();
		// REsult set stores the result of the Executed query 
		ResultSet rs = st.executeQuery("select * from emp1");
		// calling the display result method to display the details
		displayResults(rs);
	}
	// creating a method to display the results
	private static void displayResults(ResultSet rs) throws SQLException {
		// Get metadata for column names
		ResultSetMetaData metaData = rs.getMetaData();
		// get column count from meta data
		int columnCount = metaData.getColumnCount();

		// Display column names
		for (int i = 1; i <= columnCount; i++) {
			System.out.printf("%-10s", metaData.getColumnName(i));
		}
		System.out.println();

		// Display rows
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.printf("%-10s", rs.getString(i));
			}
			System.out.println();
		}
	}
	// Closing the Database connection
	public void closedb() throws Exception

	{
		conn.close();
	}
}
