/*
 * classname : Bill

data member : billno - int, description - string , sales_amount, discount, amt_afterdiscount - double

method:
	readbill(): from the user read billno,description, sales_amount
	calculatebill(): if sales_amount>50000, discount=10%, else discount=2%, then calculate amt_afterdiscount
	showbill(): display all the datamember.

create 2 objects to implement for 2 bills
 */

package lab_03_Accessmodifiers; // package declaration

import java.util.Scanner;

public class Bill { // Class declaration

	// data members of class function
	int billno;
	String description;
	double sales_amount, discount, amt_afterdiscount;

	public void readbill() // method to read the values
	{
		Scanner obj = new Scanner(System.in); // parameter to take input

		System.out.println("Enter BillNo :  ");
		billno = obj.nextInt();
		System.out.println("Enter Description :  ");
		description = obj.next();
		System.out.println("Enter Sales Amount :  ");
		sales_amount = obj.nextDouble();
	}

	public void calculatebill() // method to calculate
	{
		// if and else statement
		if (sales_amount > 50000) {
			discount = 0.10; // 10% discount
		} else {
			discount = 0.02; // 2% discount
		}
	}

	public void showbill() {
		// Calculate the amt_afterdiscount
		double amt_afterdiscount = sales_amount * (1 - discount);

		System.out.println("Bill No : " + billno);
		System.out.println("Description of the product :" + description);
		System.out.println("Sales Amount: " + sales_amount);
		System.out.println("Discount: " + (discount * 100) + "%");
		System.out.println("Amount after Discount: " + amt_afterdiscount);
	}

	public static void main(String[] args) // Main method
	{

		Bill bill1 = new Bill(); // object 1
		Bill bill2 = new Bill(); // object 2

		bill1.readbill();
		bill1.calculatebill();
		bill1.showbill();

		bill2.readbill();
		bill2.calculatebill();
		bill2.showbill();

	}

}