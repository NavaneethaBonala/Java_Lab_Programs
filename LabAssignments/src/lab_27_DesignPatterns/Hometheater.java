/*
 *2. Home Theater System: Create a home theater system using the Facade Pattern.
Define classes for various components like DVD player, amplifier, projector, and screen. 
Implement a HomeTheaterFacade class that provides a simplified interface to control
the entire home theater system, including turning it on, playing a movie, and turning it off.
 */


package lab_27_DesignPatterns;
//Subsystem Class 1
class DVDplayer {
	// method to PowerON the DVDplayer
	public void oN() {
		System.out.println("DVD Player is ON");
	}
	// method to PowerOff the DVDplayer
	public void oFF() {
		System.out.println("DVDplayer is OFF");
	}
	
}
//Subsystem Class 1
class Projector {
	// method to PowerON the Projector
	public void oN() {
		System.out.println("Projector is ON");
	}
	// method to PowerOff the Projector
	public void oFF() {
		System.out.println("Projector is OFF");
	}
	
}
//Subsystem Class 1
class Amplifier {
	// method to PowerON the Amplifier
	public void oN() {
		System.out.println("Amplifier is ON");
	}
	// method to PowerOff the Amplifier
	public void oFF() {
		System.out.println("Amplifier is OFF");
	}
	
}
//Subsystem Class 1
class Screen {
	// method to PowerON the Screen
	public void oN() {
		System.out.println("Screen is ON");
	}
	// method to PowerOff the Screen
	public void oFF() {
		System.out.println("Screen is OFF");
	}
	
}
//Facade Class
class HometheaterFacade {
	// creating reference to the classes
	// making reference as private to hide from client
	//The client code doesn't need to know the details of how the DVDplayer, Projector,
	//and Amplifier,Screen work; 
	//it simply calls the startHomeTheater() method and stopHomeTheater() method
	private DVDplayer dvdplayer;
	private Projector projector;
	private Amplifier amplifier;
	private Screen screen;
	//we are using constructor to create object to the reference of classes
	public HometheaterFacade() {
		dvdplayer = new DVDplayer();
		projector = new Projector();
		amplifier = new Amplifier();
		screen = new Screen();
		
	}
	// calling "oN" method using the respective objects 
	public void startHomeTheater() {
		dvdplayer.oN();
		projector.oN();
		amplifier.oN();
		screen.oN();
		System.out.println("HomeTheater is  ON");
		System.out.println("Playing a Movie");
	}
	// calling "oFF" method using the respective objects 
	public void stopHomeTheater() {
		System.out.println("HomeTheater is Shutting down");
		dvdplayer.oFF();
		projector.oFF();
		amplifier.oFF();
		screen.oFF();		
	}
}

//Client Code
public class Hometheater {
	// Main method
	public static void main(String[] args) {
		// creating the object for HometheaterFacade class
		HometheaterFacade hf = new HometheaterFacade();
		// Calling the methods of facade class
		hf.startHomeTheater();
		hf.stopHomeTheater();
	}
}
