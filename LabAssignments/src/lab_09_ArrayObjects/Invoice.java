
/*
 * Define a class Invoice

invoiceId    : inv1
invoicePrice : 2300.50
vendorName : vendor1
invoiceName : abc ltd.
location : Pune

default constructor

addInvoice() - read from user
displayInvoice() - display all datamebers

crate array objects to store 'n' no. of invoices
 */

package lab_09_ArrayObjects;
//User defined Package Declaration

import java.util.Scanner; // in-built Package Declaration

public class Invoice { // Class Declaration

	// Data Members
	String invoiceId;
	float invoicePrice;
	String vendorName, invoiceName, location;

	public Invoice() {
	} // Default Contructor

	public void addInvoice() // Method to read the Invoice Details
	{
		// parameter to take input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Invoice ID : ");
		invoiceId = sc.next();

		System.out.println("Enter Invoice Name : ");
		invoiceName = sc.next();

		System.out.println("Enter Vendor Name : ");
		vendorName = sc.next();

		System.out.println("Enter Invoice Price : ");
		invoicePrice = sc.nextFloat();

		System.out.println("Enter Location : ");
		location = sc.next();

	}

	// Method to Display the Entered Invoice Details
	public void displayinvoice() {
		System.out.println(
				"\n" + invoiceId + "\t" + invoiceName + "\t" + vendorName + "\t" + invoicePrice + "\t" + location);

	}

	public static void main(String[] args) {
		// Main Method

		int n, i;
		// parameter to take input
		Scanner sc = new Scanner(System.in);

		// Define the number of Invoices
		System.out.println("Enter the Number of Invoices : ");
		n = sc.nextInt();

		Invoice[] invoice = new Invoice[n]; // array of objects

		System.out.println("Enter Invoice Details : ");
		// allocate memory of each object and read data to the objects
		for (i = 0; i < n; i++) {
			invoice[i] = new Invoice(); // allocate memory for object
			invoice[i].addInvoice();

		}

		System.out.println("Displaying Invoice Details : ");
		// for loop to display the Invoice Details
		for (i = 0; i < n; i++) {
			invoice[i].displayinvoice();

		}
	}

}