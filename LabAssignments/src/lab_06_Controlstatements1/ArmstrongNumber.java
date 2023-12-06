/*
 * 1. Write a program to find out all the armstrong numbers within a given

range using a method named printArmstrongNumber( int start, int

end) by taking input from the user. The program should print the

Armstrong number in a given range starting from “start” and ending

with “end”.

Note: input should be taken from the keyboard. Use a loop to calculate the

Armstrong number from “start” to “end”. Also use loops to calculate the

cube of a number. Do not use the Math.pow() function. 
 */

package lab_06_Controlstatements1;
//User Defined Package Declaration

import java.util.*;
//Built in package Declaration

public class ArmstrongNumber {
	// Class Declaration

	public static void main(String[] args) { // Main method

		// Object to accept input from keyboard
		Scanner obj = new Scanner(System.in);

		// data members
		int start, end, n, n1, r, count, sum;
		boolean flag = false;

		System.out.println("Enter the Start Limit :");
		start = obj.nextInt();// object to accept the input from keyboard

		System.out.println("Enter the End Limit :");
		end = obj.nextInt();// object to accept the input from keyboard

		// for loop to check the range
		for (int i = start; i <= end; i++) {
			n1 = n = i;
			count = 0;

			// while loop checks n is greater than 0
			while (n > 0) {
				n = n / 10;
				count++;
			}

			sum = 0;
			// while loop checks n1 is greater than 0
			while (n1 > 0) {
				r = n1 % 10;
				int p = 1;
				for (int j = 1; j <= count; j++)
					p = p * r;
				sum = sum + p;
				n1 = n1 / 10;
			}

			// checks if sum is equal to zero
			if (sum == i) {
				System.out.println(i);
				flag = true;

			}

		}
		// checks if flag is false
		if (flag == false) {
			System.out.println("  No a Armstrong Number");
		}

	}
}