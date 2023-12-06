package lab_23_ObjectsWithFIle; // User Defined Package declaration

import java.io.Serializable;// Built in declaration

// class declaration which implements serialization
public class BookInfo implements Serializable 
{
	// class data members
	private static final long serialVersionUID = 1L;
	int bookid;
	String title, author;
	
	// constructor with parameters
	BookInfo(int bookid, String title, String author)
	{
		// constructor data members
		this.bookid = bookid;
		this.title = title;
		this.author = author;
	
	}
	// Show () method to print the Details of Book Id
	public void Show()
	{
		System.out.println("Book Id : "  + bookid);
		System.out.println("Title   : "  + title);
		System.out.println("Author : "  + author);
		
	}
}




