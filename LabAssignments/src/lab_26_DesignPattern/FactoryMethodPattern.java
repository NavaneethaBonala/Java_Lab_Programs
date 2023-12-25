package lab_26_DesignPattern;// User defined Package declaration
// Class Declaration
public class FactoryMethodPattern {
	// Main method
	public static void main(String[] args) {
		// creating an object for shapefactory class
		ShapeFactory sf = new ShapeFactory();
		// creating an object "s" with shape interface as reference 
		// calling an method from shapefactory class using an sf obj
		Shape s = sf.createShape("Circle");
		// Calling a circle class method 
		s.drawshape();
		
		Shape s1 = sf.createShape("Square");
		// Calling a Square class method 
		s1.drawshape();
		
		Shape s2 = sf.createShape("Triangle");
		// Calling a Triangle class method 
		s2.drawshape();
	}

}
