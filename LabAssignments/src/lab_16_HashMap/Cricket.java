/*
 * 2.Write a program in Java to create a Map Interface where we can store the cricketer name in it along with his scores and search for the batsman name and display his score. 
 * [Hint:use containsKey() method to search batsman name]
 */


package lab_16_HashMap;//User defined package declaration

import java.util.HashMap; // in built package declaration
import java.util.Map; // in built package declaration
import java.util.Scanner; // in built package declaration

public class Cricket {
	// Class declaration
    public static void main(String[] args) {// Main declaration
        // Creating a Map to store cricketer names and scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Adding cricketer names and scores to the map
        cricketerScores.put("Virat Kohli", 90);
        cricketerScores.put("Rohit Sharma", 75);
        cricketerScores.put("Steve Smith", 82);
        cricketerScores.put("Kane Williamson", 68);

        // Getting input from the user to search for a batsman
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the batsman: ");
        String batsmanName = scanner.nextLine();

        // Searching for the batsman and displaying the score
        if (cricketerScores.containsKey(batsmanName)) {
            int score = cricketerScores.get(batsmanName);
            System.out.println(batsmanName + "'s score is: " + score);
        } else {
            System.out.println("Batsman not found in the records.");
        }
    }
}
