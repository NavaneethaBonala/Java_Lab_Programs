/*Assignment 
 *  Write a program which calculates the monthly bill amount for a
internet subscriber based on the following logic:
1) If the total data consumed is less than 10 GB then bill amount
will be Rs. 300. (Basic charge)
2) If the data consumed is between 10 GB and 30 GB then bill
amount will be basic charge + 5* (Total GB consumed - 10).
That means consumers will be charged Rs 5 for each
additional GB consumed over 10 GB.
3) If the consumer consumes more than 30 GB then
The bill amount = 400 + 3 *(Total GB consumed - 30).
That means the consumer has to pay additional Rs 3 for each
GB above 30GB.
Use if-else block to solve the problem.
 */

package lab_05_Controlstatements;
//User Defined Package Declaration

import java.util.*;
//Built in package Declaration

public class InternetBill {
	// Class Declaration

	public static void main(String[] args) {
		// Main method

		int basic_charge = 300;

		Scanner obj = new Scanner(System.in);
		// Object to accept input from keyboard
		System.out.println("Enter Data consumed : ");
		int data_consumed = obj.nextInt();

		System.out.println("Data Consumed by the Subscriber : " + data_consumed + "GB");

		// if .. else Statement
		// checks if the data consumed is below 10
		if (data_consumed < 10) {
			System.out.println("Bill Amount is : " + basic_charge);
		}
		// checks if the data consumed is between 10 and 30
		else if (data_consumed > 10 & data_consumed < 30) {
			int amount = basic_charge + 5 * (data_consumed - 10);
			System.out.println("Bill Amount is : " + amount);
		}
		// checks if the data consumed is above 30
		else {
			int amount1 = 400 + 3 * (data_consumed - 30);
			System.out.println("Bill Amount is : " + amount1);
		}
	}
}