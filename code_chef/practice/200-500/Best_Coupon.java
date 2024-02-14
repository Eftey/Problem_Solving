import java.io.*;
import java.util.*;

/*
    Problem: Best Coupon
    1) He has to get whichever is cheaper
    2) 10% off means divide it by 10 or 100
    2) Print whichever one is greater
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            pw.println(Math.max(x / 10, 100));
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