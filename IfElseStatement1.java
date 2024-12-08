import java.util.Scanner;

public class IfElseStatement1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;

        System.out.print("Enter age: ");
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("\nYou are qualified to vote.");
        } else {
            System.out.println("\nSorry, you are not eligible for voting yet.");
        }
    }
}