package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/

//I'm stuck at this point. Trying this method didn't work either. Thinking I might just use the Integer.toString(n,2) and call it a day...//

public class DecimalToBinary {

	public static String DecimalToBinary(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value: ");
		String line = input.nextLine();
		
		if (number < 0) {
            System.out.println("Error: Not a positive integer");
        } else { 

        	System.out.print("Convert to binary is:");
        	System.out.print(binaryform(number));
        }
    }

    private static void printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return;
        }

        remainder = number %2; 
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}

