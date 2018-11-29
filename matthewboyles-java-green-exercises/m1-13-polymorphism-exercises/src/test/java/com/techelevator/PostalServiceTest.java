package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class PostalServiceTest {
	
	FexEd fex;
	SPU spu;
	PostalService post;
	
	@Before
	public void setup() {
		fex = new FexEd();
		spu = new SPU();
		post = new PostalService();
	}
	@Test
	public void test_fexed_calculate_rate_method() {
		fex.calculateRate(340, 15);
		Assert.assertEquals("Calculate rate method does not calculate properly " , 20.00, fex.getRate());
		fex.calculateRate(501, 15);
		Assert.assertEquals("Calculate rate does not include over 500 mile charge ", 25.00, fex.getRate());
		fex.calculateRate(500, 49);
		Assert.assertEquals("Calculate rate does not include over 48 ounce charge ", 23.00, fex.getRate());
		fex.calculateRate(501, 49);
		Assert.assertEquals("Calculate rate does not combine rate, mile, and ounce charges ", 28.00, fex.getRate());
		fex.calculateRate(0, 49);
		Assert.assertEquals("Calculate rate does not return zero with no mileage ", 0.00, fex.getRate(), .01);
		
	}
	@Test
	public void test_spu_calculate_rate_method() {
		spu.calculateRate(340, 15);
		Assert.assertEquals("Calculate rate method 4-day ground does not calculate properly ", 1.59,spu.getFourDayRate(), .01);
		Assert.assertEquals("Calculate rate 2-day business does not calculate properly ", 15.94, spu.getTwoDayRate(), .01);
		Assert.assertEquals("Calculate rate method next-day does not calculate properly ", 23.91, spu.getNextDayRate(), .01);
	}
	@Test
	public void test_postal_service_rate_0_2_ounces() {
		post.calculateRate(100, 2);
		Assert.assertEquals("First Class rate between 0-2 ounces ", 3.5, post.getTotalFirstClassRate(), .01);
		post.calculateRate(100, 2);
		Assert.assertEquals("Second Class rate between 0-2 ounces ", .35, post.getTotalSecondClassRate(), .01);
		post.calculateRate(100, 2);
		Assert.assertEquals("Third Class rate between 0-2 ounces ", .20, post.getTotalThirdClassRate(), .01);
	}
	@Test
	public void test_postal_service_rate_3_8_ounces() {	
		post.calculateRate(100, 2.01);
		Assert.assertEquals("First Class rate between 3-8 ounces ", 4.0, post.getTotalFirstClassRate(), .01);
		post.calculateRate(100, 2.01);
		Assert.assertEquals("Second Class rate between 3-8 ounces ", .40, post.getTotalSecondClassRate(), .01);
		post.calculateRate(100, 2.01);
		Assert.assertEquals("Third Class rate between 3-8 ounces ", .22, post.getTotalThirdClassRate(), .01);
	}
	@Test
	public void test_postal_service_rate_9_15_ounces() {	
		post.calculateRate(100, 8.01);
		Assert.assertEquals("First Class rate between 9-15 ounces ", 4.70, post.getTotalFirstClassRate(), .01);
		post.calculateRate(100, 8.01);
		Assert.assertEquals("Third Class rate between 9-15 ounces ", .47, post.getTotalSecondClassRate(), .01);
		post.calculateRate(100, 8.01);
		Assert.assertEquals("Third Class rate between 9-15 ounces ", .24, post.getTotalThirdClassRate(), .01);
	}
	@Test
	public void test_postal_service_rate_1_3_pounds() {	
		post.calculateRate(100, 16);
		Assert.assertEquals("First Class rate between 1-3 pounds ", 19.50, post.getTotalFirstClassRate(), .01);
		post.calculateRate(100, 16);
		Assert.assertEquals("Second Class rate between 1-3 pounds ", 1.95, post.getTotalSecondClassRate(), .01);
		post.calculateRate(100, 16);
		Assert.assertEquals("Third Class rate between 1-3 pounds ", 1.50, post.getTotalThirdClassRate(), .01);
		post.calculateRate(0, 0);
	}
	@Test
	public void test_postal_service_rate_4_8_pounds() {
		post.calculateRate(100, 64);
		Assert.assertEquals("Third Class rate between 4-8 pounds ", 45.00, post.getTotalFirstClassRate(), .01);
		post.calculateRate(100, 64);
		Assert.assertEquals("Third Class rate between 4-8 pounds ", 4.50, post.getTotalSecondClassRate(), .01);
		post.calculateRate(100, 64);
		Assert.assertEquals("Third Class rate between 4-8 pounds ", 1.60, post.getTotalThirdClassRate(), .01);
	}	
	@Test
	public void test_postal_service_rate_9_or_more_pounds() {	
		post.calculateRate(100, 144);
		Assert.assertEquals("Third Class rate 9+ pounds ", 50.00, post.getTotalFirstClassRate(), .01);
		post.calculateRate(100, 144);
		Assert.assertEquals("Third Class rate 9+ pounds ", 5.00, post.getTotalSecondClassRate(), .01);
		post.calculateRate(100, 144);
		Assert.assertEquals("Third Class rate 9+ pounds ", 1.70, post.getTotalThirdClassRate(), .01);
		
		
		
		
	}

}
