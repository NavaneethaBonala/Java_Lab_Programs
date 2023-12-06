
/*
* ● Write a Java program named Car

● The Car class should have the following attributes: make (String), model

(String) , year (short) , and price(int) .

● The car class should have a constructor that takes all the attributes.

● Add a main method to instantiate car objects.

● The program should allow the user to create and display objects of each car class


 */
package lab_02_Constructor; // Package Declaration

import java.util.*; // in-built Package

public class Car { // Class Declaration

	// Data members of Class variables
	private String make, model;
	private short year;
	private int price;

	public Car(String make, String model, Short year, int price) { // Constuctor

		// Data members of Constructor
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// method to print the data
	protected void showdata() {

		System.out.println("Make : " + make);
		System.out.println("Car Model : " + model);
		System.out.println("year of manufacturing : " + year);
		System.out.println("Price of Car :" + price);
	}

	public static void main(String[] args) // main method (program starts to execute)
	{
		System.out.println("Car Details: ");

		Car car1 = new Car("Maruti Suzuki", "Swift", (short) (2005), 500000);
		Car car2 = new Car("Toyota", "4Runner", (short) (2012), 354000);

		car1.showdata();
		car2.showdata();
	}

}
