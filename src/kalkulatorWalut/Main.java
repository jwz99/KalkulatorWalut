package kalkulatorWalut;

import java.util.Scanner;

/*
 * @author Julia Zielonka
 * 
 * Main
 *
 * 25.05.2021
 * 
 */

public class Main extends Calculator{
	
	public static void main(String[] args) {
		
		while(true) {
			//ask user for the euro value and chosen currency and get user input.  
			Scanner scanner = new Scanner(System.in); 
			Scanner scanner2 = new Scanner(System.in);
		    System.out.println("Enter the value in euro(please, use dots instead of commas)");
		    String euro_value = scanner.nextLine();  
		    System.out.println("Enter the currency");
		    String currency = scanner2.nextLine(); 
		    
		    try {
		    	
		    	//convert the given input.
		    	System.out.println(convert(Double.parseDouble(euro_value), currency));
		    }
		    //catch the exception if the number format is incorrect. 
		    catch(Exception nfe) 
		    {
		    	System.out.println("Could not read value or currency correctly");
		    }
		}
	}
}
