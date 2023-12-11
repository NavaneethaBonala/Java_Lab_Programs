/*
 * create a custom exception class to check the number is non zero value.

implement in a class which find square of given number.
 */

package lab_13_CustomException; // User defined Package Declaration

import java.util.*; // in built package declaration

//Custom exception class for handling NonZeroValue Exception
class NonZeroValueException extends Exception {

	public NonZeroValueException(String message) {
		super(message);
	}
}

//Findsquare class for calculating the Square of a given number
class Findsquare {

	double number;

	// Method which throws an Exception
	public void square(double number) throws NonZeroValueException {
		// if ...else loop to check number is greater than zero
		if (number != 0) {

			System.out.println("Square of given number : " + number * number);

		} else {
			// Throw the custom exception if number is equal to zero
			throw new NonZeroValueException("Enter a Number greater than zero ");
		}
	}
}

// class declaration 
public class CustomException {

	public static void main(String[] args) { // main method

		// create an Object for class Findsquare
		Findsquare sq = new Findsquare();

		// try block -calling a method
		try {
			sq.square(0);

		}
		// catch block to print the exception message if occured
		catch (NonZeroValueException e) {
			System.out.println("Invalid Number : " + e.getMessage());
		}
	}
}
