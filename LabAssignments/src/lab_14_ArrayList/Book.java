/*
 * 1. Create a Book class with bookId, bookName and authorName.Create

parameterized constructor to initialize the object. Create an ArrayList of

type Book and store all book objects into collections and display all book

details.
 */


package lab_14_ArrayList; // User defined Package Declaration


public class Book { // Class Declaration

	// class members
	int bookid;
	String bookName, authorName;
	
	//Method to display Book details
	public String toString() 
	{		
		return "Book [Book Id: "+bookid+", Book Name: "+bookName+",  Author Name: "+ authorName+"]";
	}
	
	//Default Constructor 
	public Book() {
		super();
	}
	
	// Constructor with Parameters
	public Book( int bookid,String bookName,String authorName ) 
	{
		super(); 
		this.bookid = bookid;
		this.bookName = bookName;
		this.authorName = authorName;
		
	}

}
