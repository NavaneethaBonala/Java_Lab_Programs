package lab_10_Inheritance;// User defined Package Declaration

// Subclass Extends Super Class
public class Car extends Vehicle {

	public Car(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	}

	@Override
	// drive method to print
	public void drive() {
		System.out.println(make + " " + model + " Car is driving.");
	}
}
