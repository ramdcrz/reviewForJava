import java.util.Scanner;

public class SquareCubeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, ctr;
        int square = 0, cube = 0;

        System.out.print("Enter n: ");
        n = input.nextInt();

        System.out.println("\nInteger\tSquare\tCube");

        for (ctr = 1; ctr <= n; ctr++) {
            square = ctr * ctr;
            cube = square * ctr;
            System.out.println(ctr + "\t" + square + "\t" + cube);
        }
    }
}