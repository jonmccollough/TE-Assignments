package com.techelevator;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// find the evens
		int[] output = Arrays.stream(numbers).filter(number -> number % 2 == 0).toArray();
				
		for(int i : output) {
			System.out.println(i);
		}
		
		
		// does the array contain a 19?
		boolean answer = Arrays.stream(numbers).anyMatch(i -> i == 19);
		System.out.println("Contains a 19? : " + answer);
		
		String[] ppl = {"Tom M", "Tom A", "Beth", "Walt", "Justin" };
		boolean containsBeth = Arrays.stream(ppl).anyMatch(name -> name.equalsIgnoreCase("beth"));
		System.out.println("Contains Beth? : " + containsBeth);
				
		
		List<String> pplAsList = Arrays.asList(ppl);
		pplAsList.indexOf("Walt");
		
		Arrays.sort(ppl);
		for(String p : ppl) {
			System.out.println(p);
		}
		
		String[] backwards = Arrays.stream(ppl).sorted(Collections.reverseOrder()).toArray(String[]::new);

		System.out.println("BACKWARDS:");
		for(String backward : backwards) {
			System.out.println(backward);
		}
		
		String input = "Go Elevate Yourself THis is stupid and confusing";
		printMostFrequentLetterTable(input.toLowerCase());
		
	}
	
	public static void printMostFrequentLetterTable(String input) {
		Map<String, Integer> letCt = new HashMap<>();
		String[] letters = input.split("");
		Arrays.stream(letters).forEach((letter) -> letCt.put(letter, letCt.containsKey(letter) ? letCt.get(letter) + 1 : 1 ));
		letCt.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach((i) -> System.out.println(i.getKey() + ": " + i.getValue()));		
	}
	
	
	/* TIP: Practice doing old array & String exercises with streams... For example:
	 1. Given an array of ints, return the number of 9s in the array.
	 arrayCount9([1, 2, 9]) → 1
	 arrayCount9([1, 9, 9]) → 2
	 arrayCount9([1, 9, 9, 3, 9]) → 3
	 */
	public int arrayCount9(int[] nums) {
		// first argument of the reduce() call will set the initial value of total to 0		
		return Arrays.stream(nums).reduce(0, (total, currentNum) -> currentNum == 9 ? total + 1 : total + 0);
	}
	
}
