import java.util.Scanner;

public class IfElseStatement2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter number: ");
        number = input.nextInt();

        if (number > 0) {
            System.out.println("\nThe number is a positive number.");
            /* If the condition turned out to be true,
             * the program will terminate after.
            */
        } else {
            System.out.println("\nThe number is a negative number.");
            /* If the if condition turned out to be false,
             * the program will execute this then will terminate after.
            */
        }
    }
}