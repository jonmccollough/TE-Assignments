package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List <String> names = new ArrayList<String>();
		names.add("Frodo");
		names.add("Sam");
		names.add("Bjorn");
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for (int i = 0; i< names.size(); i++ ) {
			
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Sam");
		
		for (int i= 0; i< names.size(); i++) {
			
			System.out.println(names.get(i));
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		names.add(2, "Laegartha");
		
		for ( int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		names.add(2, "Laegartha");
		
		for (int i = 0; i < names.size(); i++ ) {
			
			System.out.println(names.get(i));
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		names.remove(1);

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		boolean isInList = names.contains("Samwise");
		
		if (names.contains("Samwise") ) {
			System.out.println("already here!");
		} else {
			names.add("Samwise");
		}
		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String[] namesArray = names.toArray(new String[names.size()]);
		
		for (int i = 0; i < namesArray.length; i++ ) {
			
			System.out.println(namesArray[i]);
		}

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		
		Integer employees = new Integer(25);
		Integer piecesOfCake = new Integer("12");
		
		if (piecesOfCake < employees) {
			System.out.println("burn the building down. eat the worm.");
		}
		
		Double accountBalance = null;
	//	double accountBalancePrimitive = accountBalance + 100.;
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		for ( String name : names ) {
			
			System.out.println(name);
		}

		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();
		
		Queue<String> orders = new LinkedList<String>();
		orders.offer("1 - Sandwich");
		orders.offer("2 - Ramen");
		orders.offer("3 - Salad");
		
		while ( orders.size() > 0 ) {
			String nextOrder = orders.poll();
			System.out.println("Order: " + nextOrder);
		}

		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////
		
		Queue<String> orders = new LinkedList<String>();
		orders.offer("1 - Sandwich");
		orders.offer("2 - Ramen");
		orders.offer("3 - Salad");
		
		while ( orders.size() > 0 ) {
			
			String nextOrder = orders.poll();
			System.out.println("Order: " + nextOrder);
			
		}
			

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();
		
		
		

		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////
		
		Stack<String> browserHistory = new Stack<String>(); //Interview question -
		browserHistory.push("http://disneyplus.com");		// build a queue
		browserHistory.push("http://www.google.com");
		browserHistory.push("http://m.facebook.com");
		

		////////////////////
		// POPPING OFF THE STACK
		////////////////////
		
		while ( browserHistory.size() > 0 ) {
			String hisotryItem = browserHistory.pop();
			System.out.println(hisotryItem);
		}

		while( browserHistory.size() > 0 ) {
			
			String historyItem = browserHistory.pop();
			System.out.println(historyItem);
		}
		
	}
}
