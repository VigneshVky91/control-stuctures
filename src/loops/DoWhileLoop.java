package loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your name: ");
		String name = scan.next();
		System.out.println("Enter no of times to print: ");
		int nums = scan.nextInt();
		
		int counter = 0;
		do {
			System.out.println(name+" : "+(counter+1));
			counter++;
//			counter = counter+1
		}while(counter<nums);
		
	}
}
