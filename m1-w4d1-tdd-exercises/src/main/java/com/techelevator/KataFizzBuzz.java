package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataFizzBuzz {

	public String fizzBuzz(int number) {
		
		if(number >=1 && number <= 100) {
			if(number % 15 == 0 && (Integer.toString(number).contains("5") || Integer.toString(number).contains("3"))) {
				return "FizzBuzz";
			}else if(number % 5 == 0) {
				return "Buzz";
			}else if(number % 3 == 0) {
				return "Fizz";
			}
		}return (Integer.toString(number));
	}
}