/*
 * 3. Write a program to count and print the total number of odd and even

numbers from user inputs. Program will ask for user inputs in a loop. Loop
 */

package lab_06_Controlstatements1;
//User Defined Package Declaration

import java.util.Scanner;
//Built in package Declaration

public class OddandEven {
	// Class Declaration

	public static void main(String[] args) {
		// Main method

		// data members
		int n, count = 0, count1 = 0;

		Scanner obj = new Scanner(System.in);
		// Object to accept input from keyboard

		System.out.println("Enter limit : ");
		n = obj.nextInt();

		System.out.println("\nEven Numbers");

		// for loop to check the Even Numbers

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ,");
				count++;
			}
		}

		System.out.println("\n\nOdd Numbers");

		// for loop to check the Odd Numbers

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ,");
				count1++;
			}

		}

		System.out.println("\n\nCount of Even Numbers : " + count);
		System.out.println("Count of Odd Numbers : " + count1);
	}

}