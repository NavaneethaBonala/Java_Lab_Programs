/*
 2. Write a program to calculate the gross salary of a group of

employees. Basic salary should be taken from the user.

If the basic salary is greater than 15000 ,HRA=20% and DA=60% will be

given, else HRA=3000 and DA 70% will be given to the employee.

Note:Input of basic salary will be taken from the keyboard. After calculating

the salary of one employee, the program will ask for the user's choice as

int. If “-1” is entered then the loop will continue and the loop will exit for

other int inputs.
 */

package lab_06_Controlstatements1;
//User Defined Package Declaration

import java.util.*;
//Built in package Declaration

public class EmployeeSalary {
	// Class Declaration

	public static void main(String[] args) {
		// Main method

		// Object to accept input from keyboard
		Scanner obj = new Scanner(System.in);

		// data members
		float basic_salary, hra, da;
		int choice;

		do // do - while loop
		{
			System.out.println("Enter Basic Pay : ");
			// object to accept the input from keyboard
			basic_salary = obj.nextFloat();

			// checks if the basic_salary is above 15000
			if (basic_salary > 15000) {
				hra = basic_salary * 20 / 100; // basic_salary * 20%
				da = basic_salary * 60 / 100; // basic_salary * 60%

			} else {
				hra = 3000;
				da = basic_salary * 70 / 100; // basic_salary * 70%
			}

			System.out.println("HRA : " + hra);
			System.out.println("DA : " + da);

			System.out.println("Do you want to continue for Another Employee");
			System.out.println("If Yes Enter -1");
			choice = obj.nextInt(); // object to accept the input from keyboard

			// checks if the choice is not equal to -1
			if (choice != -1)
				break;
		}
		// checks if the choice is equal to -1
		while (choice == -1);

		System.out.println("End of execution.");

	}

}