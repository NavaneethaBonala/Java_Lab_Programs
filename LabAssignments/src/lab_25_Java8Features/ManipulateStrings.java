/*
 * Assignment 1.
Write a Java program that uses lambda expressions to manipulate strings. Create lambda
expressions to perform the following operations on a given string:
● Convert the string to uppercase
● Convert the string to lowercase
● Reverse the string
 */

package lab_25_Java8Features;  // User Defined Package declaration
//Declaring an FunctionalInterface - 1
interface ConvertString
{
	public void convert(String s);
}
//Declaring an FunctionalInterface-2
interface ReverseString
{
	public void reverse(String s);
}
//Class Declaration
public class ManipulateStrings 
{	//  Method  Declaration
	public static void main(String args[]) 
	{	// An Lambda Expression for ConvertString Interface
		ConvertString test = (String s) -> {
			//  Display the Converted UpperCase of the Given String
			System.out.println(s.toUpperCase());
		//  Display the Converted LowerCase of the Given String
			System.out.println(s.toLowerCase());
		};
		// An Lambda Expression for ReverseString Interface
		ReverseString test1 = (String s) -> {
			// Using String Builder to Reverse a String
			String reversed = new StringBuilder(s).reverse().toString();
			// Display the Reversed String
			System.out.println(reversed);
		};
		// Method Calling
		test.convert("JAVA Programming Language");
		test1.reverse("JAVA Programming Language");
	}
}


	
