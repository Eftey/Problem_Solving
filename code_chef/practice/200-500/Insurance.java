import java.io.*;
import java.util.*;

/*
    Problem: Insurance
    1) Whichever is minimum is the price
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((Math.min(in.nextInt(), in.nextInt())));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}