/*
 * 3.Write a Java program that demonstrates the functionality of this dictionary 
 * application using a TreeMap.
 *  Your program should include the following features:
 * i)A TreeMap named dictionary to store word-definition pairs.
 * ii)A way to input word-definition pairs and add them to the dictionary. 
 * iii)A way to retrieve and display the definition of a specific word.
 * iv)An iteration through the dictionary to display all word-definition pairs in alphabetical order based on words
 */


package lab_16_HashMap;//User defined package declaration
//in built package declarations
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
//Class declaration
public class Dictionary_Demo {

	// Main declaration
    public static void main(String argv[])
    {
            TreeMap hm = new TreeMap();

//put(String key, Object value)
            hm.put("dawn","early morning");
            hm.put("rigid","Constant");
            hm.put("vintage","Older");
            hm.put("robust","Anticipating problems");
            hm.put("boilerplate","REpeated set of code in an application");
            // Getting input from the user to search 
            Scanner obj = new Scanner(System.in);
            
            System.out.println("Enter a word to add into Dictionary");
            String word = obj.next();
            System.out.println("Enter meaning of the word");
            String meaning = obj.next();
            
            hm.put(word, meaning);
            
            System.out.println("Enter a word to find meaning");
            word = obj.next();
            // If else statement to search for the word
            if(hm.containsKey(word))
            {
            	System.out.println("Meaning of the word: " + hm.get(word));
            }
            else
            {
            	System.out.println("Searching word not present in the dictionary...");
            }
            
            Set s = hm.entrySet();

            
            Iterator it = s.iterator();

            System.out.println("\n\nWord and Synonym present in Treeset");
            while (it.hasNext())
            {
                    Map.Entry me = (Map.Entry) it.next();

                    System.out.println(me.getKey() + "-" + me.getValue());
                    }
            }

}
