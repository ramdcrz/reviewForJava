package reviewForJava;

import java.util.Scanner;

public class InputAndArithmeticOperators {

	public static void main(String[] args) {
		
		int x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Age: ");
		x = scan.nextInt();
		
		System.out.println("You are "+ x +" years old");
	}

}
