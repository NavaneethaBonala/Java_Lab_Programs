/*
Assignment 2.
Write a Java program that demonstrates the use of method references for static methods.
Create a functional interface and use a method reference to call a static method that
calculates the square of a number
*/

package lab_25_Java8Features; // User Defined Package declaration
import java.util.*; // Built in declaration

// Declaring an FunctionalInterface
@FunctionalInterface
interface FunctionalInterfaces{
	void say(); // void method
}
// Class Declaration
public class SquareOfaNumber 
{	//  Method  Declaration
	public static void Square()
	{	 // Scanner class to take input from keyboard 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		// int a variable to hold the integer value
		int a = sc.nextInt();
		System.out.print("Square of Given number : " + a*a);
		// close the scanner class
		sc.close();
		}
	// Main Method
	public static void main(String[] args) 
	{	// Referring static method 
		FunctionalInterfaces f = SquareOfaNumber ::Square;
		// Calling interface method
		f.say();
		
	}
}
