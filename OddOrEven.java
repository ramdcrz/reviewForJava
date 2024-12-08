import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int num;

        System.out.println("Please pick a number: ");
        num = input.nextInt();

        if (num % 2 == 1) {
            System.out.println("The number is odd.");
        } else if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("Invalid Input");
        }
    }
}