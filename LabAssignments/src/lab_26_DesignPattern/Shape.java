/*
 * 1. Create a simple Factory Pattern for creating shapes 
 * (e.g., Circle, Square, Triangle).
 *  Define an interface called Shape with a draw method, 
 *  and create concrete classes Circle, Square, and Triangle that implement the Shape interface. 
 *  Implement a ShapeFactory that has a method createShape which takes a string 
 *  (e.g., "circle", "square", "triangle") as input and returns the corresponding shape object.
 *   Write a program to demonstrate the usage of the factory to create different shapes 
 *   and call their draw methods. 
 */

package lab_26_DesignPattern;// User defined Package declaration
//Interface Declaration
public interface Shape {
	// Abstract Method 
	public void drawshape() ;
		
}
