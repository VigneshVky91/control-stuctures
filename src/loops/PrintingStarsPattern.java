package loops;

import java.util.Scanner;

public class PrintingStarsPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the no of stars: ");
		int stars = scan.nextInt();
		
		for(int i=0; i< stars; i++) {
			for(int j=0; j< stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
