package lab_10_Inheritance; // User defined Package Declaration

public class Main { // Class Declaration

	public static void main(String[] args) // Main Method
	{
		// object created for Car from super Class
		Car car = new Car("Toyota", "Camry", 2022, 150);
		// object created for Bike from super Class
		Bike bike = new Bike("Honda", "CBR500R", 2021, 120);

		System.out.println("Car Attributes:");
		car.printAttributes(); // calling method from Car Class
		car.drive();

		System.out.println("\nBike Attributes:");
		bike.printAttributes(); // // calling method from Bike Class
		bike.drive();
	}
}
