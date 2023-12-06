/*
 * Assignment - 3
Create a class Person
•	Add member variables name as String, age and salary as int
•	Initialize the member variable along with declaration.
•	Now put the previous Person class in a package com.anudip.learning
•	Add a main method. Add a print message "Test Successful".
•	Run the class after compilation.
•	Modify the classpaths to see the error messages on the console

 */
package lab_01_class_objects;

public class Person {
	// data members
	String name = "nita";
	int age = 21, salary = 20000;

	public static void main(String[] args) {
		System.out.println("Test Successful");
	}

}