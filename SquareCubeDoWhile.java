import java.util.Scanner;

public class SquareCubeDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, ctr = 1;
        int square = 0, cube = 0;

        System.out.print("Enter n: ");
        n = input.nextInt();

        System.out.println("\nInteger\tSquare\tCube");

        do {
            square = ctr * ctr;
            cube = square * ctr;
            System.out.println(ctr + "\t" + square + "\t" + cube);
            ctr++;
        } while (ctr <= n);
    }
}