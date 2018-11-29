package com.techelevator;
import java.util.LinkedHashMap;
import java.util.Map;

public class KataRomanNumerals {

	
	private String[] oneRoman = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	private String[] tenRoman = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXX", "XC"};
	private String[] hundredRoman = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	private String[] thousandRoman = new String[] {"", "M", "MM", "MMM"};
	
	
		
	public String convertToRoman (int n) {
			
			String ones;
			String tens;
			String hundred;
			String thousand;
			String total;
			int modSwitch;
			
			
			
			
			tens = tenRoman[n/10];
			ones = oneRoman[n % 10];
		
		total = tens + ones;
			
		return total;
	}
	
	
}
