package lab_23_ObjectsWithFIle;// User Defined Package declaration

import java.io.FileOutputStream;// Built in declaration
import java.io.ObjectOutputStream;// Built in declaration

//class declaration
public class ObjectOutputStream1 
{ 
	// Main Method throws Exception
	public static void main(String argv[]) throws Exception
	{
		////Saving of object in a file "E:\\Test1.txt"  
		FileOutputStream fout = new FileOutputStream("E:\\Test1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		// creating the two objects for Book Info
		BookInfo b = new BookInfo(101, "Oracle pl/sql", " Bill Pribyl");
		BookInfo b1 = new BookInfo(102, "Spring Boot", " Rod Johnson");

		// Method for serialization of objects
		out.writeObject(b);
		out.writeObject(b1);
		// Objects calling show() 
		System.out.println("Book Details 1 : ");
		b.Show();
		System.out.println("\nBook Details 2 : ");
		b1.Show();

		System.out.println("\nObjects written to the file successfuly...");
		// Close() 
		out.close();
		fout.close();
	}
}
