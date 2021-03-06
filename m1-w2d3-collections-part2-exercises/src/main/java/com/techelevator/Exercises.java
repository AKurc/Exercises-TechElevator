package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.STRING;

public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) { 

		Map<String, String> nonpets = new HashMap<String, String>();

		nonpets.put("rhino", "Crash");
		nonpets.put("giraffe", "Tower");
		nonpets.put("elephant", "Herd");
		nonpets.put("lion", "Pride");
		nonpets.put("crow", "Murder");
		nonpets.put("pigeon", "Kit");
		nonpets.put("flamingo", "Pat");
		nonpets.put("deer", "Herd");
		nonpets.put("dog", "Pack");
		nonpets.put("crocodile", "Float");

		if (nonpets.get(animalName.toLowerCase()) == null) {
			return "unknown";			
		}	
		return nonpets.get(animalName.toLowerCase());



	}

	/*			
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		Map<String, Double> discount = new HashMap<String, Double>();

		discount.put("KITCHEN4001", 0.20);
		discount.put("GARAGE1070", 0.15);
		discount.put("LIVINGROOM", 0.10);
		discount.put("KITCHEN6073", 0.40);
		discount.put("BEDROOM3434", 0.60);
		discount.put("BATH0073", 0.15);

		String upperCase = itemNumber.toUpperCase();

		if(discount.get(upperCase) == null) {
			return 0.00;
		}
		return(discount.get(upperCase));

	}

	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099} map with a key peter/paul with value for each//
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {

		int petersMoney = peterPaul.get("Peter"); //figue out peter's money and//
		int paulsMoney = peterPaul.get("Paul"); //figure out paul's money//

		//if paul has less than 1000 and peter has more than 0, take half of peter's money and give to paul//
		if(paulsMoney < 1000 && petersMoney > 0) {

			int stolenMoney = petersMoney / 2;

			peterPaul.put("Paul", paulsMoney + stolenMoney); //put puts new key into map--or key is there and it's getting overwritten//
			peterPaul.put("Peter", petersMoney - stolenMoney);
		}
		return peterPaul;

	}

	/*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {

		int peterMoney = peterPaul.get("Peter");//figure out peter's money
		int paulMoney = peterPaul.get("Paul");//figure out paul's money
		//if peter has >=5000 more && paul has >=10000 --create string of /4 (25%) each partner's total worth//
		if(peterMoney >= 5000 && paulMoney >= 10000) {
			int peterContributeMoney = (peterMoney / 4);
			int paulContributeMoney = (paulMoney / 4);
			int partnerMoney = peterContributeMoney + paulContributeMoney;

			peterPaul.put("Peter", peterMoney - (peterMoney / 4));
			peterPaul.put("Paul", paulMoney - (paulMoney / 4));
			peterPaul.put(("PeterPaulPartnership"), partnerMoney);
		}
		return peterPaul;

	}
	//****for each loop from here on b/c you need to go thru every single element****
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		List<String> mapString = new ArrayList<>();
		Map<String, String> map = new HashMap<>();

		//given string array, create new string

		//for loop
		
		for(int i = 0; i < words.length; i++) {
			mapString.add(words[i]);
		}
		for(String x : mapString) {
			map.put(x.substring(0, 1), x.substring(x.length() -1, x.length()));
		} return map;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> counts = new HashMap<>(); //have an array and need to go thru it- for each loop//

		for(String word : words){

			//have an empty map- need to get words into map and start at 1//
			//if not in Map- put in Map with count(key) 1(value)//

			if(counts.containsKey(word)) {
				int currentCount = counts.get(word); //get integer out of map and put value into int(int or immutable)//
				currentCount++; //increment current count// //now put back into map//
				counts.put(word, currentCount); //now overwrites what was there and puts incremented value back in//
				//if it is in Map, increment count it already has//
			}else { //put it in the map and start off at 1//
				counts.put(word, 1);


			} 
		}

		return counts;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Integer integerCount(int[] ints) {
		
		Map<Integer, Integer> intKey = new HashMap<>();
	}

	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> inFact = new HashMap<>();

		for(String x : words) {//inside for loop, x contains value of array
			if(inFact.containsKey(x)) {
				inFact.put(x, true);
			} else {
				inFact.put(x, false);
			}
		}

		return inFact;
	}

	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		return null;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	public Map<String, Integer> last2Revisted(String[] words) {
		Map<String, Integer> count = new HashMap<>();
		for(String word: words) {
			
			String lastTwo = word.substring(word.length() -2);
			int times = 0;
			for(int i = 0; i < word.length() -2; i++) {
				if(word.substring(i, i + 2).equals(lastTwo)) {
					times++;
			}
			}
			count.put(word, times);
	}		
		
		
		return count;
	}
}
