import java.io.*;
import java.util.*;

/*
    Problem: Sale Season
    1) For each condition we subtract the discount from the original price
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), e = 0, o = 0;
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if (x <= 100) pw.println(x);
            else if (x <= 1000) pw.println(x - 25);
            else if (x <= 5000) pw.println(x - 100);
            else pw.println(x - 500);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}