/*Assignment 1
 * Write a Java Program that uses a method to calculate the area of a rectangle and compare them using RelationalOperator
 * Steps:
 * Create a class Rectangle.
 * The Rectangle class should have two attributes length and width of type int
 * Create a constructor that accepts length and width as parameters.
 * Area should be calculated as length * area
 * Instantiate two Rectangle classes with random values.
 * Compare the areas of the two rectangles using the Relational Operator
 * If the first one is bigger than the second one, print "Rectangle>Rectangle2"
 * If the first one is smaller print "Rectangle<Rectangle2" 
 * Otherwise print "They are Equal"
 */

package lab_04_Operators; // Package Declaration

public class Rectangle { // Class Declaration

	int length, width, area; // Data members

	public Rectangle(int length, int width) // Constructor with arguments
	{

		this.length = length;
		this.width = width;

	}

	public void findarea() { // Method to find the area of rectangle

		area = length * width;

	}

	public static void main(String[] args) { // Main method

		Rectangle r1 = new Rectangle(5, 9); // Object r1 is created
		Rectangle r2 = new Rectangle(5, 7); // Object r2 is created

		r1.findarea();
		r2.findarea();

		// Comparing the area's using if..else Statement
		if (r1.area > r2.area) {
			System.out.println("Rectangle1 > Rectangle2");
		} else if (r1.area < r2.area) {
			System.out.println("Rectangle1 < Rectangle2");
		} else
			System.out.println("Rectangle1 = Rectangle2");

		Rectangle r3 = new Rectangle(3, 9); // Object r3 is created
		Rectangle r4 = new Rectangle(5, 7); // Object r4 is created

		// Ternary (conditional operator)
		String result;
		result = (r3.area > r4.area) ? "Rectangle1 > Rectangle2"
				: (r3.area < r4.area) ? "Rectangle1 < Rectangle2" : "They are equal";

		System.out.println(result);

	}

}