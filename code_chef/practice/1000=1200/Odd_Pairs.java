import java.io.*;
import java.util.*;

/*
    Problem: Odd Pairs
    1) n * n / 2 formula
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long x = in.nextLong();
            pw.println(x * x / 2);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}