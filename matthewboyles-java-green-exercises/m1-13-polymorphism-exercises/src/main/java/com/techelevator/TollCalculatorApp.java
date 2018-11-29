package com.techelevator;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TollCalculatorApp {

	public static void main(String[] args) {
		
		List<VehicleInterface> transport = new ArrayList<VehicleInterface>(); // made a list and added vehicle elements to that list.
		
		Car car = new Car(0 , true);   //random miles 10 - 240 , whether has trailer or not.
		Tank tank = new Tank(0);
		Truck truck = new Truck(0 , 6);
		
		transport.add(car);
		transport.add(tank);
		transport.add(truck);
		
		
		String vehicle = "Vehicle";
		String distanceTraveled = "Distance Traveled";
		String tollAmount = " Toll";
		
		System.out.println(String.format("%-29s  %-15s %-10s" , vehicle , "$" + tollAmount , distanceTraveled ));
		System.out.println("----------------------------------------------------------------");
		
		double totalMiles = 0;
		double totalRevenue = 0.00d;
		for (VehicleInterface ride : transport) {
			totalMiles += ride.getDistance();
			totalRevenue += ride.calculateToll();
			System.out.printf("%-30s %s%-14.2f %-20.2f %n", ride.getVehicleType(),  "$",ride.calculateToll(), ride.getDistance());
			
		}
		DecimalFormat text = new DecimalFormat("0.##");
		System.out.println("");
		System.out.println("Total Miles Traveled: " + text.format(totalMiles) + " mi");
		System.out.println("Total Revenue: $" + text.format(totalRevenue));

	}

}


//Scanner myScanner = new Scanner(System.in);
//System.out.println("What type of vehicle are you driving?"); //  asking for vehicle type input.
//String vehicleType = myScanner.nextLine();                   //

//	if (vehicleType.equalsIgnoreCase("car")) {
//		car.getDistance();
//		System.out.println("Does your car have a trailer connected as well?");
//		if (vehicleType.equalsIgnoreCase("yes")) {
//			boolean trailer = car.isHasTrailer(); 
//			//car.calculateToll();
//			//print something?
//		}
//		else if (vehicleType.equalsIgnoreCase("no")) {
//			boolean trailer = car.isHasTrailer();
//			car.calculateToll();
//			//print out something?
//		}
//			
//	}
//	else if(vehicleType.equalsIgnoreCase("tank")) {
//		tank.getDistance();
//		tank.calculateToll();
//		//print out something?
//	}
//	else if (vehicleType.equalsIgnoreCase("truck")) {
//		truck.getDistance();
//		System.out.println("How many axles does your truck have?");
//		truck.getNumAxles();
//		truck.calculateToll();
//	}
//	else {
//		System.out.println("Invalid input.");
//	}
