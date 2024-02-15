import java.io.*;
import java.util.*;

/*
    Problem: CRED Coins
    1) Total = x * y / 100 since each costs 100
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), e = 0, o = 0;
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() * in.nextInt() / 100);
        }
        pw.close();
    }

    public static int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}