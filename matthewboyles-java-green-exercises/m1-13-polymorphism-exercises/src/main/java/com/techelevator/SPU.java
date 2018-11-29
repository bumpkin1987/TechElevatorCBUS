package com.techelevator;

public class SPU implements DeliveryDriver {
	
	private double distanceInMiles;
	private double weightInOunces;
	private double fourDayRate;
	private double twoDayRate;
	private double nextDayRate;
	private double weightInPounds;
	

	@Override
	public double calculateRate(double distanceInMiles, double weightInOunces) {
		
		weightInPounds = (weightInOunces / 16);
		fourDayRate = (weightInPounds * 0.0050) * distanceInMiles;
		twoDayRate = fourDayRate * 10;
		nextDayRate = (weightInPounds * 0.075) * distanceInMiles;
		

		return 0;
	}

	public double getDistanceInMiles() {
		return distanceInMiles;
	}

	public double getWeightInOunces() {
		return weightInOunces;
	}

	public double getFourDayRate() {
		return fourDayRate;
	}

	public double getTwoDayRate() {
		return twoDayRate;
	}

	public double getNextDayRate() {
		return nextDayRate;
	}

}
