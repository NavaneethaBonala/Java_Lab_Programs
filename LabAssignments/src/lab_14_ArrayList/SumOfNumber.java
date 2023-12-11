/*
 * 2. Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.
 */

package lab_14_ArrayList;// User defined Package Declaration

import java.util.*;// in built Package Declaration

public class SumOfNumber {// Class Declaration

	    public static void main(String[] args) {
	    	// Main Method
	       
	    	//create an empty ArrayList of Integer  type
	        ArrayList<Integer> numbers = new ArrayList<Integer>();
	        
	        Scanner sc = new Scanner(System.in);
	        int n;
	      	     
	        System.out.println("Enter Number of Values : ");
	        n=sc.nextInt();
	        
	        System.out.println("Please Enter your Numbers: ");
	        
	        // Adding elements to above List using add() method
	        for(int i=0; i<n; i++) 
	        {	           	            
	            numbers.add(sc.nextInt());
	        }
	        
	        // Printing all elements of Collection (ArrayList)
	        System.out.println(numbers);
	        
	        // for each loop of array list elements
	        int sum=0;
	        for(int num : numbers) {
	        	// if loop to check for Even Numbers
	        	if(num %2==0) {
	        		sum +=num;
	        	}
	        	
	        }
	        // Print the sum of all Even Numbers from the ArrayList
	        System.out.println("Sum of All Even Numbers from the Given ArrayList : "+sum);
	    }
}