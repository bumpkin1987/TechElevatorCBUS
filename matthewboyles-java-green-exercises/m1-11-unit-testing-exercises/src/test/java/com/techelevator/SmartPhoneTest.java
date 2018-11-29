package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SmartPhoneTest {

	SmartPhone smartPhone;
	
	@Before
	public void setUp() {
		smartPhone = new SmartPhone("61486753099", "Sprint");
	}
	
	@Test
	public void testBatteryDrain() {
		smartPhone.Call("6148854930", 50);
		Assert.assertEquals(50, smartPhone.getBatteryCharge());
		smartPhone.Call("6148854930", 200);
		Assert.assertEquals(0, smartPhone.getBatteryCharge());

	}
	
	@Test
	public void testRecharge() {
		smartPhone.RechargeBattery();
		Assert.assertEquals(100, smartPhone.getBatteryCharge());
		
	}
	
	@Test
	public void testStateOfCall() {
		smartPhone.AnswerPhone();
		Assert.assertEquals(true, smartPhone.isOnCall());
		smartPhone.HangUp();
		Assert.assertEquals(false, smartPhone.isOnCall());
	}


}



//Things to look/test for
//
//* does the battery return to 100% after recharging?
//* are there any methods that change the state of the object when repeatedly called?
//* is it possible to spend too much time on a call that there isn't enough battery power remaining?
//* what happens if we dial a 7-digit number and not a 10 digit number?