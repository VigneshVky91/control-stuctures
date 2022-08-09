package condiional_constructs;

import java.util.Scanner;

public class NestedIfToCheckGrades {

	public static void main(String[] args) {
		float marks;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input marks: ");
		marks = scan.nextFloat();
		
		if(marks <=100 && marks >=0) {
			if(marks>90) {
				System.out.println("Distinction");
			}
			else if(marks >80) {
				System.out.println("First class");
			}
			else if(marks >60) {
				System.out.println("Second class");
			}
			else {
				System.out.println("Fail");
			}
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
