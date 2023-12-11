/*
1. Write a Java program that reads an input file from the file system and 
outputs the content of the file character by character. 
 Use FileReader.read() method to read characters from the file.
 At the end, print the total number of characters present in the file
 */

package lab_22_FileHandling;// User Defined Package declaration
import java.io.*;// Built in declaration

public class ReadInput // class declaration
{
	// Main Method throws Exception
	public static void main(String[] args) throws Exception {
		// read data from a file
		FileInputStream fis = new FileInputStream("E:\\test.txt");
		int character;
		int totalCharacters = 0;

		// Read characters from the file until the end of the file is reached
		while ((character = fis.read()) != -1) {
			// Print each character
			System.out.print((char) character);
			totalCharacters++;
		}
		// Print the total number of characters in the file
		System.out.println("\nTotal number of characters: " + totalCharacters);
		// Close() 
		fis.close();
	}

}






