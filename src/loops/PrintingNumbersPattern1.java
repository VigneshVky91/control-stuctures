package loops;

import java.util.Scanner;

public class PrintingNumbersPattern1 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num_times = scan.nextInt();
		
//		for(int i=0; i< num_times; i++) {
//			for(int j=1; j<=num_times; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		for(int i=0; i< num_times; i++) {
			for(int j=num_times; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
