package condiional_constructs;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		float marks;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input your marks: ");
		marks = scan.nextFloat();
		
		if(marks >=35 ) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
