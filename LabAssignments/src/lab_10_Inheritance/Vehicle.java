/*
 * Assignment -1.
● Write a Java program to create a class called Vehicle with a method called
drive().
● Vehicle should have attributes such as make (String), model (String) ,
year (int) and maximumSpeed (int).
● Create a constructor in Vehicle with all fields as constructor parameters.
● Create a subclass called Car and override constructor. Call super(). ●
Write a function that overrides the drive() method to print (make + “ ” +
model + " Car is driving". )
● Also create another subclass Bike extending the vehicle class. ●
Override the drive() method to print (make + “ ” + model + " Bike is
driving". )
● Instantiate both Bike and Car class. Print their attributes.
 */

package lab_10_Inheritance; // User defined Package Declaration

public class Vehicle // Class Declaration
{
	// data members
	String make, model;
	int year, maximumspeed;

	// constructor with arguments
	public Vehicle(String make, String model, int year, int maximumspeed) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.maximumspeed = maximumspeed;
	}

	// drive method to print
	public void drive() {
		System.out.println(make + " " + model + " is driving.");

	}

	// Method to Print all the Details of Data Members
	public void printAttributes() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Maximum Speed: " + maximumspeed);
	}
}
