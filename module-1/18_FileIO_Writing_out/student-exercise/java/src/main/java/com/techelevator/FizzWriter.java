package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {

		File pointer = new File("REAMME.md");

		File newFile = new File(pointer.getParent(), "Fizzbuzz.txt");

		try {
			
			newFile.createNewFile();

			PrintWriter writer = new PrintWriter(newFile);

			int i = 0;
			while (i <= 300) {

				for (i = 1; i <= 300; i++) {
					String fizzStr = "";
					String testString = Integer.toString(i);

					if (testString.contains("3") && testString.contains("5") || i % 3 == 0 && i % 5 == 0 && i >= 1 && i <= 300) {

						fizzStr = "FizzBuzz";

					} else if ((i % 5 == 0 && i >= 1 && i <= 300) || testString.contains("5")) {
						fizzStr = "Buzz";

					} else if (testString.contains("3") || i % 3 == 0 && i >= 1 && i <= 300) {
						fizzStr = "Fizz";

					} else if (i >= 1 && i <= 300) {
						fizzStr = Integer.toString(i);

					}

					writer.println(fizzStr);
				}

			} writer.close();
			
		} catch (IOException e) {

		} finally {
			
			System.out.println("FizzBuzz.txt has been created.");
			System.exit(0);
		}
	}
}
// Users/jonathonmccollough/workspace/jonathonmccollough-java-green/module-1/18_FileIO_Writing_out/student-exercise/java

