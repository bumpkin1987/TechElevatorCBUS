package com.techelevator;

public class PostalService implements DeliveryDriver {

	private double distanceInMiles;
	private double weightInOunces;
	private double firstClassRateOunces;
	private double secondClassRateOunces;
	private double thirdClassRateOunces;
	private double firstClassRatePounds;
	private double secondClassRatePounds;
	private double thirdClassRatePounds;
	private double totalFirstClassRate;
	private double totalSecondClassRate;
	private double totalThirdClassRate;
	private int weightInPounds;
	
	
	
	@Override
	public double calculateRate(double distanceInMiles, double weightInOunces) {
		if (weightInOunces >= 16) {
			weightInPounds = (int)weightInOunces / 16;
			weightInOunces = weightInOunces % 16;
		}
		
		if (weightInOunces < 16) {
			if (weightInOunces <= 2) {
			firstClassRateOunces = distanceInMiles * 0.035;
			secondClassRateOunces = firstClassRateOunces / 10;
			thirdClassRateOunces = distanceInMiles * 0.0020;
			} 
			else if (weightInOunces > 2 && weightInOunces <= 8) {
				firstClassRateOunces = distanceInMiles * 0.040;
				secondClassRateOunces = firstClassRateOunces / 10;
				thirdClassRateOunces = distanceInMiles * 0.0022;
			}
			else if (weightInOunces >8 && weightInOunces < 16) {
				firstClassRateOunces = distanceInMiles * 0.047;
				secondClassRateOunces = firstClassRateOunces / 10;
				thirdClassRateOunces = distanceInMiles * 0.0024;
			}		
		}
		
		if (weightInPounds >=1) {
			if (weightInPounds <= 3) {
				firstClassRatePounds = distanceInMiles * 0.195;
				secondClassRatePounds = firstClassRatePounds / 10;
				thirdClassRatePounds = distanceInMiles * 0.0150;
			} 
			else if (weightInPounds >=4 && weightInPounds <=8) {
				firstClassRatePounds = distanceInMiles * 0.450;
				secondClassRatePounds = firstClassRatePounds / 10;
				thirdClassRatePounds = distanceInMiles * 0.0160;
			}
			else if (weightInPounds >= 9) {
				firstClassRatePounds = distanceInMiles * 0.500;
				secondClassRatePounds = firstClassRatePounds / 10;
				thirdClassRatePounds = distanceInMiles * 0.0170;
			}
		}
		totalFirstClassRate = firstClassRateOunces + firstClassRatePounds;
		totalSecondClassRate = secondClassRateOunces + secondClassRatePounds;
		totalThirdClassRate = thirdClassRateOunces + thirdClassRatePounds;
		return 0;
	}
	
	public int getWeightInPounds() {
		return weightInPounds;
	}
	public double getDistanceInMiles() {
		return distanceInMiles;
	}
	public double getWeightInOunces() {
		return weightInOunces;
	}
	public double getTotalFirstClassRate() {
		return totalFirstClassRate;
	}
	public double getTotalSecondClassRate() {
		return totalSecondClassRate;
	}
	public double getTotalThirdClassRate() {
		return totalThirdClassRate;
	}

}
