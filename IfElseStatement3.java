public class IfElseStatement3 {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 4, r = 0;                     // Line 1
        if (a > 3) {                                        // Line 2
            if (b <= a) {                                   // Line 4
                r = b++ - --a + c--;                        // Line 6
                    if (r % 2 == 0) {                       // Line 7
                        r++;                                // Line 9
                        c++;                                // Line 10
                    } else {                                // Line 11
                        --r;                                // Line 14
                        b += c++;                           // Line 15
                    }
            }
            System.out.println("The value of r=" + ++r);    // Line 18
        }
        System.out.println("The value of r=" + r);          // Line 20
        System.out.println("The value of c=" + c);          // Line 21
        System.out.println("The value of b=" + b);          // Line 22
    }
}