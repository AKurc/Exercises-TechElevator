package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	
	public static void main(String[] args) {
		
		System.out.println("What word would you like to search for?");
		Scanner userInput = new Scanner(System.in); //need a scanner to read user input
		String searchWord = userInput.nextLine(); //search word, not "" so any word could used
		
		System.out.println("Would you like your word search to be case sensitive? Y/N?");
		String answer = userInput.nextLine(); //putting the user's response on the next line
	
	
		File readMe = new File("alices_adventures_in_wonderland.txt"); //importing the text to be searched thru
		System.out.println(readMe.exists()); //if the readMe was really imported
		
		int lineCount = 0;
		
		try(Scanner input = new Scanner(readMe)) { //need a scanner to read the imported file
			while(input.hasNextLine()) { //tells the scanner to continue to another line as long as another line exists
				lineCount++; //assigns a line count
				String line = input.nextLine();
				if(answer.equalsIgnoreCase("Y")) { //equalsIgnoreCase so the user can enter a y/Y
					if(line.contains(searchWord)) {
						System.out.println(lineCount + " " + line);
					}
				}else {
					if(answer.equalsIgnoreCase("N")) {
						if(line.toUpperCase().contains(searchWord.toUpperCase())) {
							System.out.println(lineCount + " " + line);
							
						}
					}
				}
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Your file does not exist.");
		}
	}
}
