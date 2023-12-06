package lab_14_ArrayList;// User defined Package Declaration

import java.util.*;// im built Package Declaration

public class Array_List { // Class Declaration

	
public static void main(String[] args) {
		
		//create an empty ArrayList of Integer  type
		ArrayList<Book> al = new ArrayList<Book>();
		//Objects Created for class Book 
		Book obj1 = new Book(01, "Oracle pl/sql", " Bill Pribyl");
		Book obj2 = new Book(02, "Spring Boot", " Rod Johnson");
		Book obj3 = new Book(03, "Spring MVC", "Amuthan G");
		
        // Adding Obj details to above List using add() method
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);

		// for each loop
		for(Book b : al)
			System.out.println(b);
		
	}

}
