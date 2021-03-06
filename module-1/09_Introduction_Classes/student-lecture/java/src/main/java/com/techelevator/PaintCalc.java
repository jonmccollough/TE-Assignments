package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PaintCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Wall> room = new ArrayList<Wall>();

		while (true) {

			System.out.println();
			System.out.println("[1] Add a wall");
			System.out.println("[2] Calculate paint required (and Exit)");
			System.out.print("Please choose >>> ");
			String userChoice = scan.nextLine();

			System.out.println();
			
			

			// When checking if a variable is equal to a string literal
			// it is best practice to check that the string variable is
			// equal to the string literal, as specified below. If we
			// said `userChoice.equals("1")` instead, what might happen if
			// userChoice is null?
			if ("1".equals(userChoice)) {
				
				Wall newWall; //= new Wall();

				System.out.print("Enter wall height >>> ");
				int height = Integer.parseInt(scan.nextLine());
			//	newWall.setHeight(height);
				
				
				
				System.out.print("Enter wall width >>> "); 
				int width = Integer.parseInt(scan.nextLine());
			//	newWall.setWidth(Integer.parseInt(scan.nextLine()));
				
				newWall = new Wall(height, width);
				
				System.out.println("Added " + newWall.getHeight() + "x" + newWall.getWidth() + " wall - " + newWall.getSurfaceArea() + " square feet");
				
				room.add(newWall);  //stores the wall we created as an element in ArrayList
				
			} else if ("2".equals(userChoice)) {

				// Here we need to sum up the areas of all walls that have been entered
				
				int wallNumber = 1;
				int totalSurfaceArea = 0;
				
				for( Wall individualWall : room ) {
					
					System.out.println("Wall " + wallNumber +  individualWall.getHeight() + "x" +
							individualWall.getWidth() + " - " + 
							individualWall.getSurfaceArea() + " square feet" );
					
					totalSurfaceArea += individualWall.getSurfaceArea();
					
					wallNumber++;
				}
				
//				System.out.println("Wall 1: 10x15 - 150 square feet"); // PROTOTYPE ONLY!!!
//				System.out.println("Wall 2: 10x15 - 150 square feet"); // PROTOTYPE ONLY!!!
//			
				
				 // PROTOTYPE ONLY!!!
				System.out.println("===============================");
				System.out.println("Total Area: " + totalSurfaceArea + " square feet");

				// 1 gallon of paint covers 400 square feet
				float gallonsRequired = (float) totalSurfaceArea / 400;
				System.out.println("Paint Required: " + gallonsRequired + " gallons");

				System.exit(0); // Causes the program to end
			}
		}
	}

}
