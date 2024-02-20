import java.io.*;
import java.util.*;

/*
    Problem: Candy Distribution
    1) It has to be even so we check if it's divisible by 2
    2) Then we have to check if the result is even or not
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            pw.println(x % y == 0 && (x / y) % 2 == 0 ? "YES" : "NO");
        }
        pw.close();
    }


    static void
    debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}