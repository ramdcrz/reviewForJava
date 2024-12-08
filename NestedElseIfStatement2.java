import java.util.Scanner;

public class NestedElseIfStatement2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test1Score = 0, test2Score = 0;

        System.out.print("Enter test 1 score: ");
        test1Score = input.nextInt();

        System.out.print("Enter test 2 score: ");
        test2Score = input.nextInt();

        if ((test1Score > 90) && (test2Score > 90)) {             // Add operator
            System.out.println("\nMake employee manager");
            /* If both test scores are above 90, the program will
             * execute the sysout and will terminate the
             * statement block after.
             */

        } else if ((test1Score > 90) || (test2Score > 90)) {     // Or operator
            System.out.println("\nMake employee supervisor");
            /* If only one of the test score is above 90, the program
             * will execute the sysout and will terminate the
             * statement block after.
             */

        } else if (!(test1Score > 90)) {                        // Not operator
            System.out.println("\nMake employee agent");
            /* If both test scores are less than 90, the program
             * will execute the sysout and will terminate the
             * statement block after.
             */
        }
    }
}