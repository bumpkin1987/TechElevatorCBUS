package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
		
	
	Map<String, String> animalGroup = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
	
		animalGroup.put("Rhino", "Crash");
		animalGroup.put("Giraffe", "Tower");
		animalGroup.put("Elephant", "Herd");
		animalGroup.put("Lion", "Pride");
		animalGroup.put("Crow", "Murder");
		animalGroup.put("Pigeon", "Kit");
		animalGroup.put("Flamingo", "Pat");
		animalGroup.put("Deer", "Herd");
		animalGroup.put("Dog", "Pack");
		animalGroup.put("Crocodile", "Float");
		
		Set<String> keys = animalGroup.keySet();
		
		for(String name : keys) {
			if (animalName == "" ) {
				return "unknown";
			}
			else if (animalGroup.containsKey(animalName)) {
				return animalGroup.get(animalName);
			}
			
		
		}
		return "unknown";
	
	}

//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
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
	
	Map<String, Double> saleItems = new TreeMap<String, Double>(String.CASE_INSENSITIVE_ORDER);
		
		saleItems.put("KITCHEN4001", 0.20);	
		saleItems.put("GARAGE1070", 0.15);
		saleItems.put("LIVINGROOM", 0.10);
		saleItems.put("KITCHEN6073", 0.40);
		saleItems.put("BEDROOM3434", 0.60);
		saleItems.put("BATH0073", 0.15);
		
		
		
		if (saleItems.equals("") || saleItems == null) {
			return 0.00;
		}
		else if (saleItems.containsKey(itemNumber)){
			return saleItems.get(itemNumber);
		}
		else {
			return 0.00;
		}
		
	}
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
			Integer peterMoney = peterPaul.get("Peter");
			Integer paulMoney = peterPaul.get("Paul");
			 
			
			if (peterMoney > 0 && paulMoney < 1000) {												
				paulMoney =	paulMoney + (peterMoney/2);
				peterMoney = peterMoney - (peterMoney/2);	
				peterPaul.put("Peter", peterMoney);
				peterPaul.put("Paul", paulMoney);
				return peterPaul;
			}
			else {
				return peterPaul;
			}
				
		
		
	
	}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%	
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
		   Map<String, Integer> newPartnership = new HashMap<String, Integer>();
		   
		   Set<String> keys = peterPaul.keySet();
		
		Integer petersMoney = peterPaul.get("Peter");
		Integer paulsMoney = peterPaul.get("Paul");
		Integer partnership = (petersMoney/4) + (paulsMoney/4);
		
		for (String  name : keys) {
			if (peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000) {
				peterPaul.put("Peter", (petersMoney - (petersMoney/4)));
				peterPaul.put("Paul", (paulsMoney - (paulsMoney/4)));
				peterPaul.put("PeterPaulPartnership", partnership);
			}
			return peterPaul;
		}
		return peterPaul;
	}
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String , String> firstlastChar = new HashMap<String , String>();
		
		for (int i = 0 ; i < words.length ; i++) {
			firstlastChar.put(words[i].substring(0, 1) , words[i].substring(words[i].length() - 1));
			
		}
		return firstlastChar;
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
	public Map<String, Integer>  (String[] words) {
		Map<String,Integer> letterCount = new HashMap<String,Integer>();
		int sumOfA = 0;
		int sumOfB = 0;
		int sumOfC = 0;
		
		for ( int i = 0 ; i < words.length ; i++) {
			if (words[i].contains("a")) {
				sumOfA++;
				letterCount.put(words[i] , sumOfA);
			}
			else if (words[i].contains("b")) {
				sumOfB++;
				letterCount.put(words[i] , sumOfB);
			}
			else if (words[i].contains("c")) {
				sumOfC++;
				letterCount.put(words[i] , sumOfC);
			}
			
			
		}
		return letterCount;
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
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> someInts = new HashMap<Integer, Integer>();
		
		
		for (int i = 0; i < ints.length; i++) {
			int count = 0;
			for (int j = 0; j < ints.length; j++) {
				if (ints[i] == ints[j]) {
					count++;				
				}				
			}
			someInts.put(ints[i], count);
		}
		return someInts;
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
		Map<String, Boolean> trueFalse = new HashMap<String, Boolean>();
		int truthOfA = 0;
		int truthOfB = 0;
		int truthOfC = 0;
		
		
		for ( int i = 0 ; i < words.length ; i++) {
			if (words[i].contains("a")) {
				truthOfA++;
				if (truthOfA >= 2) {
					trueFalse.put(words[i] , true);
				}
				else {
					trueFalse.put(words[i] , false);
				}
			}
			else if (words[i].contains("b")) {
				truthOfB++;
				if (truthOfB >= 2) {
					trueFalse.put(words[i] , true);
				}
				else {
					trueFalse.put(words[i] , false);
				}
			}
			else if (words[i].contains("c")) {
				truthOfC++;
				if (truthOfC >= 2) {
					trueFalse.put(words[i] , true);
				}
				else {
					trueFalse.put(words[i] , false);
				}
			}
			
			
		}
		return trueFalse;
	
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
		Map<String, Integer> newMap = new HashMap<String, Integer>();
		
		
		Set<String> item = mainWarehouse.keySet();
		Set<String> item2 = remoteWarehouse.keySet();
		
		for (String thing2 : item2) {
			for (String thing : item) {
				if (thing.equals(thing2)) {
					newMap.put(thing, mainWarehouse.get(thing) + remoteWarehouse.get(thing2));
				} 
				else {
					newMap.put(thing2, remoteWarehouse.get(thing2));
					newMap.put(thing, mainWarehouse.get(thing));	
				}
			}
		}
		return newMap;
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
		Map<String , Integer> doubleX = new HashMap <String , Integer>();

		
		
		for(int j = 0 ; j < words.length ; j++) {
			int count = 0;
			for(int i = 0; i < words[j].length() - 2; i++) {
				String end = words[j].substring(words[j].length() - 2);
				String partialStr = words[j].substring(i, i+2);
					
				if (end.equals(partialStr)) {
						count++;
						
				}
			}	doubleX.put(words[j], count);	
		}
		return doubleX;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		List<String> myList = new ArrayList<String>();
		Set<String> mySet = new TreeSet<String>();
		
		mySet.addAll(stringList);
		myList.addAll(mySet);
		return myList;
	}

}
