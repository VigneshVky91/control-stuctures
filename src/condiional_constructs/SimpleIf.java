package condiional_constructs;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
//		int age;
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter your age: ");
//		age = scan.nextInt();
//		
//		if(age>=18) {
//			System.out.println("You can vote!");
//		}
		
		float marks;
		System.out.println("Input your marks: ");
		marks = scan.nextFloat();
		
		if(marks >= 35) {
			System.out.println("Pass");
		}
	}
}
