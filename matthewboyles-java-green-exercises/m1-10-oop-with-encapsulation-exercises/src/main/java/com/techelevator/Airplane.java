package com.techelevator;

public class Airplane {
	
	private String planeNumber;             
	
	private int totalFirstClassSeats;
	private int bookedFirstClassSeats;     
	private int availableFirstClassSeats ;
	               
	private int bookedCoachSeats;        
	private int totalCoachSeats;            
	private int availableCoachSeats;   
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.totalCoachSeats = totalCoachSeats;
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats ;
		availableFirstClassSeats = getAvailableFirstClassSeats();
		availableCoachSeats = getAvailableCoachSeats();
	}
	public boolean reserveSeats( boolean forFirstClass, int totalNumberOfSeats) {
		if(forFirstClass && availableFirstClassSeats - totalNumberOfSeats >= 0) {
			bookedFirstClassSeats = (totalFirstClassSeats - availableFirstClassSeats) + totalNumberOfSeats;
			return true;
		}
		else if(!forFirstClass && availableFirstClassSeats - totalNumberOfSeats >= 0) {
			bookedCoachSeats = (totalCoachSeats - availableCoachSeats) + totalNumberOfSeats;
			return true;
		}
		return false;
	}
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
}
	
//
//*Notes**
//- `reserveSeats()` is a method
//    - if firstClass is true, reserve the value for `totalNumberOfSeats` for first class
//    - if firstClass is false, reserve the value for `totalNumberOfSeats` for coach
//    - return `true` if the reservation can be made, `false` if it cannot