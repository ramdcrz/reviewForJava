import java.util.Scanner;

public class JavaTutorial3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOne;
        int numTwo;
        int add, subtract, multiply, divide, modulus;

        System.out.print("Num 1: ");
        numOne = input.nextInt();

        System.out.print("Num 2: ");
        numTwo = input.nextInt();

        add = numOne + numTwo;
        subtract = numOne - numTwo;
        multiply = numOne * numTwo;
        divide = numOne / numTwo;
        modulus = numOne % numTwo;

        System.out.println("\nAddition: " + numOne + " + " +  numTwo + " = " + add);
        System.out.println("\nSubtraction: " + numOne + " - " +  numTwo + " = " + subtract);
        System.out.println("\nMultiplication: " + numOne + " * " +  numTwo + " = " + multiply);
        System.out.println("\nDivision: " + numOne + " / " +  numTwo + " = " + divide);
        System.out.println("\nModulus: " + numOne + " % " +  numTwo + " = " + modulus);
    } 

}