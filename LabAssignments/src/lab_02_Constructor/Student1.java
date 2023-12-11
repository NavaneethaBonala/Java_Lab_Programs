/*
 * Assignment-2

Define a student class with following data members

Idno, name, course and average

Add methods to read and display the student data.
 */

// Package Declaration
package lab_02_Constructor;

import java.util.*; // in-built Package

public class Student1 {
	// attributes or data members or class variables

	private int idno;
	private String name, course;
	private float avg_marks;

	public Student1() // Constuctor
	{
	}

	public Student1(int id, String na, String c, float avg)// Constuctor
	{
		// Data members of Constructor
		idno = id;
		name = na;
		course = c;
		avg_marks = avg;
	}

	// function or method
	public void readdata() {
		// Take the input
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter idno ");
		idno = obj.nextInt();
		System.out.println("Enter Name of the student ");
		name = obj.next();
		System.out.println("Enter Course name ");
		course = obj.next();
		System.out.println("Enter average marks ");
		avg_marks = obj.nextFloat();

	}

	// method to print the data
	protected void showdata() {
		System.out.println("IDNO " + idno);
		System.out.println("Name " + name);
		System.out.println("Course " + course);
		System.out.println("Average " + avg_marks);

	}
}