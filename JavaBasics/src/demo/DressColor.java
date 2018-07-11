package demo;

import java.util.Scanner;

public class DressColor {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter the day -");
		String day = k.nextLine();
		
		switch(day) {
		case "Monday":
			System.out.println("Wear a white color dress");
			break;
			
		case "Tuesday":
			System.out.println("Wear a red dress");
			break;
			
		case "Wednesday":
			System.out.println("Wear a yellow dress");
			break;
			
		case "Thursday":
			System.out.println("Wear an orange dress");
			break;
			
		case "Friday":
			System.out.println("Wear a peach dress");
			break;
			
		case "Saturday":
			System.out.println("Wear a black dress");
			break;
			
		case "Sunday":
			System.out.println("Wear a golden dress");
			break;
			
			default:
				System.out.println("Please enter a valid input");
		}
	}

}
