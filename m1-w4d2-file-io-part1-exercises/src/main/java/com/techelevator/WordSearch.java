package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	
	public static void main(String[] args) {
		
		System.out.println("What word would you like to search for?");
		Scanner userInput = new Scanner(System.in);
		String searchWord = userInput.nextLine();
		
		System.out.println("Would you like your word search to be case sensitive? Y/N?");
		String answer = userInput.nextLine();
	
	
		File readMe = new File("alices_adventures_in_wonderland.txt");
		System.out.println(readMe.exists());
		
		int lineCount = 0;
		
		try(Scanner input = new Scanner(readMe)) {
			while(input.hasNextLine()) {
				lineCount++;
				String line = input.nextLine();
				if(answer.equalsIgnoreCase("Y")) {
					if(line.contains(searchWord)) {
						System.out.println(lineCount + " " + line);
					}
				}else {
					if(answer.equals("N")) {
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
