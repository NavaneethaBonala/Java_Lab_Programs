package lab_36_EmpAllRecords;// user defined package declaration
import java.util.*;// Built in package declaration
// class declaration
public class EmpDAO {
// main method that throws exception
	public static void main(String[] args) throws Exception{
		// Scanner class to accept input from user
		Scanner sc = new Scanner(System.in);
		
		// Creating a reference of EmpDBconnect class
		EmpDBconnect empdb = new EmpDBconnect();
		
		// data members 
		String username, password;
		
		//input from user stored in username
		System.out.println("Enter username ");
		username=sc.next();
		
		//input from user stored in username
		System.out.println("Enter password ");
		password=sc.next();
		
		// calling the methods from EmpDBconnect class
		empdb.Dbconnect();
		empdb.loginCredential(username, password);

		//close the connection object
		empdb.closedb();

	}

}


