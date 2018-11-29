package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class AirplaneTest {
	
	
//	## Airplane ( 4 , 4 )  
			//"message saying what was expected" , value of what was expected , call to the method(being tested)
//	@Before uses object for each test
//		-make the object to be used
//		
//	@Test -- method you are testing
//	
//	Things to look/test for
//
//	* is it possible to overbook seats?  first and coach
//	* is the count for available seats accurate? first and coach
//	* is the count accurate after successfully booking a seat? 
	
	private Airplane myAirplane;
	@Before
	public void Constructor() {
		myAirplane = new Airplane(4,4);
	}
	
	@Test
	public void testConstructor() {
		Assert.assertNotNull("Expected myAirplane to be instantiated" , myAirplane);
		Assert.assertEquals("Expected total number of seats in FirstClass",  4    ,  myAirplane.getTotalFirstClassSeats() );
		Assert.assertEquals("Expected total number of seats in CoachClass", 4 , myAirplane.getTotalCoachSeats());
	}
	
	@Test
	public void ShouldNotOverBookFirstClassSeats() {
		Assert.assertEquals("Cannot book first class seats beyond total available seats", false , myAirplane.Reserve(true, 5));
		Assert.assertEquals("Cannot book first class seats beyond total available seats", true , myAirplane.Reserve(true, 2));
		
	}
	
	@Test
	public void ShouldNotOverBookCoachSeats() {
		Assert.assertEquals("Can not book coach seats beyond total available seats", false , myAirplane.Reserve(false, 5));
		Assert.assertEquals("Can not book coach seats beyond total available seats", true , myAirplane.Reserve(false, 2));
		
	
	}
	@Test
	public void ShouldNotMissCountAvailableSeats() {
		myAirplane.Reserve(true, 2);
		Assert.assertEquals("Needed to check on count of available first class seats", 2 , myAirplane.getAvailableFirstClassSeats());
		myAirplane.Reserve(false, 2);
		Assert.assertEquals("Available first class seats returned wrong number", 2, myAirplane.getAvailableCoachSeats());
		
		
	}
	
	@Test
	public void AvailbleFirstClassSeatsAndBookedSeatsCountAccurate() {
		Assert.assertEquals("Can not book First class seats beyond total available seats", true , myAirplane.Reserve(true, 2));
		Assert.assertEquals("Can not book First class seats beyond total available seats", false , myAirplane.Reserve(true, 5));
		
	}
	
	@Test
	public void AvailbleCoachSeatsAndBookedSeatsCountAccurate() {
		Assert.assertEquals("Can not book coach seats beyond total available seats", true , myAirplane.Reserve(false, 2));
		Assert.assertEquals("Can not book coach seats beyond total available seats", false , myAirplane.Reserve(false, 5));
		
	}
	
	
}










