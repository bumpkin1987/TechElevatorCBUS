package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {
	
	
	
	public String fizzBuzz(int n) {
		if (n < 1 || n > 300) {
			return "";
		}			
		boolean isDivisibleBy3 = n % 3 == 0;
		boolean isDivisibleBy5 = n % 5 == 0;
		boolean contains3 = Integer.toString(n).contains("3");
		boolean contains5 = Integer.toString(n).contains("5");
			
			
		if (isDivisibleBy3 && isDivisibleBy5) {
			return "FizzBuzz";
		}
			
		else if (isDivisibleBy3 || contains3) {
			return "Fizz";
		}
			
		else if (isDivisibleBy5 || contains5) {
			return "Buzz";
		}
			
		return Integer.toString(n);	
	}

	public static void main(String[] args) {
		
		FizzWriter buzz = new FizzWriter();
		
		File fizzyFile = new File("fizzyBuzz.txt");
			
		try {
			fizzyFile.createNewFile();
			PrintWriter writtenWord = new PrintWriter(fizzyFile);
			for (int i = 1 ; i <= 300 ; i++) {
				writtenWord.println(buzz.fizzBuzz(i));;
			}
		writtenWord.close();
		}	
		   catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("absolutePath: "+ fizzyFile.getAbsolutePath());
		System.out.println("size : "+ fizzyFile.length());
	}
	
	
}


//		/* ************************
//		 * CREATING A FILE 
//		 * ************************/
//		
//		System.out.println();
//		System.out.println("Now let's put a file in the directory.");
//		System.out.print("Enter a name for the new file >>> ");
//		String fileName = userInput.nextLine();
//		File newFile = new File(newDirectory, fileName);
//		
//		newFile.createNewFile();
//		System.out.println();
//		System.out.println("name: "+newFile.getName());
//		System.out.println("absolutePath: "+newFile.getAbsolutePath());
//		System.out.println("size : "+newFile.length());
//		
//		 
//		/* ************************
//		 * WRITING TO A FILE 
//		 * ************************/
//		
//		System.out.println();
//		System.out.println("Now let's write something in the new file.");
//		System.out.print("Enter a message to be stored in the new file >>> ");
//		String message = userInput.nextLine();
//		
//		try(PrintWriter writer = new PrintWriter(newFile)) {
//			writer.println(message);
//		} // When we exit the try block, this cause the file to be closed and an automatic flush of the buffer to trigger
//		
//		System.out.println();
//		System.out.println("name: "+newFile.getName());
//		System.out.println("absolutePath: "+newFile.getAbsolutePath());
//		System.out.println("size : "+newFile.length());
		
		
	


