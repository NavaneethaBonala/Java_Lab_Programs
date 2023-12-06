
/*
 * Lab 1:

	class name : Product

	data members :  prdid, prddescription, batchcode, price, profit;

	method:  addproduct() with args assign the values to datamembers and display to user
	(with args and no return value)

		calculate_profit()  if price>=10000 and <=100000  profit is 10% on price
				if price between 100000 to 500000 profit is 15% on price
				if price is >500000 profit is 20% on price (with return type and no args)
 */

package lab_07_Methods;// User defined Package

public class Product { // class declaration

	// data members
	int prdid;
	double profit, price;
	String prddescription, batchcode;

	// method to assign values
	public void addProduct(int prdid, String batchcode, String prddescription, double price) {
		this.prdid = prdid;
		this.prddescription = prddescription;
		this.price = price;
		this.batchcode = batchcode;

	}

	// method to calculate profit
	double calculate_profit() {
		// if-else statement to check the profit percentage
		if (price >= 10000 && price <= 100000)
			profit = price * 10 / 100;
		else if (price > 100000 && price < 500000)
			profit = price * 15 / 100;
		else
			profit = price * 20 / 100;
		return profit;
	}

	// method to display product details
	public void displayProduct() {
		System.out.println("Product Id : " + prdid);
		System.out.println("Product Description : " + prddescription);
		System.out.println("Batchcode : " + batchcode);
		System.out.println("Price " + price);
		System.out.println("Profit: " + calculate_profit());
	}

	// main method
	public static void main(String[] args) {

		Product p = new Product(); // New object created

		p.addProduct(101, "AB123", "XYZ", 55000); // assign Values
		p.displayProduct(); // calling method
	}
}