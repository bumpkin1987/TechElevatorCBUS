package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;


public class KataFizzBuzzTest {
	
	@Test
	public void testFizzBuzzConstructor() {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertNotNull(fizzBuzz);
	}
	
	@Test
	public void testNumberOutOfRange () {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
	    Assert.assertEquals("Expected an empty String", "", fizzBuzz.fizzBuzz(1000));
	    Assert.assertEquals("Expected an empty String", "", fizzBuzz.fizzBuzz(-10));
	}
	
	@Test
	public void testDivisibleBy3 () {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertEquals("Expected Fizz", "Fizz", fizzBuzz.fizzBuzz(3));
	}
	
	@Test
	public void testDivisibleBy5 () {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertEquals("Expected Buzz", "Buzz", fizzBuzz.fizzBuzz(5));
	}	
	
	@Test
	public void testDivisibleBy5and3 () {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertEquals("Expected Buzz", "FizzBuzz", fizzBuzz.fizzBuzz(30));
		Assert.assertEquals("Expected Buzz", "FizzBuzz", fizzBuzz.fizzBuzz(15));

	}		
	
	@Test
	public void testContains3 () {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertEquals("Expected Buzz", "Fizz", fizzBuzz.fizzBuzz(43));
		Assert.assertEquals("Expected Buzz", "Fizz", fizzBuzz.fizzBuzz(31));
		Assert.assertEquals("Expected Buzz", "Fizz", fizzBuzz.fizzBuzz(37));

	}	

	

	
	
	
	@Before
	public void setup() {
		
	}
	
	@Test
	public void testFizzBuzzConstructor() {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertNotNull(fizzBuzz);
	}
	
	@Test
	public void testNumberOutOfRange() {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		// any number outside boudaries should return as empty string
		Assert.assertEquals("Expected an empty string", "" , fizzBuzz.fizzBuzz(1000));
		Assert.assertEquals("Expected an empty string", "" , fizzBuzz.fizzBuzz(-10));
		
	}
	
	@Test
	public void testDivisibleBy3() {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertEquals("Expected Fizz", "Fizz" , fizzBuzz.fizzBuzz(3));
		Assert.assertEquals("Expected Fizz", "Fizz" , fizzBuzz.fizzBuzz(12));
		Assert.assertEquals("Expected Fizz", "Fizz" , fizzBuzz.fizzBuzz(27));
	}
	
	@Test
	public void testDivisibleBy5() {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertEquals("Expected Buzz", "Buzz" , fizzBuzz.fizzBuzz(5));
		Assert.assertEquals("Expected Buzz", "Buzz" , fizzBuzz.fizzBuzz(10));
		Assert.assertEquals("Expected Buzz", "Buzz" , fizzBuzz.fizzBuzz(20));
	}
	
	@Test
	public void testDivisibleByBoth() {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertEquals("Expected FizzBuzz", "FizzBuzz" , fizzBuzz.fizzBuzz(45));
		Assert.assertEquals("Expected FizzBuzz", "FizzBuzz" , fizzBuzz.fizzBuzz(15));
		Assert.assertEquals("Expected FizzBuzz", "FizzBuzz" , fizzBuzz.fizzBuzz(30));
	}
	
	@Test
	public void testContains3() {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertEquals("Expected Fizz", "Fizz" , fizzBuzz.fizzBuzz(13));
		
	}
	
	@Test
	public void testContains5() {
		KataFizzBuzz fizzBuzz = new KataFizzBuzz();
		Assert.assertEquals("Expected Buzz", "Buzz" , fizzBuzz.fizzBuzz(25));
		
	}
}
