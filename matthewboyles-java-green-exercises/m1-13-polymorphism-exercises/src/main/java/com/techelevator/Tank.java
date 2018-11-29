package com.techelevator;

import java.util.Random;

public class Tank implements VehicleInterface {

	private String vehicleType = "Tank";
	private double distance;
	private double toll = 0;
	
	public Tank(double distance) {
		double start = 10;
		double end = 240;
		double random = new Random().nextDouble();
		double randomDistanceGenerator = start + (random * (end - start));
		this.distance = randomDistanceGenerator;
	}
	
	@Override
	public double calculateToll() {
		return toll;
	}
	
	public double getDistance() {
		return distance;
	}


	public double getToll() {
		return toll;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}

}

