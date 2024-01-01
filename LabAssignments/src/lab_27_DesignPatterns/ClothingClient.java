/*
* Write a program to Illustrate Abstract Factory method pattern.
 */

package lab_27_DesignPatterns;// package declaration
// Abstract classes
//Interface 1
interface Top {
	String getTop();
}
// Interface 2
interface Bottom {
	String getBottom();
}


//Concrete Products for Casual Outfit
// concrete class implements interface 1
class CasualTop implements Top {
	@Override
	public String getTop() {
		return "Casual T-Shirt";
	}
}
//concrete class implements interface 2
class CasualBottom implements Bottom {
	@Override
	public String getBottom() {
		return "Casual Jeans";
	}
}

//Concrete Products for Formal Outfit
//concrete class implements interface
class FormalTop implements Top {
	@Override
	public String getTop() {
		return "Formal Shirt";
	}
}
//concrete class implements interface
class FormalBottom implements Bottom {
	@Override
	public String getBottom() {
		return "Formal Trousers";
	}
}
//Abstract Factory
interface OutfitFactory {
	Top createTop();
	Bottom createBottom();
}

//Concrete Factory for Casual Outfit
class CasualOutfitFactory implements OutfitFactory {
	@Override
	public Top createTop() {
		return new CasualTop();
	}
	@Override
	public Bottom createBottom() {
		return new CasualBottom();
	}	
}

//Concrete Factory for Formal Outfit
class FormalOutfitFactory implements OutfitFactory {
	@Override
	public Top createTop() {
		return new FormalTop();
	}
	@Override
	public Bottom createBottom() {
		return new FormalBottom();
	}
}

//Client
public class ClothingClient {
	public static void main(String[] args) {
		// Creating a Casual Outfit
		OutfitFactory casualFactory = new CasualOutfitFactory();
		Top casualTop = casualFactory.createTop();
		Bottom casualBottom = casualFactory.createBottom();
		//calling the method using the objects to display 
		System.out.println("Casual Outfit:");
		System.out.println("Top: " + casualTop.getTop());
		System.out.println("Bottom: " + casualBottom.getBottom());
		
		//Creating a Formal Outfit
		OutfitFactory formalFactory = new FormalOutfitFactory();
		Top formalTop = formalFactory.createTop();
		Bottom formalBottom = formalFactory.createBottom();
		// calling the method using the objects to display 
		System.out.println("\nFormal Outfit:");
		System.out.println("Top: " + formalTop.getTop());
		System.out.println("Bottom: " + formalBottom.getBottom());
		
	}
}

