import java.util.Scanner;
import java.text.DecimalFormat;

public class AirFare1 { // Using int for the customer code
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        double fare = 0.0;
        int custCode = 0;
        String customer = "";
        double discount = 0.0;
        double discRate = 0.0;
        double netFare = 0.0;

        System.out.print("Enter fare amount: ");
        fare = input.nextDouble();

        System.out.print("Enter customer code " +
                        "[0=Ordinary, 1=Student, 2=Senior]: ");
        custCode = input.nextInt();

        switch (custCode) {
            case 0 : customer = "ordinary";
                discRate = 0;
                break;
            case 1 : customer = "student";
                discRate = 0.1;
                break;
            case 2 : customer = "senior";
                discRate = 0.2;
                break;
            default :
                customer = "Invalid Code!";
            }
        /* The break statement is needed after every cases
         * so that it won't continue to check every cases once
         * the given case is already satisfied.
         */

        discount = fare * discRate;
        netFare = fare - discount;

        System.out.println("\nCustomer is " + customer);
        System.out.println("Discount is " + df.format(discount) + " dollars");
        System.out.println("\nNet Fare is " + df.format(netFare) + " dollars");

    }
}