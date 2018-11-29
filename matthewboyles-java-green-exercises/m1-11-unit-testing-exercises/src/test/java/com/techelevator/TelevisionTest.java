package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TelevisionTest {

	Television tv;
	
	@Before
	public void SetUp() {
		tv = new Television();
	}
	
	@Test
	public void testTVolumeReset() {
		tv.TurnOn();
		tv.RaiseVolume();
		tv.TurnOff();
		tv.TurnOn();
		Assert.assertEquals(2 , tv.getCurrentVolume());
		
	}
	@Test
	public void testRaiseVolume() {
		tv.TurnOn();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		tv.RaiseVolume();
		Assert.assertEquals("Expected volume to raise." , 10, tv.getCurrentVolume());

	}
	
	@Test
	public void testLowerVolume() {
		tv.TurnOn();
		tv.LowerVolume();
		tv.LowerVolume();
		tv.LowerVolume();
		Assert.assertEquals("Expected volume to raise." , 0, tv.getCurrentVolume());

	}

}



//Things to look/test for
//
//* are there boundaries on the volume limits?
//* does the volume correctly reset when turning the tv on?
//* are there unexpected side effects when changing the channel, turning it on/off, raising/lowering volume?