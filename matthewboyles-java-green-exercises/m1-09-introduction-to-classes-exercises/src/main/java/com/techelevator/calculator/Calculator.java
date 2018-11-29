package com.techelevator.calculator;

public class Calculator {

	private int currentValue = 0;
	
	public int getCurrentValue() {
		return currentValue;
	}
	
	public int add(int addend) {
		this.currentValue = currentValue + addend;
		return currentValue;
	}
	
	
	public int multiply(int multiplier) {
		this.currentValue = currentValue * multiplier;
		return currentValue;
	}
	
	
	public int subtract(int subtrahend) {
		this.currentValue = currentValue - subtrahend;
		return currentValue;
	}
	
	
	public int power(int exponent) {
		this.currentValue = (int)Math.pow(currentValue, exponent);
		return currentValue;
	}
	
	
	public void reset() {
		currentValue = 0;
	}
}
