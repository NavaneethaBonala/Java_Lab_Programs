package lab_26_DesignPattern;// User defined Package declaration
// Class DEclaration
public class ShapeFactory {
	// concrete method 
	public Shape createShape(String s)
	{
		Shape shape = null;
		// else if statement to check the string and return the class instance
		if(s.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(s.equalsIgnoreCase("Square"))
			return new Square();
		else if(s.equalsIgnoreCase("Triangle"))
			return new Triangle();
		else
			return shape;
	}	
}
