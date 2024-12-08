import java.util.Scanner;
import java.text.DecimalFormat;

public class AirFare { // Using char for the customer code
    /* Also, converted the char so that it would not validate
     * whether or not the input is uppercase or lowercase..
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        double fare = 0.0;
        char custCode;
        String customer = "";
        double discount = 0.0;
        double discRate = 0.0;
        double netFare = 0.0;

        System.out.print("Enter fare amount: ");
        fare = input.nextDouble();

        System.out.print("Enter customer code " +
                        "[O=Ordinary, S=Student, R=Senior]: ");
        custCode = input.next().charAt(0);
        custCode = Character.toUpperCase(custCode);

        switch (custCode) {
            case 'O' : customer = "ordinary";
                discRate = 0;
                break;
            case 'S' : customer = "student";
                discRate = 0.1;
                break;
            case 'R' : customer = "senior";
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