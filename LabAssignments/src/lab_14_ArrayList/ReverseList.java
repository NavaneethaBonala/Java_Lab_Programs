package lab_14_ArrayList;
import java.util.*;

public class ReverseList {

	public static void main(String[] args) {

		List<String> words= new ArrayList<>(Arrays.asList("Apple", "Banana","Cherry", "Dates"));
		
		System.out.println("Original List : "+words);
		
		Collections.reverse(words);
		
		System.out.println("Reversed List : "+words);

	}

}
