/*
 * 1. Write a Java program to check if a given string is a palindrome. 
 * Use a stack to help you compare characters from the beginning and end of the string.
 *  Do not use any String functionalities to reverse the String. Use Stack data structure. 
 *  You can use (A string is called Palindrome if the reverse of the string 
 *  is the same as the original string. Example: “racecar”. )
 */


package lab_28_stackimplementation;// User Defined Package declaration
import java.util.*;// Build in package declaration
import java.util.Stack; // Build in package declaration
// Class Declaration
public class PalindromeString {
	// Method to check for the Palindrome with parameter
	public static boolean isPalindrome(String input) {
		// Create a empty stack
		Stack<Character> stack = new Stack<>();
		// Convert the input to Lowercase for Case sensitive
		input = input.toLowerCase();
		// checks the length of the string
		int length = input.length();
		// for loop to indicate the stack index number
		for(int i=0; i< length ; i++)
		{
			// Adding all the character of a string in to a stack by push operation
			stack.push(input.charAt(i));
		}
		// for loop to indicate the stack index number
		for(int i=0; i< length ; i++)
		{	// Pop the digits off the stack and compare them with the original number 
	            
	            if (stack.pop() == input.charAt(i)) {
	                return true; //Is a palindrome
	            }
	            else 
	            	return false;
	        }
		
		 return true;	
	}
	// Main method
	public static void main(String[] args) {
		// Scanner class to take input from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		// string str variable to hold the input String
		String input = sc.nextLine();
		// calling Method in 'if else' statement
		if(isPalindrome(input))
		{
			System.out.println(input + " is a Palindrome");
		}
		else
			System.out.println(input + " is a Not Palindrome");
		// closing the scanner class
		sc.close();
	}
}
