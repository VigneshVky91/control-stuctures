package loops;

import java.util.Scanner;

public class WithLoops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your name:");
		String name = scan.next();
		System.out.println("Input number of times to print your name: ");
		int no_of_times = scan.nextInt();
//		k++ ---> k=k+1
		for(int k=0; k< no_of_times; k++) {
			System.out.println((k+1)+" : "+name);
		}
	}
}
