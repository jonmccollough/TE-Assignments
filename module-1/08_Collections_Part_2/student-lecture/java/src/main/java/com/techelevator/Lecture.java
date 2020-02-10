package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();

		/* Map is an interface and HashMap is a class that implements Map */
		
		Map<String, String>  nameToZip = new HashMap<String, String>();

		/* The "put" method is used to add elements to a Map */
		
		nameToZip.put("beth", "15212" );
		nameToZip.put("charles", "15237");
		nameToZip.put("bob", "05237");

		/* The "get" method is used to retrieve elements from a Map */
		
		System.out.println("Beth lives in " + nameToZip.get("beth"));
		System.out.println("Charles lives in " + nameToZip.get("charles"));
	
		/* keySet returns a Set of all of the keys in the Map */
		
		Set<String> keys = nameToZip.keySet();
		
		System.out.println(keys);
		
		
		/* If the key already exists, put will overwrite the existing value with the new value */

		nameToZip.put("beth", "85283" );
		

//		System.out.println("####################");
//		System.out.println("       SETS");
//		System.out.println("####################");
//		System.out.println();

		Set<String> students = new HashSet<String>();
		
		students.add("Eric");
		students.add("Archana");
		students.add("Cat");
		

//		System.out.println("####################");
//		System.out.println("Sets cannot contain duplicates");
//		System.out.println("####################");
//		System.out.println();

		students.add("Eric");
		
		System.out.println("####################");
		System.out.println("Sets do not guarantee ordering");
		System.out.println("####################");
		System.out.println();

		for (String student : students ) {
			
			System.out.println(student + " : Hash = " + student.hashCode());
			
		}
			

	}

}
