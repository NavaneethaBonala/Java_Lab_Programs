/*
 * 1.Create a Java program that acts as a simple calculator.

● The program should prompt the user to enter two numbers and an operator (+, -, *, /).

● Perform the corresponding calculation based on the operator.

● Handle potential exceptions, such as division by zero or invalid operator input.

● Display the result or an appropriate error message.
 */

package lab_12_ExceptionalHandling;
//User defined Package Declaration

import java.util.Scanner; // in-built Package Declaration

public class SimpleCalculator { // Class Declaration

	// Main Method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Try Block for Calculating the Simple Operations
		try {

			// Prompt the user for input
			System.out.print("Enter the first number: ");
			double num1 = scanner.nextDouble();

			System.out.print("Enter the second number: ");
			double num2 = scanner.nextDouble();

			System.out.print("Enter the operator (+, -, *, /): ");
			char operator = scanner.next().charAt(0);

			// Perform calculation based on the operator
			double result;
			// Switch ... Case Block for Choosing the Operators
			switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("Error: Division by zero is not allowed.");
					return;
				}
				break;
			default:
				System.out.println("Enter valid  operator");
				return;
			}

			// Display the result
			System.out.println("Result: " + result);

		}
		// Catch Block Executes when an Exception Occurs
		catch (Exception e) {
			System.out.println("Enter valid integer values and operator.");
		}

	}
}