/*
 * Write a program to read and write object to the file. the object need to store bookinfo.

eg: bookid, title, author 

store and retieve few objects to the file.
 */


package lab_23_ObjectsWithFIle; // User Defined Package declaration

import java.io.FileInputStream;// Built in declaration
import java.io.ObjectInputStream;// Built in declaration

public class ObjectFile {// class declaration

		// Main Method throws Exception
	public static void main(String argv[]) throws Exception
    {
		
		FileInputStream fin = new FileInputStream("Test1_rec.txt");

		ObjectInputStream in = new ObjectInputStream(fin);

		BookInfo b1 = (BookInfo) in.readObject();
        b1.Show();
        BookInfo b2 = (BookInfo) in.readObject();
        b2.Show();
        
        in.close();
        fin.close();
     }

}
