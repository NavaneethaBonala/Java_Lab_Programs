/*
 *  Write a Java program that demonstrates method overriding by creating a superclass called Animal 
 *  and two subclasses called Dog and Cat. 
 *  ● The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound." 
 *  ● The Dog and Cat classes should override this method to print "TheCat/The dog meows/barks" respectively. 
 *  ● The program should allow the user to create and display objects of each
 */

package lab_11_InheritanceOverride;

import java.util.Scanner;

class Animal {
	// make sound method to print
	public void makesound() {
		System.out.println("The Animal makes Sound");
	}

}

class Dog extends Animal {
	@Override
	// make sound method to print
	public void makesound() {
		System.out.println("The Dog Barks");
	}
}

class Cat extends Dog {
	@Override
	// make sound method to print
	public void makesound() {
		System.out.println("The Cat says Meow");
	}
}

public class Overriding { // Class Declaration

	public static void main(String[] args) {
		// Main Method

		// Objects created for Super class and each Sub Class
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();

		// Calling a method
		a.makesound();
		d.makesound();
		c.makesound();
	}

}