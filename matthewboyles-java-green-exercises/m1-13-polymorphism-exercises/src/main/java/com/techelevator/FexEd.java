package com.techelevator;

public class FexEd implements DeliveryDriver {

	private double distanceInMiles;
	private double weightInOunces;
	private double rate;
	private int weightInPounds;
	
	
//    rate = 20.00
//    if distance > 500 miles then rate = rate + 5.00
//    if weight > 48 ounces then rate = rate + 3.00
	
	@Override
	public double calculateRate(double distanceInMiles, double weightInOunces) {
		
		rate = 20.00;
		
		if (distanceInMiles > 500) {
			rate += 5.00;
		}
		if (weightInOunces > 48 || weightInPounds > 3) {
			rate += 3.00;
		}
		return rate;
}

	public double getDistanceInMiles() {
		return distanceInMiles;
	}

	public double getWeightInOunces() {
		return weightInOunces;
	}

	public double getRate() {
		return rate;
	}

}
