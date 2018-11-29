package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		
		try {
			String path = "fizzyBuzz.txt";
			File buzzFile = new File(path);
			Scanner fileInput = new Scanner(buzzFile);
			int j = 1;
			int counter = 1;
			
			String fileName = "Numbers" + j + ".txt";
			File file = new File(fileName);
			PrintWriter writer = new PrintWriter(fileName);
			
			try {
				file.createNewFile();
			} catch (IOException e1) {
				System.out.println("File does not exist");
				e1.printStackTrace();
			}
			
			while (fileInput.hasNextLine()) { 
				String line = fileInput.nextLine();
				writer.println(line);
				if (counter % 100 == 0 && counter < 250) {
					writer.close();
					j++;
					fileName = "Numbers" + j + ".txt";
					file = new File(fileName);
					writer = new PrintWriter(file);
					try {				
						file.createNewFile();					
					} catch (IOException e) {
						System.out.println("File does not exist.");
						e.printStackTrace();
					}
				}
				else if (counter == 250) {
					writer.close();
				}
				counter++;
			}
		}catch (FileNotFoundException e) {		
		}
	}
}
