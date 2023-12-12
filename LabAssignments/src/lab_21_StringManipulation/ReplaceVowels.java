/*
 * 2. Read a string and replace only vowels with a specific letter to perform encoding operation.
eg: computer
encoding : cpmpptp
 */


package lab_21_StringManipulation;// user defined package declaration

import java.util.Scanner; // in built package declaration

public class ReplaceVowels { // classdeclaration

	public static void main(String[] args) { // Main method
		// Scanner class to take input from keyboard
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		 // string str variable to hold the input String
		String str = sc.nextLine();
		
		String str1; 
		// replaceAll method to replace the Vowels with Star(*) 
		str1 = str.replaceAll( "[aeiouAEIOU]", "*" );
		System.out.println(str1);
		
		sc.close();
	}
}


