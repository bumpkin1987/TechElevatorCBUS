package com.techelevator;
import java.util.Scanner;
/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int firstNum = 0;
		int secondNum = 1;
		String startingNums = "0, 1";

		System.out.println("Please enter the Fibonacci number: ");

		int upperBoundNum = input.nextInt();

		System.out.print(startingNums);
		while (sum < upperBoundNum) {
			sum = firstNum + secondNum;

			if (sum < upperBoundNum) {
				System.out.print(", " + sum);
				firstNum = secondNum;
				secondNum = sum;
				
			}
		}

		System.out.println();
	}

	}


