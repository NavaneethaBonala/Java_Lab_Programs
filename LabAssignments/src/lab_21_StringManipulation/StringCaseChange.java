/*
 * 1. Write a program to accept string and change the case of each letter of the string. display the new string

eg: Welcome to Java

O/P: wELCOME TO jAVA
 */


package lab_21_StringManipulation;// user defined package declaration

import java.util.Scanner;// in built package declaration

public class StringCaseChange {// classdeclaration

	public static void main(String[] args) {// Main method
		// Scanner class to take input from keyboard
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		// string str variable to hold the input String
		String str = sc.nextLine();
		// StringBuffer str1 obj is created
		StringBuffer str1 = new StringBuffer(str);
			// for Loop to check each letter of a string
		for(int i = 0; i<str.length(); i++)
		{
			// if Loop to check each letter in LowerCase  
			if (Character.isLowerCase(str.charAt(i))) {
				//  To Convert letter in lowerCase to UpperCase
				str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));			
			}
			else 
			{	// To Convert letter in UpperCase to LowerCase
				str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}			
		}
		System.out.println(str1);
	}
}
