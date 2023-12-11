package lab_01_class_objects;

public class Employee {

	protected int id, age; // int variables are protected
	protected String name; // string variable name is protected
	protected boolean isPermanent; // boolean variable is Protected

	public static void main(String[] args) {
		double age = 35.5; // Assign double data type value to age
		int numInt = (int) age; // casting the age value from double to int
		System.out.println(numInt); // print age value after casting
		System.out.println("Successfully started");

	}

}