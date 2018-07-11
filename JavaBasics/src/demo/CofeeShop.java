package demo;

import java.util.Scanner;

public class CofeeShop {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("What size of Coffee would you like to have - Small/Medium/Large?");
		String userInput = k.nextLine();
		
		if(userInput.equals("Small")) {
			System.out.println("Price = $1");
		}
		//Adding a comment in line number 16
		else if(userInput.equals("Medium")) {
			System.out.println("Price = $1.5");
		}
		
		else {
			System.out.println("Price = $2"); 
		}
		
	}

}
