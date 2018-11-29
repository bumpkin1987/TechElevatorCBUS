package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//Assert.assertEquals(message , what it should be, what it is after i.e. airpplane.getSomething that figures out the value.)

public class FruitTreetest {

	

	@Test
	public void testConstructor() {
		FruitTree fruity = new FruitTree("Apple" , 10);  // creation of fruity to be checked
		Assert.assertNotNull("Expected fruity to be instantiated." , fruity); // checks to see if fruity exists.
		Assert.assertEquals("Value of fruit was expected to be ", 10 ,  fruity.getPiecesOfFruitLeft());
		Assert.assertEquals("The type of fruit was expected to be ", "Apple" , fruity.getTypeOfFruit());
	}
	
	@Test
	public void testPickFruit() {
		FruitTree fruity = new FruitTree("Apple" , 10);
		Assert.assertEquals("Picking 8 apples should return true " , true , fruity.PickFruit(8));
		Assert.assertEquals("Picking 15 apples should return false. " , false , fruity.PickFruit(5));
		FruitTree fruity2 = new FruitTree("Apple" , 10);
		Assert.assertEquals("Picking 10 apples should return true, with 0 apples left. ", true, fruity2.PickFruit(10));
	}

}
