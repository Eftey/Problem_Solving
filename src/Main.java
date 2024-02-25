import java.io.*;
import java.util.*;

/*
    Problem: Divisibility Problem
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