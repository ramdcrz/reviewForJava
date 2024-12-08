import java.util.Scanner;

public class OddSquareCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, ctr;
        int square = 0, cube = 0;
        int totalSquare = 1, totalCube = 1;
        boolean oddNum = false;

        System.out.print("Enter number: ");
        n = input.nextInt();

        System.out.println("\nNumber\tSquare\tCube");

        for (ctr = 1; ctr <= n; ctr++) {
            oddNum = ctr % 2 == 1;
            if (oddNum) {
                square = ctr * ctr;
                cube = square * ctr;
                System.out.println(ctr + "\t" + square + "\t" + cube);
                totalSquare += ctr;
                totalCube += totalSquare;
            }
        }
        System.out.println("TOTAL\t" + totalSquare + "\t" + totalCube);
    }
}