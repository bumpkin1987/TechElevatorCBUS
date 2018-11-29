package com.techelevator;

public class KataFizzBuzz {

	

		public String fizzBuzz(int n) {
			if (n < 1 || n > 100) {
				return "";
			}
			
			boolean isDivisibleBy3 = n % 3 == 0;
			boolean isDivisibleBy5 = n % 5 == 0;
			boolean contains3 = contains3(n);
			boolean contains5 = contains5(n);
			
			
			if (isDivisibleBy3 && isDivisibleBy5) {
				return "FizzBuzz";
			}
			
			else if (isDivisibleBy3 || contains3) {
				return "Fizz";
			}
			
			
			else if (isDivisibleBy5 || contains5) {
				return "Buzz";
			}
			
			else {
				return Integer.toString(n);
			}
		}
		
		///////////////////////////////////////////////
			
		private boolean contains3(int n) {
			
			if (Integer.toString(n).contains("3")) {
				return true;
			}
		
			return false;
		}
		
		///////////////////////////////////////////////
		
		private boolean contains5(int n) {
			
			if (Integer.toString(n).contains("5")) {
				return true;
			}
		
			return false;
		}
		
		public static void main(String[] args) {
		
			KataFizzBuzz fizzy = new KataFizzBuzz();
			
			for (int i = 0 ; i <= 100 ; i++) {
				System.out.println(fizzy.fizzBuzz(i));
			}	
	}
}
