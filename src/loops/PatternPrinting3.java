package loops;

import java.util.Scanner;

public class PatternPrinting3 {

	public static void main(String[] args) {
		System.out.println("Input Num:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
