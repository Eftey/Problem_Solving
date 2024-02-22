import java.io.*;
import java.util.*;

/*
    Problem: Water Mixing
    1) We have to check if the current temperature is lower than what is needed or greater or equal
    2) If equal then yes
    3) If lower than we have to add a and see if it's equal or greater than yes
    4) Same if greater, but we have to subtract b and see if it's equal or smaller than yes
    5) If all case fails then no
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
            pw.println(x == n ? "YES" : (x > n && (x - b) <= n) ? "YES" : (x < n && (x + a) >= n) ? "YES" : "No");
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}