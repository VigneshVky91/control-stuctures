package condiional_constructs;

import java.util.Scanner;

public class NestedIfComparingThreeStudents {

	public static void main(String[] args) {
		float mark1, mark2, mark3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the marks of three students: ");
		mark1 = scan.nextFloat();
		mark2 = scan.nextFloat();
		mark3 = scan.nextFloat();
		
		if(mark1 > mark2) {
			if(mark1>mark3) {
				System.out.println("Mark1 is the greatest");
			}
			else {
				System.out.println("Mark3 is the greatest");
			}
		}
		else {
			if(mark2 >  mark3) {
				System.out.println("Mark2 is the greatest");
			}
			else {
				System.out.println("Mark3 is the greatest");
			}
		}
	}
}
