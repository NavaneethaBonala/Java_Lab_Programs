package lab_01_class_objects;

import java.util.*;

class Arith {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter 2 integer values");
		num1 = obj.nextInt();
		num2 = obj.nextInt();
		System.out.println("addition " + (num1 + num2));
		System.out.println("product " + (num1 * num2));
	}
}