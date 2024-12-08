package reviewForJava;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {

		float numOne;
		float numTwo;
		float result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Num 1: ");
		numOne = s.nextFloat();
		
		System.out.print("Num 2: ");
		numTwo = s.nextFloat();
		
		result = numOne + numTwo;
		
		System.out.println();
		System.out.print("Result: " + result);
		


	}

}
