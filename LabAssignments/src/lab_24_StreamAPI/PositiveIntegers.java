/*
 * Read and store 'n' no. of elements to an arraylist using stream API, and display the same to user.
	From the above list filter and display only positive numbers.
 */


package lab_24_StreamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class PositiveIntegers
{
	public static void main(String[] args) 
	{
		//List of Integers with +ve and -ve Integers
		List<Integer> numbers = Arrays.asList(1, -2, 3, 4, 5, -6, -7, 8, 9, 10);
		// Intermediate Operation: filter to check for positive Integers
		List<Integer> positive = numbers.stream()
				// Keep positive numbers in to a stream
				.filter(n -> n > 0) 
				//Collects the elements into a list 
				.collect(Collectors.toList());
		// Display all the +ve numbers from the given list
		System.out.println("Given List of Integers : "+numbers);
		System.out.println("positive Integers: " + positive);										
	}
}
