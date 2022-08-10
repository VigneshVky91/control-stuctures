package condiional_constructs;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input an alphabet:");
		char alphabet = scan.next().toLowerCase().charAt(0);
		//aeiou
		switch(alphabet) {
			case 'a':
				System.out.println("Vowel");
				break;
			case 'e':
				System.out.println("Vowel");
				break;
			case 'i':
				System.out.println("Vowel");
				break;
			case 'o':
				System.out.println("Vowel");
				break;
			case 'u':
				System.out.println("Vowel");
				break;
			
			default:
				System.out.println("Consonant");
		}
	}
}
