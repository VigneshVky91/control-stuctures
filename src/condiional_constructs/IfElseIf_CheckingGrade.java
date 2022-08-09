package condiional_constructs;

import java.util.Scanner;

public class IfElseIf_CheckingGrade {

	public static void main(String[] args) {
		float marks;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your marks: ");
		
		marks = scan.nextFloat();
		
		if(marks >=90 && marks <=100) {
			System.out.println("Distinction");
		}
		else if(marks >= 80 && marks <90) {
			System.out.println("First class");
		}
		else if(marks >= 60 && marks <80) {
			System.out.println("Second class");
		}
		
		else if(marks >= 35 && marks <60) {
			System.out.println("Pass");
		}
		else if(marks < 35 && marks >=0 ) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
