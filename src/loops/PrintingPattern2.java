package loops;

import java.util.Scanner;

public class PrintingPattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num = scan.nextInt();
		
		for(int i=num; i>0; i--) {
			for(int j=0; j < num; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
