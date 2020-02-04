package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

		File inputFile = getInputFileFromUser();

		Scanner userInput2 = new Scanner(System.in);
		System.out.println(("Please enter word to search for: "));
		String userWord = userInput2.nextLine();

		int counter = 0;
		
		try (Scanner fileScanner = new Scanner(inputFile)) {

			while (fileScanner.hasNextLine()) {
				
				counter++;
				
				String line = fileScanner.nextLine();

				if ( line.contains(userWord) ) {

					System.out.println(counter + ") " + line);

				}

			} 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("What is the file that should be searched?: ");
		String path = userInput.nextLine();

		File inputFile = new File(path);
		if (inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path + " does not exist");
			System.exit(1); // Ends the program
		} else if (inputFile.isFile() == false) {
			System.out.println(path + " is not a file");
			System.exit(1); // Ends the program
		}
		
		return inputFile;

	}

}

// alices_adventures_in_wonderland.txt
