package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;
//syso control space enter
public class FizzWriter {

	public static void main(String[] args) {
		fizzBuzzOutput(300);
	}	
		public static String fizzBuzz(int number) {
			
			if(number >=1 && number <= 300) {
				if(number % 15 == 0) {
					return "FizzBuzz";
				}else if(number % 5 == 0 || (Integer.toString(number).contains("5"))) {
					return "Buzz";
				}else if(number % 3 == 0 || Integer.toString(number).contains("3")) {
					return "Fizz";
				}
			}return (Integer.toString(number));
		}
public static void fizzBuzzOutput(int number) {
	File originalFizz = new File("FizzBuzz.txt");
	
	try(PrintWriter writeBuzz = new PrintWriter(originalFizz)) {
		for(int i = 1; i < number; i++) {
			writeBuzz.println(fizzBuzz(i));
		}
			
	}catch (FileNotFoundException e) {
		e.printStackTrace();
		System.exit(1);
}
}
}
