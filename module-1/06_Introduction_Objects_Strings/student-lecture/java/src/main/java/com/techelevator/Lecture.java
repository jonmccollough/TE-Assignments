package com.techelevator;

import java.util.Arrays;

public class Lecture {

	public static void main(String[] args) {

//		System.out.println("************************************");
//		System.out.println("****** MAKING A STRING OBJECT ******");
//		System.out.println("************************************");
//
//		/* The String class gets special treatment in the Java language.  One
//		 * example of this is that there is a literal representation of a
//		 * String (i.e. characters appearing between two double quotes.  This
//		 * is not the case for most classes */
//
//		/* create an new instance of String using a literal */
//
//		String greeting = "Hello, nice person!";
//		System.out.println("greeting: " + greeting);
//		
//		System.out.println();
//		System.out.println("******************************");
//		System.out.println("****** MEMBER METHODS ******");
//		System.out.println("******************************");
//		System.out.println();
//
//		System.out.println("charAt(5): " + greeting.charAt(5));
//		System.out.println("indexOf (o): " + greeting.indexOf("o"));
//		System.out.println("indexOf (nice): " + greeting.indexOf("nice"));
//		System.out.println("indexOf (0,5 substring): " + greeting.substring(0,5));
//		System.out.println("indexOf (whole substring): " + greeting.substring(0,greeting.length()));
//		
		
		
		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */
		
		

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
		String hello1 = new String(helloArray);
		String hello2 = new String(helloArray);
		String hello3 = "Hello";
		
		System.out.println(helloArray);  //prints whole array
		System.out.println(Arrays.toString(helloArray));
		
		System.out.println(hello1 + " " + hello2 + " " + hello3);

		
		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}
//
//		String hello3 = hello1;
//		if (hello1 == hello3) {
//			System.out.println("hello1 is the same reference as hello3");
//		}
//
//		/* So, to compare the values of two objects, we need to use the equals method.
//		 * Every object type has an equals method */
//		if (hello1.equals(hello2)) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}
//
	}
}
