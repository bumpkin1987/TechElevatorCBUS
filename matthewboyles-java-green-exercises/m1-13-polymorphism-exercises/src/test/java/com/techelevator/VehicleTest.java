package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class VehicleTest {
	
	private Car myCar2;
	private Car myCar;
	private Tank myTank;
	private Truck myTruck;
	
	@Before
	public void SetUp() {
		myCar = new Car(100 , false);
		myCar2 = new Car(100, true);
		
		
	}
	
////////////////CAR/////////////////////////////////////////

	@Test
	public void testCarTollWithOutTrailer() {
		Assert.assertEquals(2.0 , myCar.calculateToll());
	}
	@Test
	public void testCarTollWithTrailer() {
		Assert.assertEquals(3.0, myCar2.calculateToll());
	}
	@Test
	public void testCarTollNegDistance() {
		Car testCar = new Car(-100, false);
		Assert.assertEquals(0.0 , testCar.calculateToll());
	}
////////////////////Truck/////////////////////////////////////
	
	@Test
	public void testTruckTollNegDistanceAndDifferentNumAxles() {
		Truck truck = new Truck(-100 , 4);
		Assert.assertEquals(0.0 , truck.calculateToll());
		Truck truck2 = new Truck(-100 , 6);
		Assert.assertEquals(0.0 , truck.calculateToll());
		Truck truck3 = new Truck(-100 , 8);
		Assert.assertEquals(0.0 , truck.calculateToll());
		Truck truck4 = new Truck(-100 , 10);
		Assert.assertEquals(0.0 , truck.calculateToll());
		
	}
	
	@Test
	public void testTruckTollDifferentNumAxles() {
		Truck truck = new Truck(100 , 4);
		Assert.assertEquals(4.0 , truck.calculateToll() , 0.001);
		Truck truck2 = new Truck(10 , 6);
		Assert.assertEquals(0.45 , truck2.calculateToll() , 0.001);
		Truck truck3 = new Truck(100 , 8);
		Assert.assertEquals(4.80 , truck3.calculateToll() , 0.001);
		Truck truck4 = new Truck(10 , 10);
		Assert.assertEquals(0.48 , truck4.calculateToll() , 0.001);
		
	}
////////////////////Tank//////////////////////////////////////////	
	
	@Test
	public void testTankTollNegDistance() {
		Tank tank = new Tank(-100);
		Assert.assertEquals(0.0 , tank.calculateToll());
	}
	
	@Test
	public void testTankCalculateToll() {
		Tank tank2 = new Tank(100);
		Assert.assertEquals(0.0 , tank2.calculateToll());
	}

}
