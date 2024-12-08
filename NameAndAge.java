import java.util.Scanner;
// if we want to use the Scanner class

/* import java.util.*;
if we want to use different classes inside the Java util
the * means all, so we can use all the classes inside the package
*/

public class NameAndAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* input is a user defined name that will handle
        the input activities on our Scanner.
        */

        String name;
        int age;
        /* name and age are variables that we can store.
        In name, we store a String data type
        while in age, we store an integer data type.
        */

        System.out.print("Enter Name: ");
        name = input.nextLine();
        // line 24 suddenly pauses the cursor to let the user type a String variable
        // whatever entered will be store on the name variable

        System.out.print("Enter Age: ");
        age = input.nextInt();
        // line 29 pauses to let the user type an integer value
        // it converts any number into an integer value

        System.out.println();
        System.out.println("Your Name is " + name);
        System.out.println("You are " + age + " years old");
    }
}