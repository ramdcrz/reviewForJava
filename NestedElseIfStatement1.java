import java.util.Scanner;

public class NestedElseIfStatement1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter number: ");
        number = input.nextInt();

        if (number > 0) {
            System.out.println("\nThe number is a positive number.");
            /* If the condition turned out to be true,
             * the statement block will terminate after.
            */

        } else if (number < 0) {
            System.out.println("\nThe number is a negative number.");
            /* If the if condition turned out to be false,
             * the program will evaluate this part.
             * If this turned out to be true,
             * it will execute this then will terminate after.
            */

        } else {
            System.out.println("\nThe number is zero.");
            /* If the two statements above turned out to be false,
             * the program will proceed here and will execute this
             * then in will terminate the statement block after.
             */
        }
        System.out.println("\nThe program ends.");
        /* This will be executed because
         * it's outside the statement block.
         */
    }
}