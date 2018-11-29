package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class ElevatorTest {
	
	Elevator elevator;
	
	@Before
	public void setup() {
		elevator = new Elevator(1,10);
	}
	
	@Test
	public void VerifyDoorIsOpen() {
		//arrange
		//action
		elevator.OpenDoor();
		//assert
		Assert.assertEquals("Door was closed", true , elevator.OpenDoor());
	}
	@Test public void VerifyDoorIsClosed() {
		//arrange
		//action
		elevator.OpenDoor();
		elevator.CloseDoor();
		//assert
		Assert.assertEquals("Door was closed", false , elevator.CloseDoor());
	}



	@Test
	public void go_up_from_floor_1() {
	//arrange
		elevator.CloseDoor();
	//act
		elevator.GoUp(10);
	//Assert
		
		Assert.assertEquals(10 ,  elevator.getCurrentLevel());
	}
	
	@Test
	public void go_down_from_floor_10() {
	//arrange
		
		elevator.GoUp(10);
		elevator.CloseDoor();
	//act
		elevator.GoDown(9);
	//Assert
		
		Assert.assertEquals("Expected to go down to first floor", 1 ,  elevator.getCurrentLevel());
	}

}

//Things to look/test for
//
//* unintended side effects when calling methods
//* moving between floors when the doors are open
//* going up past the ceiling
