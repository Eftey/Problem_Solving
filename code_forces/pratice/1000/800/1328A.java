import java.io.*;
import java.util.*;

/*
    Problem: Divisibility Problem
    1) a = 10, b = 4
    2) a % b = 2
    3) If we subtract that reminder from b then it's divisible by b
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long x = in.nextLong(), xx = in.nextLong(), c = 0;
            pw.println(x % xx != 0 ? xx - (x % xx) : 0);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}