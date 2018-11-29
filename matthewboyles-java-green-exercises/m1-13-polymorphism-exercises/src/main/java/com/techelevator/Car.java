package com.techelevator;

import java.util.Random;

public class Car implements VehicleInterface {

	private String vehicleType = "Car";
	private boolean hasTrailer = true;
	private double distance;
	private double toll;
	
	
	public Car(double distance , boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
		double start = 10;
		double end = 240;
		double random = new Random().nextDouble();
		double randomDistanceGenerator = start + (random * (end - start));
		this.distance = randomDistanceGenerator;
	}
	
	@Override
	public double calculateToll() {
		
		if (distance > 0 && hasTrailer) {
			toll = distance * 0.020;
			return toll += 1.00;
		}
		else if (distance > 0 && !hasTrailer) {
			return toll = distance * 0.020;
		}
		return 0;
	}
	
	public boolean isHasTrailer() {
		return hasTrailer;
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
