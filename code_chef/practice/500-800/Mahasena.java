import java.io.*;
import java.util.*;

/*
    Problem: Mahasena
    1) Sum of even numbers has to be greater than sum of odd numbers
    2) If so then Ready else Not ready
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), e = 0, o = 0;
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if (x % 2 == 0) e++;
            else o++;
        }
        pw.println(e > o ? "READY FOR BATTLE" : "NOT READY");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}