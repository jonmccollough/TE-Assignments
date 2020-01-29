package com.techelevator.PostageCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.TollBoothCalculator.VehicleInterface;

public class PostageCalculator {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter the weight of the package: ");
		double packageWeight = Double.parseDouble(userInput.nextLine());
		System.out.println("Is the weight (P)ounds or (O)unces?: ");
		String poundsOrOunces = userInput.nextLine();
		System.out.println("What distance will the package be traveling?: ");
		int packageDistance = Integer.parseInt(userInput.nextLine());

		System.out.println("Delivery Method\t\t\t\t $ Cost");
		System.out.println("===================================================");

		List<DeliveryDriver> mail = new ArrayList<DeliveryDriver>();
		mail.add(new PostalServiceFirstClass());
		mail.add(new PostalServiceSecondClass());
		mail.add(new PostalServiceThirdClass());
		mail.add(new FedEx());
		mail.add(new SPU4DayGround());
		mail.add(new SPU2DayBusiness());
		mail.add(new SPUNextDay());

		if (poundsOrOunces.equalsIgnoreCase("p")) {

			packageWeight = packageWeight * 16;

		}
		for (DeliveryDriver method : mail) {

			System.out.println(method.name() + " " + method.calculateRate(packageDistance, packageWeight));
		}

	}

}
