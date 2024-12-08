import java.util.Scanner;

public class JavaTutorial3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int favoriteNum;
        int age;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your favorite number: ");
        favoriteNum = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println("\nHi, " + name + "!");
        System.out.println("\tYour lucky number is " + (favoriteNum/age) + ".");
        System.out.println("\tYour unlucky number is " + (favoriteNum % age) + ".");
    }
}