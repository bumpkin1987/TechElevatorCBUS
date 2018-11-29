package com.techelevator;

import java.util.Random;

public class Truck implements VehicleInterface {

	private String vehicleType = "Truck";
	private int numAxles;
	private double distance;
	private double toll;
	
	public Truck(double distance , int numAxles) {
		this.numAxles = numAxles;
		double start = 10;
		double end = 240;
		double random = new Random().nextDouble();
		double randomDistanceGenerator = start + (random * (end - start));
		this.distance = randomDistanceGenerator;
	}
	
	
	@Override
	public double calculateToll() {
		if ( distance > 0) {
			if (numAxles >= 8 && numAxles % 2 == 0) {
				toll = distance * 0.048;
			}
			else if (numAxles == 6 && numAxles % 2 == 0) {
				toll = distance * 0.045;
			}
			else if (numAxles == 4 && numAxles % 2 == 0) {
				toll = distance * 0.040;
			}
		}
		return toll;
	}
	
	public int getNumAxles() {
		return numAxles;
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





