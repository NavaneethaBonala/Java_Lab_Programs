/*
 * 1. read and store student records with rollno, name, average marks of 10 students using arrays. and display the same to user. display the student list who are scored above 60 as average marks.
 
 */

package lab_08_Array; // in-built Package Declaration

import java.util.*; // User defined Package Declaration

public class StudentDetails {
	// Class Declaration

	public static void main(String args[]) {
		// Main Method

		// Define the number of students
		int numStudents = 5, i;

		// parameter to take input
		Scanner sc = new Scanner(System.in);

		// Memory Allocation to RollNo, Name, Average Marks
		int rollNo[] = new int[numStudents];
		String name[] = new String[numStudents];
		float[] averageMarks = new float[numStudents];

		// for loop to Store the Details of Students
		for (i = 0; i < rollNo.length; i++) {

			System.out.println("Enter student " + (i + 1) + " details :");

			// Enter Roll no of "n" students
			System.out.print("Roll No: ");
			rollNo[i] = sc.nextInt();

			// Enter Name of "n" students
			System.out.print("Name : ");
			name[i] = sc.next();

			// Enter AverageMarks of "n" students
			System.out.print("Average Marks : ");
			averageMarks[i] = sc.nextFloat();

		}

		System.out.println("Details of " + numStudents + " Students");
		// for loop to print Details of All Students
		for (i = 0; i < rollNo.length; i++) {
			System.out.println(rollNo[i] + "\t" + name[i] + "\t" + averageMarks[i] + "\t");

		}

		System.out.println("Students scored above 60 average marks : ");
		// for loop to print the details of students scored above 60
		for (i = 0; i < rollNo.length; i++) {
			// if statement to check Average Marks
			if (averageMarks[i] > 60) {
				System.out.println(rollNo[i] + "\t" + name[i] + "\t" + averageMarks[i] + "\t");
			}
		}
	}

}