package com.techelevator;
import java.util.Scanner;
public class PostageApp {

	public static void main(String[] args) {
		
		PostalService postal = new PostalService();
		SPU spu = new SPU();
		FexEd fexEd = new FexEd();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the weight of the package? ");
		String response = scanner.nextLine();
		double weight = Double.parseDouble(response);
		System.out.println("");
		
		System.out.print("(P)ounds or (O)unces? ");		
		String weightType = scanner.nextLine();
		System.out.println("");
		
		System.out.print("What is the distance in miles it will be travelling? ");	
		String response2 = scanner.nextLine();
		double miles = Double.parseDouble(response2);
		System.out.println("");
		
		if (weightType.equalsIgnoreCase("p")) {
			weight = weight * 16;		
		}
			postal.calculateRate(miles, weight);
			spu.calculateRate(miles, weight);
			fexEd.calculateRate(miles, weight);
			
			String line1 = String.format("Delivery Method %23s","$ Cost");
			String line2 = ("---------------------------------------");
			String line3 = String.format("Postal Service (1st Class) %6s%1.2f", "$", postal.getTotalFirstClassRate());
			String line4 = String.format("Postal Service (2nd Class) %6s%1.2f", "$",postal.getTotalSecondClassRate());
			String line5 = String.format("Postal Service (3rd Class) %6s%1.2f", "$",postal.getTotalThirdClassRate());
			String line6 = String.format("FexEd %27s%1.2f", "$",fexEd.getRate());
			String line7 = String.format("SPU (4-day ground) %14s%1.2f", "$",spu.getFourDayRate());
			String line8 = String.format("SPU (2-day business) %12s%1.2f", "$",spu.getTwoDayRate());
			String line9 = String.format("SPU (next-day) %18s%1.2f", "$",spu.getNextDayRate());
			
			
		
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(line4);
		System.out.println(line5);
		System.out.println(line6);
		System.out.println(line7);
		System.out.println(line8);
		System.out.println(line9);
		
		
	}

}
