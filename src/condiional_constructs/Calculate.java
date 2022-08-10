package condiional_constructs;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		int units = 0;
		double unitCost = 0, totalAmount=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input no of units consumed:");
		units = scan.nextInt();
		
		if(units >= 500) {
			unitCost = 5.5;
		}
		else if(units >= 430) {
			unitCost = 4.3;
		}
		else if(units >= 350) {
			unitCost = 3;
		}
		else if(units > 250) {
			unitCost = 2.5;
		}
		else {
			unitCost = 1;
		}
		
		totalAmount = units * unitCost;
		
		System.out.println("Total units consumed: "+units);
		System.out.println("Per unit cost: "+unitCost);
		System.out.println("Total amount = "+totalAmount);
	}

}
