package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class EmployeeTest {

	
	
	Employee employee;
	
	@Before
	public void setUpBeforeClass()  {
		employee = new Employee("Matthew", "Boyles", 100000.00);
	}
////////////////////////////////////////////////////////////////////////
	
	
	@Test
	public void testIsAnnualSalaryCorrectAfterGettingRaise() {
		employee.RaiseSalary(3);
		Assert.assertEquals("Salary should be raised to raise amount given.", 103000.00, employee.getAnnualSalary(), 0.001);
	}
	
	@Test
	public void testPossibleToGetNegativeRaiseAmount() {
		
		
		employee.RaiseSalary(-3);
		Assert.assertEquals("Salary should be raised to raise amount given.", 100000.00, employee.getAnnualSalary(), 0.001);
	}

}

//Things to look/test for
//
//* is the annual salary correct after receiving a raise?
//* is it possible to give a non-negative raise amount?