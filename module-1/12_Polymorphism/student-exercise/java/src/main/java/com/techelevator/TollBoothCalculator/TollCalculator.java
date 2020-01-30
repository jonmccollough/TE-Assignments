package com.techelevator.TollBoothCalculator;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

	public static void main(String[] args) {
		
		
		System.out.println("Vehicle\t\t\t\t Distance Traveled\t Toll$" );
		System.out.println("================================================================" );
		
		List<VehicleInterface> listOfVehicles = new ArrayList<VehicleInterface>();
		listOfVehicles.add(new Car(true) );
		listOfVehicles.add(new Car(false) );
		listOfVehicles.add(new Tank() );
		listOfVehicles.add(new Truck(4) );
		listOfVehicles.add(new Truck(6) );
		listOfVehicles.add(new Truck(8) );
		
		for ( VehicleInterface highway : listOfVehicles ) {
			
			int random = (int) (Math.random() * 240 + 10 ) - 10 ;
			
			System.out.println(highway.getType()+ " \t\t " + random + "\t\t\t $"+
			highway.calculateToll(random) );
			
		}
	
	}
}
