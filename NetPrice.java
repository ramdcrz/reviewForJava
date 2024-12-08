import java.util.Scanner;
import java.text.DecimalFormat;
// instiating (representing) an object to make se of DecimalFormat class

public class NetPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        String product = ""; // used double quotes to signify that there is no initial value
        double unitPrice = 0.0, quantity = 0.0; // use camelized form for variable names
        double totalPrice = 0.0, discount = 0.0, netPrice = 0.0;

        System.out.print("Enter product: ");
        product = input.nextLine();

        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextDouble();

        totalPrice = unitPrice * quantity;
        discount = totalPrice * 0.10;
        netPrice = totalPrice - discount;

        System.out.println("\nThe product is " + product);
        System.out.println("Total price is " + df.format(totalPrice) + " dollars");
        System.out.println("Discount is " + df.format(discount) + " dollars");
        System.out.println("\nNet Price is " + df.format(netPrice) + " dollars");
    }
}